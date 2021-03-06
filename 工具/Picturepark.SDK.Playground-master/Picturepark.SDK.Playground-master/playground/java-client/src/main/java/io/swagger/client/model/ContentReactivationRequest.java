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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ContentReactivationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T14:36:42.044Z")
public class ContentReactivationRequest {
  @SerializedName("contentIds")
  private List<String> contentIds = null;

  public ContentReactivationRequest contentIds(List<String> contentIds) {
    this.contentIds = contentIds;
    return this;
  }

  public ContentReactivationRequest addContentIdsItem(String contentIdsItem) {
    if (this.contentIds == null) {
      this.contentIds = new ArrayList<String>();
    }
    this.contentIds.add(contentIdsItem);
    return this;
  }

   /**
   * Get contentIds
   * @return contentIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getContentIds() {
    return contentIds;
  }

  public void setContentIds(List<String> contentIds) {
    this.contentIds = contentIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentReactivationRequest contentReactivationRequest = (ContentReactivationRequest) o;
    return Objects.equals(this.contentIds, contentReactivationRequest.contentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentReactivationRequest {\n");
    
    sb.append("    contentIds: ").append(toIndentedString(contentIds)).append("\n");
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

