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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DvAuthDetail extends AbstractModel{

    /**
    * DV 认证密钥。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthKey")
    @Expose
    private String DvAuthKey;

    /**
    * DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthValue")
    @Expose
    private String DvAuthValue;

    /**
    * DV 认证值域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthDomain")
    @Expose
    private String DvAuthDomain;

    /**
    * DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthPath")
    @Expose
    private String DvAuthPath;

    /**
    * DV 认证子域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuthKeySubDomain")
    @Expose
    private String DvAuthKeySubDomain;

    /**
    * DV 认证信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DvAuths")
    @Expose
    private DvAuths [] DvAuths;

    /**
     * Get DV 认证密钥。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthKey DV 认证密钥。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthKey() {
        return this.DvAuthKey;
    }

    /**
     * Set DV 认证密钥。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthKey DV 认证密钥。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthKey(String DvAuthKey) {
        this.DvAuthKey = DvAuthKey;
    }

    /**
     * Get DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthValue DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthValue() {
        return this.DvAuthValue;
    }

    /**
     * Set DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthValue DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthValue(String DvAuthValue) {
        this.DvAuthValue = DvAuthValue;
    }

    /**
     * Get DV 认证值域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthDomain DV 认证值域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthDomain() {
        return this.DvAuthDomain;
    }

    /**
     * Set DV 认证值域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthDomain DV 认证值域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthDomain(String DvAuthDomain) {
        this.DvAuthDomain = DvAuthDomain;
    }

    /**
     * Get DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthPath DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthPath() {
        return this.DvAuthPath;
    }

    /**
     * Set DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthPath DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthPath(String DvAuthPath) {
        this.DvAuthPath = DvAuthPath;
    }

    /**
     * Get DV 认证子域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuthKeySubDomain DV 认证子域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDvAuthKeySubDomain() {
        return this.DvAuthKeySubDomain;
    }

    /**
     * Set DV 认证子域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuthKeySubDomain DV 认证子域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuthKeySubDomain(String DvAuthKeySubDomain) {
        this.DvAuthKeySubDomain = DvAuthKeySubDomain;
    }

    /**
     * Get DV 认证信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DvAuths DV 认证信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DvAuths [] getDvAuths() {
        return this.DvAuths;
    }

    /**
     * Set DV 认证信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DvAuths DV 认证信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDvAuths(DvAuths [] DvAuths) {
        this.DvAuths = DvAuths;
    }

    public DvAuthDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DvAuthDetail(DvAuthDetail source) {
        if (source.DvAuthKey != null) {
            this.DvAuthKey = new String(source.DvAuthKey);
        }
        if (source.DvAuthValue != null) {
            this.DvAuthValue = new String(source.DvAuthValue);
        }
        if (source.DvAuthDomain != null) {
            this.DvAuthDomain = new String(source.DvAuthDomain);
        }
        if (source.DvAuthPath != null) {
            this.DvAuthPath = new String(source.DvAuthPath);
        }
        if (source.DvAuthKeySubDomain != null) {
            this.DvAuthKeySubDomain = new String(source.DvAuthKeySubDomain);
        }
        if (source.DvAuths != null) {
            this.DvAuths = new DvAuths[source.DvAuths.length];
            for (int i = 0; i < source.DvAuths.length; i++) {
                this.DvAuths[i] = new DvAuths(source.DvAuths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DvAuthKey", this.DvAuthKey);
        this.setParamSimple(map, prefix + "DvAuthValue", this.DvAuthValue);
        this.setParamSimple(map, prefix + "DvAuthDomain", this.DvAuthDomain);
        this.setParamSimple(map, prefix + "DvAuthPath", this.DvAuthPath);
        this.setParamSimple(map, prefix + "DvAuthKeySubDomain", this.DvAuthKeySubDomain);
        this.setParamArrayObj(map, prefix + "DvAuths.", this.DvAuths);

    }
}

