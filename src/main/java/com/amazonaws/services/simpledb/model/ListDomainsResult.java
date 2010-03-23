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
package com.amazonaws.services.simpledb.model;

/**
 * List Domains Result
 */
public class ListDomainsResult {
        
    /**
     * Domain names that match the expression.
     */
    private java.util.List<String> domainNames;

    /**
     * An opaque token indicating that there are more than MaxNumberOfDomains
     * domains still available.
     */
    private String nextToken;

    /**
     * Domain names that match the expression.
     *
     * @return Domain names that match the expression.
     */
    public java.util.List<String> getDomainNames() {
        if (domainNames == null) {
            domainNames = new java.util.ArrayList<String>();
        }
        return domainNames;
    }
    
    /**
     * Domain names that match the expression.
     *
     * @param domainNames Domain names that match the expression.
     */
    public void setDomainNames(java.util.Collection<String> domainNames) {
        java.util.List<String> domainNamesCopy = new java.util.ArrayList<String>();
        if (domainNames != null) {
            domainNamesCopy.addAll(domainNames);
        }
        this.domainNames = domainNamesCopy;
    }
    
    /**
     * Domain names that match the expression.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainNames Domain names that match the expression.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListDomainsResult withDomainNames(String... domainNames) {
        for (String value : domainNames) {
            getDomainNames().add(value);
        }
        return this;
    }
    
    /**
     * Domain names that match the expression.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainNames Domain names that match the expression.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListDomainsResult withDomainNames(java.util.Collection<String> domainNames) {
        java.util.List<String> domainNamesCopy = new java.util.ArrayList<String>();
        if (domainNames != null) {
            domainNamesCopy.addAll(domainNames);
        }
        this.domainNames = domainNamesCopy;

        return this;
    }
    
    /**
     * An opaque token indicating that there are more than MaxNumberOfDomains
     * domains still available.
     *
     * @return An opaque token indicating that there are more than MaxNumberOfDomains
     *         domains still available.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * An opaque token indicating that there are more than MaxNumberOfDomains
     * domains still available.
     *
     * @param nextToken An opaque token indicating that there are more than MaxNumberOfDomains
     *         domains still available.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * An opaque token indicating that there are more than MaxNumberOfDomains
     * domains still available.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken An opaque token indicating that there are more than MaxNumberOfDomains
     *         domains still available.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListDomainsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    
    
}
    