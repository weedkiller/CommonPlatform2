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

/**
 * OwnerToken
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T14:36:42.044Z")
public class OwnerToken {
  @SerializedName("id")
  private String id = null;

  @SerializedName("userId")
  private String userId = null;

  public OwnerToken id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ownertoken id.
   * @return id
  **/
  @ApiModelProperty(value = "The ownertoken id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OwnerToken userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user to whom this ownertoken currently belongs to.
   * @return userId
  **/
  @ApiModelProperty(value = "The id of the user to whom this ownertoken currently belongs to.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerToken ownerToken = (OwnerToken) o;
    return Objects.equals(this.id, ownerToken.id) &&
        Objects.equals(this.userId, ownerToken.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerToken {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

