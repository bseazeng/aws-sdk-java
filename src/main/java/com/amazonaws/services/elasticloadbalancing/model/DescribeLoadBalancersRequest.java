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
package com.amazonaws.services.elasticloadbalancing.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * 
 * </p>
 */
public class DescribeLoadBalancersRequest extends AmazonWebServiceRequest {
        
    /**
     * A list of names associated with the LoadBalancers at creation time.
     */
    private java.util.List<String> loadBalancerNames;

    /**
     * A list of names associated with the LoadBalancers at creation time.
     *
     * @return A list of names associated with the LoadBalancers at creation time.
     */
    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
            loadBalancerNames = new java.util.ArrayList<String>();
        }
        return loadBalancerNames;
    }
    
    /**
     * A list of names associated with the LoadBalancers at creation time.
     *
     * @param loadBalancerNames A list of names associated with the LoadBalancers at creation time.
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        java.util.List<String> loadBalancerNamesCopy = new java.util.ArrayList<String>();
        if (loadBalancerNames != null) {
            loadBalancerNamesCopy.addAll(loadBalancerNames);
        }
        this.loadBalancerNames = loadBalancerNamesCopy;
    }
    
    /**
     * A list of names associated with the LoadBalancers at creation time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of names associated with the LoadBalancers at creation time.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancersRequest withLoadBalancerNames(String... loadBalancerNames) {
        for (String value : loadBalancerNames) {
            getLoadBalancerNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of names associated with the LoadBalancers at creation time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of names associated with the LoadBalancers at creation time.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancersRequest withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        java.util.List<String> loadBalancerNamesCopy = new java.util.ArrayList<String>();
        if (loadBalancerNames != null) {
            loadBalancerNamesCopy.addAll(loadBalancerNames);
        }
        this.loadBalancerNames = loadBalancerNamesCopy;

        return this;
    }
    
}
    