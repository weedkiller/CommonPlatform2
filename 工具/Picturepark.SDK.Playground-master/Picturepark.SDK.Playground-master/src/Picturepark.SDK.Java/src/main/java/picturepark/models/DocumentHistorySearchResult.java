/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DocumentHistorySearchResult model.
 */
public class DocumentHistorySearchResult {
    /**
     * The totalResults property.
     */
    @JsonProperty(value = "totalResults", required = true)
    private long totalResults;

    /**
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<DocumentHistory> results;

    /**
     * The pageToken property.
     */
    @JsonProperty(value = "pageToken")
    private String pageToken;

    /**
     * The elapsedMilliseconds property.
     */
    @JsonProperty(value = "elapsedMilliseconds", required = true)
    private long elapsedMilliseconds;

    /**
     * Get the totalResults value.
     *
     * @return the totalResults value
     */
    public long totalResults() {
        return this.totalResults;
    }

    /**
     * Set the totalResults value.
     *
     * @param totalResults the totalResults value to set
     * @return the DocumentHistorySearchResult object itself.
     */
    public DocumentHistorySearchResult withTotalResults(long totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    /**
     * Get the results value.
     *
     * @return the results value
     */
    public List<DocumentHistory> results() {
        return this.results;
    }

    /**
     * Set the results value.
     *
     * @param results the results value to set
     * @return the DocumentHistorySearchResult object itself.
     */
    public DocumentHistorySearchResult withResults(List<DocumentHistory> results) {
        this.results = results;
        return this;
    }

    /**
     * Get the pageToken value.
     *
     * @return the pageToken value
     */
    public String pageToken() {
        return this.pageToken;
    }

    /**
     * Set the pageToken value.
     *
     * @param pageToken the pageToken value to set
     * @return the DocumentHistorySearchResult object itself.
     */
    public DocumentHistorySearchResult withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    /**
     * Get the elapsedMilliseconds value.
     *
     * @return the elapsedMilliseconds value
     */
    public long elapsedMilliseconds() {
        return this.elapsedMilliseconds;
    }

    /**
     * Set the elapsedMilliseconds value.
     *
     * @param elapsedMilliseconds the elapsedMilliseconds value to set
     * @return the DocumentHistorySearchResult object itself.
     */
    public DocumentHistorySearchResult withElapsedMilliseconds(long elapsedMilliseconds) {
        this.elapsedMilliseconds = elapsedMilliseconds;
        return this;
    }

}
