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
 * The EnvironmentDeactivationException model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("EnvironmentDeactivationException")
public class EnvironmentDeactivationException extends PictureparkException {
    /**
     * The deactivationMessage property.
     */
    @JsonProperty(value = "deactivationMessage")
    private String deactivationMessage;

    /**
     * Get the deactivationMessage value.
     *
     * @return the deactivationMessage value
     */
    public String deactivationMessage() {
        return this.deactivationMessage;
    }

    /**
     * Set the deactivationMessage value.
     *
     * @param deactivationMessage the deactivationMessage value to set
     * @return the EnvironmentDeactivationException object itself.
     */
    public EnvironmentDeactivationException withDeactivationMessage(String deactivationMessage) {
        this.deactivationMessage = deactivationMessage;
        return this;
    }

}
