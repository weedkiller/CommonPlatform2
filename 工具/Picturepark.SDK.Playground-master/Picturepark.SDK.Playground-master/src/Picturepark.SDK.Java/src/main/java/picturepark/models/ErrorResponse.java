/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ErrorResponse model.
 */
public class ErrorResponse {
    /**
     * The exception property.
     */
    @JsonProperty(value = "exception")
    private String exception;

    /**
     * The traceId property.
     */
    @JsonProperty(value = "traceId")
    private String traceId;

    /**
     * The traceJobId property.
     */
    @JsonProperty(value = "traceJobId")
    private String traceJobId;

    /**
     * Get the exception value.
     *
     * @return the exception value
     */
    public String exception() {
        return this.exception;
    }

    /**
     * Set the exception value.
     *
     * @param exception the exception value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withException(String exception) {
        this.exception = exception;
        return this;
    }

    /**
     * Get the traceId value.
     *
     * @return the traceId value
     */
    public String traceId() {
        return this.traceId;
    }

    /**
     * Set the traceId value.
     *
     * @param traceId the traceId value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * Get the traceJobId value.
     *
     * @return the traceJobId value
     */
    public String traceJobId() {
        return this.traceJobId;
    }

    /**
     * Set the traceJobId value.
     *
     * @param traceJobId the traceJobId value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withTraceJobId(String traceJobId) {
        this.traceJobId = traceJobId;
        return this;
    }

}
