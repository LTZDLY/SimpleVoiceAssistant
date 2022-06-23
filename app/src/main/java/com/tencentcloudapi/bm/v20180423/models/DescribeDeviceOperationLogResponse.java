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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceOperationLogResponse extends AbstractModel{

    /**
    * 操作日志列表
    */
    @SerializedName("DeviceOperationLogSet")
    @Expose
    private DeviceOperationLog [] DeviceOperationLogSet;

    /**
    * 返回数目
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 操作日志列表 
     * @return DeviceOperationLogSet 操作日志列表
     */
    public DeviceOperationLog [] getDeviceOperationLogSet() {
        return this.DeviceOperationLogSet;
    }

    /**
     * Set 操作日志列表
     * @param DeviceOperationLogSet 操作日志列表
     */
    public void setDeviceOperationLogSet(DeviceOperationLog [] DeviceOperationLogSet) {
        this.DeviceOperationLogSet = DeviceOperationLogSet;
    }

    /**
     * Get 返回数目 
     * @return TotalCount 返回数目
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回数目
     * @param TotalCount 返回数目
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDeviceOperationLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceOperationLogResponse(DescribeDeviceOperationLogResponse source) {
        if (source.DeviceOperationLogSet != null) {
            this.DeviceOperationLogSet = new DeviceOperationLog[source.DeviceOperationLogSet.length];
            for (int i = 0; i < source.DeviceOperationLogSet.length; i++) {
                this.DeviceOperationLogSet[i] = new DeviceOperationLog(source.DeviceOperationLogSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DeviceOperationLogSet.", this.DeviceOperationLogSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

