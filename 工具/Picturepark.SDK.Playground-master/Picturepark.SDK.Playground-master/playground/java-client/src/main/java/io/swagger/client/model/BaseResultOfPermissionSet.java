/*
 * Web API Swagger specification
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PermissionSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BaseResultOfPermissionSet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T14:36:42.044Z")
public class BaseResultOfPermissionSet {
  @SerializedName("totalResults")
  private Long totalResults = null;

  @SerializedName("results")
  private List<PermissionSet> results = null;

  @SerializedName("pageToken")
  private String pageToken = null;

  public BaseResultOfPermissionSet totalResults(Long totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * Get totalResults
   * @return totalResults
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Long totalResults) {
    this.totalResults = totalResults;
  }

  public BaseResultOfPermissionSet results(List<PermissionSet> results) {
    this.results = results;
    return this;
  }

  public BaseResultOfPermissionSet addResultsItem(PermissionSet resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<PermissionSet>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<PermissionSet> getResults() {
    return results;
  }

  public void setResults(List<PermissionSet> results) {
    this.results = results;
  }

  public BaseResultOfPermissionSet pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

   /**
   * Get pageToken
   * @return pageToken
  **/
  @ApiModelProperty(value = "")
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseResultOfPermissionSet baseResultOfPermissionSet = (BaseResultOfPermissionSet) o;
    return Objects.equals(this.totalResults, baseResultOfPermissionSet.totalResults) &&
        Objects.equals(this.results, baseResultOfPermissionSet.results) &&
        Objects.equals(this.pageToken, baseResultOfPermissionSet.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalResults, results, pageToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseResultOfPermissionSet {\n");
    
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

