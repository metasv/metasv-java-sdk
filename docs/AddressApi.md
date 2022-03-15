# AddressApi

All URIs are relative to *https://apiv2.metasv.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressAddressBalanceGet**](AddressApi.md#addressAddressBalanceGet) | **GET** /address/{address}/balance | Get address balance by specific address.
[**addressAddressUtxoGet**](AddressApi.md#addressAddressUtxoGet) | **GET** /address/{address}/utxo | Get address utxos by specific address(100 per page).


<a name="addressAddressBalanceGet"></a>
# **addressAddressBalanceGet**
> AddressBalance addressAddressBalanceGet(address)

Get address balance by specific address.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.AddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddressApi apiInstance = new AddressApi(defaultClient);
    String address = "address_example"; // String | the requested address
    try {
      AddressBalance result = apiInstance.addressAddressBalanceGet(address);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#addressAddressBalanceGet");
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
 **address** | **String**| the requested address |

### Return type

[**AddressBalance**](AddressBalance.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get address detail success. |  -  |

<a name="addressAddressUtxoGet"></a>
# **addressAddressUtxoGet**
> List&lt;AddressUtxo&gt; addressAddressUtxoGet(address, flag)

Get address utxos by specific address(100 per page).

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.AddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddressApi apiInstance = new AddressApi(defaultClient);
    String address = "address_example"; // String | the requested address
    String flag = "flag_example"; // String | The last id of the last query(Paging flag)
    try {
      List<AddressUtxo> result = apiInstance.addressAddressUtxoGet(address, flag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#addressAddressUtxoGet");
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
 **address** | **String**| the requested address |
 **flag** | **String**| The last id of the last query(Paging flag) | [optional]

### Return type

[**List&lt;AddressUtxo&gt;**](AddressUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get address utxos success. |  -  |

