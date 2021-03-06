/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A document stored in the elastic search metadata index, with fields
 * corresponding to the the schemantics of its underlying list schema.
 */
public class ListItem {
    /**
     * The content data of the list item.
     */
    @JsonProperty(value = "content")
    private Object content;

    /**
     * The id of the schema with schema type list.
     */
    @JsonProperty(value = "contentSchemaId")
    private String contentSchemaId;

    /**
     * Contains language specific display values, rendered according to the
     * list schema's display pattern configuration.
     */
    @JsonProperty(value = "displayValues")
    private Object displayValues;

    /**
     * The entity type of the list item is metadata. Possible values include:
     * 'Content', 'BasicShare', 'EmbedShare', 'Metadata', 'FileTransfer'.
     */
    @JsonProperty(value = "entityType", required = true)
    private String entityType;

    /**
     * The list item id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the content value.
     *
     * @return the content value
     */
    public Object content() {
        return this.content;
    }

    /**
     * Set the content value.
     *
     * @param content the content value to set
     * @return the ListItem object itself.
     */
    public ListItem withContent(Object content) {
        this.content = content;
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
     * @return the ListItem object itself.
     */
    public ListItem withContentSchemaId(String contentSchemaId) {
        this.contentSchemaId = contentSchemaId;
        return this;
    }

    /**
     * Get the displayValues value.
     *
     * @return the displayValues value
     */
    public Object displayValues() {
        return this.displayValues;
    }

    /**
     * Set the displayValues value.
     *
     * @param displayValues the displayValues value to set
     * @return the ListItem object itself.
     */
    public ListItem withDisplayValues(Object displayValues) {
        this.displayValues = displayValues;
        return this;
    }

    /**
     * Get the entityType value.
     *
     * @return the entityType value
     */
    public String entityType() {
        return this.entityType;
    }

    /**
     * Set the entityType value.
     *
     * @param entityType the entityType value to set
     * @return the ListItem object itself.
     */
    public ListItem withEntityType(String entityType) {
        this.entityType = entityType;
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
     * @return the ListItem object itself.
     */
    public ListItem withId(String id) {
        this.id = id;
        return this;
    }

}
