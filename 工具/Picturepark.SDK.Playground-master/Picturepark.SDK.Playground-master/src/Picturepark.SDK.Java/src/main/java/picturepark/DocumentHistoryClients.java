/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark;

import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import picturepark.models.DocumentHistory;
import picturepark.models.DocumentHistoryDifference;
import picturepark.models.DocumentHistorySearchRequest;
import picturepark.models.DocumentHistorySearchResult;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DocumentHistoryClients.
 */
public interface DocumentHistoryClients {
    /**
     * Search.
     * Search the document history.
     *
     * @param documentHistorySearchRequest The document history search request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DocumentHistorySearchResult object if successful.
     */
    DocumentHistorySearchResult search(DocumentHistorySearchRequest documentHistorySearchRequest);

    /**
     * Search.
     * Search the document history.
     *
     * @param documentHistorySearchRequest The document history search request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DocumentHistorySearchResult> searchAsync(DocumentHistorySearchRequest documentHistorySearchRequest, final ServiceCallback<DocumentHistorySearchResult> serviceCallback);

    /**
     * Search.
     * Search the document history.
     *
     * @param documentHistorySearchRequest The document history search request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DocumentHistorySearchResult object
     */
    Observable<DocumentHistorySearchResult> searchAsync(DocumentHistorySearchRequest documentHistorySearchRequest);

    /**
     * Search.
     * Search the document history.
     *
     * @param documentHistorySearchRequest The document history search request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DocumentHistorySearchResult object
     */
    Observable<ServiceResponse<DocumentHistorySearchResult>> searchWithServiceResponseAsync(DocumentHistorySearchRequest documentHistorySearchRequest);

    /**
     * Get latest.
     * Gets the latest version of a document.
     *
     * @param id The id of the document (e.g. ContentId)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DocumentHistory object if successful.
     */
    DocumentHistory get(String id);

    /**
     * Get latest.
     * Gets the latest version of a document.
     *
     * @param id The id of the document (e.g. ContentId)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DocumentHistory> getAsync(String id, final ServiceCallback<DocumentHistory> serviceCallback);

    /**
     * Get latest.
     * Gets the latest version of a document.
     *
     * @param id The id of the document (e.g. ContentId)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DocumentHistory object
     */
    Observable<DocumentHistory> getAsync(String id);

    /**
     * Get latest.
     * Gets the latest version of a document.
     *
     * @param id The id of the document (e.g. ContentId)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DocumentHistory object
     */
    Observable<ServiceResponse<DocumentHistory>> getWithServiceResponseAsync(String id);

    /**
     * Get latest by version.
     * Gets the latest version of a document by specifiying a specific document version.
     *
     * @param id The id of the document (e.g. ContentId)
     * @param version The version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DocumentHistory object if successful.
     */
    DocumentHistory getVersion(String id, String version);

    /**
     * Get latest by version.
     * Gets the latest version of a document by specifiying a specific document version.
     *
     * @param id The id of the document (e.g. ContentId)
     * @param version The version
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DocumentHistory> getVersionAsync(String id, String version, final ServiceCallback<DocumentHistory> serviceCallback);

    /**
     * Get latest by version.
     * Gets the latest version of a document by specifiying a specific document version.
     *
     * @param id The id of the document (e.g. ContentId)
     * @param version The version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DocumentHistory object
     */
    Observable<DocumentHistory> getVersionAsync(String id, String version);

    /**
     * Get latest by version.
     * Gets the latest version of a document by specifiying a specific document version.
     *
     * @param id The id of the document (e.g. ContentId)
     * @param version The version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DocumentHistory object
     */
    Observable<ServiceResponse<DocumentHistory>> getVersionWithServiceResponseAsync(String id, String version);

    /**
     * Get latest difference.
     * Gets the difference on a document by comparing the provided version against the latest versions.
     *
     * @param id The id of the document (e.g. ContentId)
     * @param oldVersion The old version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DocumentHistoryDifference object if successful.
     */
    DocumentHistoryDifference getDifferenceLatest(String id, long oldVersion);

    /**
     * Get latest difference.
     * Gets the difference on a document by comparing the provided version against the latest versions.
     *
     * @param id The id of the document (e.g. ContentId)
     * @param oldVersion The old version
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DocumentHistoryDifference> getDifferenceLatestAsync(String id, long oldVersion, final ServiceCallback<DocumentHistoryDifference> serviceCallback);

    /**
     * Get latest difference.
     * Gets the difference on a document by comparing the provided version against the latest versions.
     *
     * @param id The id of the document (e.g. ContentId)
     * @param oldVersion The old version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DocumentHistoryDifference object
     */
    Observable<DocumentHistoryDifference> getDifferenceLatestAsync(String id, long oldVersion);

    /**
     * Get latest difference.
     * Gets the difference on a document by comparing the provided version against the latest versions.
     *
     * @param id The id of the document (e.g. ContentId)
     * @param oldVersion The old version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DocumentHistoryDifference object
     */
    Observable<ServiceResponse<DocumentHistoryDifference>> getDifferenceLatestWithServiceResponseAsync(String id, long oldVersion);

    /**
     * Get difference.
     * Gets the difference on a document by comparing two document versions.
     *
     * @param id The id of the document (e.g. ContentId)
     * @param oldVersion The old version
     * @param newVersion The new version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DocumentHistoryDifference object if successful.
     */
    DocumentHistoryDifference getDifference(String id, long oldVersion, long newVersion);

    /**
     * Get difference.
     * Gets the difference on a document by comparing two document versions.
     *
     * @param id The id of the document (e.g. ContentId)
     * @param oldVersion The old version
     * @param newVersion The new version
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DocumentHistoryDifference> getDifferenceAsync(String id, long oldVersion, long newVersion, final ServiceCallback<DocumentHistoryDifference> serviceCallback);

    /**
     * Get difference.
     * Gets the difference on a document by comparing two document versions.
     *
     * @param id The id of the document (e.g. ContentId)
     * @param oldVersion The old version
     * @param newVersion The new version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DocumentHistoryDifference object
     */
    Observable<DocumentHistoryDifference> getDifferenceAsync(String id, long oldVersion, long newVersion);

    /**
     * Get difference.
     * Gets the difference on a document by comparing two document versions.
     *
     * @param id The id of the document (e.g. ContentId)
     * @param oldVersion The old version
     * @param newVersion The new version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DocumentHistoryDifference object
     */
    Observable<ServiceResponse<DocumentHistoryDifference>> getDifferenceWithServiceResponseAsync(String id, long oldVersion, long newVersion);

}
