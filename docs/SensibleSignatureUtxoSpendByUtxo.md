

# SensibleSignatureUtxoSpendByUtxo

Signature for utxo spent by tx, and signature for new utxo.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txId** | **String** | Utxo txid(same as parameter). |  [optional]
**index** | **Integer** | utxo index(same as parameter) |  [optional]
**byTxId** | **String** | spent txid(same as parameter). |  [optional]
**byTxIndex** | **Integer** | spent utxo index(same as parameter). |  [optional]
**sigBE** | **String** | Big endian signature hex. |  [optional]
**sigLE** | **String** | Little endian signature hex. |  [optional]
**padding** | **String** | Signature padding. |  [optional]
**payload** | **String** | Signature payload(txid, index, value, hash160(script), bytxid) |  [optional]
**byTxSigBE** | **String** | Big endian signature hex. |  [optional]
**byTxSigLE** | **String** | Little endian signature hex. |  [optional]
**byTxPadding** | **String** | Signature padding. |  [optional]
**byTxPayload** | **String** | Payload for the new utxo(byTxid, byTxIndex, byTxValue, hash160(byTxScript)). |  [optional]
**byTxScript** | **String** | Script with hex encoding |  [optional]



