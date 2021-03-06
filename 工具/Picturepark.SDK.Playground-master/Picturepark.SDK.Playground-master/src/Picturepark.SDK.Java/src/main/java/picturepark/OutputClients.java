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
import java.util.List;
import picturepark.models.ContentsByIdsRequest;
import picturepark.models.OutputDetail;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in OutputClients.
 */
public interface OutputClients {
    /**
     * Get outputs by contentIds.
     * Gets output documents related for given content ids.
     *
     * @param contentsByIdsRequest Contains the list of contentIds for which the outputs are requested
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;OutputDetail&gt; object if successful.
     */
    List<OutputDetail> getByContentIds(ContentsByIdsRequest contentsByIdsRequest);

    /**
     * Get outputs by contentIds.
     * Gets output documents related for given content ids.
     *
     * @param contentsByIdsRequest Contains the list of contentIds for which the outputs are requested
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<OutputDetail>> getByContentIdsAsync(ContentsByIdsRequest contentsByIdsRequest, final ServiceCallback<List<OutputDetail>> serviceCallback);

    /**
     * Get outputs by contentIds.
     * Gets output documents related for given content ids.
     *
     * @param contentsByIdsRequest Contains the list of contentIds for which the outputs are requested
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;OutputDetail&gt; object
     */
    Observable<List<OutputDetail>> getByContentIdsAsync(ContentsByIdsRequest contentsByIdsRequest);

    /**
     * Get outputs by contentIds.
     * Gets output documents related for given content ids.
     *
     * @param contentsByIdsRequest Contains the list of contentIds for which the outputs are requested
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;OutputDetail&gt; object
     */
    Observable<ServiceResponse<List<OutputDetail>>> getByContentIdsWithServiceResponseAsync(ContentsByIdsRequest contentsByIdsRequest);

    /**
     * Get - single.
     * Gets a output document by id.
     *
     * @param outputId The output id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OutputDetail object if successful.
     */
    OutputDetail get(String outputId);

    /**
     * Get - single.
     * Gets a output document by id.
     *
     * @param outputId The output id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<OutputDetail> getAsync(String outputId, final ServiceCallback<OutputDetail> serviceCallback);

    /**
     * Get - single.
     * Gets a output document by id.
     *
     * @param outputId The output id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OutputDetail object
     */
    Observable<OutputDetail> getAsync(String outputId);

    /**
     * Get - single.
     * Gets a output document by id.
     *
     * @param outputId The output id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OutputDetail object
     */
    Observable<ServiceResponse<OutputDetail>> getWithServiceResponseAsync(String outputId);

}
