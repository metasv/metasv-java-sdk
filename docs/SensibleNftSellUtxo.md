

# SensibleNftSellUtxo

Sensible nft sell Utxo belongs to the specified address
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | Address string of this utxo |  [optional]
**contractAddress** | **String** | Address calculated from contract hash(p2ch). |  [optional]
**txid** | **String** | Txid for this utxo. |  [optional]
**txIndex** | **Integer** | Output index for the Utxo. |  [optional]
**codeHash** | **String** | Codehash of this utxo. |  [optional]
**genesis** | **String** | Genesis of this utxo. |  [optional]
**tokenIndex** | **Long** | The index of this NFT. |  [optional]
**price** | **Long** | the price of nft. |  [optional]
**satoshi** | **Long** | Bsv value of the utxo(Irrelavant to token value) |  [optional]
**satoshiString** | **String** | Bsv value of the utxo(In string format) |  [optional]
**height** | **Integer** | The height of this utxo, -1 for unconfirmed utxo. |  [optional]
**isReady** | **Boolean** | Is current nft transfered into sell contract, If not ready, the following fields will be null |  [optional]
**sensibleId** | **String** | SensibleId of the token |  [optional]
**metaTxid** | **String** | The metanet tx describing the nft. |  [optional]
**metaOutputIndex** | **Integer** | Symbol of the token. |  [optional]
**tokenSupply** | **Long** | The total supply of this NFT. |  [optional]
**flag** | **String** | Flag used for paging |  [optional]



