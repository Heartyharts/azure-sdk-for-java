/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation.NamespacesInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.IpFilterRule;
import rx.Completable;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.VirtualNetworkRule;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation.NetworkRuleSetInner;

/**
 * Type representing Namespaces.
 */
public interface Namespaces extends SupportsCreating<EHNamespace.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<EHNamespace>, SupportsListingByResourceGroup<EHNamespace>, SupportsListing<EHNamespace>, HasInner<NamespacesInner> {
    /**
     * Begins definition for a new Ipfilterrule resource.
     * @param name resource name.
     * @return the first stage of the new Ipfilterrule definition.
     */
    IpFilterRule.DefinitionStages.Blank defineIpfilterrule(String name);

    /**
     * Begins definition for a new Virtualnetworkrule resource.
     * @param name resource name.
     * @return the first stage of the new Virtualnetworkrule definition.
     */
    VirtualNetworkRule.DefinitionStages.Blank defineVirtualnetworkrule(String name);

    /**
     * Gets an IpFilterRule for a Namespace by rule name.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @param ipFilterRuleName The IP Filter Rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IpFilterRule> getIpFilterRuleAsync(String resourceGroupName, String namespaceName, String ipFilterRuleName);

    /**
     * Gets a list of IP Filter rules for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IpFilterRule> listIPFilterRulesAsync(final String resourceGroupName, final String namespaceName);

    /**
     * Deletes an IpFilterRule for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @param ipFilterRuleName The IP Filter Rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteIpFilterRuleAsync(String resourceGroupName, String namespaceName, String ipFilterRuleName);

    /**
     * Gets an VirtualNetworkRule for a Namespace by rule name.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @param virtualNetworkRuleName The Virtual Network Rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetworkRule> getVirtualNetworkRuleAsync(String resourceGroupName, String namespaceName, String virtualNetworkRuleName);

    /**
     * Gets a list of VirtualNetwork rules for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetworkRule> listVirtualNetworkRulesAsync(final String resourceGroupName, final String namespaceName);

    /**
     * Deletes an VirtualNetworkRule for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @param virtualNetworkRuleName The Virtual Network Rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteVirtualNetworkRuleAsync(String resourceGroupName, String namespaceName, String virtualNetworkRuleName);

    /**
     * Create or update NetworkRuleSet for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @param parameters The Namespace IpFilterRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkRuleSet> createOrUpdateNetworkRuleSetAsync(String resourceGroupName, String namespaceName, NetworkRuleSetInner parameters);

    /**
     * Gets NetworkRuleSet for a Namespace.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param namespaceName The Namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkRuleSet> getNetworkRuleSetAsync(String resourceGroupName, String namespaceName);

}
