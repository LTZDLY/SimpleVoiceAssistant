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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnConfig extends AbstractModel{

    /**
    * on | off
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 自定义 cc 防护规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private ScdnCCRules [] Rules;

    /**
    * 增强自定义 cc 防护规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedRules")
    @Expose
    private AdvancedCCRules [] AdvancedRules;

    /**
     * Get on | off 
     * @return Switch on | off
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set on | off
     * @param Switch on | off
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 自定义 cc 防护规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules 自定义 cc 防护规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScdnCCRules [] getRules() {
        return this.Rules;
    }

    /**
     * Set 自定义 cc 防护规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules 自定义 cc 防护规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(ScdnCCRules [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 增强自定义 cc 防护规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedRules 增强自定义 cc 防护规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedCCRules [] getAdvancedRules() {
        return this.AdvancedRules;
    }

    /**
     * Set 增强自定义 cc 防护规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedRules 增强自定义 cc 防护规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedRules(AdvancedCCRules [] AdvancedRules) {
        this.AdvancedRules = AdvancedRules;
    }

    public ScdnConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnConfig(ScdnConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Rules != null) {
            this.Rules = new ScdnCCRules[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new ScdnCCRules(source.Rules[i]);
            }
        }
        if (source.AdvancedRules != null) {
            this.AdvancedRules = new AdvancedCCRules[source.AdvancedRules.length];
            for (int i = 0; i < source.AdvancedRules.length; i++) {
                this.AdvancedRules[i] = new AdvancedCCRules(source.AdvancedRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamArrayObj(map, prefix + "AdvancedRules.", this.AdvancedRules);

    }
}

