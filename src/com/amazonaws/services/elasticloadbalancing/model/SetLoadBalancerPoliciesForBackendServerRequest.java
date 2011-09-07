/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#setLoadBalancerPoliciesForBackendServer(SetLoadBalancerPoliciesForBackendServerRequest) SetLoadBalancerPoliciesForBackendServer operation}.
 * 
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#setLoadBalancerPoliciesForBackendServer(SetLoadBalancerPoliciesForBackendServerRequest)
 */
public class SetLoadBalancerPoliciesForBackendServerRequest extends AmazonWebServiceRequest {

    private String loadBalancerName;

    private Integer instancePort;

    private java.util.List<String> policyNames;

    /**
     * Returns the value of the LoadBalancerName property for this object.
     *
     * @return The value of the LoadBalancerName property for this object.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * Sets the value of the LoadBalancerName property for this object.
     *
     * @param loadBalancerName The new value for the LoadBalancerName property for this object.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * Sets the value of the LoadBalancerName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The new value for the LoadBalancerName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetLoadBalancerPoliciesForBackendServerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * Returns the value of the InstancePort property for this object.
     *
     * @return The value of the InstancePort property for this object.
     */
    public Integer getInstancePort() {
        return instancePort;
    }
    
    /**
     * Sets the value of the InstancePort property for this object.
     *
     * @param instancePort The new value for the InstancePort property for this object.
     */
    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }
    
    /**
     * Sets the value of the InstancePort property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instancePort The new value for the InstancePort property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetLoadBalancerPoliciesForBackendServerRequest withInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    
    
    /**
     * Returns the value of the PolicyNames property for this object.
     *
     * @return The value of the PolicyNames property for this object.
     */
    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
            policyNames = new java.util.ArrayList<String>();
        }
        return policyNames;
    }
    
    /**
     * Sets the value of the PolicyNames property for this object.
     *
     * @param policyNames The new value for the PolicyNames property for this object.
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        java.util.List<String> policyNamesCopy = new java.util.ArrayList<String>();
        if (policyNames != null) {
            policyNamesCopy.addAll(policyNames);
        }
        this.policyNames = policyNamesCopy;
    }
    
    /**
     * Sets the value of the PolicyNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames The new value for the PolicyNames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetLoadBalancerPoliciesForBackendServerRequest withPolicyNames(String... policyNames) {
        for (String value : policyNames) {
            getPolicyNames().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the PolicyNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames The new value for the PolicyNames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetLoadBalancerPoliciesForBackendServerRequest withPolicyNames(java.util.Collection<String> policyNames) {
        java.util.List<String> policyNamesCopy = new java.util.ArrayList<String>();
        if (policyNames != null) {
            policyNamesCopy.addAll(policyNames);
        }
        this.policyNames = policyNamesCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("LoadBalancerName: " + loadBalancerName + ", ");
        sb.append("InstancePort: " + instancePort + ", ");
        sb.append("PolicyNames: " + policyNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    