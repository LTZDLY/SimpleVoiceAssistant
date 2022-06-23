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
package com.tencentcloudapi.chdfs.v20190718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLifeCycleRulesResponse extends AbstractModel{

    /**
    * 生命周期规则列表
    */
    @SerializedName("LifeCycleRules")
    @Expose
    private LifeCycleRule [] LifeCycleRules;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 生命周期规则列表 
     * @return LifeCycleRules 生命周期规则列表
     */
    public LifeCycleRule [] getLifeCycleRules() {
        return this.LifeCycleRules;
    }

    /**
     * Set 生命周期规则列表
     * @param LifeCycleRules 生命周期规则列表
     */
    public void setLifeCycleRules(LifeCycleRule [] LifeCycleRules) {
        this.LifeCycleRules = LifeCycleRules;
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

    public DescribeLifeCycleRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLifeCycleRulesResponse(DescribeLifeCycleRulesResponse source) {
        if (source.LifeCycleRules != null) {
            this.LifeCycleRules = new LifeCycleRule[source.LifeCycleRules.length];
            for (int i = 0; i < source.LifeCycleRules.length; i++) {
                this.LifeCycleRules[i] = new LifeCycleRule(source.LifeCycleRules[i]);
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
        this.setParamArrayObj(map, prefix + "LifeCycleRules.", this.LifeCycleRules);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
