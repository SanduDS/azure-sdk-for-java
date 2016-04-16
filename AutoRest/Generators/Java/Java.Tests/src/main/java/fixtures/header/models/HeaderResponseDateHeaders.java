/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header.models;

import org.joda.time.LocalDate;

/**
 * Defines headers for responseDate operation.
 */
public class HeaderResponseDateHeaders {
    /**
     * response with header values "2010-01-01" or "0001-01-01".
     */
    private LocalDate value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public LocalDate value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the HeaderResponseDateHeaders object itself.
     */
    public HeaderResponseDateHeaders setValue(LocalDate value) {
        this.value = value;
        return this;
    }

}
