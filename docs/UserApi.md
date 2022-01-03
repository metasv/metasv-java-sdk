# UserApi

All URIs are relative to *https://apiv2.metasv.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userClientPubkeyGet**](UserApi.md#userClientPubkeyGet) | **GET** /user/clientPubkey | See https://github.com/metasv/metasv-client-signature for details. Get all trusted public keys.
[**userClientPubkeyPost**](UserApi.md#userClientPubkeyPost) | **POST** /user/clientPubkey | See https://github.com/metasv/metasv-client-signature for details. Register new client public key.
[**userClientPubkeyPubkeyDelete**](UserApi.md#userClientPubkeyPubkeyDelete) | **DELETE** /user/clientPubkey/{pubkey} | Delete a registered client public key.
[**userTrafficGet**](UserApi.md#userTrafficGet) | **GET** /user/traffic | Get traffic details for every hour(valid in six months).
[**userTrafficSumGet**](UserApi.md#userTrafficSumGet) | **GET** /user/traffic/sum | Sum all traffic in the current month.


<a name="userClientPubkeyGet"></a>
# **userClientPubkeyGet**
> List&lt;String&gt; userClientPubkeyGet()

See https://github.com/metasv/metasv-client-signature for details. Get all trusted public keys.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    try {
      List<String> result = apiInstance.userClientPubkeyGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#userClientPubkeyGet");
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

**List&lt;String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get all registered client public keys. |  -  |
**401** |  |  -  |

<a name="userClientPubkeyPost"></a>
# **userClientPubkeyPost**
> ClientPubkeyResult userClientPubkeyPost(clientPubkeyRequest)

See https://github.com/metasv/metasv-client-signature for details. Register new client public key.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    ClientPubkeyRequest clientPubkeyRequest = new ClientPubkeyRequest(); // ClientPubkeyRequest | 
    try {
      ClientPubkeyResult result = apiInstance.userClientPubkeyPost(clientPubkeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#userClientPubkeyPost");
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
 **clientPubkeyRequest** | [**ClientPubkeyRequest**](ClientPubkeyRequest.md)|  | [optional]

### Return type

[**ClientPubkeyResult**](ClientPubkeyResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Register success, pubkey returned. |  -  |
**200** | Register success, while pubkey already exists. pubkey returned. |  -  |
**403** | Register forbidden. Not authorized or exceed register limit. |  -  |
**400** | Bad request, pubkey is not valid, or already registered by others. |  -  |
**401** |  |  -  |

<a name="userClientPubkeyPubkeyDelete"></a>
# **userClientPubkeyPubkeyDelete**
> ClientPubkeyResult userClientPubkeyPubkeyDelete(pubkey)

Delete a registered client public key.

See https://github.com/metasv/metasv-client-signature for details. You can use this api to delete your registered public key.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    String pubkey = "pubkey_example"; // String | the pubkey to delete
    try {
      ClientPubkeyResult result = apiInstance.userClientPubkeyPubkeyDelete(pubkey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#userClientPubkeyPubkeyDelete");
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
 **pubkey** | **String**| the pubkey to delete |

### Return type

[**ClientPubkeyResult**](ClientPubkeyResult.md)

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

<a name="userTrafficGet"></a>
# **userTrafficGet**
> List&lt;UserHourlyTraffic&gt; userTrafficGet(startTime, endTime)

Get traffic details for every hour(valid in six months).

Return hourly summed outbound traffic bytes.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    Long startTime = 56L; // Long | define start query time(unix timestamp)
    Long endTime = 56L; // Long | define end query time(unix timestamp)
    try {
      List<UserHourlyTraffic> result = apiInstance.userTrafficGet(startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#userTrafficGet");
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
 **startTime** | **Long**| define start query time(unix timestamp) | [optional]
 **endTime** | **Long**| define end query time(unix timestamp) | [optional]

### Return type

[**List&lt;UserHourlyTraffic&gt;**](UserHourlyTraffic.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get hourly traffic success. |  -  |
**401** |  |  -  |

<a name="userTrafficSumGet"></a>
# **userTrafficSumGet**
> UserTrafficSum userTrafficSumGet()

Sum all traffic in the current month.

Return  summed outbound traffic bytes in current month.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    try {
      UserTrafficSum result = apiInstance.userTrafficSumGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#userTrafficSumGet");
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

[**UserTrafficSum**](UserTrafficSum.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get hourly traffic success. |  -  |
**401** |  |  -  |

