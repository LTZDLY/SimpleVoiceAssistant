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

public class MigrateNetworkInterfaceRequest extends AbstractModel{

    /**
    * 弹性网卡实例ID，例如：eni-m6dyj72l。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 弹性网卡当前绑定的CVM实例ID。形如：ins-r8hr2upy。
    */
    @SerializedName("SourceInstanceId")
    @Expose
    private String SourceInstanceId;

    /**
    * 待迁移的目的CVM实例ID。
    */
    @SerializedName("DestinationInstanceId")
    @Expose
    private String DestinationInstanceId;

    /**
    * 网卡绑定类型：0 标准型 1 扩展型。
    */
    @SerializedName("AttachType")
    @Expose
    private Long AttachType;

    /**
     * Get 弹性网卡实例ID，例如：eni-m6dyj72l。 
     * @return NetworkInterfaceId 弹性网卡实例ID，例如：eni-m6dyj72l。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set 弹性网卡实例ID，例如：eni-m6dyj72l。
     * @param NetworkInterfaceId 弹性网卡实例ID，例如：eni-m6dyj72l。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 弹性网卡当前绑定的CVM实例ID。形如：ins-r8hr2upy。 
     * @return SourceInstanceId 弹性网卡当前绑定的CVM实例ID。形如：ins-r8hr2upy。
     */
    public String getSourceInstanceId() {
        return this.SourceInstanceId;
    }

    /**
     * Set 弹性网卡当前绑定的CVM实例ID。形如：ins-r8hr2upy。
     * @param SourceInstanceId 弹性网卡当前绑定的CVM实例ID。形如：ins-r8hr2upy。
     */
    public void setSourceInstanceId(String SourceInstanceId) {
        this.SourceInstanceId = SourceInstanceId;
    }

    /**
     * Get 待迁移的目的CVM实例ID。 
     * @return DestinationInstanceId 待迁移的目的CVM实例ID。
     */
    public String getDestinationInstanceId() {
        return this.DestinationInstanceId;
    }

    /**
     * Set 待迁移的目的CVM实例ID。
     * @param DestinationInstanceId 待迁移的目的CVM实例ID。
     */
    public void setDestinationInstanceId(String DestinationInstanceId) {
        this.DestinationInstanceId = DestinationInstanceId;
    }

    /**
     * Get 网卡绑定类型：0 标准型 1 扩展型。 
     * @return AttachType 网卡绑定类型：0 标准型 1 扩展型。
     */
    public Long getAttachType() {
        return this.AttachType;
    }

    /**
     * Set 网卡绑定类型：0 标准型 1 扩展型。
     * @param AttachType 网卡绑定类型：0 标准型 1 扩展型。
     */
    public void setAttachType(Long AttachType) {
        this.AttachType = AttachType;
    }

    public MigrateNetworkInterfaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateNetworkInterfaceRequest(MigrateNetworkInterfaceRequest source) {
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.SourceInstanceId != null) {
            this.SourceInstanceId = new String(source.SourceInstanceId);
        }
        if (source.DestinationInstanceId != null) {
            this.DestinationInstanceId = new String(source.DestinationInstanceId);
        }
        if (source.AttachType != null) {
            this.AttachType = new Long(source.AttachType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "SourceInstanceId", this.SourceInstanceId);
        this.setParamSimple(map, prefix + "DestinationInstanceId", this.DestinationInstanceId);
        this.setParamSimple(map, prefix + "AttachType", this.AttachType);

    }
}

