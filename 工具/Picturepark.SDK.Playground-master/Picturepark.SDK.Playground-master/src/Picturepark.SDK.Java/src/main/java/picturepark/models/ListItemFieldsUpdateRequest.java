/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ListItemFieldsUpdateRequest model.
 */
public class ListItemFieldsUpdateRequest {
    /**
     * The ids of the list items whose fields need to be updated.
     */
    @JsonProperty(value = "listItemIds")
    private List<String> listItemIds;

    /**
     * The change commads to be applied to the list items.
     */
    @JsonProperty(value = "changeCommands")
    private List<MetadataValuesChangeCommandBase> changeCommands;

    /**
     * Allow storing references to missing list items / contents.
     */
    @JsonProperty(value = "allowMissingDependencies", required = true)
    private boolean allowMissingDependencies;

    /**
     * Get the listItemIds value.
     *
     * @return the listItemIds value
     */
    public List<String> listItemIds() {
        return this.listItemIds;
    }

    /**
     * Set the listItemIds value.
     *
     * @param listItemIds the listItemIds value to set
     * @return the ListItemFieldsUpdateRequest object itself.
     */
    public ListItemFieldsUpdateRequest withListItemIds(List<String> listItemIds) {
        this.listItemIds = listItemIds;
        return this;
    }

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
     * @return the ListItemFieldsUpdateRequest object itself.
     */
    public ListItemFieldsUpdateRequest withChangeCommands(List<MetadataValuesChangeCommandBase> changeCommands) {
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
     * @return the ListItemFieldsUpdateRequest object itself.
     */
    public ListItemFieldsUpdateRequest withAllowMissingDependencies(boolean allowMissingDependencies) {
        this.allowMissingDependencies = allowMissingDependencies;
        return this;
    }

}
