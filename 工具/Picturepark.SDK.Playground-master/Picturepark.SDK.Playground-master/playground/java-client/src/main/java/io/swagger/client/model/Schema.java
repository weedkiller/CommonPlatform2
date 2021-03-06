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
import io.swagger.client.model.SchemaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Schema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T14:36:42.044Z")
public class Schema {
  @SerializedName("id")
  private String id = null;

  @SerializedName("parentSchemaId")
  private String parentSchemaId = null;

  @SerializedName("types")
  private List<SchemaType> types = null;

  @SerializedName("layerSchemaIds")
  private List<String> layerSchemaIds = null;

  @SerializedName("fieldCount")
  private Integer fieldCount = null;

  @SerializedName("childCount")
  private Integer childCount = null;

  @SerializedName("level")
  private Integer level = null;

  @SerializedName("system")
  private Boolean system = null;

  public Schema id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The schema id.
   * @return id
  **/
  @ApiModelProperty(value = "The schema id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Schema parentSchemaId(String parentSchemaId) {
    this.parentSchemaId = parentSchemaId;
    return this;
  }

   /**
   * The parent schema id.
   * @return parentSchemaId
  **/
  @ApiModelProperty(value = "The parent schema id.")
  public String getParentSchemaId() {
    return parentSchemaId;
  }

  public void setParentSchemaId(String parentSchemaId) {
    this.parentSchemaId = parentSchemaId;
  }

  public Schema types(List<SchemaType> types) {
    this.types = types;
    return this;
  }

  public Schema addTypesItem(SchemaType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<SchemaType>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Types control schema usage.
   * @return types
  **/
  @ApiModelProperty(value = "Types control schema usage.")
  public List<SchemaType> getTypes() {
    return types;
  }

  public void setTypes(List<SchemaType> types) {
    this.types = types;
  }

  public Schema layerSchemaIds(List<String> layerSchemaIds) {
    this.layerSchemaIds = layerSchemaIds;
    return this;
  }

  public Schema addLayerSchemaIdsItem(String layerSchemaIdsItem) {
    if (this.layerSchemaIds == null) {
      this.layerSchemaIds = new ArrayList<String>();
    }
    this.layerSchemaIds.add(layerSchemaIdsItem);
    return this;
  }

   /**
   * An optional id list of schemas with type layer.
   * @return layerSchemaIds
  **/
  @ApiModelProperty(value = "An optional id list of schemas with type layer.")
  public List<String> getLayerSchemaIds() {
    return layerSchemaIds;
  }

  public void setLayerSchemaIds(List<String> layerSchemaIds) {
    this.layerSchemaIds = layerSchemaIds;
  }

  public Schema fieldCount(Integer fieldCount) {
    this.fieldCount = fieldCount;
    return this;
  }

   /**
   * The count of all fields.
   * @return fieldCount
  **/
  @ApiModelProperty(required = true, value = "The count of all fields.")
  public Integer getFieldCount() {
    return fieldCount;
  }

  public void setFieldCount(Integer fieldCount) {
    this.fieldCount = fieldCount;
  }

  public Schema childCount(Integer childCount) {
    this.childCount = childCount;
    return this;
  }

   /**
   * The count of all schema descendants with a immediate inheritance.
   * @return childCount
  **/
  @ApiModelProperty(required = true, value = "The count of all schema descendants with a immediate inheritance.")
  public Integer getChildCount() {
    return childCount;
  }

  public void setChildCount(Integer childCount) {
    this.childCount = childCount;
  }

  public Schema level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * The descendancy depth of the schema.
   * @return level
  **/
  @ApiModelProperty(required = true, value = "The descendancy depth of the schema.")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public Schema system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * Is true when schema is system provided.
   * @return system
  **/
  @ApiModelProperty(required = true, value = "Is true when schema is system provided.")
  public Boolean getSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schema schema = (Schema) o;
    return Objects.equals(this.id, schema.id) &&
        Objects.equals(this.parentSchemaId, schema.parentSchemaId) &&
        Objects.equals(this.types, schema.types) &&
        Objects.equals(this.layerSchemaIds, schema.layerSchemaIds) &&
        Objects.equals(this.fieldCount, schema.fieldCount) &&
        Objects.equals(this.childCount, schema.childCount) &&
        Objects.equals(this.level, schema.level) &&
        Objects.equals(this.system, schema.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentSchemaId, types, layerSchemaIds, fieldCount, childCount, level, system);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentSchemaId: ").append(toIndentedString(parentSchemaId)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    layerSchemaIds: ").append(toIndentedString(layerSchemaIds)).append("\n");
    sb.append("    fieldCount: ").append(toIndentedString(fieldCount)).append("\n");
    sb.append("    childCount: ").append(toIndentedString(childCount)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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

