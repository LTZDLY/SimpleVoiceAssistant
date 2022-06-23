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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoadBalancingStatusRequest extends AbstractModel{

    /**
    * 站点ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 负载均衡ID
    */
    @SerializedName("LoadBalancingId")
    @Expose
    private String LoadBalancingId;

    /**
    * 状态
online: 启用
offline: 停用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 站点ID 
     * @return ZoneId 站点ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID
     * @param ZoneId 站点ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 负载均衡ID 
     * @return LoadBalancingId 负载均衡ID
     */
    public String getLoadBalancingId() {
        return this.LoadBalancingId;
    }

    /**
     * Set 负载均衡ID
     * @param LoadBalancingId 负载均衡ID
     */
    public void setLoadBalancingId(String LoadBalancingId) {
        this.LoadBalancingId = LoadBalancingId;
    }

    /**
     * Get 状态
online: 启用
offline: 停用 
     * @return Status 状态
online: 启用
offline: 停用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
online: 启用
offline: 停用
     * @param Status 状态
online: 启用
offline: 停用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyLoadBalancingStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancingStatusRequest(ModifyLoadBalancingStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.LoadBalancingId != null) {
            this.LoadBalancingId = new String(source.LoadBalancingId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "LoadBalancingId", this.LoadBalancingId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

