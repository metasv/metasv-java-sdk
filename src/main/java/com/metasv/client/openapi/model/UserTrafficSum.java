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
 * Summed outbound traffic for this month and lastMonth.
 */
@ApiModel(description = "Summed outbound traffic for this month and lastMonth.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T15:28:46.058485+09:00[Asia/Tokyo]")
public class UserTrafficSum {
  public static final String SERIALIZED_NAME_THIS_MONTH = "thisMonth";
  @SerializedName(SERIALIZED_NAME_THIS_MONTH)
  private Long thisMonth;

  public static final String SERIALIZED_NAME_LAST_MONTH = "lastMonth";
  @SerializedName(SERIALIZED_NAME_LAST_MONTH)
  private Long lastMonth;


  public UserTrafficSum thisMonth(Long thisMonth) {
    
    this.thisMonth = thisMonth;
    return this;
  }

   /**
   * Summed traffic for currentMonth.
   * @return thisMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Summed traffic for currentMonth.")

  public Long getThisMonth() {
    return thisMonth;
  }


  public void setThisMonth(Long thisMonth) {
    this.thisMonth = thisMonth;
  }


  public UserTrafficSum lastMonth(Long lastMonth) {
    
    this.lastMonth = lastMonth;
    return this;
  }

   /**
   * Summed traffic for lastMonth.
   * @return lastMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Summed traffic for lastMonth.")

  public Long getLastMonth() {
    return lastMonth;
  }


  public void setLastMonth(Long lastMonth) {
    this.lastMonth = lastMonth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTrafficSum userTrafficSum = (UserTrafficSum) o;
    return Objects.equals(this.thisMonth, userTrafficSum.thisMonth) &&
        Objects.equals(this.lastMonth, userTrafficSum.lastMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thisMonth, lastMonth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTrafficSum {\n");
    sb.append("    thisMonth: ").append(toIndentedString(thisMonth)).append("\n");
    sb.append("    lastMonth: ").append(toIndentedString(lastMonth)).append("\n");
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

