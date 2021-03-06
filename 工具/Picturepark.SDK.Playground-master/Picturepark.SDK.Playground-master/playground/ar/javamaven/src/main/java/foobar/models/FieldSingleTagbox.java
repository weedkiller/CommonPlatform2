/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package foobar.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The FieldSingleTagbox model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("FieldSingleTagbox")
public class FieldSingleTagbox extends FieldBase {
    /**
     * The schemaId property.
     */
    @JsonProperty(value = "schemaId")
    private String schemaId;

    /**
     * The schemaIndexingInfo property.
     */
    @JsonProperty(value = "schemaIndexingInfo")
    private SchemaIndexingInfo schemaIndexingInfo;

    /**
     * The maxRecursion property.
     */
    @JsonProperty(value = "maxRecursion", required = true)
    private int maxRecursion;

    /**
     * The filter property.
     */
    @JsonProperty(value = "filter")
    private FilterBase filter;

    /**
     * The listItemCreateTemplate property.
     */
    @JsonProperty(value = "listItemCreateTemplate")
    private String listItemCreateTemplate;

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
     * @return the FieldSingleTagbox object itself.
     */
    public FieldSingleTagbox withSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }

    /**
     * Get the schemaIndexingInfo value.
     *
     * @return the schemaIndexingInfo value
     */
    public SchemaIndexingInfo schemaIndexingInfo() {
        return this.schemaIndexingInfo;
    }

    /**
     * Set the schemaIndexingInfo value.
     *
     * @param schemaIndexingInfo the schemaIndexingInfo value to set
     * @return the FieldSingleTagbox object itself.
     */
    public FieldSingleTagbox withSchemaIndexingInfo(SchemaIndexingInfo schemaIndexingInfo) {
        this.schemaIndexingInfo = schemaIndexingInfo;
        return this;
    }

    /**
     * Get the maxRecursion value.
     *
     * @return the maxRecursion value
     */
    public int maxRecursion() {
        return this.maxRecursion;
    }

    /**
     * Set the maxRecursion value.
     *
     * @param maxRecursion the maxRecursion value to set
     * @return the FieldSingleTagbox object itself.
     */
    public FieldSingleTagbox withMaxRecursion(int maxRecursion) {
        this.maxRecursion = maxRecursion;
        return this;
    }

    /**
     * Get the filter value.
     *
     * @return the filter value
     */
    public FilterBase filter() {
        return this.filter;
    }

    /**
     * Set the filter value.
     *
     * @param filter the filter value to set
     * @return the FieldSingleTagbox object itself.
     */
    public FieldSingleTagbox withFilter(FilterBase filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the listItemCreateTemplate value.
     *
     * @return the listItemCreateTemplate value
     */
    public String listItemCreateTemplate() {
        return this.listItemCreateTemplate;
    }

    /**
     * Set the listItemCreateTemplate value.
     *
     * @param listItemCreateTemplate the listItemCreateTemplate value to set
     * @return the FieldSingleTagbox object itself.
     */
    public FieldSingleTagbox withListItemCreateTemplate(String listItemCreateTemplate) {
        this.listItemCreateTemplate = listItemCreateTemplate;
        return this;
    }

}
