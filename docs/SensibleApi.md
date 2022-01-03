# SensibleApi

All URIs are relative to *https://apiv2.metasv.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sensibleFtAddressAddressBalanceGet**](SensibleApi.md#sensibleFtAddressAddressBalanceGet) | **GET** /sensible/ft/address/{address}/balance | Get all sensible token balances for specific address.
[**sensibleFtAddressAddressTxsGet**](SensibleApi.md#sensibleFtAddressAddressTxsGet) | **GET** /sensible/ft/address/{address}/txs | Get all sensible token transaction history for specific address.
[**sensibleFtAddressAddressUtxoGet**](SensibleApi.md#sensibleFtAddressAddressUtxoGet) | **GET** /sensible/ft/address/{address}/utxo | Get all sensible token utxos for specific address.
[**sensibleOracleGet**](SensibleApi.md#sensibleOracleGet) | **GET** /sensible/oracle | Get metasv sensible oracle info.
[**sensibleOracleUtxoSpendByTxidIndexByTxidGet**](SensibleApi.md#sensibleOracleUtxoSpendByTxidIndexByTxidGet) | **GET** /sensible/oracle/utxoSpendBy/{txid}/{index}/{byTxid} | Get signature for utxo spend by transaction.
[**sensibleOracleUtxoSpendByUtxoTxidIndexByTxidByTxIndexGet**](SensibleApi.md#sensibleOracleUtxoSpendByUtxoTxidIndexByTxidByTxIndexGet) | **GET** /sensible/oracle/utxoSpendByUtxo/{txid}/{index}/{byTxid}/{byTxIndex} | Get signature for utxo spend by transaction.
[**sensibleOracleUtxoTxidIndexGet**](SensibleApi.md#sensibleOracleUtxoTxidIndexGet) | **GET** /sensible/oracle/utxo/{txid}/{index} | Get signature for utxo.


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

<a name="sensibleFtAddressAddressTxsGet"></a>
# **sensibleFtAddressAddressTxsGet**
> List&lt;SensibleFtTransaction&gt; sensibleFtAddressAddressTxsGet(address, codeHash, genesis, flag)

Get all sensible token transaction history for specific address.

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
    String flag = "flag_example"; // String | The last id of the last query(Paging flag)
    try {
      List<SensibleFtTransaction> result = apiInstance.sensibleFtAddressAddressTxsGet(address, codeHash, genesis, flag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensibleApi#sensibleFtAddressAddressTxsGet");
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
 **flag** | **String**| The last id of the last query(Paging flag) | [optional]

### Return type

[**List&lt;SensibleFtTransaction&gt;**](SensibleFtTransaction.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get sensible ft transactions success. |  -  |
**401** |  |  -  |

<a name="sensibleFtAddressAddressUtxoGet"></a>
# **sensibleFtAddressAddressUtxoGet**
> List&lt;SensibleFtUtxo&gt; sensibleFtAddressAddressUtxoGet(address, codeHash, genesis)

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
    try {
      List<SensibleFtUtxo> result = apiInstance.sensibleFtAddressAddressUtxoGet(address, codeHash, genesis);
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

<a name="sensibleOracleGet"></a>
# **sensibleOracleGet**
> SensibleOracleInfo sensibleOracleGet()

Get metasv sensible oracle info.

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
    try {
      SensibleOracleInfo result = apiInstance.sensibleOracleGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensibleApi#sensibleOracleGet");
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

[**SensibleOracleInfo**](SensibleOracleInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get sensible oracle success. |  -  |

<a name="sensibleOracleUtxoSpendByTxidIndexByTxidGet"></a>
# **sensibleOracleUtxoSpendByTxidIndexByTxidGet**
> SensibleSignatureUtxoSpendBy sensibleOracleUtxoSpendByTxidIndexByTxidGet(txid, index, byTxid)

Get signature for utxo spend by transaction.

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
    String txid = "txid_example"; // String | Utxo txid.
    Integer index = 56; // Integer | Utxo txid.
    String byTxid = "byTxid_example"; // String | txid that spent this utxo
    try {
      SensibleSignatureUtxoSpendBy result = apiInstance.sensibleOracleUtxoSpendByTxidIndexByTxidGet(txid, index, byTxid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensibleApi#sensibleOracleUtxoSpendByTxidIndexByTxidGet");
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
 **txid** | **String**| Utxo txid. |
 **index** | **Integer**| Utxo txid. |
 **byTxid** | **String**| txid that spent this utxo |

### Return type

[**SensibleSignatureUtxoSpendBy**](SensibleSignatureUtxoSpendBy.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get signature success. |  -  |
**404** | Utxo or transaction not found. |  -  |

<a name="sensibleOracleUtxoSpendByUtxoTxidIndexByTxidByTxIndexGet"></a>
# **sensibleOracleUtxoSpendByUtxoTxidIndexByTxidByTxIndexGet**
> SensibleSignatureUtxoSpendByUtxo sensibleOracleUtxoSpendByUtxoTxidIndexByTxidByTxIndexGet(txid, index, byTxid, byTxIndex)

Get signature for utxo spend by transaction.

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
    String txid = "txid_example"; // String | Utxo txid.
    Integer index = 56; // Integer | Utxo txid.
    String byTxid = "byTxid_example"; // String | txid that spent this utxo
    Integer byTxIndex = 56; // Integer | tx index that spent this utxo
    try {
      SensibleSignatureUtxoSpendByUtxo result = apiInstance.sensibleOracleUtxoSpendByUtxoTxidIndexByTxidByTxIndexGet(txid, index, byTxid, byTxIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensibleApi#sensibleOracleUtxoSpendByUtxoTxidIndexByTxidByTxIndexGet");
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
 **txid** | **String**| Utxo txid. |
 **index** | **Integer**| Utxo txid. |
 **byTxid** | **String**| txid that spent this utxo |
 **byTxIndex** | **Integer**| tx index that spent this utxo |

### Return type

[**SensibleSignatureUtxoSpendByUtxo**](SensibleSignatureUtxoSpendByUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get signature success. |  -  |
**404** | Utxo or transaction not found. |  -  |

<a name="sensibleOracleUtxoTxidIndexGet"></a>
# **sensibleOracleUtxoTxidIndexGet**
> SensibleSignatureUtxo sensibleOracleUtxoTxidIndexGet(txid, index)

Get signature for utxo.

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
    String txid = "txid_example"; // String | Utxo txid.
    Integer index = 56; // Integer | Utxo txid.
    try {
      SensibleSignatureUtxo result = apiInstance.sensibleOracleUtxoTxidIndexGet(txid, index);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensibleApi#sensibleOracleUtxoTxidIndexGet");
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
 **txid** | **String**| Utxo txid. |
 **index** | **Integer**| Utxo txid. |

### Return type

[**SensibleSignatureUtxo**](SensibleSignatureUtxo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get signature success. |  -  |
**404** | Utxo not found. |  -  |

