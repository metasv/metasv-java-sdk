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
 * Summed outbound traffic within particular hour.
 */
@ApiModel(description = "Summed outbound traffic within particular hour.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-03T16:43:19.203251+09:00[Asia/Tokyo]")
public class UserHourlyTraffic {
  public static final String SERIALIZED_NAME_HOUR_TIME = "hourTime";
  @SerializedName(SERIALIZED_NAME_HOUR_TIME)
  private Long hourTime;

  public static final String SERIALIZED_NAME_HOUR_TIME_STRING = "hourTimeString";
  @SerializedName(SERIALIZED_NAME_HOUR_TIME_STRING)
  private String hourTimeString;

  public static final String SERIALIZED_NAME_TOTAL_BYTES = "totalBytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_BYTES)
  private Long totalBytes;


  public UserHourlyTraffic hourTime(Long hourTime) {
    
    this.hourTime = hourTime;
    return this;
  }

   /**
   * The unix timestamp of the beginning of the hour.
   * @return hourTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unix timestamp of the beginning of the hour.")

  public Long getHourTime() {
    return hourTime;
  }


  public void setHourTime(Long hourTime) {
    this.hourTime = hourTime;
  }


  public UserHourlyTraffic hourTimeString(String hourTimeString) {
    
    this.hourTimeString = hourTimeString;
    return this;
  }

   /**
   * Parsed utc time string for readability.
   * @return hourTimeString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parsed utc time string for readability.")

  public String getHourTimeString() {
    return hourTimeString;
  }


  public void setHourTimeString(String hourTimeString) {
    this.hourTimeString = hourTimeString;
  }


  public UserHourlyTraffic totalBytes(Long totalBytes) {
    
    this.totalBytes = totalBytes;
    return this;
  }

   /**
   * Total outbound bytes within this hour
   * @return totalBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total outbound bytes within this hour")

  public Long getTotalBytes() {
    return totalBytes;
  }


  public void setTotalBytes(Long totalBytes) {
    this.totalBytes = totalBytes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserHourlyTraffic userHourlyTraffic = (UserHourlyTraffic) o;
    return Objects.equals(this.hourTime, userHourlyTraffic.hourTime) &&
        Objects.equals(this.hourTimeString, userHourlyTraffic.hourTimeString) &&
        Objects.equals(this.totalBytes, userHourlyTraffic.totalBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hourTime, hourTimeString, totalBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserHourlyTraffic {\n");
    sb.append("    hourTime: ").append(toIndentedString(hourTime)).append("\n");
    sb.append("    hourTimeString: ").append(toIndentedString(hourTimeString)).append("\n");
    sb.append("    totalBytes: ").append(toIndentedString(totalBytes)).append("\n");
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

