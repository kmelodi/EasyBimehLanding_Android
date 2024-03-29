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

public class OtherInsuranceTypesController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static OtherInsuranceTypesController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the OtherInsuranceTypesController class 
     */
    public static OtherInsuranceTypesController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new OtherInsuranceTypesController();
                }
            }
        }
        return instance;
    }

    /**
     * دریافت لیست سایر بیمه نامه ها
     * @param    subDomain    Required parameter: دامنه یا زیر دامنه ی مرکز بیمه
     * @param    xApiKey    Required parameter: کلید اختصاصی ارتباط با سرور
     */
    public void getOtherInsuranceTypesAsync(
                final String subDomain,
                final String xApiKey,
                final APICallBack<OtherInsuranceTypes> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetOtherInsuranceTypesRequest(subDomain, xApiKey);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            OtherInsuranceTypes returnValue = _handleGetOtherInsuranceTypesResponse(_context);
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
     * Builds the HttpRequest object for getOtherInsuranceTypes
     */
    private HttpRequest _buildGetOtherInsuranceTypesRequest(
                final String subDomain,
                final String xApiKey) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/ComboData/OtherInsuranceTypes");

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


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getOtherInsuranceTypes
     * @return An object of type OtherInsuranceTypes
     */
    private OtherInsuranceTypes _handleGetOtherInsuranceTypesResponse(HttpContext _context)
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
        OtherInsuranceTypes _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<OtherInsuranceTypes>(){});

        return _result;
    }

    /**
     * ارسال توکن تایید شماره تماس، برای احراز هویت کاربر
     * @param    mobile    Required parameter: شماره موبایل
     * @param    insuranceCentreSubDomain    Required parameter: دامنه یا زیردامنه ی مرکز بیمه
     * @param    xApiKey    Required parameter: کلید اختصاصی ارتباط با سرور
     */
    public void getSendSmsTokenAsync(
                final String mobile,
                final String insuranceCentreSubDomain,
                final String xApiKey,
                final APICallBack<SendSmsToken> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetSendSmsTokenRequest(mobile, insuranceCentreSubDomain, xApiKey);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            SendSmsToken returnValue = _handleGetSendSmsTokenResponse(_context);
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
     * Builds the HttpRequest object for getSendSmsToken
     */
    private HttpRequest _buildGetSendSmsTokenRequest(
                final String mobile,
                final String insuranceCentreSubDomain,
                final String xApiKey) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/Account/SendSmsToken");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("mobile", mobile);
        _queryParameters.put("insuranceCentreSubDomain", insuranceCentreSubDomain);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("x-api-key", xApiKey);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getSendSmsToken
     * @return An object of type SendSmsToken
     */
    private SendSmsToken _handleGetSendSmsTokenResponse(HttpContext _context)
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
        SendSmsToken _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<SendSmsToken>(){});

        return _result;
    }

    /**
     * تایید توکن پیامک شده به کاربر، برای احراز هویت
     * @param    mobile    Required parameter: شماره موبایل
     * @param    token    Required parameter: توکن دریافتی کاربر از پیامک
     * @param    insuranceCentreSubDomain    Required parameter: دامنه یا زیر دامنه ی اختصاصی مرکز بیمه
     * @param    aliasName    Required parameter: نام و نام خانوادگی کاربر
     * @param    resource    Required parameter: دامنه ی درخواست دهنده
     * @param    xApiKey    Required parameter: کلید اختصاصی ارتباط با سرور
     */
    public void getVerifySmsTokenAsync(
                final String mobile,
                final int token,
                final String insuranceCentreSubDomain,
                final String aliasName,
                final String resource,
                final String xApiKey,
                final APICallBack<Status200> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetVerifySmsTokenRequest(mobile, token, insuranceCentreSubDomain, aliasName, resource, xApiKey);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            Status200 returnValue = _handleGetVerifySmsTokenResponse(_context);
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
     * Builds the HttpRequest object for getVerifySmsToken
     */
    private HttpRequest _buildGetVerifySmsTokenRequest(
                final String mobile,
                final int token,
                final String insuranceCentreSubDomain,
                final String aliasName,
                final String resource,
                final String xApiKey) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/Account/verifySmsToken");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("mobile", mobile);
        _queryParameters.put("token", token);
        _queryParameters.put("insuranceCentreSubDomain", insuranceCentreSubDomain);
        _queryParameters.put("aliasName", aliasName);
        _queryParameters.put("resource", resource);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("x-api-key", xApiKey);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getVerifySmsToken
     * @return An object of type Status200
     */
    private Status200 _handleGetVerifySmsTokenResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 400) {
            throw new Status400Exception("Bad Request", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        Status200 _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<Status200>(){});

        return _result;
    }

}
