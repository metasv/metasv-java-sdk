

# TxInput

Parsed inputs from raw tx. Use output api to get value and spent info.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Integer** | Input index of the tx. |  [optional]
**utxoTxid** | **String** | The outpoint utxo txid that this input spent |  [optional]
**utxoIndex** | **Integer** | The outpoint utxo index that this input spent |  [optional]
**address** | **String** | Parsed address from pubkey(P2PKH input only). |  [optional]
**value** | **Long** | satoshi value of this input. |  [optional]
**unlockScript** | **String** | The hex of the input script. |  [optional]



