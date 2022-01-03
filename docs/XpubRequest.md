

# XpubRequest

Request object to register(or delete) a new xpub
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**xpub** | **String** | The xpub to register. |  [optional]
**skipHeight** | **Integer** | Skip transactions before this height. Default is 0. Ignore this while deleting xpub. |  [optional]
**initReceiveIndex** | **Integer** | Set the init maxReceiveIndex to {initReceiveIndex}(less than 5000) before the initial crawl , default is 200. This could increase cost. |  [optional]
**initChangeIndex** | **Integer** | Set the init maxChangeIndex(less than 5000) before the initial crawl , default is 200. This could increase cost. |  [optional]



