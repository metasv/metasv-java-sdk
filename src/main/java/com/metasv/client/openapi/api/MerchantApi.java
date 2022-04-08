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


import com.metasv.client.openapi.model.AddressUtxo;
import com.metasv.client.openapi.model.BroadcastResult;
import com.metasv.client.openapi.model.TxRaw;
import com.metasv.client.openapi.model.UtxoPickRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MerchantApi {
    private ApiClient localVarApiClient;

    public MerchantApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MerchantApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for merchantBroadcastPost
     * @param txRaw  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Broadcast success, txid returned </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Broadcast Failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call merchantBroadcastPostCall(TxRaw txRaw, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = txRaw;

        // create path and map variables
        String localVarPath = "/merchant/broadcast";

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
    private okhttp3.Call merchantBroadcastPostValidateBeforeCall(TxRaw txRaw, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = merchantBroadcastPostCall(txRaw, _callback);
        return localVarCall;

    }

    /**
     * Broadcast tx to coorperated miner merchant APIs(TAAL).
     * This api will broadcast to taal, you can broadcast tx with fee rate 0.25 sat/b by this api
     * @param txRaw  (optional)
     * @return BroadcastResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Broadcast success, txid returned </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Broadcast Failed </td><td>  -  </td></tr>
     </table>
     */
    public BroadcastResult merchantBroadcastPost(TxRaw txRaw) throws ApiException {
        ApiResponse<BroadcastResult> localVarResp = merchantBroadcastPostWithHttpInfo(txRaw);
        return localVarResp.getData();
    }

    /**
     * Broadcast tx to coorperated miner merchant APIs(TAAL).
     * This api will broadcast to taal, you can broadcast tx with fee rate 0.25 sat/b by this api
     * @param txRaw  (optional)
     * @return ApiResponse&lt;BroadcastResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Broadcast success, txid returned </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Broadcast Failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BroadcastResult> merchantBroadcastPostWithHttpInfo(TxRaw txRaw) throws ApiException {
        okhttp3.Call localVarCall = merchantBroadcastPostValidateBeforeCall(txRaw, null);
        Type localVarReturnType = new TypeToken<BroadcastResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Broadcast tx to coorperated miner merchant APIs(TAAL). (asynchronously)
     * This api will broadcast to taal, you can broadcast tx with fee rate 0.25 sat/b by this api
     * @param txRaw  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Broadcast success, txid returned </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Broadcast Failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call merchantBroadcastPostAsync(TxRaw txRaw, final ApiCallback<BroadcastResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = merchantBroadcastPostValidateBeforeCall(txRaw, _callback);
        Type localVarReturnType = new TypeToken<BroadcastResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for merchantUtxoPost
     * @param utxoPickRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> utxo pick success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call merchantUtxoPostCall(UtxoPickRequest utxoPickRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = utxoPickRequest;

        // create path and map variables
        String localVarPath = "/merchant/utxo";

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
    private okhttp3.Call merchantUtxoPostValidateBeforeCall(UtxoPickRequest utxoPickRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = merchantUtxoPostCall(utxoPickRequest, _callback);
        return localVarCall;

    }

    /**
     * Pick utxos by addresses and amount.
     * Selects a set of Utxos with total value higher than the given amount from a given address list . In case of HD wallets, multiple addresses can be specified.
     * @param utxoPickRequest  (optional)
     * @return List&lt;AddressUtxo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> utxo pick success </td><td>  -  </td></tr>
     </table>
     */
    public List<AddressUtxo> merchantUtxoPost(UtxoPickRequest utxoPickRequest) throws ApiException {
        ApiResponse<List<AddressUtxo>> localVarResp = merchantUtxoPostWithHttpInfo(utxoPickRequest);
        return localVarResp.getData();
    }

    /**
     * Pick utxos by addresses and amount.
     * Selects a set of Utxos with total value higher than the given amount from a given address list . In case of HD wallets, multiple addresses can be specified.
     * @param utxoPickRequest  (optional)
     * @return ApiResponse&lt;List&lt;AddressUtxo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> utxo pick success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AddressUtxo>> merchantUtxoPostWithHttpInfo(UtxoPickRequest utxoPickRequest) throws ApiException {
        okhttp3.Call localVarCall = merchantUtxoPostValidateBeforeCall(utxoPickRequest, null);
        Type localVarReturnType = new TypeToken<List<AddressUtxo>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Pick utxos by addresses and amount. (asynchronously)
     * Selects a set of Utxos with total value higher than the given amount from a given address list . In case of HD wallets, multiple addresses can be specified.
     * @param utxoPickRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> utxo pick success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call merchantUtxoPostAsync(UtxoPickRequest utxoPickRequest, final ApiCallback<List<AddressUtxo>> _callback) throws ApiException {

        okhttp3.Call localVarCall = merchantUtxoPostValidateBeforeCall(utxoPickRequest, _callback);
        Type localVarReturnType = new TypeToken<List<AddressUtxo>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
