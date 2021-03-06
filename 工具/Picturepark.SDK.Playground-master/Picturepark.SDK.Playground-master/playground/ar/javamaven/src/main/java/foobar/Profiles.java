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
import foobar.models.UserProfile;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Profiles.
 */
public interface Profiles {
    /**
     * Get.
     * Get profile of currently logged in user.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object get();

    /**
     * Get.
     * Get profile of currently logged in user.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Get.
     * Get profile of currently logged in user.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAsync();

    /**
     * Get.
     * Get profile of currently logged in user.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getWithServiceResponseAsync();

    /**
     * Update.
     * Updates profile of currently logged in user.
     *
     * @param profile the UserProfile value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object update(UserProfile profile);

    /**
     * Update.
     * Updates profile of currently logged in user.
     *
     * @param profile the UserProfile value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> updateAsync(UserProfile profile, final ServiceCallback<Object> serviceCallback);

    /**
     * Update.
     * Updates profile of currently logged in user.
     *
     * @param profile the UserProfile value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> updateAsync(UserProfile profile);

    /**
     * Update.
     * Updates profile of currently logged in user.
     *
     * @param profile the UserProfile value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> updateWithServiceResponseAsync(UserProfile profile);

}
