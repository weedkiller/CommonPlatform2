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
 * The OwnerTokenNotFoundException model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("OwnerTokenNotFoundException")
public class OwnerTokenNotFoundException extends PictureparkNotFoundException {
    /**
     * The ownerTokenUserId property.
     */
    @JsonProperty(value = "ownerTokenUserId")
    private String ownerTokenUserId;

    /**
     * Get the ownerTokenUserId value.
     *
     * @return the ownerTokenUserId value
     */
    public String ownerTokenUserId() {
        return this.ownerTokenUserId;
    }

    /**
     * Set the ownerTokenUserId value.
     *
     * @param ownerTokenUserId the ownerTokenUserId value to set
     * @return the OwnerTokenNotFoundException object itself.
     */
    public OwnerTokenNotFoundException withOwnerTokenUserId(String ownerTokenUserId) {
        this.ownerTokenUserId = ownerTokenUserId;
        return this;
    }

}
