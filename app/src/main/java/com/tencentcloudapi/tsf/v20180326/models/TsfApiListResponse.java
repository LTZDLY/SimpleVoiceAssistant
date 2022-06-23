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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TsfApiListResponse extends AbstractModel{

    /**
    * 数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * API 列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private MsApiArray [] Content;

    /**
     * Get 数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get API 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content API 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MsApiArray [] getContent() {
        return this.Content;
    }

    /**
     * Set API 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content API 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(MsApiArray [] Content) {
        this.Content = Content;
    }

    public TsfApiListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TsfApiListResponse(TsfApiListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Content != null) {
            this.Content = new MsApiArray[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new MsApiArray(source.Content[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);

    }
}

