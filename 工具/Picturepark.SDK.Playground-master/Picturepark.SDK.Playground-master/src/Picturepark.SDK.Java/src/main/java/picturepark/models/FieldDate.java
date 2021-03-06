/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The FieldDate model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("FieldDate")
public class FieldDate extends FieldBase {
    /**
     * Defines the date format structure.
     */
    @JsonProperty(value = "format")
    private String format;

    /**
     * Priorizes search results. SimpleSearch must be true.
     */
    @JsonProperty(value = "boost", required = true)
    private double boost;

    /**
     * Get the format value.
     *
     * @return the format value
     */
    public String format() {
        return this.format;
    }

    /**
     * Set the format value.
     *
     * @param format the format value to set
     * @return the FieldDate object itself.
     */
    public FieldDate withFormat(String format) {
        this.format = format;
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
     * @return the FieldDate object itself.
     */
    public FieldDate withBoost(double boost) {
        this.boost = boost;
        return this;
    }

}
