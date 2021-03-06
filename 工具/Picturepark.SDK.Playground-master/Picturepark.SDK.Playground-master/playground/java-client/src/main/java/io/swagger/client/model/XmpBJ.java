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
import io.swagger.client.model.Job;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * XmpBJ
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T14:36:42.044Z")
public class XmpBJ {
  @SerializedName("jobRef")
  private List<Job> jobRef = null;

  public XmpBJ jobRef(List<Job> jobRef) {
    this.jobRef = jobRef;
    return this;
  }

  public XmpBJ addJobRefItem(Job jobRefItem) {
    if (this.jobRef == null) {
      this.jobRef = new ArrayList<Job>();
    }
    this.jobRef.add(jobRefItem);
    return this;
  }

   /**
   * Get jobRef
   * @return jobRef
  **/
  @ApiModelProperty(value = "")
  public List<Job> getJobRef() {
    return jobRef;
  }

  public void setJobRef(List<Job> jobRef) {
    this.jobRef = jobRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmpBJ xmpBJ = (XmpBJ) o;
    return Objects.equals(this.jobRef, xmpBJ.jobRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmpBJ {\n");
    
    sb.append("    jobRef: ").append(toIndentedString(jobRef)).append("\n");
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

