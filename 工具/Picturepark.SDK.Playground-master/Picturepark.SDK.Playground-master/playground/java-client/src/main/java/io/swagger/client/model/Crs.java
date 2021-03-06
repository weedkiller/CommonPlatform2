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
import io.swagger.client.model.CropUnit;
import io.swagger.client.model.ToneCurve;
import io.swagger.client.model.WhiteBalance;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Crs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T14:36:42.044Z")
public class Crs {
  @SerializedName("autoBrightness")
  private Boolean autoBrightness = null;

  @SerializedName("autoContrast")
  private Boolean autoContrast = null;

  @SerializedName("autoExposure")
  private Boolean autoExposure = null;

  @SerializedName("autoShadows")
  private Boolean autoShadows = null;

  @SerializedName("blueHue")
  private Integer blueHue = null;

  @SerializedName("blueSaturation")
  private Integer blueSaturation = null;

  @SerializedName("brightness")
  private Integer brightness = null;

  @SerializedName("cameraProfile")
  private String cameraProfile = null;

  @SerializedName("chromaticAberrationB")
  private Integer chromaticAberrationB = null;

  @SerializedName("chromaticAberrationR")
  private Integer chromaticAberrationR = null;

  @SerializedName("colorNoiseReduction")
  private Integer colorNoiseReduction = null;

  @SerializedName("contrast")
  private Integer contrast = null;

  @SerializedName("cropTop")
  private BigDecimal cropTop = null;

  @SerializedName("cropLeft")
  private BigDecimal cropLeft = null;

  @SerializedName("cropBottom")
  private BigDecimal cropBottom = null;

  @SerializedName("cropRight")
  private BigDecimal cropRight = null;

  @SerializedName("cropAngle")
  private BigDecimal cropAngle = null;

  @SerializedName("cropWidth")
  private BigDecimal cropWidth = null;

  @SerializedName("cropHeight")
  private BigDecimal cropHeight = null;

  @SerializedName("cropUnits")
  private CropUnit cropUnits = null;

  @SerializedName("exposure")
  private BigDecimal exposure = null;

  @SerializedName("greenHue")
  private Integer greenHue = null;

  @SerializedName("greenSaturation")
  private Integer greenSaturation = null;

  @SerializedName("hasCrop")
  private Boolean hasCrop = null;

  @SerializedName("hasSettings")
  private Boolean hasSettings = null;

  @SerializedName("luminanceSmoothing")
  private Integer luminanceSmoothing = null;

  @SerializedName("rawFileName")
  private String rawFileName = null;

  @SerializedName("redHue")
  private Integer redHue = null;

  @SerializedName("redSaturation")
  private Integer redSaturation = null;

  @SerializedName("saturation")
  private Integer saturation = null;

  @SerializedName("shadows")
  private Integer shadows = null;

  @SerializedName("shadowTint")
  private Integer shadowTint = null;

  @SerializedName("sharpness")
  private Integer sharpness = null;

  @SerializedName("temperature")
  private Integer temperature = null;

  @SerializedName("tint")
  private Integer tint = null;

  @SerializedName("toneCurve")
  private List<String> toneCurve = null;

  @SerializedName("toneCurveName")
  private ToneCurve toneCurveName = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("vignetteAmount")
  private Integer vignetteAmount = null;

  @SerializedName("vignetteMidpoint")
  private Integer vignetteMidpoint = null;

  @SerializedName("whiteBalance")
  private WhiteBalance whiteBalance = null;

  public Crs autoBrightness(Boolean autoBrightness) {
    this.autoBrightness = autoBrightness;
    return this;
  }

   /**
   * Get autoBrightness
   * @return autoBrightness
  **/
  @ApiModelProperty(value = "")
  public Boolean getAutoBrightness() {
    return autoBrightness;
  }

  public void setAutoBrightness(Boolean autoBrightness) {
    this.autoBrightness = autoBrightness;
  }

  public Crs autoContrast(Boolean autoContrast) {
    this.autoContrast = autoContrast;
    return this;
  }

   /**
   * Get autoContrast
   * @return autoContrast
  **/
  @ApiModelProperty(value = "")
  public Boolean getAutoContrast() {
    return autoContrast;
  }

  public void setAutoContrast(Boolean autoContrast) {
    this.autoContrast = autoContrast;
  }

  public Crs autoExposure(Boolean autoExposure) {
    this.autoExposure = autoExposure;
    return this;
  }

   /**
   * Get autoExposure
   * @return autoExposure
  **/
  @ApiModelProperty(value = "")
  public Boolean getAutoExposure() {
    return autoExposure;
  }

  public void setAutoExposure(Boolean autoExposure) {
    this.autoExposure = autoExposure;
  }

  public Crs autoShadows(Boolean autoShadows) {
    this.autoShadows = autoShadows;
    return this;
  }

   /**
   * Get autoShadows
   * @return autoShadows
  **/
  @ApiModelProperty(value = "")
  public Boolean getAutoShadows() {
    return autoShadows;
  }

  public void setAutoShadows(Boolean autoShadows) {
    this.autoShadows = autoShadows;
  }

  public Crs blueHue(Integer blueHue) {
    this.blueHue = blueHue;
    return this;
  }

   /**
   * Get blueHue
   * @return blueHue
  **/
  @ApiModelProperty(value = "")
  public Integer getBlueHue() {
    return blueHue;
  }

  public void setBlueHue(Integer blueHue) {
    this.blueHue = blueHue;
  }

  public Crs blueSaturation(Integer blueSaturation) {
    this.blueSaturation = blueSaturation;
    return this;
  }

   /**
   * Get blueSaturation
   * @return blueSaturation
  **/
  @ApiModelProperty(value = "")
  public Integer getBlueSaturation() {
    return blueSaturation;
  }

  public void setBlueSaturation(Integer blueSaturation) {
    this.blueSaturation = blueSaturation;
  }

  public Crs brightness(Integer brightness) {
    this.brightness = brightness;
    return this;
  }

   /**
   * Get brightness
   * @return brightness
  **/
  @ApiModelProperty(value = "")
  public Integer getBrightness() {
    return brightness;
  }

  public void setBrightness(Integer brightness) {
    this.brightness = brightness;
  }

  public Crs cameraProfile(String cameraProfile) {
    this.cameraProfile = cameraProfile;
    return this;
  }

   /**
   * Get cameraProfile
   * @return cameraProfile
  **/
  @ApiModelProperty(value = "")
  public String getCameraProfile() {
    return cameraProfile;
  }

  public void setCameraProfile(String cameraProfile) {
    this.cameraProfile = cameraProfile;
  }

  public Crs chromaticAberrationB(Integer chromaticAberrationB) {
    this.chromaticAberrationB = chromaticAberrationB;
    return this;
  }

   /**
   * Get chromaticAberrationB
   * @return chromaticAberrationB
  **/
  @ApiModelProperty(value = "")
  public Integer getChromaticAberrationB() {
    return chromaticAberrationB;
  }

  public void setChromaticAberrationB(Integer chromaticAberrationB) {
    this.chromaticAberrationB = chromaticAberrationB;
  }

  public Crs chromaticAberrationR(Integer chromaticAberrationR) {
    this.chromaticAberrationR = chromaticAberrationR;
    return this;
  }

   /**
   * Get chromaticAberrationR
   * @return chromaticAberrationR
  **/
  @ApiModelProperty(value = "")
  public Integer getChromaticAberrationR() {
    return chromaticAberrationR;
  }

  public void setChromaticAberrationR(Integer chromaticAberrationR) {
    this.chromaticAberrationR = chromaticAberrationR;
  }

  public Crs colorNoiseReduction(Integer colorNoiseReduction) {
    this.colorNoiseReduction = colorNoiseReduction;
    return this;
  }

   /**
   * Get colorNoiseReduction
   * @return colorNoiseReduction
  **/
  @ApiModelProperty(value = "")
  public Integer getColorNoiseReduction() {
    return colorNoiseReduction;
  }

  public void setColorNoiseReduction(Integer colorNoiseReduction) {
    this.colorNoiseReduction = colorNoiseReduction;
  }

  public Crs contrast(Integer contrast) {
    this.contrast = contrast;
    return this;
  }

   /**
   * Get contrast
   * @return contrast
  **/
  @ApiModelProperty(value = "")
  public Integer getContrast() {
    return contrast;
  }

  public void setContrast(Integer contrast) {
    this.contrast = contrast;
  }

  public Crs cropTop(BigDecimal cropTop) {
    this.cropTop = cropTop;
    return this;
  }

   /**
   * Get cropTop
   * @return cropTop
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCropTop() {
    return cropTop;
  }

  public void setCropTop(BigDecimal cropTop) {
    this.cropTop = cropTop;
  }

  public Crs cropLeft(BigDecimal cropLeft) {
    this.cropLeft = cropLeft;
    return this;
  }

   /**
   * Get cropLeft
   * @return cropLeft
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCropLeft() {
    return cropLeft;
  }

  public void setCropLeft(BigDecimal cropLeft) {
    this.cropLeft = cropLeft;
  }

  public Crs cropBottom(BigDecimal cropBottom) {
    this.cropBottom = cropBottom;
    return this;
  }

   /**
   * Get cropBottom
   * @return cropBottom
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCropBottom() {
    return cropBottom;
  }

  public void setCropBottom(BigDecimal cropBottom) {
    this.cropBottom = cropBottom;
  }

  public Crs cropRight(BigDecimal cropRight) {
    this.cropRight = cropRight;
    return this;
  }

   /**
   * Get cropRight
   * @return cropRight
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCropRight() {
    return cropRight;
  }

  public void setCropRight(BigDecimal cropRight) {
    this.cropRight = cropRight;
  }

  public Crs cropAngle(BigDecimal cropAngle) {
    this.cropAngle = cropAngle;
    return this;
  }

   /**
   * Get cropAngle
   * @return cropAngle
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCropAngle() {
    return cropAngle;
  }

  public void setCropAngle(BigDecimal cropAngle) {
    this.cropAngle = cropAngle;
  }

  public Crs cropWidth(BigDecimal cropWidth) {
    this.cropWidth = cropWidth;
    return this;
  }

   /**
   * Get cropWidth
   * @return cropWidth
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCropWidth() {
    return cropWidth;
  }

  public void setCropWidth(BigDecimal cropWidth) {
    this.cropWidth = cropWidth;
  }

  public Crs cropHeight(BigDecimal cropHeight) {
    this.cropHeight = cropHeight;
    return this;
  }

   /**
   * Get cropHeight
   * @return cropHeight
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCropHeight() {
    return cropHeight;
  }

  public void setCropHeight(BigDecimal cropHeight) {
    this.cropHeight = cropHeight;
  }

  public Crs cropUnits(CropUnit cropUnits) {
    this.cropUnits = cropUnits;
    return this;
  }

   /**
   * Get cropUnits
   * @return cropUnits
  **/
  @ApiModelProperty(value = "")
  public CropUnit getCropUnits() {
    return cropUnits;
  }

  public void setCropUnits(CropUnit cropUnits) {
    this.cropUnits = cropUnits;
  }

  public Crs exposure(BigDecimal exposure) {
    this.exposure = exposure;
    return this;
  }

   /**
   * Get exposure
   * @return exposure
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExposure() {
    return exposure;
  }

  public void setExposure(BigDecimal exposure) {
    this.exposure = exposure;
  }

  public Crs greenHue(Integer greenHue) {
    this.greenHue = greenHue;
    return this;
  }

   /**
   * Get greenHue
   * @return greenHue
  **/
  @ApiModelProperty(value = "")
  public Integer getGreenHue() {
    return greenHue;
  }

  public void setGreenHue(Integer greenHue) {
    this.greenHue = greenHue;
  }

  public Crs greenSaturation(Integer greenSaturation) {
    this.greenSaturation = greenSaturation;
    return this;
  }

   /**
   * Get greenSaturation
   * @return greenSaturation
  **/
  @ApiModelProperty(value = "")
  public Integer getGreenSaturation() {
    return greenSaturation;
  }

  public void setGreenSaturation(Integer greenSaturation) {
    this.greenSaturation = greenSaturation;
  }

  public Crs hasCrop(Boolean hasCrop) {
    this.hasCrop = hasCrop;
    return this;
  }

   /**
   * Get hasCrop
   * @return hasCrop
  **/
  @ApiModelProperty(value = "")
  public Boolean getHasCrop() {
    return hasCrop;
  }

  public void setHasCrop(Boolean hasCrop) {
    this.hasCrop = hasCrop;
  }

  public Crs hasSettings(Boolean hasSettings) {
    this.hasSettings = hasSettings;
    return this;
  }

   /**
   * Get hasSettings
   * @return hasSettings
  **/
  @ApiModelProperty(value = "")
  public Boolean getHasSettings() {
    return hasSettings;
  }

  public void setHasSettings(Boolean hasSettings) {
    this.hasSettings = hasSettings;
  }

  public Crs luminanceSmoothing(Integer luminanceSmoothing) {
    this.luminanceSmoothing = luminanceSmoothing;
    return this;
  }

   /**
   * Get luminanceSmoothing
   * @return luminanceSmoothing
  **/
  @ApiModelProperty(value = "")
  public Integer getLuminanceSmoothing() {
    return luminanceSmoothing;
  }

  public void setLuminanceSmoothing(Integer luminanceSmoothing) {
    this.luminanceSmoothing = luminanceSmoothing;
  }

  public Crs rawFileName(String rawFileName) {
    this.rawFileName = rawFileName;
    return this;
  }

   /**
   * Get rawFileName
   * @return rawFileName
  **/
  @ApiModelProperty(value = "")
  public String getRawFileName() {
    return rawFileName;
  }

  public void setRawFileName(String rawFileName) {
    this.rawFileName = rawFileName;
  }

  public Crs redHue(Integer redHue) {
    this.redHue = redHue;
    return this;
  }

   /**
   * Get redHue
   * @return redHue
  **/
  @ApiModelProperty(value = "")
  public Integer getRedHue() {
    return redHue;
  }

  public void setRedHue(Integer redHue) {
    this.redHue = redHue;
  }

  public Crs redSaturation(Integer redSaturation) {
    this.redSaturation = redSaturation;
    return this;
  }

   /**
   * Get redSaturation
   * @return redSaturation
  **/
  @ApiModelProperty(value = "")
  public Integer getRedSaturation() {
    return redSaturation;
  }

  public void setRedSaturation(Integer redSaturation) {
    this.redSaturation = redSaturation;
  }

  public Crs saturation(Integer saturation) {
    this.saturation = saturation;
    return this;
  }

   /**
   * Get saturation
   * @return saturation
  **/
  @ApiModelProperty(value = "")
  public Integer getSaturation() {
    return saturation;
  }

  public void setSaturation(Integer saturation) {
    this.saturation = saturation;
  }

  public Crs shadows(Integer shadows) {
    this.shadows = shadows;
    return this;
  }

   /**
   * Get shadows
   * @return shadows
  **/
  @ApiModelProperty(value = "")
  public Integer getShadows() {
    return shadows;
  }

  public void setShadows(Integer shadows) {
    this.shadows = shadows;
  }

  public Crs shadowTint(Integer shadowTint) {
    this.shadowTint = shadowTint;
    return this;
  }

   /**
   * Get shadowTint
   * @return shadowTint
  **/
  @ApiModelProperty(value = "")
  public Integer getShadowTint() {
    return shadowTint;
  }

  public void setShadowTint(Integer shadowTint) {
    this.shadowTint = shadowTint;
  }

  public Crs sharpness(Integer sharpness) {
    this.sharpness = sharpness;
    return this;
  }

   /**
   * Get sharpness
   * @return sharpness
  **/
  @ApiModelProperty(value = "")
  public Integer getSharpness() {
    return sharpness;
  }

  public void setSharpness(Integer sharpness) {
    this.sharpness = sharpness;
  }

  public Crs temperature(Integer temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * Get temperature
   * @return temperature
  **/
  @ApiModelProperty(value = "")
  public Integer getTemperature() {
    return temperature;
  }

  public void setTemperature(Integer temperature) {
    this.temperature = temperature;
  }

  public Crs tint(Integer tint) {
    this.tint = tint;
    return this;
  }

   /**
   * Get tint
   * @return tint
  **/
  @ApiModelProperty(value = "")
  public Integer getTint() {
    return tint;
  }

  public void setTint(Integer tint) {
    this.tint = tint;
  }

  public Crs toneCurve(List<String> toneCurve) {
    this.toneCurve = toneCurve;
    return this;
  }

  public Crs addToneCurveItem(String toneCurveItem) {
    if (this.toneCurve == null) {
      this.toneCurve = new ArrayList<String>();
    }
    this.toneCurve.add(toneCurveItem);
    return this;
  }

   /**
   * Get toneCurve
   * @return toneCurve
  **/
  @ApiModelProperty(value = "")
  public List<String> getToneCurve() {
    return toneCurve;
  }

  public void setToneCurve(List<String> toneCurve) {
    this.toneCurve = toneCurve;
  }

  public Crs toneCurveName(ToneCurve toneCurveName) {
    this.toneCurveName = toneCurveName;
    return this;
  }

   /**
   * Get toneCurveName
   * @return toneCurveName
  **/
  @ApiModelProperty(value = "")
  public ToneCurve getToneCurveName() {
    return toneCurveName;
  }

  public void setToneCurveName(ToneCurve toneCurveName) {
    this.toneCurveName = toneCurveName;
  }

  public Crs version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Crs vignetteAmount(Integer vignetteAmount) {
    this.vignetteAmount = vignetteAmount;
    return this;
  }

   /**
   * Get vignetteAmount
   * @return vignetteAmount
  **/
  @ApiModelProperty(value = "")
  public Integer getVignetteAmount() {
    return vignetteAmount;
  }

  public void setVignetteAmount(Integer vignetteAmount) {
    this.vignetteAmount = vignetteAmount;
  }

  public Crs vignetteMidpoint(Integer vignetteMidpoint) {
    this.vignetteMidpoint = vignetteMidpoint;
    return this;
  }

   /**
   * Get vignetteMidpoint
   * @return vignetteMidpoint
  **/
  @ApiModelProperty(value = "")
  public Integer getVignetteMidpoint() {
    return vignetteMidpoint;
  }

  public void setVignetteMidpoint(Integer vignetteMidpoint) {
    this.vignetteMidpoint = vignetteMidpoint;
  }

  public Crs whiteBalance(WhiteBalance whiteBalance) {
    this.whiteBalance = whiteBalance;
    return this;
  }

   /**
   * Get whiteBalance
   * @return whiteBalance
  **/
  @ApiModelProperty(value = "")
  public WhiteBalance getWhiteBalance() {
    return whiteBalance;
  }

  public void setWhiteBalance(WhiteBalance whiteBalance) {
    this.whiteBalance = whiteBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Crs crs = (Crs) o;
    return Objects.equals(this.autoBrightness, crs.autoBrightness) &&
        Objects.equals(this.autoContrast, crs.autoContrast) &&
        Objects.equals(this.autoExposure, crs.autoExposure) &&
        Objects.equals(this.autoShadows, crs.autoShadows) &&
        Objects.equals(this.blueHue, crs.blueHue) &&
        Objects.equals(this.blueSaturation, crs.blueSaturation) &&
        Objects.equals(this.brightness, crs.brightness) &&
        Objects.equals(this.cameraProfile, crs.cameraProfile) &&
        Objects.equals(this.chromaticAberrationB, crs.chromaticAberrationB) &&
        Objects.equals(this.chromaticAberrationR, crs.chromaticAberrationR) &&
        Objects.equals(this.colorNoiseReduction, crs.colorNoiseReduction) &&
        Objects.equals(this.contrast, crs.contrast) &&
        Objects.equals(this.cropTop, crs.cropTop) &&
        Objects.equals(this.cropLeft, crs.cropLeft) &&
        Objects.equals(this.cropBottom, crs.cropBottom) &&
        Objects.equals(this.cropRight, crs.cropRight) &&
        Objects.equals(this.cropAngle, crs.cropAngle) &&
        Objects.equals(this.cropWidth, crs.cropWidth) &&
        Objects.equals(this.cropHeight, crs.cropHeight) &&
        Objects.equals(this.cropUnits, crs.cropUnits) &&
        Objects.equals(this.exposure, crs.exposure) &&
        Objects.equals(this.greenHue, crs.greenHue) &&
        Objects.equals(this.greenSaturation, crs.greenSaturation) &&
        Objects.equals(this.hasCrop, crs.hasCrop) &&
        Objects.equals(this.hasSettings, crs.hasSettings) &&
        Objects.equals(this.luminanceSmoothing, crs.luminanceSmoothing) &&
        Objects.equals(this.rawFileName, crs.rawFileName) &&
        Objects.equals(this.redHue, crs.redHue) &&
        Objects.equals(this.redSaturation, crs.redSaturation) &&
        Objects.equals(this.saturation, crs.saturation) &&
        Objects.equals(this.shadows, crs.shadows) &&
        Objects.equals(this.shadowTint, crs.shadowTint) &&
        Objects.equals(this.sharpness, crs.sharpness) &&
        Objects.equals(this.temperature, crs.temperature) &&
        Objects.equals(this.tint, crs.tint) &&
        Objects.equals(this.toneCurve, crs.toneCurve) &&
        Objects.equals(this.toneCurveName, crs.toneCurveName) &&
        Objects.equals(this.version, crs.version) &&
        Objects.equals(this.vignetteAmount, crs.vignetteAmount) &&
        Objects.equals(this.vignetteMidpoint, crs.vignetteMidpoint) &&
        Objects.equals(this.whiteBalance, crs.whiteBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoBrightness, autoContrast, autoExposure, autoShadows, blueHue, blueSaturation, brightness, cameraProfile, chromaticAberrationB, chromaticAberrationR, colorNoiseReduction, contrast, cropTop, cropLeft, cropBottom, cropRight, cropAngle, cropWidth, cropHeight, cropUnits, exposure, greenHue, greenSaturation, hasCrop, hasSettings, luminanceSmoothing, rawFileName, redHue, redSaturation, saturation, shadows, shadowTint, sharpness, temperature, tint, toneCurve, toneCurveName, version, vignetteAmount, vignetteMidpoint, whiteBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Crs {\n");
    
    sb.append("    autoBrightness: ").append(toIndentedString(autoBrightness)).append("\n");
    sb.append("    autoContrast: ").append(toIndentedString(autoContrast)).append("\n");
    sb.append("    autoExposure: ").append(toIndentedString(autoExposure)).append("\n");
    sb.append("    autoShadows: ").append(toIndentedString(autoShadows)).append("\n");
    sb.append("    blueHue: ").append(toIndentedString(blueHue)).append("\n");
    sb.append("    blueSaturation: ").append(toIndentedString(blueSaturation)).append("\n");
    sb.append("    brightness: ").append(toIndentedString(brightness)).append("\n");
    sb.append("    cameraProfile: ").append(toIndentedString(cameraProfile)).append("\n");
    sb.append("    chromaticAberrationB: ").append(toIndentedString(chromaticAberrationB)).append("\n");
    sb.append("    chromaticAberrationR: ").append(toIndentedString(chromaticAberrationR)).append("\n");
    sb.append("    colorNoiseReduction: ").append(toIndentedString(colorNoiseReduction)).append("\n");
    sb.append("    contrast: ").append(toIndentedString(contrast)).append("\n");
    sb.append("    cropTop: ").append(toIndentedString(cropTop)).append("\n");
    sb.append("    cropLeft: ").append(toIndentedString(cropLeft)).append("\n");
    sb.append("    cropBottom: ").append(toIndentedString(cropBottom)).append("\n");
    sb.append("    cropRight: ").append(toIndentedString(cropRight)).append("\n");
    sb.append("    cropAngle: ").append(toIndentedString(cropAngle)).append("\n");
    sb.append("    cropWidth: ").append(toIndentedString(cropWidth)).append("\n");
    sb.append("    cropHeight: ").append(toIndentedString(cropHeight)).append("\n");
    sb.append("    cropUnits: ").append(toIndentedString(cropUnits)).append("\n");
    sb.append("    exposure: ").append(toIndentedString(exposure)).append("\n");
    sb.append("    greenHue: ").append(toIndentedString(greenHue)).append("\n");
    sb.append("    greenSaturation: ").append(toIndentedString(greenSaturation)).append("\n");
    sb.append("    hasCrop: ").append(toIndentedString(hasCrop)).append("\n");
    sb.append("    hasSettings: ").append(toIndentedString(hasSettings)).append("\n");
    sb.append("    luminanceSmoothing: ").append(toIndentedString(luminanceSmoothing)).append("\n");
    sb.append("    rawFileName: ").append(toIndentedString(rawFileName)).append("\n");
    sb.append("    redHue: ").append(toIndentedString(redHue)).append("\n");
    sb.append("    redSaturation: ").append(toIndentedString(redSaturation)).append("\n");
    sb.append("    saturation: ").append(toIndentedString(saturation)).append("\n");
    sb.append("    shadows: ").append(toIndentedString(shadows)).append("\n");
    sb.append("    shadowTint: ").append(toIndentedString(shadowTint)).append("\n");
    sb.append("    sharpness: ").append(toIndentedString(sharpness)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    tint: ").append(toIndentedString(tint)).append("\n");
    sb.append("    toneCurve: ").append(toIndentedString(toneCurve)).append("\n");
    sb.append("    toneCurveName: ").append(toIndentedString(toneCurveName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    vignetteAmount: ").append(toIndentedString(vignetteAmount)).append("\n");
    sb.append("    vignetteMidpoint: ").append(toIndentedString(vignetteMidpoint)).append("\n");
    sb.append("    whiteBalance: ").append(toIndentedString(whiteBalance)).append("\n");
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

