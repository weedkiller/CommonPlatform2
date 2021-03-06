/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package foobar.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BusinessProcessWaitResult model.
 */
public class BusinessProcessWaitResult {
    /**
     * The hasStateHit property.
     */
    @JsonProperty(value = "hasStateHit", required = true)
    private boolean hasStateHit;

    /**
     * The processEnded property.
     */
    @JsonProperty(value = "processEnded", required = true)
    private boolean processEnded;

    /**
     * The stateHit property.
     */
    @JsonProperty(value = "stateHit")
    private String stateHit;

    /**
     * The businessProcess property.
     */
    @JsonProperty(value = "businessProcess")
    private BusinessProcess businessProcess;

    /**
     * Get the hasStateHit value.
     *
     * @return the hasStateHit value
     */
    public boolean hasStateHit() {
        return this.hasStateHit;
    }

    /**
     * Set the hasStateHit value.
     *
     * @param hasStateHit the hasStateHit value to set
     * @return the BusinessProcessWaitResult object itself.
     */
    public BusinessProcessWaitResult withHasStateHit(boolean hasStateHit) {
        this.hasStateHit = hasStateHit;
        return this;
    }

    /**
     * Get the processEnded value.
     *
     * @return the processEnded value
     */
    public boolean processEnded() {
        return this.processEnded;
    }

    /**
     * Set the processEnded value.
     *
     * @param processEnded the processEnded value to set
     * @return the BusinessProcessWaitResult object itself.
     */
    public BusinessProcessWaitResult withProcessEnded(boolean processEnded) {
        this.processEnded = processEnded;
        return this;
    }

    /**
     * Get the stateHit value.
     *
     * @return the stateHit value
     */
    public String stateHit() {
        return this.stateHit;
    }

    /**
     * Set the stateHit value.
     *
     * @param stateHit the stateHit value to set
     * @return the BusinessProcessWaitResult object itself.
     */
    public BusinessProcessWaitResult withStateHit(String stateHit) {
        this.stateHit = stateHit;
        return this;
    }

    /**
     * Get the businessProcess value.
     *
     * @return the businessProcess value
     */
    public BusinessProcess businessProcess() {
        return this.businessProcess;
    }

    /**
     * Set the businessProcess value.
     *
     * @param businessProcess the businessProcess value to set
     * @return the BusinessProcessWaitResult object itself.
     */
    public BusinessProcessWaitResult withBusinessProcess(BusinessProcess businessProcess) {
        this.businessProcess = businessProcess;
        return this;
    }

}
