/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.internal;

import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.ResponseMetadata;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.transform.Unmarshaller;

/**
 * S3 Implementation of HttpResponseHandler. Relies on a SAX unmarshaller for
 * handling the response.
 */
public class S3XmlResponseHandler<T> extends AbstractS3ResponseHandler<T> {
    
    /** The SAX unmarshaller to use when handling the response from S3 */
    private Unmarshaller<T, InputStream> responseUnmarshaller;

    /** Shared logger for profiling information */
    private static final Log log = LogFactory.getLog("com.amazonaws.request");

    /**
     * Constructs a new S3 response handler that will use the specified SAX
     * unmarshaller to turn the response into an object.
     * 
     * @param responseUnmarshaller
     *            The SAX unmarshaller to use on the response from S3.
     */
    public S3XmlResponseHandler(Unmarshaller<T, InputStream> responseUnmarshaller) { 
        this.responseUnmarshaller = responseUnmarshaller;
    }

    /**
     * @see com.amazonaws.http.HttpResponseHandler#handle(com.amazonaws.http.HttpResponse)
     */
    public ResponseMetadata<T> handle(HttpResponse response) throws Exception {
        ResponseMetadata<T> responseMetadata = parseResponseMetadata(response);
        
        if (responseUnmarshaller != null) {
            log.trace("Beginning to parse service response XML");
            T result = responseUnmarshaller.unmarshall(response.getContent());
            log.trace("Done parsing service response XML");
            responseMetadata.setResult(result);
        }
        
        return responseMetadata;
    }

}
