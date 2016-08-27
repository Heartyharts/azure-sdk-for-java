/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceCall;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Routes.
 */
public final class RoutesInner {
    /** The Retrofit service to perform REST calls. */
    private RoutesService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of RoutesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RoutesInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(RoutesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Routes to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RoutesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes/{routeName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("routeName") String routeName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes/{routeName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("routeName") String routeName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes/{routeName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("routeName") String routeName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes/{routeName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("routeName") String routeName, @Path("subscriptionId") String subscriptionId, @Body RouteInner routeParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes/{routeName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("routeName") String routeName, @Path("subscriptionId") String subscriptionId, @Body RouteInner routeParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("{nextLink}")
        Observable<Response<ResponseBody>> listNext(@Path(value = "nextLink", encoded = true) String nextPageLink, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> delete(String resourceGroupName, String routeTableName, String routeName) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        return deleteAsync(resourceGroupName, routeTableName, routeName).toBlocking().last();
    }

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> deleteAsync(String resourceGroupName, String routeTableName, String routeName, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(deleteAsync(resourceGroupName, routeTableName, routeName), serviceCallback);
    }

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> deleteAsync(String resourceGroupName, String routeTableName, String routeName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (routeTableName == null) {
            throw new IllegalArgumentException("Parameter routeTableName is required and cannot be null.");
        }
        if (routeName == null) {
            throw new IllegalArgumentException("Parameter routeName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Observable<Response<ResponseBody>> observable = service.delete(resourceGroupName, routeTableName, routeName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> beginDelete(String resourceGroupName, String routeTableName, String routeName) throws CloudException, IOException, IllegalArgumentException {
        return beginDeleteAsync(resourceGroupName, routeTableName, routeName).toBlocking().single();
    }

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> beginDeleteAsync(String resourceGroupName, String routeTableName, String routeName, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(beginDeleteAsync(resourceGroupName, routeTableName, routeName), serviceCallback);
    }

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginDeleteAsync(String resourceGroupName, String routeTableName, String routeName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (routeTableName == null) {
            throw new IllegalArgumentException("Parameter routeTableName is required and cannot be null.");
        }
        if (routeName == null) {
            throw new IllegalArgumentException("Parameter routeName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.beginDelete(resourceGroupName, routeTableName, routeName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginDeleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginDeleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.mapperAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * The Get route operation retrieves information about the specified route from the route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RouteInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RouteInner> get(String resourceGroupName, String routeTableName, String routeName) throws CloudException, IOException, IllegalArgumentException {
        return getAsync(resourceGroupName, routeTableName, routeName).toBlocking().single();
    }

    /**
     * The Get route operation retrieves information about the specified route from the route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<RouteInner> getAsync(String resourceGroupName, String routeTableName, String routeName, final ServiceCallback<RouteInner> serviceCallback) {
        return ServiceCall.create(getAsync(resourceGroupName, routeTableName, routeName), serviceCallback);
    }

    /**
     * The Get route operation retrieves information about the specified route from the route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @return the observable to the RouteInner object
     */
    public Observable<ServiceResponse<RouteInner>> getAsync(String resourceGroupName, String routeTableName, String routeName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (routeTableName == null) {
            throw new IllegalArgumentException("Parameter routeTableName is required and cannot be null.");
        }
        if (routeName == null) {
            throw new IllegalArgumentException("Parameter routeName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, routeTableName, routeName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteInner>>>() {
                @Override
                public Observable<ServiceResponse<RouteInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RouteInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RouteInner, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<RouteInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update route operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the RouteInner object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<RouteInner> createOrUpdate(String resourceGroupName, String routeTableName, String routeName, RouteInner routeParameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        return createOrUpdateAsync(resourceGroupName, routeTableName, routeName, routeParameters).toBlocking().last();
    }

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update route operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<RouteInner> createOrUpdateAsync(String resourceGroupName, String routeTableName, String routeName, RouteInner routeParameters, final ServiceCallback<RouteInner> serviceCallback) {
        return ServiceCall.create(createOrUpdateAsync(resourceGroupName, routeTableName, routeName, routeParameters), serviceCallback);
    }

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update route operation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<RouteInner>> createOrUpdateAsync(String resourceGroupName, String routeTableName, String routeName, RouteInner routeParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (routeTableName == null) {
            throw new IllegalArgumentException("Parameter routeTableName is required and cannot be null.");
        }
        if (routeName == null) {
            throw new IllegalArgumentException("Parameter routeName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (routeParameters == null) {
            throw new IllegalArgumentException("Parameter routeParameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(routeParameters);
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(resourceGroupName, routeTableName, routeName, this.client.subscriptionId(), routeParameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<RouteInner>() { }.getType());
    }

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update route operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RouteInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<RouteInner> beginCreateOrUpdate(String resourceGroupName, String routeTableName, String routeName, RouteInner routeParameters) throws CloudException, IOException, IllegalArgumentException {
        return beginCreateOrUpdateAsync(resourceGroupName, routeTableName, routeName, routeParameters).toBlocking().single();
    }

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update route operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<RouteInner> beginCreateOrUpdateAsync(String resourceGroupName, String routeTableName, String routeName, RouteInner routeParameters, final ServiceCallback<RouteInner> serviceCallback) {
        return ServiceCall.create(beginCreateOrUpdateAsync(resourceGroupName, routeTableName, routeName, routeParameters), serviceCallback);
    }

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update route operation
     * @return the observable to the RouteInner object
     */
    public Observable<ServiceResponse<RouteInner>> beginCreateOrUpdateAsync(String resourceGroupName, String routeTableName, String routeName, RouteInner routeParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (routeTableName == null) {
            throw new IllegalArgumentException("Parameter routeTableName is required and cannot be null.");
        }
        if (routeName == null) {
            throw new IllegalArgumentException("Parameter routeName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (routeParameters == null) {
            throw new IllegalArgumentException("Parameter routeParameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(routeParameters);
        return service.beginCreateOrUpdate(resourceGroupName, routeTableName, routeName, this.client.subscriptionId(), routeParameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteInner>>>() {
                @Override
                public Observable<ServiceResponse<RouteInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RouteInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<RouteInner, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<RouteInner>() { }.getType())
                .register(201, new TypeToken<RouteInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The List network security rule operation retrieves all the routes in a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;RouteInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<RouteInner>> list(final String resourceGroupName, final String routeTableName) throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<RouteInner>> response = listSinglePageAsync(resourceGroupName, routeTableName).toBlocking().single();
        PagedList<RouteInner> pagedList = new PagedList<RouteInner>(response.getBody()) {
            @Override
            public Page<RouteInner> nextPage(String nextPageLink) throws RestException, IOException {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
        return new ServiceResponse<>(pagedList, response.getResponse());
    }

    /**
     * The List network security rule operation retrieves all the routes in a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<RouteInner>> listAsync(final String resourceGroupName, final String routeTableName, final ListOperationCallback<RouteInner> serviceCallback) {
        return AzureServiceCall.create(
            listSinglePageAsync(resourceGroupName, routeTableName),
            new Func1<String, Observable<ServiceResponse<Page<RouteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RouteInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * The List network security rule operation retrieves all the routes in a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @return the observable to the List&lt;RouteInner&gt; object
     */
    public Observable<ServiceResponse<Page<RouteInner>>> listAsync(final String resourceGroupName, final String routeTableName) {
        return listSinglePageAsync(resourceGroupName, routeTableName)
            .concatMap(new Func1<ServiceResponse<Page<RouteInner>>, Observable<ServiceResponse<Page<RouteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RouteInner>>> call(ServiceResponse<Page<RouteInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    return listNextSinglePageAsync(nextPageLink);
                }
            });
    }

    /**
     * The List network security rule operation retrieves all the routes in a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @return the List&lt;RouteInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RouteInner>>> listSinglePageAsync(final String resourceGroupName, final String routeTableName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (routeTableName == null) {
            throw new IllegalArgumentException("Parameter routeTableName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(resourceGroupName, routeTableName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RouteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RouteInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RouteInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RouteInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RouteInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<RouteInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl<RouteInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The List network security rule operation retrieves all the routes in a route table.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;RouteInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<RouteInner>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<RouteInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        PagedList<RouteInner> pagedList = new PagedList<RouteInner>(response.getBody()) {
            @Override
            public Page<RouteInner> nextPage(String nextPageLink) throws RestException, IOException {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
        return new ServiceResponse<>(pagedList, response.getResponse());
    }

    /**
     * The List network security rule operation retrieves all the routes in a route table.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<RouteInner>> listNextAsync(final String nextPageLink, final ServiceCall<List<RouteInner>> serviceCall, final ListOperationCallback<RouteInner> serviceCallback) {
        return AzureServiceCall.create(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<RouteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RouteInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * The List network security rule operation retrieves all the routes in a route table.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the List&lt;RouteInner&gt; object
     */
    public Observable<ServiceResponse<Page<RouteInner>>> listNextAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<RouteInner>>, Observable<ServiceResponse<Page<RouteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RouteInner>>> call(ServiceResponse<Page<RouteInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    return listNextSinglePageAsync(nextPageLink);
                }
            });
    }

    /**
     * The List network security rule operation retrieves all the routes in a route table.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the List&lt;RouteInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RouteInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        return service.listNext(nextPageLink, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RouteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RouteInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RouteInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RouteInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RouteInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<RouteInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl<RouteInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
