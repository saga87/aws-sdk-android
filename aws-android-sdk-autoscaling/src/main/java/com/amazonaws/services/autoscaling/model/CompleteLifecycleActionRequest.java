/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Completes the lifecycle action for the specified token or instance with the
 * specified result.
 * </p>
 * <p>
 * This step is a part of the procedure for adding a lifecycle hook to an Auto
 * Scaling group:
 * </p>
 * <ol>
 * <li>(Optional) Create a Lambda function and a rule that allows CloudWatch
 * Events to invoke your Lambda function when Auto Scaling launches or
 * terminates instances.</li>
 * <li>(Optional) Create a notification target and an IAM role. The target can
 * be either an Amazon SQS queue or an Amazon SNS topic. The role allows Auto
 * Scaling to publish lifecycle notifications to the target.</li>
 * <li>Create the lifecycle hook. Specify whether the hook is used when the
 * instances launch or terminate.</li>
 * <li>If you need more time, record the lifecycle action heartbeat to keep the
 * instance in a pending state.</li>
 * <li><b>If you finish before the timeout period ends, complete the lifecycle
 * action.</b></li>
 * </ol>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html"
 * >Auto Scaling Lifecycle</a> in the <i>Auto Scaling Developer Guide</i>.
 * </p>
 */
public class CompleteLifecycleActionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     */
    private String lifecycleHookName;

    /**
     * <p>
     * The name of the group for the lifecycle hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * A universally unique identifier (UUID) that identifies a specific
     * lifecycle action associated with an instance. Auto Scaling sends this
     * token to the notification target you specified when you created the
     * lifecycle hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String lifecycleActionToken;

    /**
     * <p>
     * The action for the group to take. This parameter can be either
     * <code>CONTINUE</code> or <code>ABANDON</code>.
     * </p>
     */
    private String lifecycleActionResult;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String instanceId;

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @return <p>
     *         The name of the lifecycle hook.
     *         </p>
     */
    public String getLifecycleHookName() {
        return lifecycleHookName;
    }

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @param lifecycleHookName <p>
     *            The name of the lifecycle hook.
     *            </p>
     */
    public void setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
    }

    /**
     * <p>
     * The name of the lifecycle hook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[A-Za-z0-9\-_\/]+<br/>
     *
     * @param lifecycleHookName <p>
     *            The name of the lifecycle hook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteLifecycleActionRequest withLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }

    /**
     * <p>
     * The name of the group for the lifecycle hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the group for the lifecycle hook.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group for the lifecycle hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the group for the lifecycle hook.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group for the lifecycle hook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the group for the lifecycle hook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteLifecycleActionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) that identifies a specific
     * lifecycle action associated with an instance. Auto Scaling sends this
     * token to the notification target you specified when you created the
     * lifecycle hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>
     *         A universally unique identifier (UUID) that identifies a specific
     *         lifecycle action associated with an instance. Auto Scaling sends
     *         this token to the notification target you specified when you
     *         created the lifecycle hook.
     *         </p>
     */
    public String getLifecycleActionToken() {
        return lifecycleActionToken;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) that identifies a specific
     * lifecycle action associated with an instance. Auto Scaling sends this
     * token to the notification target you specified when you created the
     * lifecycle hook.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param lifecycleActionToken <p>
     *            A universally unique identifier (UUID) that identifies a
     *            specific lifecycle action associated with an instance. Auto
     *            Scaling sends this token to the notification target you
     *            specified when you created the lifecycle hook.
     *            </p>
     */
    public void setLifecycleActionToken(String lifecycleActionToken) {
        this.lifecycleActionToken = lifecycleActionToken;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) that identifies a specific
     * lifecycle action associated with an instance. Auto Scaling sends this
     * token to the notification target you specified when you created the
     * lifecycle hook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param lifecycleActionToken <p>
     *            A universally unique identifier (UUID) that identifies a
     *            specific lifecycle action associated with an instance. Auto
     *            Scaling sends this token to the notification target you
     *            specified when you created the lifecycle hook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteLifecycleActionRequest withLifecycleActionToken(String lifecycleActionToken) {
        this.lifecycleActionToken = lifecycleActionToken;
        return this;
    }

    /**
     * <p>
     * The action for the group to take. This parameter can be either
     * <code>CONTINUE</code> or <code>ABANDON</code>.
     * </p>
     *
     * @return <p>
     *         The action for the group to take. This parameter can be either
     *         <code>CONTINUE</code> or <code>ABANDON</code>.
     *         </p>
     */
    public String getLifecycleActionResult() {
        return lifecycleActionResult;
    }

    /**
     * <p>
     * The action for the group to take. This parameter can be either
     * <code>CONTINUE</code> or <code>ABANDON</code>.
     * </p>
     *
     * @param lifecycleActionResult <p>
     *            The action for the group to take. This parameter can be either
     *            <code>CONTINUE</code> or <code>ABANDON</code>.
     *            </p>
     */
    public void setLifecycleActionResult(String lifecycleActionResult) {
        this.lifecycleActionResult = lifecycleActionResult;
    }

    /**
     * <p>
     * The action for the group to take. This parameter can be either
     * <code>CONTINUE</code> or <code>ABANDON</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleActionResult <p>
     *            The action for the group to take. This parameter can be either
     *            <code>CONTINUE</code> or <code>ABANDON</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteLifecycleActionRequest withLifecycleActionResult(String lifecycleActionResult) {
        this.lifecycleActionResult = lifecycleActionResult;
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompleteLifecycleActionRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLifecycleHookName() != null)
            sb.append("LifecycleHookName: " + getLifecycleHookName() + ",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getLifecycleActionToken() != null)
            sb.append("LifecycleActionToken: " + getLifecycleActionToken() + ",");
        if (getLifecycleActionResult() != null)
            sb.append("LifecycleActionResult: " + getLifecycleActionResult() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLifecycleHookName() == null) ? 0 : getLifecycleHookName().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getLifecycleActionToken() == null) ? 0 : getLifecycleActionToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getLifecycleActionResult() == null) ? 0 : getLifecycleActionResult().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteLifecycleActionRequest == false)
            return false;
        CompleteLifecycleActionRequest other = (CompleteLifecycleActionRequest) obj;

        if (other.getLifecycleHookName() == null ^ this.getLifecycleHookName() == null)
            return false;
        if (other.getLifecycleHookName() != null
                && other.getLifecycleHookName().equals(this.getLifecycleHookName()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getLifecycleActionToken() == null ^ this.getLifecycleActionToken() == null)
            return false;
        if (other.getLifecycleActionToken() != null
                && other.getLifecycleActionToken().equals(this.getLifecycleActionToken()) == false)
            return false;
        if (other.getLifecycleActionResult() == null ^ this.getLifecycleActionResult() == null)
            return false;
        if (other.getLifecycleActionResult() != null
                && other.getLifecycleActionResult().equals(this.getLifecycleActionResult()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }
}
