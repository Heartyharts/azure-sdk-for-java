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
 * in ExpressRouteCircuitPeerings.
 */
public final class ExpressRouteCircuitPeeringsInner {
    /** The Retrofit service to perform REST calls. */
    private ExpressRouteCircuitPeeringsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ExpressRouteCircuitPeeringsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ExpressRouteCircuitPeeringsInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(ExpressRouteCircuitPeeringsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ExpressRouteCircuitPeerings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ExpressRouteCircuitPeeringsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("peeringName") String peeringName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("peeringName") String peeringName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("peeringName") String peeringName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("peeringName") String peeringName, @Path("subscriptionId") String subscriptionId, @Body ExpressRouteCircuitPeeringInner peeringParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("peeringName") String peeringName, @Path("subscriptionId") String subscriptionId, @Body ExpressRouteCircuitPeeringInner peeringParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("{nextLink}")
        Observable<Response<ResponseBody>> listNext(@Path(value = "nextLink", encoded = true) String nextPageLink, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * The delete peering operation deletes the specified peering from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> delete(String resourceGroupName, String circuitName, String peeringName) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        return deleteAsync(resourceGroupName, circuitName, peeringName).toBlocking().last();
    }

    /**
     * The delete peering operation deletes the specified peering from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> deleteAsync(String resourceGroupName, String circuitName, String peeringName, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(deleteAsync(resourceGroupName, circuitName, peeringName), serviceCallback);
    }

    /**
     * The delete peering operation deletes the specified peering from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> deleteAsync(String resourceGroupName, String circuitName, String peeringName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (circuitName == null) {
            throw new IllegalArgumentException("Parameter circuitName is required and cannot be null.");
        }
        if (peeringName == null) {
            throw new IllegalArgumentException("Parameter peeringName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Observable<Response<ResponseBody>> observable = service.delete(resourceGroupName, circuitName, peeringName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * The delete peering operation deletes the specified peering from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> beginDelete(String resourceGroupName, String circuitName, String peeringName) throws CloudException, IOException, IllegalArgumentException {
        return beginDeleteAsync(resourceGroupName, circuitName, peeringName).toBlocking().single();
    }

    /**
     * The delete peering operation deletes the specified peering from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> beginDeleteAsync(String resourceGroupName, String circuitName, String peeringName, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(beginDeleteAsync(resourceGroupName, circuitName, peeringName), serviceCallback);
    }

    /**
     * The delete peering operation deletes the specified peering from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginDeleteAsync(String resourceGroupName, String circuitName, String peeringName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (circuitName == null) {
            throw new IllegalArgumentException("Parameter circuitName is required and cannot be null.");
        }
        if (peeringName == null) {
            throw new IllegalArgumentException("Parameter peeringName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.beginDelete(resourceGroupName, circuitName, peeringName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
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
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * The GET peering operation retrieves the specified authorization from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ExpressRouteCircuitPeeringInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ExpressRouteCircuitPeeringInner> get(String resourceGroupName, String circuitName, String peeringName) throws CloudException, IOException, IllegalArgumentException {
        return getAsync(resourceGroupName, circuitName, peeringName).toBlocking().single();
    }

    /**
     * The GET peering operation retrieves the specified authorization from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<ExpressRouteCircuitPeeringInner> getAsync(String resourceGroupName, String circuitName, String peeringName, final ServiceCallback<ExpressRouteCircuitPeeringInner> serviceCallback) {
        return ServiceCall.create(getAsync(resourceGroupName, circuitName, peeringName), serviceCallback);
    }

    /**
     * The GET peering operation retrieves the specified authorization from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @return the observable to the ExpressRouteCircuitPeeringInner object
     */
    public Observable<ServiceResponse<ExpressRouteCircuitPeeringInner>> getAsync(String resourceGroupName, String circuitName, String peeringName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (circuitName == null) {
            throw new IllegalArgumentException("Parameter circuitName is required and cannot be null.");
        }
        if (peeringName == null) {
            throw new IllegalArgumentException("Parameter peeringName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, circuitName, peeringName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExpressRouteCircuitPeeringInner>>>() {
                @Override
                public Observable<ServiceResponse<ExpressRouteCircuitPeeringInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExpressRouteCircuitPeeringInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ExpressRouteCircuitPeeringInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ExpressRouteCircuitPeeringInner, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<ExpressRouteCircuitPeeringInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The Put Peering operation creates/updates an peering in the specified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create/update ExpressRouteCircuit Peering operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ExpressRouteCircuitPeeringInner object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<ExpressRouteCircuitPeeringInner> createOrUpdate(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeeringInner peeringParameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        return createOrUpdateAsync(resourceGroupName, circuitName, peeringName, peeringParameters).toBlocking().last();
    }

    /**
     * The Put Peering operation creates/updates an peering in the specified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create/update ExpressRouteCircuit Peering operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<ExpressRouteCircuitPeeringInner> createOrUpdateAsync(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeeringInner peeringParameters, final ServiceCallback<ExpressRouteCircuitPeeringInner> serviceCallback) {
        return ServiceCall.create(createOrUpdateAsync(resourceGroupName, circuitName, peeringName, peeringParameters), serviceCallback);
    }

    /**
     * The Put Peering operation creates/updates an peering in the specified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create/update ExpressRouteCircuit Peering operation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<ExpressRouteCircuitPeeringInner>> createOrUpdateAsync(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeeringInner peeringParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (circuitName == null) {
            throw new IllegalArgumentException("Parameter circuitName is required and cannot be null.");
        }
        if (peeringName == null) {
            throw new IllegalArgumentException("Parameter peeringName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (peeringParameters == null) {
            throw new IllegalArgumentException("Parameter peeringParameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(peeringParameters);
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(resourceGroupName, circuitName, peeringName, this.client.subscriptionId(), peeringParameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<ExpressRouteCircuitPeeringInner>() { }.getType());
    }

    /**
     * The Put Peering operation creates/updates an peering in the specified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create/update ExpressRouteCircuit Peering operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ExpressRouteCircuitPeeringInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ExpressRouteCircuitPeeringInner> beginCreateOrUpdate(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeeringInner peeringParameters) throws CloudException, IOException, IllegalArgumentException {
        return beginCreateOrUpdateAsync(resourceGroupName, circuitName, peeringName, peeringParameters).toBlocking().single();
    }

    /**
     * The Put Peering operation creates/updates an peering in the specified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create/update ExpressRouteCircuit Peering operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<ExpressRouteCircuitPeeringInner> beginCreateOrUpdateAsync(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeeringInner peeringParameters, final ServiceCallback<ExpressRouteCircuitPeeringInner> serviceCallback) {
        return ServiceCall.create(beginCreateOrUpdateAsync(resourceGroupName, circuitName, peeringName, peeringParameters), serviceCallback);
    }

    /**
     * The Put Peering operation creates/updates an peering in the specified ExpressRouteCircuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create/update ExpressRouteCircuit Peering operation
     * @return the observable to the ExpressRouteCircuitPeeringInner object
     */
    public Observable<ServiceResponse<ExpressRouteCircuitPeeringInner>> beginCreateOrUpdateAsync(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeeringInner peeringParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (circuitName == null) {
            throw new IllegalArgumentException("Parameter circuitName is required and cannot be null.");
        }
        if (peeringName == null) {
            throw new IllegalArgumentException("Parameter peeringName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (peeringParameters == null) {
            throw new IllegalArgumentException("Parameter peeringParameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(peeringParameters);
        return service.beginCreateOrUpdate(resourceGroupName, circuitName, peeringName, this.client.subscriptionId(), peeringParameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExpressRouteCircuitPeeringInner>>>() {
                @Override
                public Observable<ServiceResponse<ExpressRouteCircuitPeeringInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExpressRouteCircuitPeeringInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ExpressRouteCircuitPeeringInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ExpressRouteCircuitPeeringInner, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<ExpressRouteCircuitPeeringInner>() { }.getType())
                .register(201, new TypeToken<ExpressRouteCircuitPeeringInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitPeeringInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<ExpressRouteCircuitPeeringInner>> list(final String resourceGroupName, final String circuitName) throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<ExpressRouteCircuitPeeringInner>> response = listSinglePageAsync(resourceGroupName, circuitName).toBlocking().single();
        PagedList<ExpressRouteCircuitPeeringInner> pagedList = new PagedList<ExpressRouteCircuitPeeringInner>(response.getBody()) {
            @Override
            public Page<ExpressRouteCircuitPeeringInner> nextPage(String nextPageLink) throws RestException, IOException {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
        return new ServiceResponse<>(pagedList, response.getResponse());
    }

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<ExpressRouteCircuitPeeringInner>> listAsync(final String resourceGroupName, final String circuitName, final ListOperationCallback<ExpressRouteCircuitPeeringInner> serviceCallback) {
        return AzureServiceCall.create(
            listSinglePageAsync(resourceGroupName, circuitName),
            new Func1<String, Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @return the observable to the List&lt;ExpressRouteCircuitPeeringInner&gt; object
     */
    public Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>> listAsync(final String resourceGroupName, final String circuitName) {
        return listSinglePageAsync(resourceGroupName, circuitName)
            .concatMap(new Func1<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>, Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>> call(ServiceResponse<Page<ExpressRouteCircuitPeeringInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    return listNextSinglePageAsync(nextPageLink);
                }
            });
    }

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the circuit.
     * @return the List&lt;ExpressRouteCircuitPeeringInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>> listSinglePageAsync(final String resourceGroupName, final String circuitName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (circuitName == null) {
            throw new IllegalArgumentException("Parameter circuitName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(resourceGroupName, circuitName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ExpressRouteCircuitPeeringInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ExpressRouteCircuitPeeringInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<ExpressRouteCircuitPeeringInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl<ExpressRouteCircuitPeeringInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ExpressRouteCircuitPeeringInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<ExpressRouteCircuitPeeringInner>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<ExpressRouteCircuitPeeringInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        PagedList<ExpressRouteCircuitPeeringInner> pagedList = new PagedList<ExpressRouteCircuitPeeringInner>(response.getBody()) {
            @Override
            public Page<ExpressRouteCircuitPeeringInner> nextPage(String nextPageLink) throws RestException, IOException {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
        return new ServiceResponse<>(pagedList, response.getResponse());
    }

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<ExpressRouteCircuitPeeringInner>> listNextAsync(final String nextPageLink, final ServiceCall<List<ExpressRouteCircuitPeeringInner>> serviceCall, final ListOperationCallback<ExpressRouteCircuitPeeringInner> serviceCallback) {
        return AzureServiceCall.create(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the List&lt;ExpressRouteCircuitPeeringInner&gt; object
     */
    public Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>> listNextAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>, Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>> call(ServiceResponse<Page<ExpressRouteCircuitPeeringInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    return listNextSinglePageAsync(nextPageLink);
                }
            });
    }

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the List&lt;ExpressRouteCircuitPeeringInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        return service.listNext(nextPageLink, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ExpressRouteCircuitPeeringInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ExpressRouteCircuitPeeringInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ExpressRouteCircuitPeeringInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<ExpressRouteCircuitPeeringInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl<ExpressRouteCircuitPeeringInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
