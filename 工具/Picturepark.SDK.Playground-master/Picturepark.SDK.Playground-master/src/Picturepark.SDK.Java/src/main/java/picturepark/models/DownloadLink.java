/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DownloadLink model.
 */
public class DownloadLink {
    /**
     * The downloadToken property.
     */
    @JsonProperty(value = "downloadToken")
    private String downloadToken;

    /**
     * The downloadUrl property.
     */
    @JsonProperty(value = "downloadUrl")
    private String downloadUrl;

    /**
     * Get the downloadToken value.
     *
     * @return the downloadToken value
     */
    public String downloadToken() {
        return this.downloadToken;
    }

    /**
     * Set the downloadToken value.
     *
     * @param downloadToken the downloadToken value to set
     * @return the DownloadLink object itself.
     */
    public DownloadLink withDownloadToken(String downloadToken) {
        this.downloadToken = downloadToken;
        return this;
    }

    /**
     * Get the downloadUrl value.
     *
     * @return the downloadUrl value
     */
    public String downloadUrl() {
        return this.downloadUrl;
    }

    /**
     * Set the downloadUrl value.
     *
     * @param downloadUrl the downloadUrl value to set
     * @return the DownloadLink object itself.
     */
    public DownloadLink withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

}
