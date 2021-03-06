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
 * PhotoshopLayer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T14:36:42.044Z")
public class PhotoshopLayer {
  @SerializedName("layerName")
  private String layerName = null;

  @SerializedName("layerText")
  private String layerText = null;

  public PhotoshopLayer layerName(String layerName) {
    this.layerName = layerName;
    return this;
  }

   /**
   * Get layerName
   * @return layerName
  **/
  @ApiModelProperty(value = "")
  public String getLayerName() {
    return layerName;
  }

  public void setLayerName(String layerName) {
    this.layerName = layerName;
  }

  public PhotoshopLayer layerText(String layerText) {
    this.layerText = layerText;
    return this;
  }

   /**
   * Get layerText
   * @return layerText
  **/
  @ApiModelProperty(value = "")
  public String getLayerText() {
    return layerText;
  }

  public void setLayerText(String layerText) {
    this.layerText = layerText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhotoshopLayer photoshopLayer = (PhotoshopLayer) o;
    return Objects.equals(this.layerName, photoshopLayer.layerName) &&
        Objects.equals(this.layerText, photoshopLayer.layerText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layerName, layerText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhotoshopLayer {\n");
    
    sb.append("    layerName: ").append(toIndentedString(layerName)).append("\n");
    sb.append("    layerText: ").append(toIndentedString(layerText)).append("\n");
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

