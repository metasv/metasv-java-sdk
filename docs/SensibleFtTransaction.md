

# SensibleFtTransaction

Sensible fungible token transaction history for specific address
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | The querying address |  [optional]
**codeHash** | **String** | Codehash of the token. |  [optional]
**genesis** | **String** | Genesis of the token. |  [optional]
**sensibleId** | **String** | SensibleId of the token |  [optional]
**txid** | **String** | Txid for this transaction. |  [optional]
**name** | **String** | Name of the token. |  [optional]
**symbol** | **String** | Symbol of the token. |  [optional]
**decimal** | **Integer** | The decimal position. |  [optional]
**income** | **Long** | Total received token(This token only) |  [optional]
**outcome** | **Long** | Total spent token(This token only) |  [optional]
**height** | **Integer** | Height for this transaction. -1 for unconfirmed |  [optional]
**blockIndex** | **Integer** | Block index for this transaction, -1 for unconfirmed |  [optional]
**blockTime** | **Long** | Block timestamp for this transaction, if unconfirmed, the time is first seen time. |  [optional]
**flag** | **String** | Paging flag, format blockTimestamp_blockIndex |  [optional]



