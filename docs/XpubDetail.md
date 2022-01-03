

# XpubDetail

Registered Xpub detail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**xpub** | **String** | String encoded extended pubkey (xpub) |  [optional]
**receiveIndex** | **Integer** | Next unused receive index, path /0/index |  [optional]
**maxReceiveIndex** | **Integer** | Max lookahead receive index. |  [optional]
**changeIndex** | **Integer** | Next unused change index, path /1/index |  [optional]
**maxChangeIndex** | **Integer** | Max lookahead change index. |  [optional]
**mode** | **Integer** | Current xpub process mode, 0 means preparing(not ready), 1 means synchronizing(ready) |  [optional]
**skipHeight** | **Integer** | Skip blocks before skipHeight while searching transactions. This will speed up sync time. |  [optional]
**processHeight** | **Integer** | Xpub current processed height. |  [optional]



