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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKeyResponse extends AbstractModel{

    /**
    * 密钥属性信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyMetadata")
    @Expose
    private KeyMetadata KeyMetadata;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 密钥属性信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyMetadata 密钥属性信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyMetadata getKeyMetadata() {
        return this.KeyMetadata;
    }

    /**
     * Set 密钥属性信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyMetadata 密钥属性信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyMetadata(KeyMetadata KeyMetadata) {
        this.KeyMetadata = KeyMetadata;
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

    public DescribeKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKeyResponse(DescribeKeyResponse source) {
        if (source.KeyMetadata != null) {
            this.KeyMetadata = new KeyMetadata(source.KeyMetadata);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "KeyMetadata.", this.KeyMetadata);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

