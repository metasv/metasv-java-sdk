# AddressApi

All URIs are relative to *https://apiv2.metasv.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressAddressBalanceGet**](AddressApi.md#addressAddressBalanceGet) | **GET** /address/{address}/balance | Get address balance by specific address.
[**addressAddressTxGet**](AddressApi.md#addressAddressTxGet) | **GET** /address/{address}/tx | Get address history by specific address(Only recent 3 months available, Use super address apis if you need more history).
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

<a name="addressAddressTxGet"></a>
# **addressAddressTxGet**
> List&lt;AddressTx&gt; addressAddressTxGet(address, flag)

Get address history by specific address(Only recent 3 months available, Use super address apis if you need more history).

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
    String flag = "flag_example"; // String | The last flag of the last query record(Paging flag)
    try {
      List<AddressTx> result = apiInstance.addressAddressTxGet(address, flag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#addressAddressTxGet");
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
 **flag** | **String**| The last flag of the last query record(Paging flag) | [optional]

### Return type

[**List&lt;AddressTx&gt;**](AddressTx.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get address transactions success. |  -  |

<a name="addressAddressUtxoGet"></a>
# **addressAddressUtxoGet**
> List&lt;AddressUtxo&gt; addressAddressUtxoGet(address, flag, confirmed)

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
    Long flag = 56L; // Long | The last id of the last query(Paging flag)
    String confirmed = "confirmed_example"; // String | Whether the utxo is confirmed, true for confirmed utxo, false for unconfirmed utxo, null for all utxos.
    try {
      List<AddressUtxo> result = apiInstance.addressAddressUtxoGet(address, flag, confirmed);
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
 **flag** | **Long**| The last id of the last query(Paging flag) | [optional]
 **confirmed** | **String**| Whether the utxo is confirmed, true for confirmed utxo, false for unconfirmed utxo, null for all utxos. | [optional]

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

