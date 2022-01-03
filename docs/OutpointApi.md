# OutpointApi

All URIs are relative to *https://apiv2.metasv.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**outpointTxidIndexGet**](OutpointApi.md#outpointTxidIndexGet) | **GET** /outpoint/{txid}/{index} | Get tx output(outpoint for vin) spent status.
[**vinTxidDetailGet**](OutpointApi.md#vinTxidDetailGet) | **GET** /vin/{txid}/detail | Get all output point of vins in the tx with detailed output script.
[**vinTxidGet**](OutpointApi.md#vinTxidGet) | **GET** /vin/{txid} | Get all output point of vins in the tx(no longer than one month).


<a name="outpointTxidIndexGet"></a>
# **outpointTxidIndexGet**
> OutputInfo outpointTxidIndexGet(txid, index)

Get tx output(outpoint for vin) spent status.

Get detailed info for a utxo(or txo if spent), Only outputs spent no longer than one month are available. (Premium feature will support full history)

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.OutpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OutpointApi apiInstance = new OutpointApi(defaultClient);
    String txid = "txid_example"; // String | The txid of the output
    Integer index = 56; // Integer | The index of the output in the tx.
    try {
      OutputInfo result = apiInstance.outpointTxidIndexGet(txid, index);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpointApi#outpointTxidIndexGet");
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
 **txid** | **String**| The txid of the output |
 **index** | **Integer**| The index of the output in the tx. |

### Return type

[**OutputInfo**](OutputInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get outpoint success. |  -  |

<a name="vinTxidDetailGet"></a>
# **vinTxidDetailGet**
> List&lt;OutputInfoDetail&gt; vinTxidDetailGet(txid)

Get all output point of vins in the tx with detailed output script.

Search output points by spent txid. Use this api to get detailed inputs for the tx.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.OutpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OutpointApi apiInstance = new OutpointApi(defaultClient);
    String txid = "txid_example"; // String | The txid of the vins
    try {
      List<OutputInfoDetail> result = apiInstance.vinTxidDetailGet(txid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpointApi#vinTxidDetailGet");
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
 **txid** | **String**| The txid of the vins |

### Return type

[**List&lt;OutputInfoDetail&gt;**](OutputInfoDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get vin list success. |  -  |
**401** |  |  -  |

<a name="vinTxidGet"></a>
# **vinTxidGet**
> List&lt;OutputInfo&gt; vinTxidGet(txid)

Get all output point of vins in the tx(no longer than one month).

Search output points by spent txid. Use this api to get detailed inputs for the tx. (Premium feature will support full history)

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.OutpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OutpointApi apiInstance = new OutpointApi(defaultClient);
    String txid = "txid_example"; // String | The txid of the vins
    try {
      List<OutputInfo> result = apiInstance.vinTxidGet(txid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpointApi#vinTxidGet");
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
 **txid** | **String**| The txid of the vins |

### Return type

[**List&lt;OutputInfo&gt;**](OutputInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get vin list success. |  -  |

