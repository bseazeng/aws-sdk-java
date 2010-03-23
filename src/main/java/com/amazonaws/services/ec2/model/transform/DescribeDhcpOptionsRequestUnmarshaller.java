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

package com.amazonaws.services.ec2.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Describe Dhcp Options Request Unmarshaller
 */        
public class DescribeDhcpOptionsRequestUnmarshaller implements Unmarshaller<DescribeDhcpOptionsRequest, Node> {

    public DescribeDhcpOptionsRequest unmarshall(Node node) throws Exception {
        DescribeDhcpOptionsRequest describeDhcpOptionsRequest = new DescribeDhcpOptionsRequest();
        
        
        NodeList dhcpOptionsIdsNodes = XpathUtils.asNodeList("DhcpOptionsId/DhcpOptionsId", node);
        for (int dhcpOptionsIdsIndex = 0; dhcpOptionsIdsIndex < XpathUtils.nodeLength(dhcpOptionsIdsNodes); ++dhcpOptionsIdsIndex) {
            Node dhcpOptionsIdsNode = dhcpOptionsIdsNodes.item(dhcpOptionsIdsIndex);
            describeDhcpOptionsRequest.getDhcpOptionsIds().add(new StringUnmarshaller().unmarshall(dhcpOptionsIdsNode));
            dhcpOptionsIdsNode.getParentNode().removeChild(dhcpOptionsIdsNode);
        }
    

        return describeDhcpOptionsRequest;
    }  
}
    