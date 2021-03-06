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
 * The DocumentVersionNotFoundException model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("DocumentVersionNotFoundException")
public class DocumentVersionNotFoundException extends PictureparkBusinessException {
    /**
     * The documentId property.
     */
    @JsonProperty(value = "documentId")
    private String documentId;

    /**
     * The documentVersion property.
     */
    @JsonProperty(value = "documentVersion")
    private String documentVersion;

    /**
     * Get the documentId value.
     *
     * @return the documentId value
     */
    public String documentId() {
        return this.documentId;
    }

    /**
     * Set the documentId value.
     *
     * @param documentId the documentId value to set
     * @return the DocumentVersionNotFoundException object itself.
     */
    public DocumentVersionNotFoundException withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * Get the documentVersion value.
     *
     * @return the documentVersion value
     */
    public String documentVersion() {
        return this.documentVersion;
    }

    /**
     * Set the documentVersion value.
     *
     * @param documentVersion the documentVersion value to set
     * @return the DocumentVersionNotFoundException object itself.
     */
    public DocumentVersionNotFoundException withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

}
