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
 * 
 */
@JsonAdapter(ContentType.Adapter.class)
public enum ContentType {
  
  UNKNOWN("Unknown"),
  
  BITMAP("Bitmap"),
  
  VECTORGRAPHIC("VectorGraphic"),
  
  RAWIMAGE("RawImage"),
  
  INTERCHANGEDOCUMENT("InterchangeDocument"),
  
  WORDPROCESSINGDOCUMENT("WordProcessingDocument"),
  
  TEXTDOCUMENT("TextDocument"),
  
  DESKTOPPUBLISHINGDOCUMENT("DesktopPublishingDocument"),
  
  PRESENTATION("Presentation"),
  
  SPREADSHEET("Spreadsheet"),
  
  ARCHIVE("Archive"),
  
  AUDIO("Audio"),
  
  VIDEO("Video"),
  
  FONT("Font"),
  
  MULTIMEDIA("Multimedia"),
  
  APPLICATION("Application"),
  
  SOURCECODE("SourceCode"),
  
  DATABASE("Database"),
  
  CAD("Cad"),
  
  MODEL3D("Model3d");

  private String value;

  ContentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ContentType fromValue(String text) {
    for (ContentType b : ContentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ContentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ContentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ContentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ContentType.fromValue(String.valueOf(value));
    }
  }
}

