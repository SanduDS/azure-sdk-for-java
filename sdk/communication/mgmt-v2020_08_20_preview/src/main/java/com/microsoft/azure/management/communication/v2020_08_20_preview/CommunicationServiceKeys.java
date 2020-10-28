/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.communication.v2020_08_20_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.communication.v2020_08_20_preview.implementation.CommunicationManager;
import com.microsoft.azure.management.communication.v2020_08_20_preview.implementation.CommunicationServiceKeysInner;

/**
 * Type representing CommunicationServiceKeys.
 */
public interface CommunicationServiceKeys extends HasInner<CommunicationServiceKeysInner>, HasManager<CommunicationManager> {
    /**
     * @return the primaryConnectionString value.
     */
    String primaryConnectionString();

    /**
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * @return the secondaryConnectionString value.
     */
    String secondaryConnectionString();

    /**
     * @return the secondaryKey value.
     */
    String secondaryKey();

}
