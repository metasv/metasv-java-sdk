

# XpubUtxo

Utxo belongs to the specified xpub
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**xpub** | **String** | xpub of the utxo |  [optional]
**address** | **String** | Address string of this utxo |  [optional]
**addressType** | **Integer** | Address type, 0 for receive address, 1 for change address. path is {{addressType}}/{{addressIndex}} |  [optional]
**addressIndex** | **Integer** | Address index. Address path in the xpub is {{addressType}}/{{addressIndex}} |  [optional]
**txid** | **String** | Txid for this utxo. |  [optional]
**txIndex** | **Integer** | Output index for the Utxo. |  [optional]
**value** | **Long** | Satoshi value of the utxo. |  [optional]
**height** | **Integer** | The height of this utxo, -1 for unconfirmed utxo. |  [optional]
**flag** | **Long** | The paging flag of utxo |  [optional]



