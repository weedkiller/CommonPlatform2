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
 * Removes a field and its value from the schema values.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("MetadataValuesFieldRemoveCommand")
public class MetadataValuesFieldRemoveCommand extends MetadataValuesChangeCommandBase {
    /**
     * The path of the field to be removed (within tha data structure), e.g.
     * "data.schemaId.fieldId".
     */
    @JsonProperty(value = "fieldPath")
    private String fieldPath;

    /**
     * Get the fieldPath value.
     *
     * @return the fieldPath value
     */
    public String fieldPath() {
        return this.fieldPath;
    }

    /**
     * Set the fieldPath value.
     *
     * @param fieldPath the fieldPath value to set
     * @return the MetadataValuesFieldRemoveCommand object itself.
     */
    public MetadataValuesFieldRemoveCommand withFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
        return this;
    }

}
