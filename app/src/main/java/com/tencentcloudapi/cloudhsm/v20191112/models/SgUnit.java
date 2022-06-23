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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SgUnit extends AbstractModel{

    /**
    * 安全组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SgId")
    @Expose
    private String SgId;

    /**
    * 安全组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SgName")
    @Expose
    private String SgName;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SgRemark")
    @Expose
    private String SgRemark;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 安全组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SgId 安全组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSgId() {
        return this.SgId;
    }

    /**
     * Set 安全组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SgId 安全组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSgId(String SgId) {
        this.SgId = SgId;
    }

    /**
     * Get 安全组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SgName 安全组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSgName() {
        return this.SgName;
    }

    /**
     * Set 安全组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SgName 安全组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSgName(String SgName) {
        this.SgName = SgName;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SgRemark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSgRemark() {
        return this.SgRemark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param SgRemark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSgRemark(String SgRemark) {
        this.SgRemark = SgRemark;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public SgUnit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SgUnit(SgUnit source) {
        if (source.SgId != null) {
            this.SgId = new String(source.SgId);
        }
        if (source.SgName != null) {
            this.SgName = new String(source.SgName);
        }
        if (source.SgRemark != null) {
            this.SgRemark = new String(source.SgRemark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SgId", this.SgId);
        this.setParamSimple(map, prefix + "SgName", this.SgName);
        this.setParamSimple(map, prefix + "SgRemark", this.SgRemark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

