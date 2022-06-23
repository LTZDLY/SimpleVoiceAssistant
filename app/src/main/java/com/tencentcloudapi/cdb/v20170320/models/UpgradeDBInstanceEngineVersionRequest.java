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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceEngineVersionRequest extends AbstractModel{

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主实例数据库引擎版本，支持值包括：5.6 和 5.7。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级中过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 [切换访问新实例](https://cloud.tencent.com/document/product/236/15864) 触发该流程。
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
    * 是否是内核子版本升级，支持的值：1 - 升级内核子版本；0 - 升级数据库引擎版本。
    */
    @SerializedName("UpgradeSubversion")
    @Expose
    private Long UpgradeSubversion;

    /**
    * 延迟阈值。取值范围1~10
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主实例数据库引擎版本，支持值包括：5.6 和 5.7。 
     * @return EngineVersion 主实例数据库引擎版本，支持值包括：5.6 和 5.7。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 主实例数据库引擎版本，支持值包括：5.6 和 5.7。
     * @param EngineVersion 主实例数据库引擎版本，支持值包括：5.6 和 5.7。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级中过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 [切换访问新实例](https://cloud.tencent.com/document/product/236/15864) 触发该流程。 
     * @return WaitSwitch 切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级中过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 [切换访问新实例](https://cloud.tencent.com/document/product/236/15864) 触发该流程。
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set 切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级中过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 [切换访问新实例](https://cloud.tencent.com/document/product/236/15864) 触发该流程。
     * @param WaitSwitch 切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级中过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 [切换访问新实例](https://cloud.tencent.com/document/product/236/15864) 触发该流程。
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    /**
     * Get 是否是内核子版本升级，支持的值：1 - 升级内核子版本；0 - 升级数据库引擎版本。 
     * @return UpgradeSubversion 是否是内核子版本升级，支持的值：1 - 升级内核子版本；0 - 升级数据库引擎版本。
     */
    public Long getUpgradeSubversion() {
        return this.UpgradeSubversion;
    }

    /**
     * Set 是否是内核子版本升级，支持的值：1 - 升级内核子版本；0 - 升级数据库引擎版本。
     * @param UpgradeSubversion 是否是内核子版本升级，支持的值：1 - 升级内核子版本；0 - 升级数据库引擎版本。
     */
    public void setUpgradeSubversion(Long UpgradeSubversion) {
        this.UpgradeSubversion = UpgradeSubversion;
    }

    /**
     * Get 延迟阈值。取值范围1~10 
     * @return MaxDelayTime 延迟阈值。取值范围1~10
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set 延迟阈值。取值范围1~10
     * @param MaxDelayTime 延迟阈值。取值范围1~10
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
    }

    public UpgradeDBInstanceEngineVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDBInstanceEngineVersionRequest(UpgradeDBInstanceEngineVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Long(source.WaitSwitch);
        }
        if (source.UpgradeSubversion != null) {
            this.UpgradeSubversion = new Long(source.UpgradeSubversion);
        }
        if (source.MaxDelayTime != null) {
            this.MaxDelayTime = new Long(source.MaxDelayTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);
        this.setParamSimple(map, prefix + "UpgradeSubversion", this.UpgradeSubversion);
        this.setParamSimple(map, prefix + "MaxDelayTime", this.MaxDelayTime);

    }
}

