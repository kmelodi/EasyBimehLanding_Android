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

public class ElectronicEquipmentInsuranceController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static ElectronicEquipmentInsuranceController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ElectronicEquipmentInsuranceController class 
     */
    public static ElectronicEquipmentInsuranceController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new ElectronicEquipmentInsuranceController();
                }
            }
        }
        return instance;
    }

    /**
     * دریافت اطلاعات اولیه استعلام بیمه نامه ی تجهیزات الکترونیک
     * @param    subDomain    Required parameter: دامنه یا زیر دامنه ی مرکز بیمه
     * @param    xApiKey    Required parameter: کلید اختصاصی ارتباط با سرور
     */
    public void getElectronicEquipmentInsuranceAsync(
                final String subDomain,
                final String xApiKey,
                final APICallBack<BaseModelElectronicEquipmentInsurance> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetElectronicEquipmentInsuranceRequest(subDomain, xApiKey);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            BaseModelElectronicEquipmentInsurance returnValue = _handleGetElectronicEquipmentInsuranceResponse(_context);
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
     * Builds the HttpRequest object for getElectronicEquipmentInsurance
     */
    private HttpRequest _buildGetElectronicEquipmentInsuranceRequest(
                final String subDomain,
                final String xApiKey) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/ElectronicEquipmentInsurance/Initialize");

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
     * Processes the response for getElectronicEquipmentInsurance
     * @return An object of type BaseModelElectronicEquipmentInsurance
     */
    private BaseModelElectronicEquipmentInsurance _handleGetElectronicEquipmentInsuranceResponse(HttpContext _context)
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
        BaseModelElectronicEquipmentInsurance _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<BaseModelElectronicEquipmentInsurance>(){});

        return _result;
    }

    /**
     * دریافت لیست نوع برند دستگاه
     * @param    deviceGroup    Required parameter: شناسه ی گروه دستگاه
     * @param    deviceTypeId    Required parameter: شناسه ی نوع دستگاه
     * @param    xApiKey    Required parameter: کلید اختصاصی ارتباط با سرور
     */
    public void getDeviceBrandTypesAsync(
                final int deviceGroup,
                final int deviceTypeId,
                final String xApiKey,
                final APICallBack<BaseModelDeviceBrandTypes> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetDeviceBrandTypesRequest(deviceGroup, deviceTypeId, xApiKey);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            BaseModelDeviceBrandTypes returnValue = _handleGetDeviceBrandTypesResponse(_context);
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
     * Builds the HttpRequest object for getDeviceBrandTypes
     */
    private HttpRequest _buildGetDeviceBrandTypesRequest(
                final int deviceGroup,
                final int deviceTypeId,
                final String xApiKey) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/ComboData/DeviceBrandTypes");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("deviceGroup", deviceGroup);
        _queryParameters.put("deviceTypeId", deviceTypeId);
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
     * Processes the response for getDeviceBrandTypes
     * @return An object of type BaseModelDeviceBrandTypes
     */
    private BaseModelDeviceBrandTypes _handleGetDeviceBrandTypesResponse(HttpContext _context)
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
        BaseModelDeviceBrandTypes _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<BaseModelDeviceBrandTypes>(){});

        return _result;
    }

    /**
     * دریافت لیست فرانشیر استعلام بیمه نامه ی تجهیزات الکترونیک
     * @param    deviceModelId    Required parameter: شناسه ی مدل دستگاه
     * @param    xApiKey    Required parameter: کلید اختصاصی ارتباط با سرور
     */
    public void getDiviceFranchiseeAsync(
                final int deviceModelId,
                final String xApiKey,
                final APICallBack<BaseModelDiviceFranchisee> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetDiviceFranchiseeRequest(deviceModelId, xApiKey);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            BaseModelDiviceFranchisee returnValue = _handleGetDiviceFranchiseeResponse(_context);
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
     * Builds the HttpRequest object for getDiviceFranchisee
     */
    private HttpRequest _buildGetDiviceFranchiseeRequest(
                final int deviceModelId,
                final String xApiKey) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/ElectronicEquipmentInsurance/DiviceFranchisee");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("deviceModelId", deviceModelId);
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
     * Processes the response for getDiviceFranchisee
     * @return An object of type BaseModelDiviceFranchisee
     */
    private BaseModelDiviceFranchisee _handleGetDiviceFranchiseeResponse(HttpContext _context)
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
        BaseModelDiviceFranchisee _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<BaseModelDiviceFranchisee>(){});

        return _result;
    }

}
