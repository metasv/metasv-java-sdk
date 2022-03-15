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
 * Sensible fungible token Utxo belongs to the specified address
 */
@ApiModel(description = "Sensible fungible token Utxo belongs to the specified address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T16:54:02.268785+09:00[Asia/Tokyo]")
public class SensibleFtUtxo {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CODE_HASH = "codeHash";
  @SerializedName(SERIALIZED_NAME_CODE_HASH)
  private String codeHash;

  public static final String SERIALIZED_NAME_GENESIS = "genesis";
  @SerializedName(SERIALIZED_NAME_GENESIS)
  private String genesis;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_SENSIBLE_ID = "sensibleId";
  @SerializedName(SERIALIZED_NAME_SENSIBLE_ID)
  private String sensibleId;

  public static final String SERIALIZED_NAME_DECIMAL = "decimal";
  @SerializedName(SERIALIZED_NAME_DECIMAL)
  private Integer decimal;

  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_TX_INDEX = "txIndex";
  @SerializedName(SERIALIZED_NAME_TX_INDEX)
  private Integer txIndex;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value;

  public static final String SERIALIZED_NAME_VALUE_STRING = "valueString";
  @SerializedName(SERIALIZED_NAME_VALUE_STRING)
  private String valueString;

  public static final String SERIALIZED_NAME_SATOSHI = "satoshi";
  @SerializedName(SERIALIZED_NAME_SATOSHI)
  private Long satoshi;

  public static final String SERIALIZED_NAME_SATOSHI_STRING = "satoshiString";
  @SerializedName(SERIALIZED_NAME_SATOSHI_STRING)
  private String satoshiString;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_FLAG = "flag";
  @SerializedName(SERIALIZED_NAME_FLAG)
  private String flag;


  public SensibleFtUtxo address(String address) {
    
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


  public SensibleFtUtxo codeHash(String codeHash) {
    
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


  public SensibleFtUtxo genesis(String genesis) {
    
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


  public SensibleFtUtxo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the token.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the token.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SensibleFtUtxo symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol of the token.
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Symbol of the token.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public SensibleFtUtxo sensibleId(String sensibleId) {
    
    this.sensibleId = sensibleId;
    return this;
  }

   /**
   * SensibleId of the token
   * @return sensibleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SensibleId of the token")

  public String getSensibleId() {
    return sensibleId;
  }


  public void setSensibleId(String sensibleId) {
    this.sensibleId = sensibleId;
  }


  public SensibleFtUtxo decimal(Integer decimal) {
    
    this.decimal = decimal;
    return this;
  }

   /**
   * The decimal position.
   * @return decimal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The decimal position.")

  public Integer getDecimal() {
    return decimal;
  }


  public void setDecimal(Integer decimal) {
    this.decimal = decimal;
  }


  public SensibleFtUtxo txid(String txid) {
    
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


  public SensibleFtUtxo txIndex(Integer txIndex) {
    
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


  public SensibleFtUtxo value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * Token value of the utxo(Irrelavant to satoshi value).
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token value of the utxo(Irrelavant to satoshi value).")

  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
    this.value = value;
  }


  public SensibleFtUtxo valueString(String valueString) {
    
    this.valueString = valueString;
    return this;
  }

   /**
   * Token value of the utxo(In string format)
   * @return valueString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token value of the utxo(In string format)")

  public String getValueString() {
    return valueString;
  }


  public void setValueString(String valueString) {
    this.valueString = valueString;
  }


  public SensibleFtUtxo satoshi(Long satoshi) {
    
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


  public SensibleFtUtxo satoshiString(String satoshiString) {
    
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


  public SensibleFtUtxo height(Integer height) {
    
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


  public SensibleFtUtxo flag(String flag) {
    
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
    SensibleFtUtxo sensibleFtUtxo = (SensibleFtUtxo) o;
    return Objects.equals(this.address, sensibleFtUtxo.address) &&
        Objects.equals(this.codeHash, sensibleFtUtxo.codeHash) &&
        Objects.equals(this.genesis, sensibleFtUtxo.genesis) &&
        Objects.equals(this.name, sensibleFtUtxo.name) &&
        Objects.equals(this.symbol, sensibleFtUtxo.symbol) &&
        Objects.equals(this.sensibleId, sensibleFtUtxo.sensibleId) &&
        Objects.equals(this.decimal, sensibleFtUtxo.decimal) &&
        Objects.equals(this.txid, sensibleFtUtxo.txid) &&
        Objects.equals(this.txIndex, sensibleFtUtxo.txIndex) &&
        Objects.equals(this.value, sensibleFtUtxo.value) &&
        Objects.equals(this.valueString, sensibleFtUtxo.valueString) &&
        Objects.equals(this.satoshi, sensibleFtUtxo.satoshi) &&
        Objects.equals(this.satoshiString, sensibleFtUtxo.satoshiString) &&
        Objects.equals(this.height, sensibleFtUtxo.height) &&
        Objects.equals(this.flag, sensibleFtUtxo.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, codeHash, genesis, name, symbol, sensibleId, decimal, txid, txIndex, value, valueString, satoshi, satoshiString, height, flag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensibleFtUtxo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    codeHash: ").append(toIndentedString(codeHash)).append("\n");
    sb.append("    genesis: ").append(toIndentedString(genesis)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    sensibleId: ").append(toIndentedString(sensibleId)).append("\n");
    sb.append("    decimal: ").append(toIndentedString(decimal)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    txIndex: ").append(toIndentedString(txIndex)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueString: ").append(toIndentedString(valueString)).append("\n");
    sb.append("    satoshi: ").append(toIndentedString(satoshi)).append("\n");
    sb.append("    satoshiString: ").append(toIndentedString(satoshiString)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

