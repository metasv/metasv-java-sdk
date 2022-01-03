

# OutputInfo

spent status and value info of the output.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txid** | **String** | txid that this output is in. |  [optional]
**index** | **Integer** | index of this output in the tx. |  [optional]
**address** | **String** | parsed address of this output, empty for non standard. |  [optional]
**value** | **Long** | value of this output |  [optional]
**spent** | **Boolean** | this output is spent or not, true if spent |  [optional]
**spentTxid** | **String** | txid that spent this output |  [optional]
**spentIndex** | **Integer** | vin index of the spent tx |  [optional]
**spentHeight** | **Integer** | height of the spent tx(-1 if unconfirmed, 0 if unspent) |  [optional]



