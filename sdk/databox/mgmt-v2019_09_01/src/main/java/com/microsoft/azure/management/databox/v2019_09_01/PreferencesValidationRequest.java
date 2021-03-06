/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request to validate preference of transport and data center.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "validationType", defaultImpl = PreferencesValidationRequest.class)
@JsonTypeName("ValidatePreferences")
public class PreferencesValidationRequest extends ValidationInputRequest {
    /**
     * Preference requested with respect to transport type and data center.
     */
    @JsonProperty(value = "preference")
    private Preferences preference;

    /**
     * Device type to be used for the job. Possible values include: 'DataBox',
     * 'DataBoxDisk', 'DataBoxHeavy'.
     */
    @JsonProperty(value = "deviceType", required = true)
    private SkuName deviceType;

    /**
     * Get preference requested with respect to transport type and data center.
     *
     * @return the preference value
     */
    public Preferences preference() {
        return this.preference;
    }

    /**
     * Set preference requested with respect to transport type and data center.
     *
     * @param preference the preference value to set
     * @return the PreferencesValidationRequest object itself.
     */
    public PreferencesValidationRequest withPreference(Preferences preference) {
        this.preference = preference;
        return this;
    }

    /**
     * Get device type to be used for the job. Possible values include: 'DataBox', 'DataBoxDisk', 'DataBoxHeavy'.
     *
     * @return the deviceType value
     */
    public SkuName deviceType() {
        return this.deviceType;
    }

    /**
     * Set device type to be used for the job. Possible values include: 'DataBox', 'DataBoxDisk', 'DataBoxHeavy'.
     *
     * @param deviceType the deviceType value to set
     * @return the PreferencesValidationRequest object itself.
     */
    public PreferencesValidationRequest withDeviceType(SkuName deviceType) {
        this.deviceType = deviceType;
        return this;
    }

}
