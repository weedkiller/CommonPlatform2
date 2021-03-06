/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package foobar.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PermissionSet model.
 */
public class PermissionSet {
    /**
     * The permission set id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The trashed property.
     */
    @JsonProperty(value = "trashed", required = true)
    private boolean trashed;

    /**
     * The names property.
     */
    @JsonProperty(value = "names")
    private Map<String, String> names;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the PermissionSet object itself.
     */
    public PermissionSet withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the trashed value.
     *
     * @return the trashed value
     */
    public boolean trashed() {
        return this.trashed;
    }

    /**
     * Set the trashed value.
     *
     * @param trashed the trashed value to set
     * @return the PermissionSet object itself.
     */
    public PermissionSet withTrashed(boolean trashed) {
        this.trashed = trashed;
        return this;
    }

    /**
     * Get the names value.
     *
     * @return the names value
     */
    public Map<String, String> names() {
        return this.names;
    }

    /**
     * Set the names value.
     *
     * @param names the names value to set
     * @return the PermissionSet object itself.
     */
    public PermissionSet withNames(Map<String, String> names) {
        this.names = names;
        return this;
    }

}
