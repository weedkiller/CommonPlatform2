/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The FieldTranslatedString model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("FieldTranslatedString")
public class FieldTranslatedString extends FieldBase {
    /**
     * Contains a regex validation pattern.
     */
    @JsonProperty(value = "pattern")
    private String pattern;

    /**
     * Defines the minimal string length.
     */
    @JsonProperty(value = "minimumLength")
    private Integer minimumLength;

    /**
     * Defines the maximal string length.
     */
    @JsonProperty(value = "maximumLength")
    private Integer maximumLength;

    /**
     * A string field can have multiple analyzers, but only one per analyzer
     * type. To have any effect the Index must be true.
     */
    @JsonProperty(value = "analyzers")
    private List<AnalyzerBase> analyzers;

    /**
     * Displays the field value in a multiline component.
     */
    @JsonProperty(value = "multiLine", required = true)
    private boolean multiLine;

    /**
     * Sets the required metadata languages for the translation field. The
     * langauge configuration limits the available metadata languages.
     * If Required is true, the field and all its metadata languages are
     * required, including x-default.
     * If Required is false, the field can be left empty, but as soon as a
     * value is entered all required metadata languages are mandatory,
     * including x-default.
     */
    @JsonProperty(value = "requiredMetadataLanguages")
    private List<String> requiredMetadataLanguages;

    /**
     * It is a DotLiquid template.
     */
    @JsonProperty(value = "template")
    private String template;

    /**
     * If true the Template will only render on item creation otherwise it will
     * render on each update.
     */
    @JsonProperty(value = "keepFieldValue", required = true)
    private boolean keepFieldValue;

    /**
     * Priorizes search results. SimpleSearch must be true.
     */
    @JsonProperty(value = "boost", required = true)
    private double boost;

    /**
     * Get the pattern value.
     *
     * @return the pattern value
     */
    public String pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern value.
     *
     * @param pattern the pattern value to set
     * @return the FieldTranslatedString object itself.
     */
    public FieldTranslatedString withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the minimumLength value.
     *
     * @return the minimumLength value
     */
    public Integer minimumLength() {
        return this.minimumLength;
    }

    /**
     * Set the minimumLength value.
     *
     * @param minimumLength the minimumLength value to set
     * @return the FieldTranslatedString object itself.
     */
    public FieldTranslatedString withMinimumLength(Integer minimumLength) {
        this.minimumLength = minimumLength;
        return this;
    }

    /**
     * Get the maximumLength value.
     *
     * @return the maximumLength value
     */
    public Integer maximumLength() {
        return this.maximumLength;
    }

    /**
     * Set the maximumLength value.
     *
     * @param maximumLength the maximumLength value to set
     * @return the FieldTranslatedString object itself.
     */
    public FieldTranslatedString withMaximumLength(Integer maximumLength) {
        this.maximumLength = maximumLength;
        return this;
    }

    /**
     * Get the analyzers value.
     *
     * @return the analyzers value
     */
    public List<AnalyzerBase> analyzers() {
        return this.analyzers;
    }

    /**
     * Set the analyzers value.
     *
     * @param analyzers the analyzers value to set
     * @return the FieldTranslatedString object itself.
     */
    public FieldTranslatedString withAnalyzers(List<AnalyzerBase> analyzers) {
        this.analyzers = analyzers;
        return this;
    }

    /**
     * Get the multiLine value.
     *
     * @return the multiLine value
     */
    public boolean multiLine() {
        return this.multiLine;
    }

    /**
     * Set the multiLine value.
     *
     * @param multiLine the multiLine value to set
     * @return the FieldTranslatedString object itself.
     */
    public FieldTranslatedString withMultiLine(boolean multiLine) {
        this.multiLine = multiLine;
        return this;
    }

    /**
     * Get the requiredMetadataLanguages value.
     *
     * @return the requiredMetadataLanguages value
     */
    public List<String> requiredMetadataLanguages() {
        return this.requiredMetadataLanguages;
    }

    /**
     * Set the requiredMetadataLanguages value.
     *
     * @param requiredMetadataLanguages the requiredMetadataLanguages value to set
     * @return the FieldTranslatedString object itself.
     */
    public FieldTranslatedString withRequiredMetadataLanguages(List<String> requiredMetadataLanguages) {
        this.requiredMetadataLanguages = requiredMetadataLanguages;
        return this;
    }

    /**
     * Get the template value.
     *
     * @return the template value
     */
    public String template() {
        return this.template;
    }

    /**
     * Set the template value.
     *
     * @param template the template value to set
     * @return the FieldTranslatedString object itself.
     */
    public FieldTranslatedString withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * Get the keepFieldValue value.
     *
     * @return the keepFieldValue value
     */
    public boolean keepFieldValue() {
        return this.keepFieldValue;
    }

    /**
     * Set the keepFieldValue value.
     *
     * @param keepFieldValue the keepFieldValue value to set
     * @return the FieldTranslatedString object itself.
     */
    public FieldTranslatedString withKeepFieldValue(boolean keepFieldValue) {
        this.keepFieldValue = keepFieldValue;
        return this;
    }

    /**
     * Get the boost value.
     *
     * @return the boost value
     */
    public double boost() {
        return this.boost;
    }

    /**
     * Set the boost value.
     *
     * @param boost the boost value to set
     * @return the FieldTranslatedString object itself.
     */
    public FieldTranslatedString withBoost(double boost) {
        this.boost = boost;
        return this;
    }

}
