

# XPubTransaction

Xpub transaction history
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**xpub** | **String** | query xpub |  [optional]
**txid** | **String** | Txid for this transaction. |  [optional]
**maxReceiveIndex** | **Integer** | Max lookahead receive index when processing this transaction. |  [optional]
**maxChangeIndex** | **Integer** | Max lookahead change index when processing this transaction. |  [optional]
**income** | **Long** | Total received satoshis(Including all address) |  [optional]
**outcome** | **Long** | Total spent satoshis(Including all address) |  [optional]
**height** | **Integer** | Height for this transaction. -1 for unconfirmed |  [optional]
**blockIndex** | **Integer** | Block index for this transaction, -1 for unconfirmed |  [optional]
**blockTime** | **Long** | Block timestamp for this transaction, if unconfirmed, the time is first seen time. |  [optional]
**flag** | **String** | Paging flag, format blockTimestamp_blockIndex |  [optional]



