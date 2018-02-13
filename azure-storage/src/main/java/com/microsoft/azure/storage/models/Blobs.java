/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.List;

/**
 * The Blobs model.
 */
@JacksonXmlRootElement(localName = "Blobs")
public class Blobs {
    /**
     * The blobPrefix property.
     */
    @JsonProperty(value = "BlobPrefix")
    private List<BlobPrefix> blobPrefix;

    /**
     * The blob property.
     */
    @JsonProperty(value = "Blob")
    private List<Blob> blob;

    /**
     * Get the blobPrefix value.
     *
     * @return the blobPrefix value.
     */
    public List<BlobPrefix> blobPrefix() {
        return this.blobPrefix;
    }

    /**
     * Set the blobPrefix value.
     *
     * @param blobPrefix the blobPrefix value to set.
     * @return the Blobs object itself.
     */
    public Blobs withBlobPrefix(List<BlobPrefix> blobPrefix) {
        this.blobPrefix = blobPrefix;
        return this;
    }

    /**
     * Get the blob value.
     *
     * @return the blob value.
     */
    public List<Blob> blob() {
        return this.blob;
    }

    /**
     * Set the blob value.
     *
     * @param blob the blob value to set.
     * @return the Blobs object itself.
     */
    public Blobs withBlob(List<Blob> blob) {
        this.blob = blob;
        return this;
    }
}
