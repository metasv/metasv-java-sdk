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
 * Registered Xpub detail
 */
@ApiModel(description = "Registered Xpub detail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T15:28:46.058485+09:00[Asia/Tokyo]")
public class XpubDetail {
  public static final String SERIALIZED_NAME_XPUB = "xpub";
  @SerializedName(SERIALIZED_NAME_XPUB)
  private String xpub;

  public static final String SERIALIZED_NAME_RECEIVE_INDEX = "receiveIndex";
  @SerializedName(SERIALIZED_NAME_RECEIVE_INDEX)
  private Integer receiveIndex;

  public static final String SERIALIZED_NAME_MAX_RECEIVE_INDEX = "maxReceiveIndex";
  @SerializedName(SERIALIZED_NAME_MAX_RECEIVE_INDEX)
  private Integer maxReceiveIndex;

  public static final String SERIALIZED_NAME_CHANGE_INDEX = "changeIndex";
  @SerializedName(SERIALIZED_NAME_CHANGE_INDEX)
  private Integer changeIndex;

  public static final String SERIALIZED_NAME_MAX_CHANGE_INDEX = "maxChangeIndex";
  @SerializedName(SERIALIZED_NAME_MAX_CHANGE_INDEX)
  private Integer maxChangeIndex;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_SKIP_HEIGHT = "skipHeight";
  @SerializedName(SERIALIZED_NAME_SKIP_HEIGHT)
  private Integer skipHeight;

  public static final String SERIALIZED_NAME_PROCESS_HEIGHT = "processHeight";
  @SerializedName(SERIALIZED_NAME_PROCESS_HEIGHT)
  private Integer processHeight;


  public XpubDetail xpub(String xpub) {
    
    this.xpub = xpub;
    return this;
  }

   /**
   * String encoded extended pubkey (xpub)
   * @return xpub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String encoded extended pubkey (xpub)")

  public String getXpub() {
    return xpub;
  }


  public void setXpub(String xpub) {
    this.xpub = xpub;
  }


  public XpubDetail receiveIndex(Integer receiveIndex) {
    
    this.receiveIndex = receiveIndex;
    return this;
  }

   /**
   * Next unused receive index, path /0/index
   * @return receiveIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Next unused receive index, path /0/index")

  public Integer getReceiveIndex() {
    return receiveIndex;
  }


  public void setReceiveIndex(Integer receiveIndex) {
    this.receiveIndex = receiveIndex;
  }


  public XpubDetail maxReceiveIndex(Integer maxReceiveIndex) {
    
    this.maxReceiveIndex = maxReceiveIndex;
    return this;
  }

   /**
   * Max lookahead receive index.
   * @return maxReceiveIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max lookahead receive index.")

  public Integer getMaxReceiveIndex() {
    return maxReceiveIndex;
  }


  public void setMaxReceiveIndex(Integer maxReceiveIndex) {
    this.maxReceiveIndex = maxReceiveIndex;
  }


  public XpubDetail changeIndex(Integer changeIndex) {
    
    this.changeIndex = changeIndex;
    return this;
  }

   /**
   * Next unused change index, path /1/index
   * @return changeIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Next unused change index, path /1/index")

  public Integer getChangeIndex() {
    return changeIndex;
  }


  public void setChangeIndex(Integer changeIndex) {
    this.changeIndex = changeIndex;
  }


  public XpubDetail maxChangeIndex(Integer maxChangeIndex) {
    
    this.maxChangeIndex = maxChangeIndex;
    return this;
  }

   /**
   * Max lookahead change index.
   * @return maxChangeIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max lookahead change index.")

  public Integer getMaxChangeIndex() {
    return maxChangeIndex;
  }


  public void setMaxChangeIndex(Integer maxChangeIndex) {
    this.maxChangeIndex = maxChangeIndex;
  }


  public XpubDetail mode(Integer mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Current xpub process mode, 0 means preparing(not ready), 1 means synchronizing(ready)
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current xpub process mode, 0 means preparing(not ready), 1 means synchronizing(ready)")

  public Integer getMode() {
    return mode;
  }


  public void setMode(Integer mode) {
    this.mode = mode;
  }


  public XpubDetail skipHeight(Integer skipHeight) {
    
    this.skipHeight = skipHeight;
    return this;
  }

   /**
   * Skip blocks before skipHeight while searching transactions. This will speed up sync time.
   * @return skipHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip blocks before skipHeight while searching transactions. This will speed up sync time.")

  public Integer getSkipHeight() {
    return skipHeight;
  }


  public void setSkipHeight(Integer skipHeight) {
    this.skipHeight = skipHeight;
  }


  public XpubDetail processHeight(Integer processHeight) {
    
    this.processHeight = processHeight;
    return this;
  }

   /**
   * Xpub current processed height.
   * @return processHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Xpub current processed height.")

  public Integer getProcessHeight() {
    return processHeight;
  }


  public void setProcessHeight(Integer processHeight) {
    this.processHeight = processHeight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XpubDetail xpubDetail = (XpubDetail) o;
    return Objects.equals(this.xpub, xpubDetail.xpub) &&
        Objects.equals(this.receiveIndex, xpubDetail.receiveIndex) &&
        Objects.equals(this.maxReceiveIndex, xpubDetail.maxReceiveIndex) &&
        Objects.equals(this.changeIndex, xpubDetail.changeIndex) &&
        Objects.equals(this.maxChangeIndex, xpubDetail.maxChangeIndex) &&
        Objects.equals(this.mode, xpubDetail.mode) &&
        Objects.equals(this.skipHeight, xpubDetail.skipHeight) &&
        Objects.equals(this.processHeight, xpubDetail.processHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xpub, receiveIndex, maxReceiveIndex, changeIndex, maxChangeIndex, mode, skipHeight, processHeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpubDetail {\n");
    sb.append("    xpub: ").append(toIndentedString(xpub)).append("\n");
    sb.append("    receiveIndex: ").append(toIndentedString(receiveIndex)).append("\n");
    sb.append("    maxReceiveIndex: ").append(toIndentedString(maxReceiveIndex)).append("\n");
    sb.append("    changeIndex: ").append(toIndentedString(changeIndex)).append("\n");
    sb.append("    maxChangeIndex: ").append(toIndentedString(maxChangeIndex)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    skipHeight: ").append(toIndentedString(skipHeight)).append("\n");
    sb.append("    processHeight: ").append(toIndentedString(processHeight)).append("\n");
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

