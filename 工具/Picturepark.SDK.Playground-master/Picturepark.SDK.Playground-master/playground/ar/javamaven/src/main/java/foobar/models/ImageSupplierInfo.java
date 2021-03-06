/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package foobar.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImageSupplierInfo model.
 */
public class ImageSupplierInfo {
    /**
     * The imageSupplierName property.
     */
    @JsonProperty(value = "imageSupplierName")
    private String imageSupplierName;

    /**
     * The imageSupplierID property.
     */
    @JsonProperty(value = "imageSupplierID")
    private String imageSupplierID;

    /**
     * Get the imageSupplierName value.
     *
     * @return the imageSupplierName value
     */
    public String imageSupplierName() {
        return this.imageSupplierName;
    }

    /**
     * Set the imageSupplierName value.
     *
     * @param imageSupplierName the imageSupplierName value to set
     * @return the ImageSupplierInfo object itself.
     */
    public ImageSupplierInfo withImageSupplierName(String imageSupplierName) {
        this.imageSupplierName = imageSupplierName;
        return this;
    }

    /**
     * Get the imageSupplierID value.
     *
     * @return the imageSupplierID value
     */
    public String imageSupplierID() {
        return this.imageSupplierID;
    }

    /**
     * Set the imageSupplierID value.
     *
     * @param imageSupplierID the imageSupplierID value to set
     * @return the ImageSupplierInfo object itself.
     */
    public ImageSupplierInfo withImageSupplierID(String imageSupplierID) {
        this.imageSupplierID = imageSupplierID;
        return this;
    }

}
