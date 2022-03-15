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
 * spent status and value info of the output.
 */
@ApiModel(description = "spent status and value info of the output.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T15:28:46.058485+09:00[Asia/Tokyo]")
public class OutputInfo {
  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value;

  public static final String SERIALIZED_NAME_SPENT = "spent";
  @SerializedName(SERIALIZED_NAME_SPENT)
  private Boolean spent;

  public static final String SERIALIZED_NAME_SPENT_TXID = "spentTxid";
  @SerializedName(SERIALIZED_NAME_SPENT_TXID)
  private String spentTxid;

  public static final String SERIALIZED_NAME_SPENT_INDEX = "spentIndex";
  @SerializedName(SERIALIZED_NAME_SPENT_INDEX)
  private Integer spentIndex;

  public static final String SERIALIZED_NAME_SPENT_HEIGHT = "spentHeight";
  @SerializedName(SERIALIZED_NAME_SPENT_HEIGHT)
  private Integer spentHeight;


  public OutputInfo txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * txid that this output is in.
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "txid that this output is in.")

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public OutputInfo index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * index of this output in the tx.
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "index of this output in the tx.")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public OutputInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * parsed address of this output, empty for non standard.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "parsed address of this output, empty for non standard.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public OutputInfo value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * value of this output
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "value of this output")

  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
    this.value = value;
  }


  public OutputInfo spent(Boolean spent) {
    
    this.spent = spent;
    return this;
  }

   /**
   * this output is spent or not, true if spent
   * @return spent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "this output is spent or not, true if spent")

  public Boolean getSpent() {
    return spent;
  }


  public void setSpent(Boolean spent) {
    this.spent = spent;
  }


  public OutputInfo spentTxid(String spentTxid) {
    
    this.spentTxid = spentTxid;
    return this;
  }

   /**
   * txid that spent this output
   * @return spentTxid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "txid that spent this output")

  public String getSpentTxid() {
    return spentTxid;
  }


  public void setSpentTxid(String spentTxid) {
    this.spentTxid = spentTxid;
  }


  public OutputInfo spentIndex(Integer spentIndex) {
    
    this.spentIndex = spentIndex;
    return this;
  }

   /**
   * vin index of the spent tx
   * @return spentIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "vin index of the spent tx")

  public Integer getSpentIndex() {
    return spentIndex;
  }


  public void setSpentIndex(Integer spentIndex) {
    this.spentIndex = spentIndex;
  }


  public OutputInfo spentHeight(Integer spentHeight) {
    
    this.spentHeight = spentHeight;
    return this;
  }

   /**
   * height of the spent tx(-1 if unconfirmed, 0 if unspent)
   * @return spentHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "height of the spent tx(-1 if unconfirmed, 0 if unspent)")

  public Integer getSpentHeight() {
    return spentHeight;
  }


  public void setSpentHeight(Integer spentHeight) {
    this.spentHeight = spentHeight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputInfo outputInfo = (OutputInfo) o;
    return Objects.equals(this.txid, outputInfo.txid) &&
        Objects.equals(this.index, outputInfo.index) &&
        Objects.equals(this.address, outputInfo.address) &&
        Objects.equals(this.value, outputInfo.value) &&
        Objects.equals(this.spent, outputInfo.spent) &&
        Objects.equals(this.spentTxid, outputInfo.spentTxid) &&
        Objects.equals(this.spentIndex, outputInfo.spentIndex) &&
        Objects.equals(this.spentHeight, outputInfo.spentHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txid, index, address, value, spent, spentTxid, spentIndex, spentHeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputInfo {\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    spent: ").append(toIndentedString(spent)).append("\n");
    sb.append("    spentTxid: ").append(toIndentedString(spentTxid)).append("\n");
    sb.append("    spentIndex: ").append(toIndentedString(spentIndex)).append("\n");
    sb.append("    spentHeight: ").append(toIndentedString(spentHeight)).append("\n");
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

