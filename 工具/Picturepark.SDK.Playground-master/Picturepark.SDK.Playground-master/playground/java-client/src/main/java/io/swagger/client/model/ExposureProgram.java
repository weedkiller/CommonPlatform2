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
 * Corresponds to exif.ExposureProgramChoice
 */
@JsonAdapter(ExposureProgram.Adapter.class)
public enum ExposureProgram {
  
  UNDEFINED("Undefined"),
  
  MANUAL("Manual"),
  
  NORMALPROGRAM("NormalProgram"),
  
  APERTUREPRIORITY("AperturePriority"),
  
  SHUTTERPRIORITY("ShutterPriority"),
  
  CREATIVEPROGRAM("CreativeProgram"),
  
  ACTIONPROGRAM("ActionProgram"),
  
  PORTRAITMODE("PortraitMode"),
  
  LANDSCAPEMODE("LandscapeMode"),
  
  UNKNOWN("Unknown");

  private String value;

  ExposureProgram(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExposureProgram fromValue(String text) {
    for (ExposureProgram b : ExposureProgram.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ExposureProgram> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExposureProgram enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExposureProgram read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExposureProgram.fromValue(String.valueOf(value));
    }
  }
}

