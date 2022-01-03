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
 * Address detail in the wallet
 */
@ApiModel(description = "Address detail in the wallet")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-03T16:43:19.203251+09:00[Asia/Tokyo]")
public class XpubAddress {
  public static final String SERIALIZED_NAME_XPUB = "xpub";
  @SerializedName(SERIALIZED_NAME_XPUB)
  private String xpub;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "addressType";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  private Integer addressType;

  public static final String SERIALIZED_NAME_ADDRESS_INDEX = "addressIndex";
  @SerializedName(SERIALIZED_NAME_ADDRESS_INDEX)
  private Integer addressIndex;


  public XpubAddress xpub(String xpub) {
    
    this.xpub = xpub;
    return this;
  }

   /**
   * xpub in the query
   * @return xpub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "xpub in the query")

  public String getXpub() {
    return xpub;
  }


  public void setXpub(String xpub) {
    this.xpub = xpub;
  }


  public XpubAddress address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address in the query
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address in the query")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public XpubAddress addressType(Integer addressType) {
    
    this.addressType = addressType;
    return this;
  }

   /**
   * Address type, 0 for receive address, 1 for change address. path is {{addressType}}/{{addressIndex}}
   * @return addressType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address type, 0 for receive address, 1 for change address. path is {{addressType}}/{{addressIndex}}")

  public Integer getAddressType() {
    return addressType;
  }


  public void setAddressType(Integer addressType) {
    this.addressType = addressType;
  }


  public XpubAddress addressIndex(Integer addressIndex) {
    
    this.addressIndex = addressIndex;
    return this;
  }

   /**
   * Address index. Address path in the xpub is {{addressType}}/{{addressIndex}}
   * @return addressIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address index. Address path in the xpub is {{addressType}}/{{addressIndex}}")

  public Integer getAddressIndex() {
    return addressIndex;
  }


  public void setAddressIndex(Integer addressIndex) {
    this.addressIndex = addressIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XpubAddress xpubAddress = (XpubAddress) o;
    return Objects.equals(this.xpub, xpubAddress.xpub) &&
        Objects.equals(this.address, xpubAddress.address) &&
        Objects.equals(this.addressType, xpubAddress.addressType) &&
        Objects.equals(this.addressIndex, xpubAddress.addressIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xpub, address, addressType, addressIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpubAddress {\n");
    sb.append("    xpub: ").append(toIndentedString(xpub)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    addressIndex: ").append(toIndentedString(addressIndex)).append("\n");
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

