/*
 * MetaSV API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 2.1.1
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


import com.metasv.client.openapi.model.OutputInfo;
import com.metasv.client.openapi.model.OutputInfoDetail;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutpointApi {
    private ApiClient localVarApiClient;

    public OutpointApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OutpointApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for outpointTxidIndexGet
     * @param txid The txid of the output (required)
     * @param index The index of the output in the tx. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get outpoint success. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call outpointTxidIndexGetCall(String txid, Integer index, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/outpoint/{txid}/{index}"
            .replaceAll("\\{" + "txid" + "\\}", localVarApiClient.escapeString(txid.toString()))
            .replaceAll("\\{" + "index" + "\\}", localVarApiClient.escapeString(index.toString()));

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
    private okhttp3.Call outpointTxidIndexGetValidateBeforeCall(String txid, Integer index, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new ApiException("Missing the required parameter 'txid' when calling outpointTxidIndexGet(Async)");
        }
        
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling outpointTxidIndexGet(Async)");
        }
        

        okhttp3.Call localVarCall = outpointTxidIndexGetCall(txid, index, _callback);
        return localVarCall;

    }

    /**
     * Get tx output(outpoint for vin) spent status.
     * Get detailed info for a utxo(or txo if spent), Only outputs spent no longer than one month are available. (Premium feature will support full history)
     * @param txid The txid of the output (required)
     * @param index The index of the output in the tx. (required)
     * @return OutputInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get outpoint success. </td><td>  -  </td></tr>
     </table>
     */
    public OutputInfo outpointTxidIndexGet(String txid, Integer index) throws ApiException {
        ApiResponse<OutputInfo> localVarResp = outpointTxidIndexGetWithHttpInfo(txid, index);
        return localVarResp.getData();
    }

    /**
     * Get tx output(outpoint for vin) spent status.
     * Get detailed info for a utxo(or txo if spent), Only outputs spent no longer than one month are available. (Premium feature will support full history)
     * @param txid The txid of the output (required)
     * @param index The index of the output in the tx. (required)
     * @return ApiResponse&lt;OutputInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get outpoint success. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OutputInfo> outpointTxidIndexGetWithHttpInfo(String txid, Integer index) throws ApiException {
        okhttp3.Call localVarCall = outpointTxidIndexGetValidateBeforeCall(txid, index, null);
        Type localVarReturnType = new TypeToken<OutputInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get tx output(outpoint for vin) spent status. (asynchronously)
     * Get detailed info for a utxo(or txo if spent), Only outputs spent no longer than one month are available. (Premium feature will support full history)
     * @param txid The txid of the output (required)
     * @param index The index of the output in the tx. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get outpoint success. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call outpointTxidIndexGetAsync(String txid, Integer index, final ApiCallback<OutputInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = outpointTxidIndexGetValidateBeforeCall(txid, index, _callback);
        Type localVarReturnType = new TypeToken<OutputInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for vinTxidDetailGet
     * @param txid The txid of the vins (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get vin list success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call vinTxidDetailGetCall(String txid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vin/{txid}/detail"
            .replaceAll("\\{" + "txid" + "\\}", localVarApiClient.escapeString(txid.toString()));

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
    private okhttp3.Call vinTxidDetailGetValidateBeforeCall(String txid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new ApiException("Missing the required parameter 'txid' when calling vinTxidDetailGet(Async)");
        }
        

        okhttp3.Call localVarCall = vinTxidDetailGetCall(txid, _callback);
        return localVarCall;

    }

    /**
     * Get all output point of vins in the tx with detailed output script.
     * Search output points by spent txid. Use this api to get detailed inputs for the tx.
     * @param txid The txid of the vins (required)
     * @return List&lt;OutputInfoDetail&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get vin list success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<OutputInfoDetail> vinTxidDetailGet(String txid) throws ApiException {
        ApiResponse<List<OutputInfoDetail>> localVarResp = vinTxidDetailGetWithHttpInfo(txid);
        return localVarResp.getData();
    }

    /**
     * Get all output point of vins in the tx with detailed output script.
     * Search output points by spent txid. Use this api to get detailed inputs for the tx.
     * @param txid The txid of the vins (required)
     * @return ApiResponse&lt;List&lt;OutputInfoDetail&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get vin list success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<OutputInfoDetail>> vinTxidDetailGetWithHttpInfo(String txid) throws ApiException {
        okhttp3.Call localVarCall = vinTxidDetailGetValidateBeforeCall(txid, null);
        Type localVarReturnType = new TypeToken<List<OutputInfoDetail>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all output point of vins in the tx with detailed output script. (asynchronously)
     * Search output points by spent txid. Use this api to get detailed inputs for the tx.
     * @param txid The txid of the vins (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get vin list success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call vinTxidDetailGetAsync(String txid, final ApiCallback<List<OutputInfoDetail>> _callback) throws ApiException {

        okhttp3.Call localVarCall = vinTxidDetailGetValidateBeforeCall(txid, _callback);
        Type localVarReturnType = new TypeToken<List<OutputInfoDetail>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
