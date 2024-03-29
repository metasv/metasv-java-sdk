/*
 * MetaSV API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 2.1.4
 * Contact: heqiming@metasv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.metasv.client.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Sensible nft auction Utxo belongs to the specified address
 */
@ApiModel(description = "Sensible nft auction Utxo belongs to the specified address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-08T16:23:39.010660+09:00[Asia/Tokyo]")
public class SensibleNftAuctionUtxo {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_TX_INDEX = "txIndex";
  @SerializedName(SERIALIZED_NAME_TX_INDEX)
  private Integer txIndex;

  public static final String SERIALIZED_NAME_BID_BSV_PRICE = "bidBsvPrice";
  @SerializedName(SERIALIZED_NAME_BID_BSV_PRICE)
  private Long bidBsvPrice;

  public static final String SERIALIZED_NAME_BID_TIMESTAMP = "bidTimestamp";
  @SerializedName(SERIALIZED_NAME_BID_TIMESTAMP)
  private Long bidTimestamp;

  public static final String SERIALIZED_NAME_BIDDER_ADDRESS_PKH = "bidderAddressPkh";
  @SerializedName(SERIALIZED_NAME_BIDDER_ADDRESS_PKH)
  private String bidderAddressPkh;

  public static final String SERIALIZED_NAME_CODE_HASH = "codeHash";
  @SerializedName(SERIALIZED_NAME_CODE_HASH)
  private String codeHash;

  public static final String SERIALIZED_NAME_GENESIS = "genesis";
  @SerializedName(SERIALIZED_NAME_GENESIS)
  private String genesis;

  public static final String SERIALIZED_NAME_END_TIMESTAMP = "endTimestamp";
  @SerializedName(SERIALIZED_NAME_END_TIMESTAMP)
  private Long endTimestamp;

  public static final String SERIALIZED_NAME_FEE_ADDRESS_PKH = "feeAddressPkh";
  @SerializedName(SERIALIZED_NAME_FEE_ADDRESS_PKH)
  private String feeAddressPkh;

  public static final String SERIALIZED_NAME_FEE_AMOUNT = "feeAmount";
  @SerializedName(SERIALIZED_NAME_FEE_AMOUNT)
  private Long feeAmount;

  public static final String SERIALIZED_NAME_FEE_RATE = "feeRate";
  @SerializedName(SERIALIZED_NAME_FEE_RATE)
  private Integer feeRate;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_NFT_CODE_HASH = "nftCodeHash";
  @SerializedName(SERIALIZED_NAME_NFT_CODE_HASH)
  private String nftCodeHash;

  public static final String SERIALIZED_NAME_NFT_ID = "nftId";
  @SerializedName(SERIALIZED_NAME_NFT_ID)
  private String nftId;

  public static final String SERIALIZED_NAME_SENDER_ADDRESS_PKH = "senderAddressPkh";
  @SerializedName(SERIALIZED_NAME_SENDER_ADDRESS_PKH)
  private String senderAddressPkh;

  public static final String SERIALIZED_NAME_SENSIBLE_ID = "sensibleId";
  @SerializedName(SERIALIZED_NAME_SENSIBLE_ID)
  private String sensibleId;

  public static final String SERIALIZED_NAME_START_BSV_PRICE = "startBsvPrice";
  @SerializedName(SERIALIZED_NAME_START_BSV_PRICE)
  private Long startBsvPrice;

  public static final String SERIALIZED_NAME_SATOSHI = "satoshi";
  @SerializedName(SERIALIZED_NAME_SATOSHI)
  private Long satoshi;

  public static final String SERIALIZED_NAME_SATOSHI_STRING = "satoshiString";
  @SerializedName(SERIALIZED_NAME_SATOSHI_STRING)
  private String satoshiString;

  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contractAddress";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;

  public static final String SERIALIZED_NAME_IS_READY = "isReady";
  @SerializedName(SERIALIZED_NAME_IS_READY)
  private Boolean isReady;

  public static final String SERIALIZED_NAME_FLAG = "flag";
  @SerializedName(SERIALIZED_NAME_FLAG)
  private String flag;


  public SensibleNftAuctionUtxo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address string of this utxo
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address string of this utxo")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public SensibleNftAuctionUtxo txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * Txid for this utxo.
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Txid for this utxo.")

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public SensibleNftAuctionUtxo txIndex(Integer txIndex) {
    
    this.txIndex = txIndex;
    return this;
  }

   /**
   * Output index for the Utxo.
   * @return txIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output index for the Utxo.")

  public Integer getTxIndex() {
    return txIndex;
  }


  public void setTxIndex(Integer txIndex) {
    this.txIndex = txIndex;
  }


  public SensibleNftAuctionUtxo bidBsvPrice(Long bidBsvPrice) {
    
    this.bidBsvPrice = bidBsvPrice;
    return this;
  }

   /**
   * bidBsvPrice
   * @return bidBsvPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "bidBsvPrice")

  public Long getBidBsvPrice() {
    return bidBsvPrice;
  }


  public void setBidBsvPrice(Long bidBsvPrice) {
    this.bidBsvPrice = bidBsvPrice;
  }


  public SensibleNftAuctionUtxo bidTimestamp(Long bidTimestamp) {
    
    this.bidTimestamp = bidTimestamp;
    return this;
  }

   /**
   * bidTimestamp
   * @return bidTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "bidTimestamp")

  public Long getBidTimestamp() {
    return bidTimestamp;
  }


  public void setBidTimestamp(Long bidTimestamp) {
    this.bidTimestamp = bidTimestamp;
  }


  public SensibleNftAuctionUtxo bidderAddressPkh(String bidderAddressPkh) {
    
    this.bidderAddressPkh = bidderAddressPkh;
    return this;
  }

   /**
   * bidderAddressPkh
   * @return bidderAddressPkh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "bidderAddressPkh")

  public String getBidderAddressPkh() {
    return bidderAddressPkh;
  }


  public void setBidderAddressPkh(String bidderAddressPkh) {
    this.bidderAddressPkh = bidderAddressPkh;
  }


  public SensibleNftAuctionUtxo codeHash(String codeHash) {
    
    this.codeHash = codeHash;
    return this;
  }

   /**
   * Codehash of this utxo.
   * @return codeHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Codehash of this utxo.")

  public String getCodeHash() {
    return codeHash;
  }


  public void setCodeHash(String codeHash) {
    this.codeHash = codeHash;
  }


  public SensibleNftAuctionUtxo genesis(String genesis) {
    
    this.genesis = genesis;
    return this;
  }

   /**
   * Genesis of this utxo.
   * @return genesis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Genesis of this utxo.")

  public String getGenesis() {
    return genesis;
  }


  public void setGenesis(String genesis) {
    this.genesis = genesis;
  }


  public SensibleNftAuctionUtxo endTimestamp(Long endTimestamp) {
    
    this.endTimestamp = endTimestamp;
    return this;
  }

   /**
   * endTimestamp
   * @return endTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "endTimestamp")

  public Long getEndTimestamp() {
    return endTimestamp;
  }


  public void setEndTimestamp(Long endTimestamp) {
    this.endTimestamp = endTimestamp;
  }


  public SensibleNftAuctionUtxo feeAddressPkh(String feeAddressPkh) {
    
    this.feeAddressPkh = feeAddressPkh;
    return this;
  }

   /**
   * feeAddressPkh
   * @return feeAddressPkh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "feeAddressPkh")

  public String getFeeAddressPkh() {
    return feeAddressPkh;
  }


  public void setFeeAddressPkh(String feeAddressPkh) {
    this.feeAddressPkh = feeAddressPkh;
  }


  public SensibleNftAuctionUtxo feeAmount(Long feeAmount) {
    
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * feeAmount
   * @return feeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "feeAmount")

  public Long getFeeAmount() {
    return feeAmount;
  }


  public void setFeeAmount(Long feeAmount) {
    this.feeAmount = feeAmount;
  }


  public SensibleNftAuctionUtxo feeRate(Integer feeRate) {
    
    this.feeRate = feeRate;
    return this;
  }

   /**
   * feeRate
   * @return feeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "feeRate")

  public Integer getFeeRate() {
    return feeRate;
  }


  public void setFeeRate(Integer feeRate) {
    this.feeRate = feeRate;
  }


  public SensibleNftAuctionUtxo height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * The height of this utxo, -1 for unconfirmed utxo.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height of this utxo, -1 for unconfirmed utxo.")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public SensibleNftAuctionUtxo nftCodeHash(String nftCodeHash) {
    
    this.nftCodeHash = nftCodeHash;
    return this;
  }

   /**
   * nftCodeHash
   * @return nftCodeHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "nftCodeHash")

  public String getNftCodeHash() {
    return nftCodeHash;
  }


  public void setNftCodeHash(String nftCodeHash) {
    this.nftCodeHash = nftCodeHash;
  }


  public SensibleNftAuctionUtxo nftId(String nftId) {
    
    this.nftId = nftId;
    return this;
  }

   /**
   * nftId of the auctioning fnt
   * @return nftId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "nftId of the auctioning fnt")

  public String getNftId() {
    return nftId;
  }


  public void setNftId(String nftId) {
    this.nftId = nftId;
  }


  public SensibleNftAuctionUtxo senderAddressPkh(String senderAddressPkh) {
    
    this.senderAddressPkh = senderAddressPkh;
    return this;
  }

   /**
   * senderAddressPkh
   * @return senderAddressPkh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "senderAddressPkh")

  public String getSenderAddressPkh() {
    return senderAddressPkh;
  }


  public void setSenderAddressPkh(String senderAddressPkh) {
    this.senderAddressPkh = senderAddressPkh;
  }


  public SensibleNftAuctionUtxo sensibleId(String sensibleId) {
    
    this.sensibleId = sensibleId;
    return this;
  }

   /**
   * SensibleId of the utxo
   * @return sensibleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SensibleId of the utxo")

  public String getSensibleId() {
    return sensibleId;
  }


  public void setSensibleId(String sensibleId) {
    this.sensibleId = sensibleId;
  }


  public SensibleNftAuctionUtxo startBsvPrice(Long startBsvPrice) {
    
    this.startBsvPrice = startBsvPrice;
    return this;
  }

   /**
   * startBsvPrice
   * @return startBsvPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "startBsvPrice")

  public Long getStartBsvPrice() {
    return startBsvPrice;
  }


  public void setStartBsvPrice(Long startBsvPrice) {
    this.startBsvPrice = startBsvPrice;
  }


  public SensibleNftAuctionUtxo satoshi(Long satoshi) {
    
    this.satoshi = satoshi;
    return this;
  }

   /**
   * Bsv value of the utxo(Irrelavant to token value)
   * @return satoshi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bsv value of the utxo(Irrelavant to token value)")

  public Long getSatoshi() {
    return satoshi;
  }


  public void setSatoshi(Long satoshi) {
    this.satoshi = satoshi;
  }


  public SensibleNftAuctionUtxo satoshiString(String satoshiString) {
    
    this.satoshiString = satoshiString;
    return this;
  }

   /**
   * Bsv value of the utxo(In string format)
   * @return satoshiString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bsv value of the utxo(In string format)")

  public String getSatoshiString() {
    return satoshiString;
  }


  public void setSatoshiString(String satoshiString) {
    this.satoshiString = satoshiString;
  }


  public SensibleNftAuctionUtxo contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * The hash160 of the script(p2ch address)
   * @return contractAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hash160 of the script(p2ch address)")

  public String getContractAddress() {
    return contractAddress;
  }


  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  public SensibleNftAuctionUtxo isReady(Boolean isReady) {
    
    this.isReady = isReady;
    return this;
  }

   /**
   * this the nft send to this contract address
   * @return isReady
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "this the nft send to this contract address")

  public Boolean getIsReady() {
    return isReady;
  }


  public void setIsReady(Boolean isReady) {
    this.isReady = isReady;
  }


  public SensibleNftAuctionUtxo flag(String flag) {
    
    this.flag = flag;
    return this;
  }

   /**
   * Flag used for paging
   * @return flag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag used for paging")

  public String getFlag() {
    return flag;
  }


  public void setFlag(String flag) {
    this.flag = flag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensibleNftAuctionUtxo sensibleNftAuctionUtxo = (SensibleNftAuctionUtxo) o;
    return Objects.equals(this.address, sensibleNftAuctionUtxo.address) &&
        Objects.equals(this.txid, sensibleNftAuctionUtxo.txid) &&
        Objects.equals(this.txIndex, sensibleNftAuctionUtxo.txIndex) &&
        Objects.equals(this.bidBsvPrice, sensibleNftAuctionUtxo.bidBsvPrice) &&
        Objects.equals(this.bidTimestamp, sensibleNftAuctionUtxo.bidTimestamp) &&
        Objects.equals(this.bidderAddressPkh, sensibleNftAuctionUtxo.bidderAddressPkh) &&
        Objects.equals(this.codeHash, sensibleNftAuctionUtxo.codeHash) &&
        Objects.equals(this.genesis, sensibleNftAuctionUtxo.genesis) &&
        Objects.equals(this.endTimestamp, sensibleNftAuctionUtxo.endTimestamp) &&
        Objects.equals(this.feeAddressPkh, sensibleNftAuctionUtxo.feeAddressPkh) &&
        Objects.equals(this.feeAmount, sensibleNftAuctionUtxo.feeAmount) &&
        Objects.equals(this.feeRate, sensibleNftAuctionUtxo.feeRate) &&
        Objects.equals(this.height, sensibleNftAuctionUtxo.height) &&
        Objects.equals(this.nftCodeHash, sensibleNftAuctionUtxo.nftCodeHash) &&
        Objects.equals(this.nftId, sensibleNftAuctionUtxo.nftId) &&
        Objects.equals(this.senderAddressPkh, sensibleNftAuctionUtxo.senderAddressPkh) &&
        Objects.equals(this.sensibleId, sensibleNftAuctionUtxo.sensibleId) &&
        Objects.equals(this.startBsvPrice, sensibleNftAuctionUtxo.startBsvPrice) &&
        Objects.equals(this.satoshi, sensibleNftAuctionUtxo.satoshi) &&
        Objects.equals(this.satoshiString, sensibleNftAuctionUtxo.satoshiString) &&
        Objects.equals(this.contractAddress, sensibleNftAuctionUtxo.contractAddress) &&
        Objects.equals(this.isReady, sensibleNftAuctionUtxo.isReady) &&
        Objects.equals(this.flag, sensibleNftAuctionUtxo.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, txid, txIndex, bidBsvPrice, bidTimestamp, bidderAddressPkh, codeHash, genesis, endTimestamp, feeAddressPkh, feeAmount, feeRate, height, nftCodeHash, nftId, senderAddressPkh, sensibleId, startBsvPrice, satoshi, satoshiString, contractAddress, isReady, flag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensibleNftAuctionUtxo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    txIndex: ").append(toIndentedString(txIndex)).append("\n");
    sb.append("    bidBsvPrice: ").append(toIndentedString(bidBsvPrice)).append("\n");
    sb.append("    bidTimestamp: ").append(toIndentedString(bidTimestamp)).append("\n");
    sb.append("    bidderAddressPkh: ").append(toIndentedString(bidderAddressPkh)).append("\n");
    sb.append("    codeHash: ").append(toIndentedString(codeHash)).append("\n");
    sb.append("    genesis: ").append(toIndentedString(genesis)).append("\n");
    sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
    sb.append("    feeAddressPkh: ").append(toIndentedString(feeAddressPkh)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    nftCodeHash: ").append(toIndentedString(nftCodeHash)).append("\n");
    sb.append("    nftId: ").append(toIndentedString(nftId)).append("\n");
    sb.append("    senderAddressPkh: ").append(toIndentedString(senderAddressPkh)).append("\n");
    sb.append("    sensibleId: ").append(toIndentedString(sensibleId)).append("\n");
    sb.append("    startBsvPrice: ").append(toIndentedString(startBsvPrice)).append("\n");
    sb.append("    satoshi: ").append(toIndentedString(satoshi)).append("\n");
    sb.append("    satoshiString: ").append(toIndentedString(satoshiString)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    isReady: ").append(toIndentedString(isReady)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

