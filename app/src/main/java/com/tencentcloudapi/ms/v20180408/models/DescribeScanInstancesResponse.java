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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanInstancesResponse extends AbstractModel{

    /**
    * 符合要求的app数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 一个关于app详细信息的结构体，主要包括app的基本信息和扫描状态信息。
    */
    @SerializedName("ScanSet")
    @Expose
    private AppScanSet [] ScanSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合要求的app数量 
     * @return TotalCount 符合要求的app数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合要求的app数量
     * @param TotalCount 符合要求的app数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 一个关于app详细信息的结构体，主要包括app的基本信息和扫描状态信息。 
     * @return ScanSet 一个关于app详细信息的结构体，主要包括app的基本信息和扫描状态信息。
     */
    public AppScanSet [] getScanSet() {
        return this.ScanSet;
    }

    /**
     * Set 一个关于app详细信息的结构体，主要包括app的基本信息和扫描状态信息。
     * @param ScanSet 一个关于app详细信息的结构体，主要包括app的基本信息和扫描状态信息。
     */
    public void setScanSet(AppScanSet [] ScanSet) {
        this.ScanSet = ScanSet;
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

    public DescribeScanInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanInstancesResponse(DescribeScanInstancesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ScanSet != null) {
            this.ScanSet = new AppScanSet[source.ScanSet.length];
            for (int i = 0; i < source.ScanSet.length; i++) {
                this.ScanSet[i] = new AppScanSet(source.ScanSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ScanSet.", this.ScanSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

