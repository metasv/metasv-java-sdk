

# SensibleSignatureUtxoSpendBy

Signature for utxo spent by tx.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txId** | **String** | Utxo txid. |  [optional]
**index** | **Integer** | utxo index |  [optional]
**byTxId** | **String** | Utxo txid. |  [optional]
**sigBE** | **String** | Big endian signature hex. |  [optional]
**sigLE** | **String** | Little endian signature hex. |  [optional]
**padding** | **String** | Signature padding. |  [optional]
**payload** | **String** | Signature payload(txid, index, value, hash160(script), bytxid) |  [optional]



