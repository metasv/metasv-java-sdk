# MerchantApi

All URIs are relative to *https://apiv2.metasv.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**merchantBroadcastPost**](MerchantApi.md#merchantBroadcastPost) | **POST** /merchant/broadcast | Broadcast tx to coorperated miner merchant APIs(TAAL).
[**merchantUtxoPost**](MerchantApi.md#merchantUtxoPost) | **POST** /merchant/utxo | Pick utxos by addresses and amount.


<a name="merchantBroadcastPost"></a>
# **merchantBroadcastPost**
> BroadcastResult merchantBroadcastPost(txRaw)

Broadcast tx to coorperated miner merchant APIs(TAAL).

This api will broadcast to taal, you can broadcast tx with fee rate 0.25 sat/b by this api

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    TxRaw txRaw = new TxRaw(); // TxRaw | 
    try {
      BroadcastResult result = apiInstance.merchantBroadcastPost(txRaw);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#merchantBroadcastPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txRaw** | [**TxRaw**](TxRaw.md)|  | [optional]

### Return type

[**BroadcastResult**](BroadcastResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Broadcast success, txid returned |  -  |
**403** | Broadcast Failed |  -  |

<a name="merchantUtxoPost"></a>
# **merchantUtxoPost**
> List&lt;AddressUtxo&gt; merchantUtxoPost(confirmed, utxoPickRequest)

Pick utxos by addresses and amount.

Selects a set of Utxos with total value higher than the given amount from a given address list . In case of HD wallets, multiple addresses can be specified.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    String confirmed = "confirmed_example"; // String | Whether the utxo is confirmed, \"true\" for confirmed, \"false\" for unconfirmed, null for both
    UtxoPickRequest utxoPickRequest = new UtxoPickRequest(); // UtxoPickRequest | 
    try {
      List<AddressUtxo> result = apiInstance.merchantUtxoPost(confirmed, utxoPickRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#merchantUtxoPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **confirmed** | **String**| Whether the utxo is confirmed, \&quot;true\&quot; for confirmed, \&quot;false\&quot; for unconfirmed, null for both | [optional]
 **utxoPickRequest** | [**UtxoPickRequest**](UtxoPickRequest.md)|  | [optional]

### Return type

[**List&lt;AddressUtxo&gt;**](AddressUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | utxo pick success |  -  |

