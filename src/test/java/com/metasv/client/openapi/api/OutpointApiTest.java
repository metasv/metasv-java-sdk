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

import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.model.OutputInfo;
import com.metasv.client.openapi.model.OutputInfoDetail;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OutpointApi
 */
@Ignore
public class OutpointApiTest {

    private final OutpointApi api = new OutpointApi();

    
    /**
     * Get tx output(outpoint for vin) spent status.
     *
     * Get detailed info for a utxo(or txo if spent), Only outputs spent no longer than one month are available. (Premium feature will support full history)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void outpointTxidIndexGetTest() throws ApiException {
        String txid = null;
        Integer index = null;
        OutputInfo response = api.outpointTxidIndexGet(txid, index);

        // TODO: test validations
    }
    
    /**
     * Get all output point of vins in the tx with detailed output script.
     *
     * Search output points by spent txid. Use this api to get detailed inputs for the tx.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vinTxidDetailGetTest() throws ApiException {
        String txid = null;
        List<OutputInfoDetail> response = api.vinTxidDetailGet(txid);

        // TODO: test validations
    }
    
}
