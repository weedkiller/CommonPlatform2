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
 * The ObjectStoreException model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("ObjectStoreException")
public class ObjectStoreException extends PictureparkBusinessException {
    /**
     * The rowErrorMessages property.
     */
    @JsonProperty(value = "rowErrorMessages")
    private String rowErrorMessages;

    /**
     * The errorMessage property.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /**
     * Get the rowErrorMessages value.
     *
     * @return the rowErrorMessages value
     */
    public String rowErrorMessages() {
        return this.rowErrorMessages;
    }

    /**
     * Set the rowErrorMessages value.
     *
     * @param rowErrorMessages the rowErrorMessages value to set
     * @return the ObjectStoreException object itself.
     */
    public ObjectStoreException withRowErrorMessages(String rowErrorMessages) {
        this.rowErrorMessages = rowErrorMessages;
        return this;
    }

    /**
     * Get the errorMessage value.
     *
     * @return the errorMessage value
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage value.
     *
     * @param errorMessage the errorMessage value to set
     * @return the ObjectStoreException object itself.
     */
    public ObjectStoreException withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

}
