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
 * OECF
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T14:36:42.044Z")
public class OECF {
  @SerializedName("columns")
  private Integer columns = null;

  @SerializedName("rows")
  private Integer rows = null;

  @SerializedName("values")
  private List<String> values = null;

  @SerializedName("names")
  private List<String> names = null;

  public OECF columns(Integer columns) {
    this.columns = columns;
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @ApiModelProperty(value = "")
  public Integer getColumns() {
    return columns;
  }

  public void setColumns(Integer columns) {
    this.columns = columns;
  }

  public OECF rows(Integer rows) {
    this.rows = rows;
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @ApiModelProperty(value = "")
  public Integer getRows() {
    return rows;
  }

  public void setRows(Integer rows) {
    this.rows = rows;
  }

  public OECF values(List<String> values) {
    this.values = values;
    return this;
  }

  public OECF addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public OECF names(List<String> names) {
    this.names = names;
    return this;
  }

  public OECF addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<String>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(value = "")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OECF OECF = (OECF) o;
    return Objects.equals(this.columns, OECF.columns) &&
        Objects.equals(this.rows, OECF.rows) &&
        Objects.equals(this.values, OECF.values) &&
        Objects.equals(this.names, OECF.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, rows, values, names);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OECF {\n");
    
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

