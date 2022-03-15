/*
 * MetaSV API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 2.1.1
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
 * BlockHeader
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T15:32:54.023410+09:00[Asia/Tokyo]")
public class BlockHeader {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_BLOCK_HASH = "blockHash";
  @SerializedName(SERIALIZED_NAME_BLOCK_HASH)
  private String blockHash;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_PREV_BLOCK_HASH = "prevBlockHash";
  @SerializedName(SERIALIZED_NAME_PREV_BLOCK_HASH)
  private String prevBlockHash;

  public static final String SERIALIZED_NAME_MERKLE_ROOT = "merkleRoot";
  @SerializedName(SERIALIZED_NAME_MERKLE_ROOT)
  private String merkleRoot;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Long timestamp;

  public static final String SERIALIZED_NAME_MEDIAN_TIME = "medianTime";
  @SerializedName(SERIALIZED_NAME_MEDIAN_TIME)
  private Long medianTime;

  public static final String SERIALIZED_NAME_REWARD = "reward";
  @SerializedName(SERIALIZED_NAME_REWARD)
  private Long reward;

  public static final String SERIALIZED_NAME_MINER = "miner";
  @SerializedName(SERIALIZED_NAME_MINER)
  private String miner;

  public static final String SERIALIZED_NAME_MINER_ADDRESS = "minerAddress";
  @SerializedName(SERIALIZED_NAME_MINER_ADDRESS)
  private String minerAddress;

  public static final String SERIALIZED_NAME_TX_COUNT = "txCount";
  @SerializedName(SERIALIZED_NAME_TX_COUNT)
  private Integer txCount;

  public static final String SERIALIZED_NAME_INPUT_COUNT = "inputCount";
  @SerializedName(SERIALIZED_NAME_INPUT_COUNT)
  private Integer inputCount;

  public static final String SERIALIZED_NAME_OUTPUT_COUNT = "outputCount";
  @SerializedName(SERIALIZED_NAME_OUTPUT_COUNT)
  private Integer outputCount;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_BITS = "bits";
  @SerializedName(SERIALIZED_NAME_BITS)
  private Long bits;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private Long nonce;

  public static final String SERIALIZED_NAME_COINBASE = "coinbase";
  @SerializedName(SERIALIZED_NAME_COINBASE)
  private String coinbase;


  public BlockHeader height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Block height.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block height.")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public BlockHeader blockHash(String blockHash) {
    
    this.blockHash = blockHash;
    return this;
  }

   /**
   * Block hash.
   * @return blockHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block hash.")

  public String getBlockHash() {
    return blockHash;
  }


  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }


  public BlockHeader version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Block version.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block version.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public BlockHeader prevBlockHash(String prevBlockHash) {
    
    this.prevBlockHash = prevBlockHash;
    return this;
  }

   /**
   * The block hash of the previous block.
   * @return prevBlockHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The block hash of the previous block.")

  public String getPrevBlockHash() {
    return prevBlockHash;
  }


  public void setPrevBlockHash(String prevBlockHash) {
    this.prevBlockHash = prevBlockHash;
  }


  public BlockHeader merkleRoot(String merkleRoot) {
    
    this.merkleRoot = merkleRoot;
    return this;
  }

   /**
   * Hex formatted block merkle root.
   * @return merkleRoot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hex formatted block merkle root.")

  public String getMerkleRoot() {
    return merkleRoot;
  }


  public void setMerkleRoot(String merkleRoot) {
    this.merkleRoot = merkleRoot;
  }


  public BlockHeader timestamp(Long timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Block timestamp.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block timestamp.")

  public Long getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  public BlockHeader medianTime(Long medianTime) {
    
    this.medianTime = medianTime;
    return this;
  }

   /**
   * Block median timestamp.
   * @return medianTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block median timestamp.")

  public Long getMedianTime() {
    return medianTime;
  }


  public void setMedianTime(Long medianTime) {
    this.medianTime = medianTime;
  }


  public BlockHeader reward(Long reward) {
    
    this.reward = reward;
    return this;
  }

   /**
   * Miner total rewards, including miner fee.
   * @return reward
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Miner total rewards, including miner fee.")

  public Long getReward() {
    return reward;
  }


  public void setReward(Long reward) {
    this.reward = reward;
  }


  public BlockHeader miner(String miner) {
    
    this.miner = miner;
    return this;
  }

   /**
   * Guessed miner name.
   * @return miner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Guessed miner name.")

  public String getMiner() {
    return miner;
  }


  public void setMiner(String miner) {
    this.miner = miner;
  }


  public BlockHeader minerAddress(String minerAddress) {
    
    this.minerAddress = minerAddress;
    return this;
  }

   /**
   * Miner address that received rewards.
   * @return minerAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Miner address that received rewards.")

  public String getMinerAddress() {
    return minerAddress;
  }


  public void setMinerAddress(String minerAddress) {
    this.minerAddress = minerAddress;
  }


  public BlockHeader txCount(Integer txCount) {
    
    this.txCount = txCount;
    return this;
  }

   /**
   * Total txs count included in the block.
   * @return txCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total txs count included in the block.")

  public Integer getTxCount() {
    return txCount;
  }


  public void setTxCount(Integer txCount) {
    this.txCount = txCount;
  }


  public BlockHeader inputCount(Integer inputCount) {
    
    this.inputCount = inputCount;
    return this;
  }

   /**
   * Total input count in the block.
   * @return inputCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total input count in the block.")

  public Integer getInputCount() {
    return inputCount;
  }


  public void setInputCount(Integer inputCount) {
    this.inputCount = inputCount;
  }


  public BlockHeader outputCount(Integer outputCount) {
    
    this.outputCount = outputCount;
    return this;
  }

   /**
   * Total output count in the block
   * @return outputCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total output count in the block")

  public Integer getOutputCount() {
    return outputCount;
  }


  public void setOutputCount(Integer outputCount) {
    this.outputCount = outputCount;
  }


  public BlockHeader size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Size of the block
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the block")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public BlockHeader bits(Long bits) {
    
    this.bits = bits;
    return this;
  }

   /**
   * Target bits.
   * @return bits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target bits.")

  public Long getBits() {
    return bits;
  }


  public void setBits(Long bits) {
    this.bits = bits;
  }


  public BlockHeader nonce(Long nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Block nonce
   * @return nonce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block nonce")

  public Long getNonce() {
    return nonce;
  }


  public void setNonce(Long nonce) {
    this.nonce = nonce;
  }


  public BlockHeader coinbase(String coinbase) {
    
    this.coinbase = coinbase;
    return this;
  }

   /**
   * Hex formated coinbase info.
   * @return coinbase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hex formated coinbase info.")

  public String getCoinbase() {
    return coinbase;
  }


  public void setCoinbase(String coinbase) {
    this.coinbase = coinbase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockHeader blockHeader = (BlockHeader) o;
    return Objects.equals(this.height, blockHeader.height) &&
        Objects.equals(this.blockHash, blockHeader.blockHash) &&
        Objects.equals(this.version, blockHeader.version) &&
        Objects.equals(this.prevBlockHash, blockHeader.prevBlockHash) &&
        Objects.equals(this.merkleRoot, blockHeader.merkleRoot) &&
        Objects.equals(this.timestamp, blockHeader.timestamp) &&
        Objects.equals(this.medianTime, blockHeader.medianTime) &&
        Objects.equals(this.reward, blockHeader.reward) &&
        Objects.equals(this.miner, blockHeader.miner) &&
        Objects.equals(this.minerAddress, blockHeader.minerAddress) &&
        Objects.equals(this.txCount, blockHeader.txCount) &&
        Objects.equals(this.inputCount, blockHeader.inputCount) &&
        Objects.equals(this.outputCount, blockHeader.outputCount) &&
        Objects.equals(this.size, blockHeader.size) &&
        Objects.equals(this.bits, blockHeader.bits) &&
        Objects.equals(this.nonce, blockHeader.nonce) &&
        Objects.equals(this.coinbase, blockHeader.coinbase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, blockHash, version, prevBlockHash, merkleRoot, timestamp, medianTime, reward, miner, minerAddress, txCount, inputCount, outputCount, size, bits, nonce, coinbase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockHeader {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    prevBlockHash: ").append(toIndentedString(prevBlockHash)).append("\n");
    sb.append("    merkleRoot: ").append(toIndentedString(merkleRoot)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    medianTime: ").append(toIndentedString(medianTime)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    miner: ").append(toIndentedString(miner)).append("\n");
    sb.append("    minerAddress: ").append(toIndentedString(minerAddress)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
    sb.append("    inputCount: ").append(toIndentedString(inputCount)).append("\n");
    sb.append("    outputCount: ").append(toIndentedString(outputCount)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    bits: ").append(toIndentedString(bits)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    coinbase: ").append(toIndentedString(coinbase)).append("\n");
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

