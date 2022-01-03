/*
 * MetaSV API Spec
 * API definition for MetaSV provided apis
 *
 * The version of the OpenAPI document: 2.0.0
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
 * Parsed outputs from raw tx.
 */
@ApiModel(description = "Parsed outputs from raw tx.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-03T16:43:19.203251+09:00[Asia/Tokyo]")
public class TxOutput {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_LOCK_SCRIPT = "lockScript";
  @SerializedName(SERIALIZED_NAME_LOCK_SCRIPT)
  private String lockScript;


  public TxOutput index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Output index of the tx.
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output index of the tx.")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public TxOutput value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * Bitcoin Value in this output.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bitcoin Value in this output.")

  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
    this.value = value;
  }


  public TxOutput address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Parsed address from output
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parsed address from output")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public TxOutput lockScript(String lockScript) {
    
    this.lockScript = lockScript;
    return this;
  }

   /**
   * Hex formatted lockScript
   * @return lockScript
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hex formatted lockScript")

  public String getLockScript() {
    return lockScript;
  }


  public void setLockScript(String lockScript) {
    this.lockScript = lockScript;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxOutput txOutput = (TxOutput) o;
    return Objects.equals(this.index, txOutput.index) &&
        Objects.equals(this.value, txOutput.value) &&
        Objects.equals(this.address, txOutput.address) &&
        Objects.equals(this.lockScript, txOutput.lockScript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, value, address, lockScript);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxOutput {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    lockScript: ").append(toIndentedString(lockScript)).append("\n");
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

