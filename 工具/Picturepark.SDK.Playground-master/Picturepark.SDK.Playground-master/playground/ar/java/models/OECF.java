/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package foobar.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The OECF model.
 */
public class OECF {
    /**
     * The columns property.
     */
    @JsonProperty(value = "columns")
    private Integer columns;

    /**
     * The rows property.
     */
    @JsonProperty(value = "rows")
    private Integer rows;

    /**
     * The values property.
     */
    @JsonProperty(value = "values")
    private List<String> values;

    /**
     * The names property.
     */
    @JsonProperty(value = "names")
    private List<String> names;

    /**
     * Get the columns value.
     *
     * @return the columns value
     */
    public Integer columns() {
        return this.columns;
    }

    /**
     * Set the columns value.
     *
     * @param columns the columns value to set
     * @return the OECF object itself.
     */
    public OECF withColumns(Integer columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the rows value.
     *
     * @return the rows value
     */
    public Integer rows() {
        return this.rows;
    }

    /**
     * Set the rows value.
     *
     * @param rows the rows value to set
     * @return the OECF object itself.
     */
    public OECF withRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * Get the values value.
     *
     * @return the values value
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values value.
     *
     * @param values the values value to set
     * @return the OECF object itself.
     */
    public OECF withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the names value.
     *
     * @return the names value
     */
    public List<String> names() {
        return this.names;
    }

    /**
     * Set the names value.
     *
     * @param names the names value to set
     * @return the OECF object itself.
     */
    public OECF withNames(List<String> names) {
        this.names = names;
        return this;
    }

}
