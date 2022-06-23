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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterAsGroupOptionResponse extends AbstractModel{

    /**
    * 集群弹性伸缩属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterAsGroupOption")
    @Expose
    private ClusterAsGroupOption ClusterAsGroupOption;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群弹性伸缩属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterAsGroupOption 集群弹性伸缩属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClusterAsGroupOption getClusterAsGroupOption() {
        return this.ClusterAsGroupOption;
    }

    /**
     * Set 集群弹性伸缩属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterAsGroupOption 集群弹性伸缩属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterAsGroupOption(ClusterAsGroupOption ClusterAsGroupOption) {
        this.ClusterAsGroupOption = ClusterAsGroupOption;
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

    public DescribeClusterAsGroupOptionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterAsGroupOptionResponse(DescribeClusterAsGroupOptionResponse source) {
        if (source.ClusterAsGroupOption != null) {
            this.ClusterAsGroupOption = new ClusterAsGroupOption(source.ClusterAsGroupOption);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClusterAsGroupOption.", this.ClusterAsGroupOption);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

