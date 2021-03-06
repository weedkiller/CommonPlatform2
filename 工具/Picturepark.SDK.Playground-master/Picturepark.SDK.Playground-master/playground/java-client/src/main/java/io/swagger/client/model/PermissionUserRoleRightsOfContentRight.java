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
import io.swagger.client.model.ContentRight;
import io.swagger.client.model.TranslatedStringDictionary;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PermissionUserRoleRightsOfContentRight
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T14:36:42.044Z")
public class PermissionUserRoleRightsOfContentRight {
  @SerializedName("userRoleId")
  private String userRoleId = null;

  @SerializedName("names")
  private TranslatedStringDictionary names = null;

  @SerializedName("rights")
  private List<ContentRight> rights = null;

  public PermissionUserRoleRightsOfContentRight userRoleId(String userRoleId) {
    this.userRoleId = userRoleId;
    return this;
  }

   /**
   * Get userRoleId
   * @return userRoleId
  **/
  @ApiModelProperty(value = "")
  public String getUserRoleId() {
    return userRoleId;
  }

  public void setUserRoleId(String userRoleId) {
    this.userRoleId = userRoleId;
  }

  public PermissionUserRoleRightsOfContentRight names(TranslatedStringDictionary names) {
    this.names = names;
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(value = "")
  public TranslatedStringDictionary getNames() {
    return names;
  }

  public void setNames(TranslatedStringDictionary names) {
    this.names = names;
  }

  public PermissionUserRoleRightsOfContentRight rights(List<ContentRight> rights) {
    this.rights = rights;
    return this;
  }

  public PermissionUserRoleRightsOfContentRight addRightsItem(ContentRight rightsItem) {
    if (this.rights == null) {
      this.rights = new ArrayList<ContentRight>();
    }
    this.rights.add(rightsItem);
    return this;
  }

   /**
   * Get rights
   * @return rights
  **/
  @ApiModelProperty(value = "")
  public List<ContentRight> getRights() {
    return rights;
  }

  public void setRights(List<ContentRight> rights) {
    this.rights = rights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionUserRoleRightsOfContentRight permissionUserRoleRightsOfContentRight = (PermissionUserRoleRightsOfContentRight) o;
    return Objects.equals(this.userRoleId, permissionUserRoleRightsOfContentRight.userRoleId) &&
        Objects.equals(this.names, permissionUserRoleRightsOfContentRight.names) &&
        Objects.equals(this.rights, permissionUserRoleRightsOfContentRight.rights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userRoleId, names, rights);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionUserRoleRightsOfContentRight {\n");
    
    sb.append("    userRoleId: ").append(toIndentedString(userRoleId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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

