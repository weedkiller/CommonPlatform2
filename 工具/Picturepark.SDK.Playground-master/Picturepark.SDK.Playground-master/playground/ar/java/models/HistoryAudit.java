/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package foobar.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The HistoryAudit model.
 */
public class HistoryAudit {
    /**
     * The modificationDate property.
     */
    @JsonProperty(value = "modificationDate", required = true)
    private DateTime modificationDate;

    /**
     * The modifiedByUser property.
     */
    @JsonProperty(value = "modifiedByUser")
    private UserItem modifiedByUser;

    /**
     * Get the modificationDate value.
     *
     * @return the modificationDate value
     */
    public DateTime modificationDate() {
        return this.modificationDate;
    }

    /**
     * Set the modificationDate value.
     *
     * @param modificationDate the modificationDate value to set
     * @return the HistoryAudit object itself.
     */
    public HistoryAudit withModificationDate(DateTime modificationDate) {
        this.modificationDate = modificationDate;
        return this;
    }

    /**
     * Get the modifiedByUser value.
     *
     * @return the modifiedByUser value
     */
    public UserItem modifiedByUser() {
        return this.modifiedByUser;
    }

    /**
     * Set the modifiedByUser value.
     *
     * @param modifiedByUser the modifiedByUser value to set
     * @return the HistoryAudit object itself.
     */
    public HistoryAudit withModifiedByUser(UserItem modifiedByUser) {
        this.modifiedByUser = modifiedByUser;
        return this;
    }

}
