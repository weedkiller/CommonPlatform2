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
 * The FileTransferNotFoundException model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("FileTransferNotFoundException")
public class FileTransferNotFoundException extends PictureparkNotFoundException {
    /**
     * The fileTransferId property.
     */
    @JsonProperty(value = "fileTransferId")
    private String fileTransferId;

    /**
     * Get the fileTransferId value.
     *
     * @return the fileTransferId value
     */
    public String fileTransferId() {
        return this.fileTransferId;
    }

    /**
     * Set the fileTransferId value.
     *
     * @param fileTransferId the fileTransferId value to set
     * @return the FileTransferNotFoundException object itself.
     */
    public FileTransferNotFoundException withFileTransferId(String fileTransferId) {
        this.fileTransferId = fileTransferId;
        return this;
    }

}
