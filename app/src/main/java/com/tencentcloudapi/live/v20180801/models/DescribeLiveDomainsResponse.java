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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveDomainsResponse extends AbstractModel{

    /**
    * 总记录数。
    */
    @SerializedName("AllCount")
    @Expose
    private Long AllCount;

    /**
    * 域名详细信息列表。
    */
    @SerializedName("DomainList")
    @Expose
    private DomainInfo [] DomainList;

    /**
    * 可继续添加域名数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateLimitCount")
    @Expose
    private Long CreateLimitCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总记录数。 
     * @return AllCount 总记录数。
     */
    public Long getAllCount() {
        return this.AllCount;
    }

    /**
     * Set 总记录数。
     * @param AllCount 总记录数。
     */
    public void setAllCount(Long AllCount) {
        this.AllCount = AllCount;
    }

    /**
     * Get 域名详细信息列表。 
     * @return DomainList 域名详细信息列表。
     */
    public DomainInfo [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set 域名详细信息列表。
     * @param DomainList 域名详细信息列表。
     */
    public void setDomainList(DomainInfo [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get 可继续添加域名数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateLimitCount 可继续添加域名数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateLimitCount() {
        return this.CreateLimitCount;
    }

    /**
     * Set 可继续添加域名数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateLimitCount 可继续添加域名数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateLimitCount(Long CreateLimitCount) {
        this.CreateLimitCount = CreateLimitCount;
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

    public DescribeLiveDomainsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveDomainsResponse(DescribeLiveDomainsResponse source) {
        if (source.AllCount != null) {
            this.AllCount = new Long(source.AllCount);
        }
        if (source.DomainList != null) {
            this.DomainList = new DomainInfo[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new DomainInfo(source.DomainList[i]);
            }
        }
        if (source.CreateLimitCount != null) {
            this.CreateLimitCount = new Long(source.CreateLimitCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllCount", this.AllCount);
        this.setParamArrayObj(map, prefix + "DomainList.", this.DomainList);
        this.setParamSimple(map, prefix + "CreateLimitCount", this.CreateLimitCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

