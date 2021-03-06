/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reduced set of user information used for shares.
 */
public class ShareUser {
    /**
     * Name of user.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * MD5 hash of email address. Can be used to display gravatar image.
     */
    @JsonProperty(value = "emailHash")
    private String emailHash;

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the ShareUser object itself.
     */
    public ShareUser withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the emailHash value.
     *
     * @return the emailHash value
     */
    public String emailHash() {
        return this.emailHash;
    }

    /**
     * Set the emailHash value.
     *
     * @param emailHash the emailHash value to set
     * @return the ShareUser object itself.
     */
    public ShareUser withEmailHash(String emailHash) {
        this.emailHash = emailHash;
        return this;
    }

}
