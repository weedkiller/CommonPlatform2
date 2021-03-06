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
 * The ContentFieldsFilterUpdateRequest model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("ContentFieldsFilterUpdateRequest")
public class ContentFieldsFilterUpdateRequest extends MetadataValuesChangeRequestBase {
    /**
     * The contentFilterRequest property.
     */
    @JsonProperty(value = "contentFilterRequest")
    private ContentFilterRequest contentFilterRequest;

    /**
     * Get the contentFilterRequest value.
     *
     * @return the contentFilterRequest value
     */
    public ContentFilterRequest contentFilterRequest() {
        return this.contentFilterRequest;
    }

    /**
     * Set the contentFilterRequest value.
     *
     * @param contentFilterRequest the contentFilterRequest value to set
     * @return the ContentFieldsFilterUpdateRequest object itself.
     */
    public ContentFieldsFilterUpdateRequest withContentFilterRequest(ContentFilterRequest contentFilterRequest) {
        this.contentFilterRequest = contentFilterRequest;
        return this;
    }

}
