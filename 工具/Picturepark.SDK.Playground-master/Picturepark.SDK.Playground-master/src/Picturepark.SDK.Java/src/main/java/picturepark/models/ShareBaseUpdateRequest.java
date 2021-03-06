/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The ShareBaseUpdateRequest model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("ShareBaseUpdateRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ShareBasicUpdateRequest", value = ShareBasicUpdateRequest.class),
    @JsonSubTypes.Type(name = "ShareEmbedUpdateRequest", value = ShareEmbedUpdateRequest.class)
})
public class ShareBaseUpdateRequest {
    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The expirationDate property.
     */
    @JsonProperty(value = "expirationDate")
    private DateTime expirationDate;

    /**
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The shareContentItems property.
     */
    @JsonProperty(value = "shareContentItems")
    private List<ShareContent> shareContentItems;

    /**
     * The layerSchemaIds property.
     */
    @JsonProperty(value = "layerSchemaIds")
    private List<String> layerSchemaIds;

    /**
     * The template property.
     */
    @JsonProperty(value = "template")
    private TemplateBase template;

    /**
     * Possible values include: 'Full', 'Preview', 'None'.
     */
    @JsonProperty(value = "outputAccess", required = true)
    private String outputAccess;

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
     * @return the ShareBaseUpdateRequest object itself.
     */
    public ShareBaseUpdateRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ShareBaseUpdateRequest object itself.
     */
    public ShareBaseUpdateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the expirationDate value.
     *
     * @return the expirationDate value
     */
    public DateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set the expirationDate value.
     *
     * @param expirationDate the expirationDate value to set
     * @return the ShareBaseUpdateRequest object itself.
     */
    public ShareBaseUpdateRequest withExpirationDate(DateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the ShareBaseUpdateRequest object itself.
     */
    public ShareBaseUpdateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the shareContentItems value.
     *
     * @return the shareContentItems value
     */
    public List<ShareContent> shareContentItems() {
        return this.shareContentItems;
    }

    /**
     * Set the shareContentItems value.
     *
     * @param shareContentItems the shareContentItems value to set
     * @return the ShareBaseUpdateRequest object itself.
     */
    public ShareBaseUpdateRequest withShareContentItems(List<ShareContent> shareContentItems) {
        this.shareContentItems = shareContentItems;
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
     * @return the ShareBaseUpdateRequest object itself.
     */
    public ShareBaseUpdateRequest withLayerSchemaIds(List<String> layerSchemaIds) {
        this.layerSchemaIds = layerSchemaIds;
        return this;
    }

    /**
     * Get the template value.
     *
     * @return the template value
     */
    public TemplateBase template() {
        return this.template;
    }

    /**
     * Set the template value.
     *
     * @param template the template value to set
     * @return the ShareBaseUpdateRequest object itself.
     */
    public ShareBaseUpdateRequest withTemplate(TemplateBase template) {
        this.template = template;
        return this;
    }

    /**
     * Get the outputAccess value.
     *
     * @return the outputAccess value
     */
    public String outputAccess() {
        return this.outputAccess;
    }

    /**
     * Set the outputAccess value.
     *
     * @param outputAccess the outputAccess value to set
     * @return the ShareBaseUpdateRequest object itself.
     */
    public ShareBaseUpdateRequest withOutputAccess(String outputAccess) {
        this.outputAccess = outputAccess;
        return this;
    }

}
