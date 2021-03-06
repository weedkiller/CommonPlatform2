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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Corresponds to stDim.UnitChoice
 */
@JsonAdapter(Unit.Adapter.class)
public enum Unit {
  
  INCH("Inch"),
  
  MILLIMETER("Millimeter"),
  
  CENTIMETER("Centimeter"),
  
  PIXEL("Pixel"),
  
  PICA("Pica"),
  
  POINT("Point");

  private String value;

  Unit(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Unit fromValue(String text) {
    for (Unit b : Unit.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Unit> {
    @Override
    public void write(final JsonWriter jsonWriter, final Unit enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Unit read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Unit.fromValue(String.valueOf(value));
    }
  }
}

