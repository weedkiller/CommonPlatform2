/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Content model.
 */
public class Content {
    /**
     * The audit property.
     */
    @JsonProperty(value = "audit")
    private UserAudit audit;

    /**
     * The id of the schema with schema type content.
     */
    @JsonProperty(value = "contentSchemaId")
    private String contentSchemaId;

    /**
     * An optional id list of schemas with schema type layer.
     */
    @JsonProperty(value = "layerSchemaIds")
    private List<String> layerSchemaIds;

    /**
     * Contains display values of the specified language, rendered according to
     * the content schema's display pattern configuration.
     */
    @JsonProperty(value = "displayValues")
    private Map<String, String> displayValues;

    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * All the ids of the broken references (tagboxes).
     */
    @JsonProperty(value = "brokenReferenceIds")
    private List<String> brokenReferenceIds;

    /**
     * All the ids of the broken indirect references (tagbox that has a
     * property that reference a broken tagbox).
     */
    @JsonProperty(value = "brokenIndirectReferenceIds")
    private List<String> brokenIndirectReferenceIds;

    /**
     * All the ids of the broken relations.
     */
    @JsonProperty(value = "brokenRelationIds")
    private List<String> brokenRelationIds;

    /**
     * Get the audit value.
     *
     * @return the audit value
     */
    public UserAudit audit() {
        return this.audit;
    }

    /**
     * Set the audit value.
     *
     * @param audit the audit value to set
     * @return the Content object itself.
     */
    public Content withAudit(UserAudit audit) {
        this.audit = audit;
        return this;
    }

    /**
     * Get the contentSchemaId value.
     *
     * @return the contentSchemaId value
     */
    public String contentSchemaId() {
        return this.contentSchemaId;
    }

    /**
     * Set the contentSchemaId value.
     *
     * @param contentSchemaId the contentSchemaId value to set
     * @return the Content object itself.
     */
    public Content withContentSchemaId(String contentSchemaId) {
        this.contentSchemaId = contentSchemaId;
        return this;
    }

    /**
     * Get the layerSchemaIds value.
     *
     * @return the layerSchemaIds value
     */
    public List<String> layerSchemaIds() {
        return this.layerSchemaIds;
    }

    /**
     * Set the layerSchemaIds value.
     *
     * @param layerSchemaIds the layerSchemaIds value to set
     * @return the Content object itself.
     */
    public Content withLayerSchemaIds(List<String> layerSchemaIds) {
        this.layerSchemaIds = layerSchemaIds;
        return this;
    }

    /**
     * Get the displayValues value.
     *
     * @return the displayValues value
     */
    public Map<String, String> displayValues() {
        return this.displayValues;
    }

    /**
     * Set the displayValues value.
     *
     * @param displayValues the displayValues value to set
     * @return the Content object itself.
     */
    public Content withDisplayValues(Map<String, String> displayValues) {
        this.displayValues = displayValues;
        return this;
    }

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
     * @return the Content object itself.
     */
    public Content withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the brokenReferenceIds value.
     *
     * @return the brokenReferenceIds value
     */
    public List<String> brokenReferenceIds() {
        return this.brokenReferenceIds;
    }

    /**
     * Set the brokenReferenceIds value.
     *
     * @param brokenReferenceIds the brokenReferenceIds value to set
     * @return the Content object itself.
     */
    public Content withBrokenReferenceIds(List<String> brokenReferenceIds) {
        this.brokenReferenceIds = brokenReferenceIds;
        return this;
    }

    /**
     * Get the brokenIndirectReferenceIds value.
     *
     * @return the brokenIndirectReferenceIds value
     */
    public List<String> brokenIndirectReferenceIds() {
        return this.brokenIndirectReferenceIds;
    }

    /**
     * Set the brokenIndirectReferenceIds value.
     *
     * @param brokenIndirectReferenceIds the brokenIndirectReferenceIds value to set
     * @return the Content object itself.
     */
    public Content withBrokenIndirectReferenceIds(List<String> brokenIndirectReferenceIds) {
        this.brokenIndirectReferenceIds = brokenIndirectReferenceIds;
        return this;
    }

    /**
     * Get the brokenRelationIds value.
     *
     * @return the brokenRelationIds value
     */
    public List<String> brokenRelationIds() {
        return this.brokenRelationIds;
    }

    /**
     * Set the brokenRelationIds value.
     *
     * @param brokenRelationIds the brokenRelationIds value to set
     * @return the Content object itself.
     */
    public Content withBrokenRelationIds(List<String> brokenRelationIds) {
        this.brokenRelationIds = brokenRelationIds;
        return this;
    }

}
