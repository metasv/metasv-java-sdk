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
 * XpubRegister result
 */
@ApiModel(description = "XpubRegister result")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-08T16:23:39.010660+09:00[Asia/Tokyo]")
public class XpubResult {
  public static final String SERIALIZED_NAME_XPUB = "xpub";
  @SerializedName(SERIALIZED_NAME_XPUB)
  private String xpub;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;


  public XpubResult xpub(String xpub) {
    
    this.xpub = xpub;
    return this;
  }

   /**
   * return xpub if broadcast success
   * @return xpub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "return xpub if broadcast success")

  public String getXpub() {
    return xpub;
  }


  public void setXpub(String xpub) {
    this.xpub = xpub;
  }


  public XpubResult message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * return messages if broadcast failed
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "return messages if broadcast failed")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XpubResult xpubResult = (XpubResult) o;
    return Objects.equals(this.xpub, xpubResult.xpub) &&
        Objects.equals(this.message, xpubResult.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xpub, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XpubResult {\n");
    sb.append("    xpub: ").append(toIndentedString(xpub)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

