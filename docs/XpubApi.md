# XpubApi

All URIs are relative to *https://apiv2.metasv.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**xpubPost**](XpubApi.md#xpubPost) | **POST** /xpub | Register a new xpub.
[**xpubXpubAddressAddressGet**](XpubApi.md#xpubXpubAddressAddressGet) | **GET** /xpub/{xpub}/address/{address} | Get xpub address type and index. Only index under max index is valid. Otherwise not found.
[**xpubXpubBalanceGet**](XpubApi.md#xpubXpubBalanceGet) | **GET** /xpub/{xpub}/balance | Get xpub balances including confirmed and unconfirmed.
[**xpubXpubDelete**](XpubApi.md#xpubXpubDelete) | **DELETE** /xpub/{xpub} | Delete a registered xpub.
[**xpubXpubGet**](XpubApi.md#xpubXpubGet) | **GET** /xpub/{xpub} | Get xpub detail and status. Only registered xpub available.
[**xpubXpubTxsGet**](XpubApi.md#xpubXpubTxsGet) | **GET** /xpub/{xpub}/txs | Get xpub transaction history by specific xpub(100 per page).
[**xpubXpubUtxoCountGet**](XpubApi.md#xpubXpubUtxoCountGet) | **GET** /xpub/{xpub}/utxo/count | Get valid utxo count(including confirmed and unconfirmed).
[**xpubXpubUtxoGet**](XpubApi.md#xpubXpubUtxoGet) | **GET** /xpub/{xpub}/utxo | Get xpub utxos by specific xpub(300 per page).
[**xpubsCountGet**](XpubApi.md#xpubsCountGet) | **GET** /xpubs/count | Get the total count of registered xpubs.
[**xpubsGet**](XpubApi.md#xpubsGet) | **GET** /xpubs | Get all registered xpub strings. 300 per page.


<a name="xpubPost"></a>
# **xpubPost**
> XpubResult xpubPost(xpubRequest)

Register a new xpub.

You have to register xpub before you can query them.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.XpubApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    XpubApi apiInstance = new XpubApi(defaultClient);
    XpubRequest xpubRequest = new XpubRequest(); // XpubRequest | 
    try {
      XpubResult result = apiInstance.xpubPost(xpubRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XpubApi#xpubPost");
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
 **xpubRequest** | [**XpubRequest**](XpubRequest.md)|  | [optional]

### Return type

[**XpubResult**](XpubResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Register success, xpub returned. |  -  |
**200** | Register success, while xpub already exists. xpub returned. |  -  |
**403** | Register forbidden. Not authorized or exceed register limit. |  -  |
**400** | Bad request, xpub is not valid or skipHeight is beyond current block height. |  -  |
**401** |  |  -  |

<a name="xpubXpubAddressAddressGet"></a>
# **xpubXpubAddressAddressGet**
> XpubAddress xpubXpubAddressAddressGet(xpub, address)

Get xpub address type and index. Only index under max index is valid. Otherwise not found.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.XpubApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    XpubApi apiInstance = new XpubApi(defaultClient);
    String xpub = "xpub_example"; // String | the requested xpub
    String address = "address_example"; // String | the requested address
    try {
      XpubAddress result = apiInstance.xpubXpubAddressAddressGet(xpub, address);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XpubApi#xpubXpubAddressAddressGet");
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
 **xpub** | **String**| the requested xpub |
 **address** | **String**| the requested address |

### Return type

[**XpubAddress**](XpubAddress.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get xpub address success. |  -  |
**401** |  |  -  |
**404** | Address not found in the xpub. |  -  |

<a name="xpubXpubBalanceGet"></a>
# **xpubXpubBalanceGet**
> XpubBalance xpubXpubBalanceGet(xpub)

Get xpub balances including confirmed and unconfirmed.

This api returns confirmed balance(same as address balance), not sumed utxos.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.XpubApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    XpubApi apiInstance = new XpubApi(defaultClient);
    String xpub = "xpub_example"; // String | the xpub to search
    try {
      XpubBalance result = apiInstance.xpubXpubBalanceGet(xpub);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XpubApi#xpubXpubBalanceGet");
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
 **xpub** | **String**| the xpub to search |

### Return type

[**XpubBalance**](XpubBalance.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get xpub balance success. |  -  |
**401** |  |  -  |

<a name="xpubXpubDelete"></a>
# **xpubXpubDelete**
> XpubResult xpubXpubDelete(xpub)

Delete a registered xpub.

You can use this api to delete your registered xpub.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.XpubApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    XpubApi apiInstance = new XpubApi(defaultClient);
    String xpub = "xpub_example"; // String | the xpub to search
    try {
      XpubResult result = apiInstance.xpubXpubDelete(xpub);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XpubApi#xpubXpubDelete");
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
 **xpub** | **String**| the xpub to search |

### Return type

[**XpubResult**](XpubResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Delete success. |  -  |
**401** |  |  -  |

<a name="xpubXpubGet"></a>
# **xpubXpubGet**
> XpubDetail xpubXpubGet(xpub)

Get xpub detail and status. Only registered xpub available.

This api returns the xpub detail you registered, authentication is required.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.XpubApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    XpubApi apiInstance = new XpubApi(defaultClient);
    String xpub = "xpub_example"; // String | the xpub to search
    try {
      XpubDetail result = apiInstance.xpubXpubGet(xpub);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XpubApi#xpubXpubGet");
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
 **xpub** | **String**| the xpub to search |

### Return type

[**XpubDetail**](XpubDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get xpub detail success. |  -  |
**404** | Xpub not found or not registered by your account. |  -  |
**401** |  |  -  |

<a name="xpubXpubTxsGet"></a>
# **xpubXpubTxsGet**
> List&lt;XPubTransaction&gt; xpubXpubTxsGet(xpub, flag)

Get xpub transaction history by specific xpub(100 per page).

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.XpubApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    XpubApi apiInstance = new XpubApi(defaultClient);
    String xpub = "xpub_example"; // String | the requested xpub
    String flag = "flag_example"; // String | The last id of the last query(Paging flag)
    try {
      List<XPubTransaction> result = apiInstance.xpubXpubTxsGet(xpub, flag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XpubApi#xpubXpubTxsGet");
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
 **xpub** | **String**| the requested xpub |
 **flag** | **String**| The last id of the last query(Paging flag) | [optional]

### Return type

[**List&lt;XPubTransaction&gt;**](XPubTransaction.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get xpub transactions success. |  -  |
**401** |  |  -  |

<a name="xpubXpubUtxoCountGet"></a>
# **xpubXpubUtxoCountGet**
> Integer xpubXpubUtxoCountGet(xpub)

Get valid utxo count(including confirmed and unconfirmed).

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.XpubApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    XpubApi apiInstance = new XpubApi(defaultClient);
    String xpub = "xpub_example"; // String | the requested xpub
    try {
      Integer result = apiInstance.xpubXpubUtxoCountGet(xpub);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XpubApi#xpubXpubUtxoCountGet");
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
 **xpub** | **String**| the requested xpub |

### Return type

**Integer**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get total utxo count success. |  -  |
**401** |  |  -  |

<a name="xpubXpubUtxoGet"></a>
# **xpubXpubUtxoGet**
> List&lt;XpubUtxo&gt; xpubXpubUtxoGet(xpub, limit)

Get xpub utxos by specific xpub(300 per page).

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.XpubApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    XpubApi apiInstance = new XpubApi(defaultClient);
    String xpub = "xpub_example"; // String | the requested xpub
    Long limit = 56L; // Long | The max items returned in this query(default 300), not bigger than 500.
    try {
      List<XpubUtxo> result = apiInstance.xpubXpubUtxoGet(xpub, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XpubApi#xpubXpubUtxoGet");
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
 **xpub** | **String**| the requested xpub |
 **limit** | **Long**| The max items returned in this query(default 300), not bigger than 500. | [optional]

### Return type

[**List&lt;XpubUtxo&gt;**](XpubUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get xpub utxos success. |  -  |
**401** |  |  -  |

<a name="xpubsCountGet"></a>
# **xpubsCountGet**
> Integer xpubsCountGet()

Get the total count of registered xpubs.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.XpubApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    XpubApi apiInstance = new XpubApi(defaultClient);
    try {
      Integer result = apiInstance.xpubsCountGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XpubApi#xpubsCountGet");
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

**Integer**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get total count success. |  -  |
**401** |  |  -  |

<a name="xpubsGet"></a>
# **xpubsGet**
> List&lt;String&gt; xpubsGet(flag)

Get all registered xpub strings. 300 per page.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.XpubApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    XpubApi apiInstance = new XpubApi(defaultClient);
    String flag = "flag_example"; // String | The last xpub of the last query(Paging flag)
    try {
      List<String> result = apiInstance.xpubsGet(flag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XpubApi#xpubsGet");
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
 **flag** | **String**| The last xpub of the last query(Paging flag) | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get all registered xpub strings. |  -  |
**401** |  |  -  |

