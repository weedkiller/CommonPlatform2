/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.implementation;

import retrofit2.Retrofit;
import picturepark.Shares;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import picturepark.models.BaseResultOfShareBase;
import picturepark.models.BusinessProcess;
import picturepark.models.ContentNotFoundException;
import picturepark.models.CreateShareResult;
import picturepark.models.ObjectAggregationResult;
import picturepark.models.PictureparkException;
import picturepark.models.ShareAggregationRequest;
import picturepark.models.ShareBaseCreateRequest;
import picturepark.models.ShareBaseDetail;
import picturepark.models.ShareBaseUpdateRequest;
import picturepark.models.ShareSearchRequest;
import picturepark.models.ShareSearchResult;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Shares.
 */
public class SharesImpl implements Shares {
    /** The Retrofit service to perform REST calls. */
    private SharesService service;
    /** The service client containing this operation class. */
    private WebAPISwaggerspecificationImpl client;

    /**
     * Initializes an instance of Shares.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SharesImpl(Retrofit retrofit, WebAPISwaggerspecificationImpl client) {
        this.service = retrofit.create(SharesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Shares to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SharesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: picturepark.Shares update" })
        @PUT("V1/Shares/{Id}")
        Observable<Response<ResponseBody>> update(@Path("Id") String id, @Body ShareBaseUpdateRequest updateRequest, @Query("resolve") boolean resolve, @Query("timeout") Integer timeout);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: picturepark.Shares get" })
        @GET("V1/Shares/{Id}")
        Observable<Response<ResponseBody>> get(@Path("Id") String id);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: picturepark.Shares deleteMany" })
        @POST("V1/Shares/DeleteMany")
        Observable<Response<ResponseBody>> deleteMany(@Body List<String> shareIds);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: picturepark.Shares aggregate" })
        @POST("V1/Shares/Aggregate")
        Observable<Response<ResponseBody>> aggregate(@Body ShareAggregationRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: picturepark.Shares create" })
        @POST("V1/Shares")
        Observable<Response<ResponseBody>> create(@Body ShareBaseCreateRequest request);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: picturepark.Shares search" })
        @POST("V1/Shares/Search")
        Observable<Response<ResponseBody>> search(@Body ShareSearchRequest request);

    }

    /**
     * Update single.
     * The update of share is executed asynchronous. However, for the specified timeout completion of the update process is awaited.
     If the update process is not completed by reaching the specified timeout, the update process continues, but null is returned.
     *
     * @param id The share id.
     * @param updateRequest The share update request.
     * @param resolve Resolves the data of referenced list items into the shares content.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object update(String id, ShareBaseUpdateRequest updateRequest, boolean resolve) {
        return updateWithServiceResponseAsync(id, updateRequest, resolve).toBlocking().single().body();
    }

    /**
     * Update single.
     * The update of share is executed asynchronous. However, for the specified timeout completion of the update process is awaited.
     If the update process is not completed by reaching the specified timeout, the update process continues, but null is returned.
     *
     * @param id The share id.
     * @param updateRequest The share update request.
     * @param resolve Resolves the data of referenced list items into the shares content.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> updateAsync(String id, ShareBaseUpdateRequest updateRequest, boolean resolve, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(id, updateRequest, resolve), serviceCallback);
    }

    /**
     * Update single.
     * The update of share is executed asynchronous. However, for the specified timeout completion of the update process is awaited.
     If the update process is not completed by reaching the specified timeout, the update process continues, but null is returned.
     *
     * @param id The share id.
     * @param updateRequest The share update request.
     * @param resolve Resolves the data of referenced list items into the shares content.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> updateAsync(String id, ShareBaseUpdateRequest updateRequest, boolean resolve) {
        return updateWithServiceResponseAsync(id, updateRequest, resolve).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Update single.
     * The update of share is executed asynchronous. However, for the specified timeout completion of the update process is awaited.
     If the update process is not completed by reaching the specified timeout, the update process continues, but null is returned.
     *
     * @param id The share id.
     * @param updateRequest The share update request.
     * @param resolve Resolves the data of referenced list items into the shares content.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> updateWithServiceResponseAsync(String id, ShareBaseUpdateRequest updateRequest, boolean resolve) {
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (updateRequest == null) {
            throw new IllegalArgumentException("Parameter updateRequest is required and cannot be null.");
        }
        Validator.validate(updateRequest);
        final Integer timeout = null;
        return service.update(id, updateRequest, resolve, timeout)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Update single.
     * The update of share is executed asynchronous. However, for the specified timeout completion of the update process is awaited.
     If the update process is not completed by reaching the specified timeout, the update process continues, but null is returned.
     *
     * @param id The share id.
     * @param updateRequest The share update request.
     * @param resolve Resolves the data of referenced list items into the shares content.
     * @param timeout Maximum time in milliseconds to wait for the business process completed state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object update(String id, ShareBaseUpdateRequest updateRequest, boolean resolve, Integer timeout) {
        return updateWithServiceResponseAsync(id, updateRequest, resolve, timeout).toBlocking().single().body();
    }

    /**
     * Update single.
     * The update of share is executed asynchronous. However, for the specified timeout completion of the update process is awaited.
     If the update process is not completed by reaching the specified timeout, the update process continues, but null is returned.
     *
     * @param id The share id.
     * @param updateRequest The share update request.
     * @param resolve Resolves the data of referenced list items into the shares content.
     * @param timeout Maximum time in milliseconds to wait for the business process completed state.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> updateAsync(String id, ShareBaseUpdateRequest updateRequest, boolean resolve, Integer timeout, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(id, updateRequest, resolve, timeout), serviceCallback);
    }

    /**
     * Update single.
     * The update of share is executed asynchronous. However, for the specified timeout completion of the update process is awaited.
     If the update process is not completed by reaching the specified timeout, the update process continues, but null is returned.
     *
     * @param id The share id.
     * @param updateRequest The share update request.
     * @param resolve Resolves the data of referenced list items into the shares content.
     * @param timeout Maximum time in milliseconds to wait for the business process completed state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> updateAsync(String id, ShareBaseUpdateRequest updateRequest, boolean resolve, Integer timeout) {
        return updateWithServiceResponseAsync(id, updateRequest, resolve, timeout).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Update single.
     * The update of share is executed asynchronous. However, for the specified timeout completion of the update process is awaited.
     If the update process is not completed by reaching the specified timeout, the update process continues, but null is returned.
     *
     * @param id The share id.
     * @param updateRequest The share update request.
     * @param resolve Resolves the data of referenced list items into the shares content.
     * @param timeout Maximum time in milliseconds to wait for the business process completed state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> updateWithServiceResponseAsync(String id, ShareBaseUpdateRequest updateRequest, boolean resolve, Integer timeout) {
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        if (updateRequest == null) {
            throw new IllegalArgumentException("Parameter updateRequest is required and cannot be null.");
        }
        Validator.validate(updateRequest);
        return service.update(id, updateRequest, resolve, timeout)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> updateDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BaseResultOfShareBase>() { }.getType())
                .register(500, new TypeToken<PictureparkException>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(429, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Get single.
     * Get share by id (basic or embed).
     *
     * @param id Share Id (not token, use PublicAccess to get share by token)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object get(String id) {
        return getWithServiceResponseAsync(id).toBlocking().single().body();
    }

    /**
     * Get single.
     * Get share by id (basic or embed).
     *
     * @param id Share Id (not token, use PublicAccess to get share by token)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAsync(String id, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(id), serviceCallback);
    }

    /**
     * Get single.
     * Get share by id (basic or embed).
     *
     * @param id Share Id (not token, use PublicAccess to get share by token)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAsync(String id) {
        return getWithServiceResponseAsync(id).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Get single.
     * Get share by id (basic or embed).
     *
     * @param id Share Id (not token, use PublicAccess to get share by token)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        return service.get(id)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ShareBaseDetail>() { }.getType())
                .register(500, new TypeToken<PictureparkException>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(429, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Delete many.
     * The delete of multiple shares executed asynchronous. To keep track of the deletion progress a business process is returned.
     *
     * @param shareIds A list of ListItemCreateRequests.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object deleteMany(List<String> shareIds) {
        return deleteManyWithServiceResponseAsync(shareIds).toBlocking().single().body();
    }

    /**
     * Delete many.
     * The delete of multiple shares executed asynchronous. To keep track of the deletion progress a business process is returned.
     *
     * @param shareIds A list of ListItemCreateRequests.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> deleteManyAsync(List<String> shareIds, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deleteManyWithServiceResponseAsync(shareIds), serviceCallback);
    }

    /**
     * Delete many.
     * The delete of multiple shares executed asynchronous. To keep track of the deletion progress a business process is returned.
     *
     * @param shareIds A list of ListItemCreateRequests.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deleteManyAsync(List<String> shareIds) {
        return deleteManyWithServiceResponseAsync(shareIds).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete many.
     * The delete of multiple shares executed asynchronous. To keep track of the deletion progress a business process is returned.
     *
     * @param shareIds A list of ListItemCreateRequests.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deleteManyWithServiceResponseAsync(List<String> shareIds) {
        if (shareIds == null) {
            throw new IllegalArgumentException("Parameter shareIds is required and cannot be null.");
        }
        Validator.validate(shareIds);
        return service.deleteMany(shareIds)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deleteManyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deleteManyDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BusinessProcess>() { }.getType())
                .register(500, new TypeToken<PictureparkException>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(429, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Aggregate.
     * Aggregates own shares.
     *
     * @param request Aggregation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object aggregate(ShareAggregationRequest request) {
        return aggregateWithServiceResponseAsync(request).toBlocking().single().body();
    }

    /**
     * Aggregate.
     * Aggregates own shares.
     *
     * @param request Aggregation request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> aggregateAsync(ShareAggregationRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(aggregateWithServiceResponseAsync(request), serviceCallback);
    }

    /**
     * Aggregate.
     * Aggregates own shares.
     *
     * @param request Aggregation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> aggregateAsync(ShareAggregationRequest request) {
        return aggregateWithServiceResponseAsync(request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Aggregate.
     * Aggregates own shares.
     *
     * @param request Aggregation request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> aggregateWithServiceResponseAsync(ShareAggregationRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        Validator.validate(request);
        return service.aggregate(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = aggregateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> aggregateDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ObjectAggregationResult>() { }.getType())
                .register(500, new TypeToken<PictureparkException>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(429, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Create single.
     * Create a new share (basic or embed).
     *
     * @param request Polymorph create contract. Use either ShareBasicCreateRequest or ShareEmbedCreateRequest
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object create(ShareBaseCreateRequest request) {
        return createWithServiceResponseAsync(request).toBlocking().single().body();
    }

    /**
     * Create single.
     * Create a new share (basic or embed).
     *
     * @param request Polymorph create contract. Use either ShareBasicCreateRequest or ShareEmbedCreateRequest
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> createAsync(ShareBaseCreateRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(request), serviceCallback);
    }

    /**
     * Create single.
     * Create a new share (basic or embed).
     *
     * @param request Polymorph create contract. Use either ShareBasicCreateRequest or ShareEmbedCreateRequest
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> createAsync(ShareBaseCreateRequest request) {
        return createWithServiceResponseAsync(request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Create single.
     * Create a new share (basic or embed).
     *
     * @param request Polymorph create contract. Use either ShareBasicCreateRequest or ShareEmbedCreateRequest
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> createWithServiceResponseAsync(ShareBaseCreateRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        Validator.validate(request);
        return service.create(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(404, new TypeToken<ContentNotFoundException>() { }.getType())
                .register(500, new TypeToken<PictureparkException>() { }.getType())
                .register(200, new TypeToken<CreateShareResult>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(429, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Search.
     * Search own shares.
     *
     * @param request Search request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object search(ShareSearchRequest request) {
        return searchWithServiceResponseAsync(request).toBlocking().single().body();
    }

    /**
     * Search.
     * Search own shares.
     *
     * @param request Search request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> searchAsync(ShareSearchRequest request, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(searchWithServiceResponseAsync(request), serviceCallback);
    }

    /**
     * Search.
     * Search own shares.
     *
     * @param request Search request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> searchAsync(ShareSearchRequest request) {
        return searchWithServiceResponseAsync(request).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Search.
     * Search own shares.
     *
     * @param request Search request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> searchWithServiceResponseAsync(ShareSearchRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("Parameter request is required and cannot be null.");
        }
        Validator.validate(request);
        return service.search(request)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = searchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> searchDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ShareSearchResult>() { }.getType())
                .register(500, new TypeToken<PictureparkException>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(429, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
