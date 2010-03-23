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
package com.amazonaws.services.elasticloadbalancing;
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.elasticloadbalancing.model.*;

/**
 * Interface for accessing AmazonElasticLoadBalancing asynchronously,
 * using Java Futures.
 * <p>
 * Elastic Load Balancing is a cost-effective and easy to use web
 * service to help you improve availability and scalability of your
 * application. It makes it easy for you to distribute application loads
 * between two or more EC2 instances. Elastic Load Balancing enables
 * availability through redundancy and supports traffic growth of your
 * application.
 * </p> 
 */       
public interface AmazonElasticLoadBalancingAsync extends AmazonElasticLoadBalancing {
    /**
     * <p>
     * Deregisters instances from the LoadBalancer. Once the instance is
     * deregistered, it will stop receiving traffic from the LoadBalancer.
     * </p>
     * <p>
     * In order to successfully call this API, the same account credentials
     * as those used to create the LoadBalancer must be provided.
     * </p>
     *
     * @param deregisterInstancesFromLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           DeregisterInstancesFromLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterInstancesFromLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeregisterInstancesFromLoadBalancerResult> deregisterInstancesFromLoadBalancerAsync(DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables the client to define an application healthcheck for the
     * instances.
     * </p>
     *
     * @param configureHealthCheckRequest Container for the necessary
     *           parameters to execute the ConfigureHealthCheck operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         ConfigureHealthCheck service method, as returned by
     *         AmazonElasticLoadBalancing.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfigureHealthCheckResult> configureHealthCheckAsync(ConfigureHealthCheckRequest configureHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified LoadBalancer.
     * </p>
     * <p>
     * If attempting to recreate the LoadBalancer, the client must
     * reconfigure all the settings. The DNS name associated with a deleted
     * LoadBalancer will no longer be usable. Once deleted, the name and
     * associated DNS record of the LoadBalancer no longer exist and traffic
     * sent to any of its IP addresses will no longer be delivered to client
     * instances. The client will not receive the same DNS name even if a new
     * LoadBalancer with same LoadBalancerName is created.
     * </p>
     * <p>
     * To successfully call this API, the client must provide the same
     * account credentials as were used to create the LoadBalancer.
     * </p>
     * <p>
     * <b>NOTE:</b> By design, if the LoadBalancer does not exist or has
     * already been deleted, DeleteLoadBalancer still succeeds.
     * </p>
     *
     * @param deleteLoadBalancerRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLoadBalancerAsync(DeleteLoadBalancerRequest deleteLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds new instances to the LoadBalancer.
     * </p>
     * <p>
     * Once the instance is registered, it starts receiving traffic and
     * requests from the LoadBalancer. Any instance that is not in any of the
     * Availability Zones registered for the LoadBalancer will be moved to
     * the <i>OutOfService</i> state. It will move to the <i>InService</i>
     * state when the Availability Zone is added to the LoadBalancer.
     * </p>
     * <p>
     * <b>NOTE:</b> In order for this call to be successful, the client must
     * have created the LoadBalancer. The client must provide the same
     * account credentials as those that were used to create the
     * LoadBalancer.
     * </p>
     * <p>
     * <b>NOTE:</b> Completion of this API does not guarantee that operation
     * has completed. Rather, it means that the request has been registered
     * and the changes will happen shortly.
     * </p>
     *
     * @param registerInstancesWithLoadBalancerRequest Container for the
     *           necessary parameters to execute the RegisterInstancesWithLoadBalancer
     *           operation on AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterInstancesWithLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterInstancesWithLoadBalancerResult> registerInstancesWithLoadBalancerAsync(RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new LoadBalancer.
     * </p>
     * <p>
     * Once the call has completed successfully, a new LoadBalancer is
     * created; however, it will not be usable until at least one instance
     * has been registered. When the LoadBalancer creation is completed, the
     * client can check whether or not it is usable by using the
     * DescribeInstanceHealth API. The LoadBalancer is usable as soon as any
     * registered instance is <i>InService</i> .
     * 
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, the client's quota of LoadBalancers is limited
     * to five per Region.
     * </p>
     * <p>
     * <b>NOTE:</b> Load balancer DNS names vary depending on the Region
     * they're created in. For load balancers created in the United States,
     * the DNS name ends with: us-east-1.elb.amazonaws.com (for the US
     * Standard Region) us-west-1.elb.amazonaws.com (for the Northern
     * California Region) For load balancers created in the EU (Ireland)
     * Region, the DNS name ends with: eu-west-1.elb.amazonaws.com
     * </p>
     *
     * @param createLoadBalancerRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest createLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more EC2 Availability Zones to the LoadBalancer.
     * </p>
     * <p>
     * The LoadBalancer evenly distributes requests across all its
     * registered Availability Zones that contain instances. As a result, the
     * client must ensure that its LoadBalancer is appropriately scaled for
     * each registered Availability Zone.
     * </p>
     * <p>
     * <b>NOTE:</b> The new EC2 Availability Zones to be added must be in the
     * same EC2 Region as the Availability Zones for which the LoadBalancer
     * was created.
     * </p>
     *
     * @param enableAvailabilityZonesForLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           EnableAvailabilityZonesForLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         EnableAvailabilityZonesForLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableAvailabilityZonesForLoadBalancerResult> enableAvailabilityZonesForLoadBalancerAsync(EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes the specified EC2 Availability Zones from the set of
     * configured Availability Zones for the LoadBalancer.
     * </p>
     * <p>
     * There must be at least one Availability Zone registered with a
     * LoadBalancer at all times. A client cannot remove all the Availability
     * Zones from a LoadBalancer. Once an Availability Zone is removed, all
     * the instances registered with the LoadBalancer that are in the removed
     * Availability Zone go into the OutOfService state. Upon Availability
     * Zone removal, the LoadBalancer attempts to equally balance the traffic
     * among its remaining usable Availability Zones. Trying to remove an
     * Availability Zone that was not associated with the LoadBalancer does
     * nothing.
     * </p>
     * <p>
     * <b>NOTE:</b> In order for this call to be successful, the client must
     * have created the LoadBalancer. The client must provide the same
     * account credentials as those that were used to create the
     * LoadBalancer.
     * </p>
     *
     * @param disableAvailabilityZonesForLoadBalancerRequest Container for
     *           the necessary parameters to execute the
     *           DisableAvailabilityZonesForLoadBalancer operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DisableAvailabilityZonesForLoadBalancer service method, as returned by
     *         AmazonElasticLoadBalancing.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableAvailabilityZonesForLoadBalancerResult> disableAvailabilityZonesForLoadBalancerAsync(DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current state of the instances of the specified
     * LoadBalancer. If no instances are specified, the state of all the
     * instances for the LoadBalancer is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> The client must have created the specified input
     * LoadBalancer in order to retrieve this information; the client must
     * provide the same account credentials as those that were used to create
     * the LoadBalancer.
     * </p>
     *
     * @param describeInstanceHealthRequest Container for the necessary
     *           parameters to execute the DescribeInstanceHealth operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstanceHealth service method, as returned by
     *         AmazonElasticLoadBalancing.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceHealthResult> describeInstanceHealthAsync(DescribeInstanceHealthRequest describeInstanceHealthRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns detailed configuration information for the specified
     * LoadBalancers. If no LoadBalancers are specified, the operation
     * returns configuration information for all LoadBalancers created by the
     * caller.
     * </p>
     * <p>
     * <b>NOTE:</b> The client must have created the specified input
     * LoadBalancers in order to retrieve this information; the client must
     * provide the same account credentials as those that were used to create
     * the LoadBalancer.
     * </p>
     *
     * @param describeLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancers operation on
     *           AmazonElasticLoadBalancing.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBalancers service method, as returned by
     *         AmazonElasticLoadBalancing.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest describeLoadBalancersRequest) 
            throws AmazonServiceException, AmazonClientException;

}
        