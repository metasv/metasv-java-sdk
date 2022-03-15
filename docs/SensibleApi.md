# SensibleApi

All URIs are relative to *https://apiv2.metasv.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sensibleFtAddressAddressBalanceGet**](SensibleApi.md#sensibleFtAddressAddressBalanceGet) | **GET** /sensible/ft/address/{address}/balance | Get all sensible token balances for specific address.
[**sensibleFtAddressAddressUtxoGet**](SensibleApi.md#sensibleFtAddressAddressUtxoGet) | **GET** /sensible/ft/address/{address}/utxo | Get all sensible token utxos for specific address.
[**sensibleNftAddressAddressUtxoGet**](SensibleApi.md#sensibleNftAddressAddressUtxoGet) | **GET** /sensible/nft/address/{address}/utxo | Get all sensible nft token utxos for specific address.
[**sensibleNftAuctionCodeHashCodeHashNftIdNftIdUtxoGet**](SensibleApi.md#sensibleNftAuctionCodeHashCodeHashNftIdNftIdUtxoGet) | **GET** /sensible/nft/auction/codeHash/{codeHash}/nftId/{nftId}/utxo | Get all sensible nft token utxos by codeHash and genesisId.
[**sensibleNftGenesisCodeHashGenesisUtxoGet**](SensibleApi.md#sensibleNftGenesisCodeHashGenesisUtxoGet) | **GET** /sensible/nft/genesis/{codeHash}/{genesis}/utxo | Get all sensible nft token utxos by codeHash and genesisId.
[**sensibleNftSellAddressAddressUtxoGet**](SensibleApi.md#sensibleNftSellAddressAddressUtxoGet) | **GET** /sensible/nft/sell/address/{address}/utxo | Get all sensible sell sell utxos for specific address.
[**sensibleNftSellGenesisCodeHashGenesisUtxoGet**](SensibleApi.md#sensibleNftSellGenesisCodeHashGenesisUtxoGet) | **GET** /sensible/nft/sell/genesis/{codeHash}/{genesis}/utxo | Get all sensible nft token utxos by codeHash and genesisId.


<a name="sensibleFtAddressAddressBalanceGet"></a>
# **sensibleFtAddressAddressBalanceGet**
> List&lt;SensibleFtBalance&gt; sensibleFtAddressAddressBalanceGet(address, codeHash, genesis)

Get all sensible token balances for specific address.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.SensibleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SensibleApi apiInstance = new SensibleApi(defaultClient);
    String address = "address_example"; // String | the requested address
    String codeHash = "codeHash_example"; // String | Filter by contract code hash
    String genesis = "genesis_example"; // String | Filter by contract genesis
    try {
      List<SensibleFtBalance> result = apiInstance.sensibleFtAddressAddressBalanceGet(address, codeHash, genesis);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensibleApi#sensibleFtAddressAddressBalanceGet");
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
 **codeHash** | **String**| Filter by contract code hash | [optional]
 **genesis** | **String**| Filter by contract genesis | [optional]

### Return type

[**List&lt;SensibleFtBalance&gt;**](SensibleFtBalance.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get sensible ft balances success. |  -  |
**401** |  |  -  |

<a name="sensibleFtAddressAddressUtxoGet"></a>
# **sensibleFtAddressAddressUtxoGet**
> List&lt;SensibleFtUtxo&gt; sensibleFtAddressAddressUtxoGet(address, codeHash, genesis, flag)

Get all sensible token utxos for specific address.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.SensibleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SensibleApi apiInstance = new SensibleApi(defaultClient);
    String address = "address_example"; // String | the requested address
    String codeHash = "codeHash_example"; // String | Filter by contract code hash
    String genesis = "genesis_example"; // String | Filter by contract genesis
    String flag = "flag_example"; // String | The flag of the last query Item(Paging flag)
    try {
      List<SensibleFtUtxo> result = apiInstance.sensibleFtAddressAddressUtxoGet(address, codeHash, genesis, flag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensibleApi#sensibleFtAddressAddressUtxoGet");
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
 **codeHash** | **String**| Filter by contract code hash | [optional]
 **genesis** | **String**| Filter by contract genesis | [optional]
 **flag** | **String**| The flag of the last query Item(Paging flag) | [optional]

### Return type

[**List&lt;SensibleFtUtxo&gt;**](SensibleFtUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get sensible ft utxo success. |  -  |
**401** |  |  -  |

<a name="sensibleNftAddressAddressUtxoGet"></a>
# **sensibleNftAddressAddressUtxoGet**
> List&lt;SensibleNftUtxo&gt; sensibleNftAddressAddressUtxoGet(address, codeHash, genesis, flag)

Get all sensible nft token utxos for specific address.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.SensibleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SensibleApi apiInstance = new SensibleApi(defaultClient);
    String address = "address_example"; // String | the requested address
    String codeHash = "codeHash_example"; // String | Filter by contract code hash
    String genesis = "genesis_example"; // String | Filter by contract genesis
    String flag = "flag_example"; // String | The flag of the last query Item(Paging flag)
    try {
      List<SensibleNftUtxo> result = apiInstance.sensibleNftAddressAddressUtxoGet(address, codeHash, genesis, flag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensibleApi#sensibleNftAddressAddressUtxoGet");
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
 **codeHash** | **String**| Filter by contract code hash | [optional]
 **genesis** | **String**| Filter by contract genesis | [optional]
 **flag** | **String**| The flag of the last query Item(Paging flag) | [optional]

### Return type

[**List&lt;SensibleNftUtxo&gt;**](SensibleNftUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get sensible nft utxo success. |  -  |
**401** |  |  -  |

<a name="sensibleNftAuctionCodeHashCodeHashNftIdNftIdUtxoGet"></a>
# **sensibleNftAuctionCodeHashCodeHashNftIdNftIdUtxoGet**
> List&lt;SensibleNftAuctionUtxo&gt; sensibleNftAuctionCodeHashCodeHashNftIdNftIdUtxoGet(codeHash, nftId)

Get all sensible nft token utxos by codeHash and genesisId.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.SensibleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SensibleApi apiInstance = new SensibleApi(defaultClient);
    String codeHash = "codeHash_example"; // String | Code hash of the token.
    String nftId = "nftId_example"; // String | Nft id of this auction.
    try {
      List<SensibleNftAuctionUtxo> result = apiInstance.sensibleNftAuctionCodeHashCodeHashNftIdNftIdUtxoGet(codeHash, nftId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensibleApi#sensibleNftAuctionCodeHashCodeHashNftIdNftIdUtxoGet");
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
 **codeHash** | **String**| Code hash of the token. |
 **nftId** | **String**| Nft id of this auction. |

### Return type

[**List&lt;SensibleNftAuctionUtxo&gt;**](SensibleNftAuctionUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get sensible nft sell utxo success. |  -  |
**401** |  |  -  |

<a name="sensibleNftGenesisCodeHashGenesisUtxoGet"></a>
# **sensibleNftGenesisCodeHashGenesisUtxoGet**
> List&lt;SensibleNftUtxo&gt; sensibleNftGenesisCodeHashGenesisUtxoGet(codeHash, genesis, tokenIndex, max, min)

Get all sensible nft token utxos by codeHash and genesisId.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.SensibleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SensibleApi apiInstance = new SensibleApi(defaultClient);
    String codeHash = "codeHash_example"; // String | Code hash of the token.
    String genesis = "genesis_example"; // String | Contract genesis
    Long tokenIndex = 56L; // Long | Find exact token Index.
    Long max = 56L; // Long | Token index not bigger than this(include this).
    Long min = 56L; // Long | Token index not less than this(include this).
    try {
      List<SensibleNftUtxo> result = apiInstance.sensibleNftGenesisCodeHashGenesisUtxoGet(codeHash, genesis, tokenIndex, max, min);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensibleApi#sensibleNftGenesisCodeHashGenesisUtxoGet");
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
 **codeHash** | **String**| Code hash of the token. |
 **genesis** | **String**| Contract genesis |
 **tokenIndex** | **Long**| Find exact token Index. | [optional]
 **max** | **Long**| Token index not bigger than this(include this). | [optional]
 **min** | **Long**| Token index not less than this(include this). | [optional]

### Return type

[**List&lt;SensibleNftUtxo&gt;**](SensibleNftUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get sensible nft utxo success. |  -  |
**401** |  |  -  |

<a name="sensibleNftSellAddressAddressUtxoGet"></a>
# **sensibleNftSellAddressAddressUtxoGet**
> List&lt;SensibleNftSellUtxo&gt; sensibleNftSellAddressAddressUtxoGet(address, codeHash, genesis, flag)

Get all sensible sell sell utxos for specific address.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.SensibleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SensibleApi apiInstance = new SensibleApi(defaultClient);
    String address = "address_example"; // String | Owner address.
    String codeHash = "codeHash_example"; // String | Filter by contract code hash
    String genesis = "genesis_example"; // String | Filter by contract genesis
    String flag = "flag_example"; // String | The flag of the last query Item(Paging flag)
    try {
      List<SensibleNftSellUtxo> result = apiInstance.sensibleNftSellAddressAddressUtxoGet(address, codeHash, genesis, flag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensibleApi#sensibleNftSellAddressAddressUtxoGet");
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
 **address** | **String**| Owner address. |
 **codeHash** | **String**| Filter by contract code hash | [optional]
 **genesis** | **String**| Filter by contract genesis | [optional]
 **flag** | **String**| The flag of the last query Item(Paging flag) | [optional]

### Return type

[**List&lt;SensibleNftSellUtxo&gt;**](SensibleNftSellUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get sensible nft sell utxo success. |  -  |
**401** |  |  -  |

<a name="sensibleNftSellGenesisCodeHashGenesisUtxoGet"></a>
# **sensibleNftSellGenesisCodeHashGenesisUtxoGet**
> List&lt;SensibleNftSellUtxo&gt; sensibleNftSellGenesisCodeHashGenesisUtxoGet(codeHash, genesis, tokenIndex, max, min)

Get all sensible nft token utxos by codeHash and genesisId.

### Example
```java
// Import classes:
import com.metasv.client.openapi.ApiClient;
import com.metasv.client.openapi.ApiException;
import com.metasv.client.openapi.Configuration;
import com.metasv.client.openapi.auth.*;
import com.metasv.client.openapi.models.*;
import com.metasv.client.openapi.api.SensibleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiv2.metasv.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SensibleApi apiInstance = new SensibleApi(defaultClient);
    String codeHash = "codeHash_example"; // String | Code hash of the token.
    String genesis = "genesis_example"; // String | Contract genesis
    Long tokenIndex = 56L; // Long | Find exact token Index.
    Long max = 56L; // Long | Token index not bigger than this(include this).
    Long min = 56L; // Long | Token index not less than this(include this).
    try {
      List<SensibleNftSellUtxo> result = apiInstance.sensibleNftSellGenesisCodeHashGenesisUtxoGet(codeHash, genesis, tokenIndex, max, min);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensibleApi#sensibleNftSellGenesisCodeHashGenesisUtxoGet");
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
 **codeHash** | **String**| Code hash of the token. |
 **genesis** | **String**| Contract genesis |
 **tokenIndex** | **Long**| Find exact token Index. | [optional]
 **max** | **Long**| Token index not bigger than this(include this). | [optional]
 **min** | **Long**| Token index not less than this(include this). | [optional]

### Return type

[**List&lt;SensibleNftSellUtxo&gt;**](SensibleNftSellUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get sensible nft sell utxo success. |  -  |
**401** |  |  -  |

