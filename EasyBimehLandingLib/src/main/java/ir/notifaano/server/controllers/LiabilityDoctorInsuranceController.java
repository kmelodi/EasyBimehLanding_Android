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

public class LiabilityDoctorInsuranceController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static LiabilityDoctorInsuranceController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the LiabilityDoctorInsuranceController class 
     */
    public static LiabilityDoctorInsuranceController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new LiabilityDoctorInsuranceController();
                }
            }
        }
        return instance;
    }

    /**
     * در یافت اطلاعات اولیه برای استعلام بیمه مسئولیت پزشکان
     * @param    subDomain    Required parameter: دامنه یا زیر دامنه ی مرکز بیمه
     * @param    xApiKey    Required parameter: کلید اختصاصی ارتباط با سرور
     */
    public void getLiabilityDoctorInsuranceAsync(
                final String subDomain,
                final String xApiKey,
                final APICallBack<BaseModelLiabilityDoctorInsurance> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetLiabilityDoctorInsuranceRequest(subDomain, xApiKey);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            BaseModelLiabilityDoctorInsurance returnValue = _handleGetLiabilityDoctorInsuranceResponse(_context);
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
     * Builds the HttpRequest object for getLiabilityDoctorInsurance
     */
    private HttpRequest _buildGetLiabilityDoctorInsuranceRequest(
                final String subDomain,
                final String xApiKey) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/LiabilityDoctorInsurance/Initialize");

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
     * Processes the response for getLiabilityDoctorInsurance
     * @return An object of type BaseModelLiabilityDoctorInsurance
     */
    private BaseModelLiabilityDoctorInsurance _handleGetLiabilityDoctorInsuranceResponse(HttpContext _context)
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
        BaseModelLiabilityDoctorInsurance _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<BaseModelLiabilityDoctorInsurance>(){});

        return _result;
    }

    /**
     * دریافت لیست تخصص های پزشکی
     * @param    id    Required parameter: نوع تخصص => ParamedicalExpertise => پیراپزشکی MedicalExpertise => پزشکی
     * @param    xApiKey    Required parameter: کلید اختصاصی ارتباط با سرور
     */
    public void getMedicalSpecialtiesAsync(
                final String id,
                final String xApiKey,
                final APICallBack<BaseModelMedicalSpecialties> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetMedicalSpecialtiesRequest(id, xApiKey);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            BaseModelMedicalSpecialties returnValue = _handleGetMedicalSpecialtiesResponse(_context);
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
     * Builds the HttpRequest object for getMedicalSpecialties
     */
    private HttpRequest _buildGetMedicalSpecialtiesRequest(
                final String id,
                final String xApiKey) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/MedicalSpecialties");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("id", id);
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
     * Processes the response for getMedicalSpecialties
     * @return An object of type BaseModelMedicalSpecialties
     */
    private BaseModelMedicalSpecialties _handleGetMedicalSpecialtiesResponse(HttpContext _context)
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
        BaseModelMedicalSpecialties _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<BaseModelMedicalSpecialties>(){});

        return _result;
    }

}
