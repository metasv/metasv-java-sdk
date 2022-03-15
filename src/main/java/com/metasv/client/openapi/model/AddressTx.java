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
 * Transaction history of the address.
 */
@ApiModel(description = "Transaction history of the address.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T16:54:02.268785+09:00[Asia/Tokyo]")
public class AddressTx {
  public static final String SERIALIZED_NAME_FLAG = "flag";
  @SerializedName(SERIALIZED_NAME_FLAG)
  private String flag;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private Long time;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_INCOME = "income";
  @SerializedName(SERIALIZED_NAME_INCOME)
  private Long income;

  public static final String SERIALIZED_NAME_OUTCOME = "outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME)
  private Long outcome;

  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;


  public AddressTx flag(String flag) {
    
    this.flag = flag;
    return this;
  }

   /**
   * Paging flag
   * @return flag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Paging flag")

  public String getFlag() {
    return flag;
  }


  public void setFlag(String flag) {
    this.flag = flag;
  }


  public AddressTx address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The address of the record
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The address of the record")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AddressTx time(Long time) {
    
    this.time = time;
    return this;
  }

   /**
   * timestamp of the tx
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "timestamp of the tx")

  public Long getTime() {
    return time;
  }


  public void setTime(Long time) {
    this.time = time;
  }


  public AddressTx height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Block Height of the tx, -1 if not confirmed
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block Height of the tx, -1 if not confirmed")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public AddressTx income(Long income) {
    
    this.income = income;
    return this;
  }

   /**
   * total income of the address from this tx
   * @return income
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "total income of the address from this tx")

  public Long getIncome() {
    return income;
  }


  public void setIncome(Long income) {
    this.income = income;
  }


  public AddressTx outcome(Long outcome) {
    
    this.outcome = outcome;
    return this;
  }

   /**
   * total outcome of the address from this tx
   * @return outcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "total outcome of the address from this tx")

  public Long getOutcome() {
    return outcome;
  }


  public void setOutcome(Long outcome) {
    this.outcome = outcome;
  }


  public AddressTx txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * txid of this record
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "txid of this record")

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressTx addressTx = (AddressTx) o;
    return Objects.equals(this.flag, addressTx.flag) &&
        Objects.equals(this.address, addressTx.address) &&
        Objects.equals(this.time, addressTx.time) &&
        Objects.equals(this.height, addressTx.height) &&
        Objects.equals(this.income, addressTx.income) &&
        Objects.equals(this.outcome, addressTx.outcome) &&
        Objects.equals(this.txid, addressTx.txid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag, address, time, height, income, outcome, txid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTx {\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
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

