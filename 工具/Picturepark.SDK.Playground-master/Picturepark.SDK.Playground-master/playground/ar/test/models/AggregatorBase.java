/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The AggregatorBase is the base class for all aggregators.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AggregatorBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DateRangeAggregator", value = DateRangeAggregator.class),
    @JsonSubTypes.Type(name = "FilterAggregator", value = FilterAggregator.class),
    @JsonSubTypes.Type(name = "GeoDistanceAggregator", value = GeoDistanceAggregator.class),
    @JsonSubTypes.Type(name = "NestedAggregator", value = NestedAggregator.class),
    @JsonSubTypes.Type(name = "NumericRangeAggregator", value = NumericRangeAggregator.class),
    @JsonSubTypes.Type(name = "TermsAggregator", value = TermsAggregator.class)
})
public class AggregatorBase {
    /**
     * The slug name of the aggregation. Must be unique per aggregation
     * request.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The translated names of the aggregation.
     */
    @JsonProperty(value = "names")
    private Object names;

    /**
     * An optional aggregator list for nested aggregations.
     */
    @JsonProperty(value = "aggregators")
    private List<AggregatorBase> aggregators;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the AggregatorBase object itself.
     */
    public AggregatorBase withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the names value.
     *
     * @return the names value
     */
    public Object names() {
        return this.names;
    }

    /**
     * Set the names value.
     *
     * @param names the names value to set
     * @return the AggregatorBase object itself.
     */
    public AggregatorBase withNames(Object names) {
        this.names = names;
        return this;
    }

    /**
     * Get the aggregators value.
     *
     * @return the aggregators value
     */
    public List<AggregatorBase> aggregators() {
        return this.aggregators;
    }

    /**
     * Set the aggregators value.
     *
     * @param aggregators the aggregators value to set
     * @return the AggregatorBase object itself.
     */
    public AggregatorBase withAggregators(List<AggregatorBase> aggregators) {
        this.aggregators = aggregators;
        return this;
    }

}
