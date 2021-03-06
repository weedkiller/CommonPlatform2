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
import io.swagger.client.model.DisplayPatternType;
import io.swagger.client.model.TemplateEngine;
import io.swagger.client.model.TranslatedStringDictionary;
import java.io.IOException;

/**
 * DisplayPattern
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T14:36:42.044Z")
public class DisplayPattern {
  @SerializedName("id")
  private String id = null;

  @SerializedName("templateEngine")
  private TemplateEngine templateEngine = null;

  @SerializedName("displayPatternType")
  private DisplayPatternType displayPatternType = null;

  @SerializedName("templates")
  private TranslatedStringDictionary templates = null;

  public DisplayPattern id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DisplayPattern templateEngine(TemplateEngine templateEngine) {
    this.templateEngine = templateEngine;
    return this;
  }

   /**
   * Get templateEngine
   * @return templateEngine
  **/
  @ApiModelProperty(required = true, value = "")
  public TemplateEngine getTemplateEngine() {
    return templateEngine;
  }

  public void setTemplateEngine(TemplateEngine templateEngine) {
    this.templateEngine = templateEngine;
  }

  public DisplayPattern displayPatternType(DisplayPatternType displayPatternType) {
    this.displayPatternType = displayPatternType;
    return this;
  }

   /**
   * Get displayPatternType
   * @return displayPatternType
  **/
  @ApiModelProperty(required = true, value = "")
  public DisplayPatternType getDisplayPatternType() {
    return displayPatternType;
  }

  public void setDisplayPatternType(DisplayPatternType displayPatternType) {
    this.displayPatternType = displayPatternType;
  }

  public DisplayPattern templates(TranslatedStringDictionary templates) {
    this.templates = templates;
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @ApiModelProperty(value = "")
  public TranslatedStringDictionary getTemplates() {
    return templates;
  }

  public void setTemplates(TranslatedStringDictionary templates) {
    this.templates = templates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayPattern displayPattern = (DisplayPattern) o;
    return Objects.equals(this.id, displayPattern.id) &&
        Objects.equals(this.templateEngine, displayPattern.templateEngine) &&
        Objects.equals(this.displayPatternType, displayPattern.displayPatternType) &&
        Objects.equals(this.templates, displayPattern.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, templateEngine, displayPatternType, templates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayPattern {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateEngine: ").append(toIndentedString(templateEngine)).append("\n");
    sb.append("    displayPatternType: ").append(toIndentedString(displayPatternType)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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

