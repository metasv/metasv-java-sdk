# BlockApi

All URIs are relative to *https://apiv2.metasv.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**blockBlockIdGet**](BlockApi.md#blockBlockIdGet) | **GET** /block/{blockId} | Get block request by height or hash
[**blockGet**](BlockApi.md#blockGet) | **GET** /block | Get recent block list by paging. 30 items per page.
[**blockInfoGet**](BlockApi.md#blockInfoGet) | **GET** /block/info | Get current blockchain info from full node.


<a name="blockBlockIdGet"></a>
# **blockBlockIdGet**
> BlockHeader blockBlockIdGet(blockId)

Get block request by height or hash

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.BlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlockApi apiInstance = new BlockApi(defaultClient);
    String blockId = "blockId_example"; // String | The block id, height or hash acceptable.
    try {
      BlockHeader result = apiInstance.blockBlockIdGet(blockId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#blockBlockIdGet");
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
 **blockId** | **String**| The block id, height or hash acceptable. |

### Return type

[**BlockHeader**](BlockHeader.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | get block info success |  -  |
**404** | block info not found |  -  |

<a name="blockGet"></a>
# **blockGet**
> List&lt;BlockHeader&gt; blockGet(last)

Get recent block list by paging. 30 items per page.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.BlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlockApi apiInstance = new BlockApi(defaultClient);
    Integer last = 56; // Integer | paging flag, height of last item in last page
    try {
      List<BlockHeader> result = apiInstance.blockGet(last);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#blockGet");
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
 **last** | **Integer**| paging flag, height of last item in last page | [optional]

### Return type

[**List&lt;BlockHeader&gt;**](BlockHeader.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successfully get lists |  -  |

<a name="blockInfoGet"></a>
# **blockInfoGet**
> BlockchainInfo blockInfoGet()

Get current blockchain info from full node.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.BlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BlockApi apiInstance = new BlockApi(defaultClient);
    try {
      BlockchainInfo result = apiInstance.blockInfoGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#blockInfoGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BlockchainInfo**](BlockchainInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get blockchain info success. |  -  |

