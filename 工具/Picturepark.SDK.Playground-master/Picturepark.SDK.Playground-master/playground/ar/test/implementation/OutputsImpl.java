/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.implementation;

import retrofit2.Retrofit;
import picturepark.Outputs;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import picturepark.models.ContentsByIdsRequest;
import picturepark.models.OutputDetail;
import picturepark.models.OutputNotFoundException;
import picturepark.models.PictureparkException;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Outputs.
 */
public class OutputsImpl implements Outputs {
    /** The Retrofit service to perform REST calls. */
    private OutputsService service;
    /** The service client containing this operation class. */
    private WebAPISwaggerspecificationImpl client;

    /**
     * Initializes an instance of Outputs.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OutputsImpl(Retrofit retrofit, WebAPISwaggerspecificationImpl client) {
        this.service = retrofit.create(OutputsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Outputs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OutputsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: picturepark.Outputs getByContentIds" })
        @POST("V1/Outputs")
        Observable<Response<ResponseBody>> getByContentIds(@Body ContentsByIdsRequest contentsByIdsRequest);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: picturepark.Outputs get" })
        @GET("V1/Outputs/{OutputId}")
        Observable<Response<ResponseBody>> get(@Path("OutputId") String outputId);

    }

    /**
     * Get outputs by contentIds.
     * Gets output documents related for given contentids.
     *
     * @param contentsByIdsRequest Contains the list of contentIds for which the outputs are requested
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getByContentIds(ContentsByIdsRequest contentsByIdsRequest) {
        return getByContentIdsWithServiceResponseAsync(contentsByIdsRequest).toBlocking().single().body();
    }

    /**
     * Get outputs by contentIds.
     * Gets output documents related for given contentids.
     *
     * @param contentsByIdsRequest Contains the list of contentIds for which the outputs are requested
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getByContentIdsAsync(ContentsByIdsRequest contentsByIdsRequest, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getByContentIdsWithServiceResponseAsync(contentsByIdsRequest), serviceCallback);
    }

    /**
     * Get outputs by contentIds.
     * Gets output documents related for given contentids.
     *
     * @param contentsByIdsRequest Contains the list of contentIds for which the outputs are requested
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getByContentIdsAsync(ContentsByIdsRequest contentsByIdsRequest) {
        return getByContentIdsWithServiceResponseAsync(contentsByIdsRequest).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Get outputs by contentIds.
     * Gets output documents related for given contentids.
     *
     * @param contentsByIdsRequest Contains the list of contentIds for which the outputs are requested
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getByContentIdsWithServiceResponseAsync(ContentsByIdsRequest contentsByIdsRequest) {
        if (contentsByIdsRequest == null) {
            throw new IllegalArgumentException("Parameter contentsByIdsRequest is required and cannot be null.");
        }
        Validator.validate(contentsByIdsRequest);
        return service.getByContentIds(contentsByIdsRequest)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getByContentIdsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getByContentIdsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<OutputDetail>>() { }.getType())
                .register(500, new TypeToken<PictureparkException>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(429, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Get Single.
     * Gets a output document by id.
     *
     * @param outputId The output id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object get(String outputId) {
        return getWithServiceResponseAsync(outputId).toBlocking().single().body();
    }

    /**
     * Get Single.
     * Gets a output document by id.
     *
     * @param outputId The output id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAsync(String outputId, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(outputId), serviceCallback);
    }

    /**
     * Get Single.
     * Gets a output document by id.
     *
     * @param outputId The output id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAsync(String outputId) {
        return getWithServiceResponseAsync(outputId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Get Single.
     * Gets a output document by id.
     *
     * @param outputId The output id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String outputId) {
        if (outputId == null) {
            throw new IllegalArgumentException("Parameter outputId is required and cannot be null.");
        }
        return service.get(outputId)
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
                .register(404, new TypeToken<OutputNotFoundException>() { }.getType())
                .register(200, new TypeToken<OutputDetail>() { }.getType())
                .register(500, new TypeToken<PictureparkException>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(429, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
