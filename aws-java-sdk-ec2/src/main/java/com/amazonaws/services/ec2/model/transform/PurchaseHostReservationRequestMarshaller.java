/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * PurchaseHostReservationRequest Marshaller
 */

public class PurchaseHostReservationRequestMarshaller
        implements
        Marshaller<Request<PurchaseHostReservationRequest>, PurchaseHostReservationRequest> {

    public Request<PurchaseHostReservationRequest> marshall(
            PurchaseHostReservationRequest purchaseHostReservationRequest) {

        if (purchaseHostReservationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<PurchaseHostReservationRequest> request = new DefaultRequest<PurchaseHostReservationRequest>(
                purchaseHostReservationRequest, "AmazonEC2");
        request.addParameter("Action", "PurchaseHostReservation");
        request.addParameter("Version", "2016-04-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (purchaseHostReservationRequest.getOfferingId() != null) {
            request.addParameter("OfferingId", StringUtils
                    .fromString(purchaseHostReservationRequest.getOfferingId()));
        }

        com.amazonaws.internal.SdkInternalList<String> hostIdSetList = (com.amazonaws.internal.SdkInternalList<String>) purchaseHostReservationRequest
                .getHostIdSet();
        if (!hostIdSetList.isEmpty() || !hostIdSetList.isAutoConstruct()) {
            int hostIdSetListIndex = 1;

            for (String hostIdSetListValue : hostIdSetList) {
                if (hostIdSetListValue != null) {
                    request.addParameter("HostIdSet." + hostIdSetListIndex,
                            StringUtils.fromString(hostIdSetListValue));
                }
                hostIdSetListIndex++;
            }
        }

        if (purchaseHostReservationRequest.getLimitPrice() != null) {
            request.addParameter("LimitPrice", StringUtils
                    .fromString(purchaseHostReservationRequest.getLimitPrice()));
        }

        if (purchaseHostReservationRequest.getCurrencyCode() != null) {
            request.addParameter("CurrencyCode", StringUtils
                    .fromString(purchaseHostReservationRequest
                            .getCurrencyCode()));
        }

        if (purchaseHostReservationRequest.getClientToken() != null) {
            request.addParameter("ClientToken",
                    StringUtils.fromString(purchaseHostReservationRequest
                            .getClientToken()));
        }

        return request;
    }

}
