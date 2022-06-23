/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowLogRequest extends AbstractModel{

    /**
    * 流日志实例名字
    */
    @SerializedName("FlowLogName")
    @Expose
    private String FlowLogName;

    /**
    * 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE|CCN|NAT|DCG
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源唯一ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 流日志采集类型，ACCEPT|REJECT|ALL
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * 私用网络ID或者统一ID，建议使用统一ID，当ResourceType为CCN时不填，其他类型必填。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 流日志实例描述
    */
    @SerializedName("FlowLogDescription")
    @Expose
    private String FlowLogDescription;

    /**
    * 流日志存储ID
    */
    @SerializedName("CloudLogId")
    @Expose
    private String CloudLogId;

    /**
    * 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 消费端类型：cls、ckafka
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 流日志消费端信息，当消费端类型为ckafka时，必填。
    */
    @SerializedName("FlowLogStorage")
    @Expose
    private FlowLogStorage FlowLogStorage;

    /**
     * Get 流日志实例名字 
     * @return FlowLogName 流日志实例名字
     */
    public String getFlowLogName() {
        return this.FlowLogName;
    }

    /**
     * Set 流日志实例名字
     * @param FlowLogName 流日志实例名字
     */
    public void setFlowLogName(String FlowLogName) {
        this.FlowLogName = FlowLogName;
    }

    /**
     * Get 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE|CCN|NAT|DCG 
     * @return ResourceType 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE|CCN|NAT|DCG
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE|CCN|NAT|DCG
     * @param ResourceType 流日志所属资源类型，VPC|SUBNET|NETWORKINTERFACE|CCN|NAT|DCG
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源唯一ID 
     * @return ResourceId 资源唯一ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源唯一ID
     * @param ResourceId 资源唯一ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 流日志采集类型，ACCEPT|REJECT|ALL 
     * @return TrafficType 流日志采集类型，ACCEPT|REJECT|ALL
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set 流日志采集类型，ACCEPT|REJECT|ALL
     * @param TrafficType 流日志采集类型，ACCEPT|REJECT|ALL
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * Get 私用网络ID或者统一ID，建议使用统一ID，当ResourceType为CCN时不填，其他类型必填。 
     * @return VpcId 私用网络ID或者统一ID，建议使用统一ID，当ResourceType为CCN时不填，其他类型必填。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私用网络ID或者统一ID，建议使用统一ID，当ResourceType为CCN时不填，其他类型必填。
     * @param VpcId 私用网络ID或者统一ID，建议使用统一ID，当ResourceType为CCN时不填，其他类型必填。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 流日志实例描述 
     * @return FlowLogDescription 流日志实例描述
     */
    public String getFlowLogDescription() {
        return this.FlowLogDescription;
    }

    /**
     * Set 流日志实例描述
     * @param FlowLogDescription 流日志实例描述
     */
    public void setFlowLogDescription(String FlowLogDescription) {
        this.FlowLogDescription = FlowLogDescription;
    }

    /**
     * Get 流日志存储ID 
     * @return CloudLogId 流日志存储ID
     */
    public String getCloudLogId() {
        return this.CloudLogId;
    }

    /**
     * Set 流日志存储ID
     * @param CloudLogId 流日志存储ID
     */
    public void setCloudLogId(String CloudLogId) {
        this.CloudLogId = CloudLogId;
    }

    /**
     * Get 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}] 
     * @return Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     * @param Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 消费端类型：cls、ckafka 
     * @return StorageType 消费端类型：cls、ckafka
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 消费端类型：cls、ckafka
     * @param StorageType 消费端类型：cls、ckafka
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 流日志消费端信息，当消费端类型为ckafka时，必填。 
     * @return FlowLogStorage 流日志消费端信息，当消费端类型为ckafka时，必填。
     */
    public FlowLogStorage getFlowLogStorage() {
        return this.FlowLogStorage;
    }

    /**
     * Set 流日志消费端信息，当消费端类型为ckafka时，必填。
     * @param FlowLogStorage 流日志消费端信息，当消费端类型为ckafka时，必填。
     */
    public void setFlowLogStorage(FlowLogStorage FlowLogStorage) {
        this.FlowLogStorage = FlowLogStorage;
    }

    public CreateFlowLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowLogRequest(CreateFlowLogRequest source) {
        if (source.FlowLogName != null) {
            this.FlowLogName = new String(source.FlowLogName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.TrafficType != null) {
            this.TrafficType = new String(source.TrafficType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.FlowLogDescription != null) {
            this.FlowLogDescription = new String(source.FlowLogDescription);
        }
        if (source.CloudLogId != null) {
            this.CloudLogId = new String(source.CloudLogId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.FlowLogStorage != null) {
            this.FlowLogStorage = new FlowLogStorage(source.FlowLogStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowLogName", this.FlowLogName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "FlowLogDescription", this.FlowLogDescription);
        this.setParamSimple(map, prefix + "CloudLogId", this.CloudLogId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamObj(map, prefix + "FlowLogStorage.", this.FlowLogStorage);

    }
}

