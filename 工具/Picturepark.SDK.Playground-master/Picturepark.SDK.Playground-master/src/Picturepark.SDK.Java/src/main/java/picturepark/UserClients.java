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
import picturepark.models.Channel;
import picturepark.models.UserDetail;
import picturepark.models.UserSearchRequest;
import picturepark.models.UserSearchResult;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in UserClients.
 */
public interface UserClients {
    /**
     * Get by id.
     *
     * @param userId The user id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UserDetail object if successful.
     */
    UserDetail get(String userId);

    /**
     * Get by id.
     *
     * @param userId The user id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UserDetail> getAsync(String userId, final ServiceCallback<UserDetail> serviceCallback);

    /**
     * Get by id.
     *
     * @param userId The user id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UserDetail object
     */
    Observable<UserDetail> getAsync(String userId);

    /**
     * Get by id.
     *
     * @param userId The user id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UserDetail object
     */
    Observable<ServiceResponse<UserDetail>> getWithServiceResponseAsync(String userId);

    /**
     * Search for users.
     *
     * @param searchRequest The user search request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UserSearchResult object if successful.
     */
    UserSearchResult search(UserSearchRequest searchRequest);

    /**
     * Search for users.
     *
     * @param searchRequest The user search request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UserSearchResult> searchAsync(UserSearchRequest searchRequest, final ServiceCallback<UserSearchResult> serviceCallback);

    /**
     * Search for users.
     *
     * @param searchRequest The user search request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UserSearchResult object
     */
    Observable<UserSearchResult> searchAsync(UserSearchRequest searchRequest);

    /**
     * Search for users.
     *
     * @param searchRequest The user search request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UserSearchResult object
     */
    Observable<ServiceResponse<UserSearchResult>> searchWithServiceResponseAsync(UserSearchRequest searchRequest);

    /**
     * Get by owner token.
     *
     * @param tokenId The token id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UserDetail object if successful.
     */
    UserDetail getByOwnerToken(String tokenId);

    /**
     * Get by owner token.
     *
     * @param tokenId The token id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UserDetail> getByOwnerTokenAsync(String tokenId, final ServiceCallback<UserDetail> serviceCallback);

    /**
     * Get by owner token.
     *
     * @param tokenId The token id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UserDetail object
     */
    Observable<UserDetail> getByOwnerTokenAsync(String tokenId);

    /**
     * Get by owner token.
     *
     * @param tokenId The token id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UserDetail object
     */
    Observable<ServiceResponse<UserDetail>> getByOwnerTokenWithServiceResponseAsync(String tokenId);

    /**
     * Get list of channels.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;Channel&gt; object if successful.
     */
    List<Channel> getChannels();

    /**
     * Get list of channels.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Channel>> getChannelsAsync(final ServiceCallback<List<Channel>> serviceCallback);

    /**
     * Get list of channels.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Channel&gt; object
     */
    Observable<List<Channel>> getChannelsAsync();

    /**
     * Get list of channels.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Channel&gt; object
     */
    Observable<ServiceResponse<List<Channel>>> getChannelsWithServiceResponseAsync();

}
