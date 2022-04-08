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
 * Parsed inputs from raw tx. Use output api to get value and spent info.
 */
@ApiModel(description = "Parsed inputs from raw tx. Use output api to get value and spent info.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-08T16:23:39.010660+09:00[Asia/Tokyo]")
public class TxInput {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_UTXO_TXID = "utxoTxid";
  @SerializedName(SERIALIZED_NAME_UTXO_TXID)
  private String utxoTxid;

  public static final String SERIALIZED_NAME_UTXO_INDEX = "utxoIndex";
  @SerializedName(SERIALIZED_NAME_UTXO_INDEX)
  private Integer utxoIndex;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value;

  public static final String SERIALIZED_NAME_UNLOCK_SCRIPT = "unlockScript";
  @SerializedName(SERIALIZED_NAME_UNLOCK_SCRIPT)
  private String unlockScript;


  public TxInput index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Input index of the tx.
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input index of the tx.")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public TxInput utxoTxid(String utxoTxid) {
    
    this.utxoTxid = utxoTxid;
    return this;
  }

   /**
   * The outpoint utxo txid that this input spent
   * @return utxoTxid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The outpoint utxo txid that this input spent")

  public String getUtxoTxid() {
    return utxoTxid;
  }


  public void setUtxoTxid(String utxoTxid) {
    this.utxoTxid = utxoTxid;
  }


  public TxInput utxoIndex(Integer utxoIndex) {
    
    this.utxoIndex = utxoIndex;
    return this;
  }

   /**
   * The outpoint utxo index that this input spent
   * @return utxoIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The outpoint utxo index that this input spent")

  public Integer getUtxoIndex() {
    return utxoIndex;
  }


  public void setUtxoIndex(Integer utxoIndex) {
    this.utxoIndex = utxoIndex;
  }


  public TxInput address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Parsed address from pubkey(P2PKH input only).
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parsed address from pubkey(P2PKH input only).")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public TxInput value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * satoshi value of this input.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "satoshi value of this input.")

  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
    this.value = value;
  }


  public TxInput unlockScript(String unlockScript) {
    
    this.unlockScript = unlockScript;
    return this;
  }

   /**
   * The hex of the input script.
   * @return unlockScript
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hex of the input script.")

  public String getUnlockScript() {
    return unlockScript;
  }


  public void setUnlockScript(String unlockScript) {
    this.unlockScript = unlockScript;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxInput txInput = (TxInput) o;
    return Objects.equals(this.index, txInput.index) &&
        Objects.equals(this.utxoTxid, txInput.utxoTxid) &&
        Objects.equals(this.utxoIndex, txInput.utxoIndex) &&
        Objects.equals(this.address, txInput.address) &&
        Objects.equals(this.value, txInput.value) &&
        Objects.equals(this.unlockScript, txInput.unlockScript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, utxoTxid, utxoIndex, address, value, unlockScript);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxInput {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    utxoTxid: ").append(toIndentedString(utxoTxid)).append("\n");
    sb.append("    utxoIndex: ").append(toIndentedString(utxoIndex)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unlockScript: ").append(toIndentedString(unlockScript)).append("\n");
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

