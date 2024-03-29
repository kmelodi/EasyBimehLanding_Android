/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import ir.notifaano.server.*;
import ir.notifaano.server.models.*;
import ir.notifaano.server.exceptions.*;
import ir.notifaano.server.http.client.HttpClient;
import ir.notifaano.server.http.client.HttpContext;
import ir.notifaano.server.http.request.HttpRequest;
import ir.notifaano.server.http.response.HttpResponse;
import ir.notifaano.server.http.response.HttpStringResponse;
import ir.notifaano.server.http.client.APICallBack;

public class FileManagerController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static FileManagerController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the FileManagerController class 
     */
    public static FileManagerController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new FileManagerController();
                }
            }
        }
        return instance;
    }

    /**
     * آپلود فایل در ایزی بیمه
     * بعد از آپلود، ادرس فایل باید در api های بعدی ارسال شود.
     * @param    subDomain    Required parameter: دامنه یا زیر دامنه ی مرکز بیمه
     * @param    xApiKey    Required parameter: کلید اختصاصی ارتباط با سرور
     * @param    file    Required parameter: فایل ارسالی
     */
    public void uploadAsync(
                final String subDomain,
                final String xApiKey,
                final String file,
                final APICallBack<BaseModelUpload> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildUploadRequest(subDomain, xApiKey, file);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            BaseModelUpload returnValue = _handleUploadResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for upload
     */
    private HttpRequest _buildUploadRequest(
                final String subDomain,
                final String xApiKey,
                final String file) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/FileManager/Upload");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("subDomain", subDomain);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("x-api-key", xApiKey);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>();
        _parameters.put("file", file);

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for upload
     * @return An object of type BaseModelUpload
     */
    private BaseModelUpload _handleUploadResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        BaseModelUpload _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<BaseModelUpload>(){});

        return _result;
    }

}
