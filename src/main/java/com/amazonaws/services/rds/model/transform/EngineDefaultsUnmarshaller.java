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

package com.amazonaws.services.rds.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Engine Defaults Unmarshaller
 */        
public class EngineDefaultsUnmarshaller implements Unmarshaller<EngineDefaults, Node> {

    public EngineDefaults unmarshall(Node node) throws Exception {
        EngineDefaults engineDefaults = new EngineDefaults();
        
        
        Node engineNode = XpathUtils.asNode("Engine", node);
        engineDefaults.setEngine(new StringUnmarshaller().unmarshall(engineNode));
    
        Node markerNode = XpathUtils.asNode("Marker", node);
        engineDefaults.setMarker(new StringUnmarshaller().unmarshall(markerNode));
    
        NodeList parametersNodes = XpathUtils.asNodeList("Parameters/Parameter", node);
        for (int parametersIndex = 0; parametersIndex < XpathUtils.nodeLength(parametersNodes); ++parametersIndex) {
            Node parametersNode = parametersNodes.item(parametersIndex);
            engineDefaults.getParameters().add(new ParameterUnmarshaller().unmarshall(parametersNode));
            parametersNode.getParentNode().removeChild(parametersNode);
        }
    

        return engineDefaults;
    }  
}
    