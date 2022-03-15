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
 * Request object to register(or delete) a new xpub
 */
@ApiModel(description = "Request object to register(or delete) a new xpub")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T15:39:16.291866+09:00[Asia/Tokyo]")
public class XpubRequest {
  public static final String SERIALIZED_NAME_XPUB = "xpub";
  @SerializedName(SERIALIZED_NAME_XPUB)
  private String xpub;

  public static final String SERIALIZED_NAME_SKIP_HEIGHT = "skipHeight";
  @SerializedName(SERIALIZED_NAME_SKIP_HEIGHT)
  private Integer skipHeight;

  public static final String SERIALIZED_NAME_INIT_RECEIVE_INDEX = "initReceiveIndex";
  @SerializedName(SERIALIZED_NAME_INIT_RECEIVE_INDEX)
  private Integer initReceiveIndex;

  public static final String SERIALIZED_NAME_INIT_CHANGE_INDEX = "initChangeIndex";
  @SerializedName(SERIALIZED_NAME_INIT_CHANGE_INDEX)
  private Integer initChangeIndex;


  public XpubRequest xpub(String xpub) {
    
    this.xpub = xpub;
    return this;
  }

   /**
   * The xpub to register.
   * @return xpub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The xpub to register.")

  public String getXpub() {
    return xpub;
  }


  public void setXpub(String xpub) {
    this.xpub = xpub;
  }


  public XpubRequest skipHeight(Integer skipHeight) {
    
    this.skipHeight = skipHeight;
    return this;
  }

   /**
   * Skip transactions before this height. Default is 0. Ignore this while deleting xpub.
   * @return skipHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip transactions before this height. Default is 0. Ignore this while deleting xpub.")

  public Integer getSkipHeight() {
    return skipHeight;
  }


  public void setSkipHeight(Integer skipHeight) {
    this.skipHeight = skipHeight;
  }


  public XpubRequest initReceiveIndex(Integer initReceiveIndex) {
    
    this.initReceiveIndex = initReceiveIndex;
    return this;
  }

   /**
   * Set the init maxReceiveIndex to {initReceiveIndex}(less than 5000) before the initial crawl , default is 200. This could increase cost.
   * @return initReceiveIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the init maxReceiveIndex to {initReceiveIndex}(less than 5000) before the initial crawl , default is 200. This could increase cost.")

  public Integer getInitReceiveIndex() {
    return initReceiveIndex;
  }


  public void setInitReceiveIndex(Integer initReceiveIndex) {
    this.initReceiveIndex = initReceiveIndex;
  }


  public XpubRequest initChangeIndex(Integer initChangeIndex) {
    
    this.initChangeIndex = initChangeIndex;
    return this;
  }

   /**
   * Set the init maxChangeIndex(less than 5000) before the initial crawl , default is 200. This could increase cost.
   * @return initChangeIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the init maxChangeIndex(less than 5000) before the initial crawl , default is 200. This could increase cost.")

  public Integer getInitChangeIndex() {
    return initChangeIndex;
  }


  public void setInitChangeIndex(Integer initChangeIndex) {
    this.initChangeIndex = initChangeIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XpubRequest xpubRequest = (XpubRequest) o;
    return Objects.equals(this.xpub, xpubRequest.xpub) &&
        Objects.equals(this.skipHeight, xpubRequest.skipHeight) &&
        Objects.equals(this.initReceiveIndex, xpubRequest.initReceiveIndex) &&
        Objects.equals(this.initChangeIndex, xpubRequest.initChangeIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xpub, skipHeight, initReceiveIndex, initChangeIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpubRequest {\n");
    sb.append("    xpub: ").append(toIndentedString(xpub)).append("\n");
    sb.append("    skipHeight: ").append(toIndentedString(skipHeight)).append("\n");
    sb.append("    initReceiveIndex: ").append(toIndentedString(initReceiveIndex)).append("\n");
    sb.append("    initChangeIndex: ").append(toIndentedString(initChangeIndex)).append("\n");
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

