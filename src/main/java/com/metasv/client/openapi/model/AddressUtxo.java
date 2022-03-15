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
 * Utxos by address(or addresses) order by height asc.
 */
@ApiModel(description = "Utxos by address(or addresses) order by height asc.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T15:32:54.023410+09:00[Asia/Tokyo]")
public class AddressUtxo {
  public static final String SERIALIZED_NAME_FLAG = "flag";
  @SerializedName(SERIALIZED_NAME_FLAG)
  private String flag;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_OUT_INDEX = "outIndex";
  @SerializedName(SERIALIZED_NAME_OUT_INDEX)
  private Integer outIndex;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;


  public AddressUtxo flag(String flag) {
    
    this.flag = flag;
    return this;
  }

   /**
   * paging flag
   * @return flag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "paging flag")

  public String getFlag() {
    return flag;
  }


  public void setFlag(String flag) {
    this.flag = flag;
  }


  public AddressUtxo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address of the utxo
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address of the utxo")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AddressUtxo txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * txid of the utxo
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "txid of the utxo")

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public AddressUtxo outIndex(Integer outIndex) {
    
    this.outIndex = outIndex;
    return this;
  }

   /**
   * output index in the tx
   * @return outIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "output index in the tx")

  public Integer getOutIndex() {
    return outIndex;
  }


  public void setOutIndex(Integer outIndex) {
    this.outIndex = outIndex;
  }


  public AddressUtxo value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value of the utxo
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the utxo")

  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
    this.value = value;
  }


  public AddressUtxo height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height of the utxo, -1 if not confirmed
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Height of the utxo, -1 if not confirmed")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressUtxo addressUtxo = (AddressUtxo) o;
    return Objects.equals(this.flag, addressUtxo.flag) &&
        Objects.equals(this.address, addressUtxo.address) &&
        Objects.equals(this.txid, addressUtxo.txid) &&
        Objects.equals(this.outIndex, addressUtxo.outIndex) &&
        Objects.equals(this.value, addressUtxo.value) &&
        Objects.equals(this.height, addressUtxo.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag, address, txid, outIndex, value, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressUtxo {\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    outIndex: ").append(toIndentedString(outIndex)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

