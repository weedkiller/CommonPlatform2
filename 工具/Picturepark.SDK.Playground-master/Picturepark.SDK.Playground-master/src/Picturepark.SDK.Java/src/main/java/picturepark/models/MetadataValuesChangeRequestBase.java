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
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The MetadataValuesChangeRequestBase model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("MetadataValuesChangeRequestBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ContentFieldsUpdateRequest", value = ContentFieldsUpdateRequest.class),
    @JsonSubTypes.Type(name = "ContentFieldsFilterUpdateRequest", value = ContentFieldsFilterUpdateRequest.class)
})
public class MetadataValuesChangeRequestBase {
    /**
     * A container for all change commads.
     */
    @JsonProperty(value = "changeCommands")
    private List<MetadataValuesChangeCommandBase> changeCommands;

    /**
     * Allow storing references to missing list items / contents.
     */
    @JsonProperty(value = "allowMissingDependencies", required = true)
    private boolean allowMissingDependencies;

    /**
     * Create notification and notify on progress.
     */
    @JsonProperty(value = "notifyProgress", required = true)
    private boolean notifyProgress;

    /**
     * Get the changeCommands value.
     *
     * @return the changeCommands value
     */
    public List<MetadataValuesChangeCommandBase> changeCommands() {
        return this.changeCommands;
    }

    /**
     * Set the changeCommands value.
     *
     * @param changeCommands the changeCommands value to set
     * @return the MetadataValuesChangeRequestBase object itself.
     */
    public MetadataValuesChangeRequestBase withChangeCommands(List<MetadataValuesChangeCommandBase> changeCommands) {
        this.changeCommands = changeCommands;
        return this;
    }

    /**
     * Get the allowMissingDependencies value.
     *
     * @return the allowMissingDependencies value
     */
    public boolean allowMissingDependencies() {
        return this.allowMissingDependencies;
    }

    /**
     * Set the allowMissingDependencies value.
     *
     * @param allowMissingDependencies the allowMissingDependencies value to set
     * @return the MetadataValuesChangeRequestBase object itself.
     */
    public MetadataValuesChangeRequestBase withAllowMissingDependencies(boolean allowMissingDependencies) {
        this.allowMissingDependencies = allowMissingDependencies;
        return this;
    }

    /**
     * Get the notifyProgress value.
     *
     * @return the notifyProgress value
     */
    public boolean notifyProgress() {
        return this.notifyProgress;
    }

    /**
     * Set the notifyProgress value.
     *
     * @param notifyProgress the notifyProgress value to set
     * @return the MetadataValuesChangeRequestBase object itself.
     */
    public MetadataValuesChangeRequestBase withNotifyProgress(boolean notifyProgress) {
        this.notifyProgress = notifyProgress;
        return this;
    }

}
