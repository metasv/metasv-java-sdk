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
 * Oracle public key info.
 */
@ApiModel(description = "Oracle public key info.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-03T16:43:19.203251+09:00[Asia/Tokyo]")
public class SensibleOracleInfo {
  public static final String SERIALIZED_NAME_PUB_KEY = "pubKey";
  @SerializedName(SERIALIZED_NAME_PUB_KEY)
  private String pubKey;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private String contact;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private String job;

  public static final String SERIALIZED_NAME_GITHUB = "github";
  @SerializedName(SERIALIZED_NAME_GITHUB)
  private String github;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public SensibleOracleInfo pubKey(String pubKey) {
    
    this.pubKey = pubKey;
    return this;
  }

   /**
   * Oracle public key.
   * @return pubKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Oracle public key.")

  public String getPubKey() {
    return pubKey;
  }


  public void setPubKey(String pubKey) {
    this.pubKey = pubKey;
  }


  public SensibleOracleInfo contact(String contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * heqiming@metasv.com
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "heqiming@metasv.com")

  public String getContact() {
    return contact;
  }


  public void setContact(String contact) {
    this.contact = contact;
  }


  public SensibleOracleInfo job(String job) {
    
    this.job = job;
    return this;
  }

   /**
   * Name of the job.
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the job.")

  public String getJob() {
    return job;
  }


  public void setJob(String job) {
    this.job = job;
  }


  public SensibleOracleInfo github(String github) {
    
    this.github = github;
    return this;
  }

   /**
   * Github repo(https://github.com/metasv/metasv).
   * @return github
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Github repo(https://github.com/metasv/metasv).")

  public String getGithub() {
    return github;
  }


  public void setGithub(String github) {
    this.github = github;
  }


  public SensibleOracleInfo version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version of the oracle
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of the oracle")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensibleOracleInfo sensibleOracleInfo = (SensibleOracleInfo) o;
    return Objects.equals(this.pubKey, sensibleOracleInfo.pubKey) &&
        Objects.equals(this.contact, sensibleOracleInfo.contact) &&
        Objects.equals(this.job, sensibleOracleInfo.job) &&
        Objects.equals(this.github, sensibleOracleInfo.github) &&
        Objects.equals(this.version, sensibleOracleInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pubKey, contact, job, github, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensibleOracleInfo {\n");
    sb.append("    pubKey: ").append(toIndentedString(pubKey)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    github: ").append(toIndentedString(github)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
