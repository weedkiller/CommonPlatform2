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
 * The SchemaValidationException model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("SchemaValidationException")
public class SchemaValidationException extends PictureparkValidationException {
    /**
     * The schemaId property.
     */
    @JsonProperty(value = "schemaId")
    private String schemaId;

    /**
     * The exceptions property.
     */
    @JsonProperty(value = "exceptions")
    private List<PictureparkBusinessException> exceptions;

    /**
     * Get the schemaId value.
     *
     * @return the schemaId value
     */
    public String schemaId() {
        return this.schemaId;
    }

    /**
     * Set the schemaId value.
     *
     * @param schemaId the schemaId value to set
     * @return the SchemaValidationException object itself.
     */
    public SchemaValidationException withSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }

    /**
     * Get the exceptions value.
     *
     * @return the exceptions value
     */
    public List<PictureparkBusinessException> exceptions() {
        return this.exceptions;
    }

    /**
     * Set the exceptions value.
     *
     * @param exceptions the exceptions value to set
     * @return the SchemaValidationException object itself.
     */
    public SchemaValidationException withExceptions(List<PictureparkBusinessException> exceptions) {
        this.exceptions = exceptions;
        return this;
    }

}
