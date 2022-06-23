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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBandwidthPackageAttributeRequest extends AbstractModel{

    /**
    * 带宽包唯一标识ID
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * 带宽包名称
    */
    @SerializedName("BandwidthPackageName")
    @Expose
    private String BandwidthPackageName;

    /**
    * 带宽包计费模式
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 退款时迁移为后付费带宽包。默认值：否
    */
    @SerializedName("MigrateOnRefund")
    @Expose
    private Boolean MigrateOnRefund;

    /**
     * Get 带宽包唯一标识ID 
     * @return BandwidthPackageId 带宽包唯一标识ID
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 带宽包唯一标识ID
     * @param BandwidthPackageId 带宽包唯一标识ID
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get 带宽包名称 
     * @return BandwidthPackageName 带宽包名称
     */
    public String getBandwidthPackageName() {
        return this.BandwidthPackageName;
    }

    /**
     * Set 带宽包名称
     * @param BandwidthPackageName 带宽包名称
     */
    public void setBandwidthPackageName(String BandwidthPackageName) {
        this.BandwidthPackageName = BandwidthPackageName;
    }

    /**
     * Get 带宽包计费模式 
     * @return ChargeType 带宽包计费模式
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 带宽包计费模式
     * @param ChargeType 带宽包计费模式
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 退款时迁移为后付费带宽包。默认值：否 
     * @return MigrateOnRefund 退款时迁移为后付费带宽包。默认值：否
     */
    public Boolean getMigrateOnRefund() {
        return this.MigrateOnRefund;
    }

    /**
     * Set 退款时迁移为后付费带宽包。默认值：否
     * @param MigrateOnRefund 退款时迁移为后付费带宽包。默认值：否
     */
    public void setMigrateOnRefund(Boolean MigrateOnRefund) {
        this.MigrateOnRefund = MigrateOnRefund;
    }

    public ModifyBandwidthPackageAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBandwidthPackageAttributeRequest(ModifyBandwidthPackageAttributeRequest source) {
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.BandwidthPackageName != null) {
            this.BandwidthPackageName = new String(source.BandwidthPackageName);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.MigrateOnRefund != null) {
            this.MigrateOnRefund = new Boolean(source.MigrateOnRefund);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "BandwidthPackageName", this.BandwidthPackageName);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "MigrateOnRefund", this.MigrateOnRefund);

    }
}

