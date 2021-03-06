/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package foobar;

import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import foobar.models.DocumentHistorySearchRequest;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DocumentHistorys.
 */
public interface DocumentHistorys {
    /**
     * Search for document history.
     *
     * @param documentHistorySearchRequest The document history search request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object search(DocumentHistorySearchRequest documentHistorySearchRequest);

    /**
     * Search for document history.
     *
     * @param documentHistorySearchRequest The document history search request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> searchAsync(DocumentHistorySearchRequest documentHistorySearchRequest, final ServiceCallback<Object> serviceCallback);

    /**
     * Search for document history.
     *
     * @param documentHistorySearchRequest The document history search request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> searchAsync(DocumentHistorySearchRequest documentHistorySearchRequest);

    /**
     * Search for document history.
     *
     * @param documentHistorySearchRequest The document history search request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> searchWithServiceResponseAsync(DocumentHistorySearchRequest documentHistorySearchRequest);

    /**
     * Gets a document history.
     *
     * @param id The id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object get(String id);

    /**
     * Gets a document history.
     *
     * @param id The id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getAsync(String id, final ServiceCallback<Object> serviceCallback);

    /**
     * Gets a document history.
     *
     * @param id The id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAsync(String id);

    /**
     * Gets a document history.
     *
     * @param id The id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String id);

    /**
     * Get document history version.
     *
     * @param id The id
     * @param version The version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getVersion(String id, String version);

    /**
     * Get document history version.
     *
     * @param id The id
     * @param version The version
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getVersionAsync(String id, String version, final ServiceCallback<Object> serviceCallback);

    /**
     * Get document history version.
     *
     * @param id The id
     * @param version The version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getVersionAsync(String id, String version);

    /**
     * Get document history version.
     *
     * @param id The id
     * @param version The version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getVersionWithServiceResponseAsync(String id, String version);

    /**
     * Get latest difference of document history.
     *
     * @param id The id
     * @param oldVersion The old version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getDifferenceLatest(String id, long oldVersion);

    /**
     * Get latest difference of document history.
     *
     * @param id The id
     * @param oldVersion The old version
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getDifferenceLatestAsync(String id, long oldVersion, final ServiceCallback<Object> serviceCallback);

    /**
     * Get latest difference of document history.
     *
     * @param id The id
     * @param oldVersion The old version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getDifferenceLatestAsync(String id, long oldVersion);

    /**
     * Get latest difference of document history.
     *
     * @param id The id
     * @param oldVersion The old version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getDifferenceLatestWithServiceResponseAsync(String id, long oldVersion);

    /**
     * Get the difference between tho document history.
     *
     * @param id The id
     * @param oldVersion The old version
     * @param newVersion The new version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getDifference(String id, long oldVersion, long newVersion);

    /**
     * Get the difference between tho document history.
     *
     * @param id The id
     * @param oldVersion The old version
     * @param newVersion The new version
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getDifferenceAsync(String id, long oldVersion, long newVersion, final ServiceCallback<Object> serviceCallback);

    /**
     * Get the difference between tho document history.
     *
     * @param id The id
     * @param oldVersion The old version
     * @param newVersion The new version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getDifferenceAsync(String id, long oldVersion, long newVersion);

    /**
     * Get the difference between tho document history.
     *
     * @param id The id
     * @param oldVersion The old version
     * @param newVersion The new version
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getDifferenceWithServiceResponseAsync(String id, long oldVersion, long newVersion);

}
