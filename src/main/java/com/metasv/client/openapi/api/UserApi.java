/*
 * MetaSV API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 2.1.4
 * Contact: heqiming@metasv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.metasv.client.openapi.api;

import com.metasv.client.openapi.ApiCallback;
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.ApiResponse;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.Pair;
import com.metasv.client.openapi.ProgressRequestBody;
import com.metasv.client.openapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.metasv.client.openapi.model.ClientPubkeyRequest;
import com.metasv.client.openapi.model.ClientPubkeyResult;
import com.metasv.client.openapi.model.UserHourlyTraffic;
import com.metasv.client.openapi.model.UserTrafficSum;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserApi {
    private ApiClient localVarApiClient;

    public UserApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for userClientPubkeyGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get all registered client public keys. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userClientPubkeyGetCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/clientPubkey";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call userClientPubkeyGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = userClientPubkeyGetCall(_callback);
        return localVarCall;

    }

    /**
     * See https://github.com/metasv/metasv-client-signature for details. Get all trusted public keys.
     * 
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get all registered client public keys. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<String> userClientPubkeyGet() throws ApiException {
        ApiResponse<List<String>> localVarResp = userClientPubkeyGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * See https://github.com/metasv/metasv-client-signature for details. Get all trusted public keys.
     * 
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get all registered client public keys. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<String>> userClientPubkeyGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = userClientPubkeyGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * See https://github.com/metasv/metasv-client-signature for details. Get all trusted public keys. (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get all registered client public keys. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userClientPubkeyGetAsync(final ApiCallback<List<String>> _callback) throws ApiException {

        okhttp3.Call localVarCall = userClientPubkeyGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for userClientPubkeyPost
     * @param clientPubkeyRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Register success, pubkey returned. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Register success, while pubkey already exists. pubkey returned. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Register forbidden. Not authorized or exceed register limit. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, pubkey is not valid, or already registered by others. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userClientPubkeyPostCall(ClientPubkeyRequest clientPubkeyRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = clientPubkeyRequest;

        // create path and map variables
        String localVarPath = "/user/clientPubkey";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call userClientPubkeyPostValidateBeforeCall(ClientPubkeyRequest clientPubkeyRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = userClientPubkeyPostCall(clientPubkeyRequest, _callback);
        return localVarCall;

    }

    /**
     * See https://github.com/metasv/metasv-client-signature for details. Register new client public key.
     * 
     * @param clientPubkeyRequest  (optional)
     * @return ClientPubkeyResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Register success, pubkey returned. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Register success, while pubkey already exists. pubkey returned. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Register forbidden. Not authorized or exceed register limit. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, pubkey is not valid, or already registered by others. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ClientPubkeyResult userClientPubkeyPost(ClientPubkeyRequest clientPubkeyRequest) throws ApiException {
        ApiResponse<ClientPubkeyResult> localVarResp = userClientPubkeyPostWithHttpInfo(clientPubkeyRequest);
        return localVarResp.getData();
    }

    /**
     * See https://github.com/metasv/metasv-client-signature for details. Register new client public key.
     * 
     * @param clientPubkeyRequest  (optional)
     * @return ApiResponse&lt;ClientPubkeyResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Register success, pubkey returned. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Register success, while pubkey already exists. pubkey returned. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Register forbidden. Not authorized or exceed register limit. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, pubkey is not valid, or already registered by others. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ClientPubkeyResult> userClientPubkeyPostWithHttpInfo(ClientPubkeyRequest clientPubkeyRequest) throws ApiException {
        okhttp3.Call localVarCall = userClientPubkeyPostValidateBeforeCall(clientPubkeyRequest, null);
        Type localVarReturnType = new TypeToken<ClientPubkeyResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * See https://github.com/metasv/metasv-client-signature for details. Register new client public key. (asynchronously)
     * 
     * @param clientPubkeyRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Register success, pubkey returned. </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Register success, while pubkey already exists. pubkey returned. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Register forbidden. Not authorized or exceed register limit. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, pubkey is not valid, or already registered by others. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userClientPubkeyPostAsync(ClientPubkeyRequest clientPubkeyRequest, final ApiCallback<ClientPubkeyResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = userClientPubkeyPostValidateBeforeCall(clientPubkeyRequest, _callback);
        Type localVarReturnType = new TypeToken<ClientPubkeyResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for userClientPubkeyPubkeyDelete
     * @param pubkey the pubkey to delete (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userClientPubkeyPubkeyDeleteCall(String pubkey, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/clientPubkey/{pubkey}"
            .replaceAll("\\{" + "pubkey" + "\\}", localVarApiClient.escapeString(pubkey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call userClientPubkeyPubkeyDeleteValidateBeforeCall(String pubkey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pubkey' is set
        if (pubkey == null) {
            throw new ApiException("Missing the required parameter 'pubkey' when calling userClientPubkeyPubkeyDelete(Async)");
        }
        

        okhttp3.Call localVarCall = userClientPubkeyPubkeyDeleteCall(pubkey, _callback);
        return localVarCall;

    }

    /**
     * Delete a registered client public key.
     * See https://github.com/metasv/metasv-client-signature for details. You can use this api to delete your registered public key.
     * @param pubkey the pubkey to delete (required)
     * @return ClientPubkeyResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ClientPubkeyResult userClientPubkeyPubkeyDelete(String pubkey) throws ApiException {
        ApiResponse<ClientPubkeyResult> localVarResp = userClientPubkeyPubkeyDeleteWithHttpInfo(pubkey);
        return localVarResp.getData();
    }

    /**
     * Delete a registered client public key.
     * See https://github.com/metasv/metasv-client-signature for details. You can use this api to delete your registered public key.
     * @param pubkey the pubkey to delete (required)
     * @return ApiResponse&lt;ClientPubkeyResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ClientPubkeyResult> userClientPubkeyPubkeyDeleteWithHttpInfo(String pubkey) throws ApiException {
        okhttp3.Call localVarCall = userClientPubkeyPubkeyDeleteValidateBeforeCall(pubkey, null);
        Type localVarReturnType = new TypeToken<ClientPubkeyResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a registered client public key. (asynchronously)
     * See https://github.com/metasv/metasv-client-signature for details. You can use this api to delete your registered public key.
     * @param pubkey the pubkey to delete (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userClientPubkeyPubkeyDeleteAsync(String pubkey, final ApiCallback<ClientPubkeyResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = userClientPubkeyPubkeyDeleteValidateBeforeCall(pubkey, _callback);
        Type localVarReturnType = new TypeToken<ClientPubkeyResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for userTrafficGet
     * @param startTime define start query time(unix timestamp) (optional)
     * @param endTime define end query time(unix timestamp) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get hourly traffic success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userTrafficGetCall(Long startTime, Long endTime, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/traffic";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startTime", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endTime", endTime));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call userTrafficGetValidateBeforeCall(Long startTime, Long endTime, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = userTrafficGetCall(startTime, endTime, _callback);
        return localVarCall;

    }

    /**
     * Get traffic details for every hour(valid in six months).
     * Return hourly summed outbound traffic bytes.
     * @param startTime define start query time(unix timestamp) (optional)
     * @param endTime define end query time(unix timestamp) (optional)
     * @return List&lt;UserHourlyTraffic&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get hourly traffic success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<UserHourlyTraffic> userTrafficGet(Long startTime, Long endTime) throws ApiException {
        ApiResponse<List<UserHourlyTraffic>> localVarResp = userTrafficGetWithHttpInfo(startTime, endTime);
        return localVarResp.getData();
    }

    /**
     * Get traffic details for every hour(valid in six months).
     * Return hourly summed outbound traffic bytes.
     * @param startTime define start query time(unix timestamp) (optional)
     * @param endTime define end query time(unix timestamp) (optional)
     * @return ApiResponse&lt;List&lt;UserHourlyTraffic&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get hourly traffic success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<UserHourlyTraffic>> userTrafficGetWithHttpInfo(Long startTime, Long endTime) throws ApiException {
        okhttp3.Call localVarCall = userTrafficGetValidateBeforeCall(startTime, endTime, null);
        Type localVarReturnType = new TypeToken<List<UserHourlyTraffic>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get traffic details for every hour(valid in six months). (asynchronously)
     * Return hourly summed outbound traffic bytes.
     * @param startTime define start query time(unix timestamp) (optional)
     * @param endTime define end query time(unix timestamp) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get hourly traffic success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userTrafficGetAsync(Long startTime, Long endTime, final ApiCallback<List<UserHourlyTraffic>> _callback) throws ApiException {

        okhttp3.Call localVarCall = userTrafficGetValidateBeforeCall(startTime, endTime, _callback);
        Type localVarReturnType = new TypeToken<List<UserHourlyTraffic>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for userTrafficSumGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get hourly traffic success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userTrafficSumGetCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/traffic/sum";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call userTrafficSumGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = userTrafficSumGetCall(_callback);
        return localVarCall;

    }

    /**
     * Sum all traffic in the current month.
     * Return  summed outbound traffic bytes in current month.
     * @return UserTrafficSum
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get hourly traffic success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public UserTrafficSum userTrafficSumGet() throws ApiException {
        ApiResponse<UserTrafficSum> localVarResp = userTrafficSumGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Sum all traffic in the current month.
     * Return  summed outbound traffic bytes in current month.
     * @return ApiResponse&lt;UserTrafficSum&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get hourly traffic success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserTrafficSum> userTrafficSumGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = userTrafficSumGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<UserTrafficSum>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Sum all traffic in the current month. (asynchronously)
     * Return  summed outbound traffic bytes in current month.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get hourly traffic success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call userTrafficSumGetAsync(final ApiCallback<UserTrafficSum> _callback) throws ApiException {

        okhttp3.Call localVarCall = userTrafficSumGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<UserTrafficSum>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
