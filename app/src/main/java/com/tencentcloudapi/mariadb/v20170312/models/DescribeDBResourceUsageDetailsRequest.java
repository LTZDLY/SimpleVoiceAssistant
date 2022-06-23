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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBResourceUsageDetailsRequest extends AbstractModel{

    /**
    * 实例 ID，形如：tdsql-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始日期，格式yyyy-mm-dd
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束日期，格式yyyy-mm-dd
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 拉取的指标名称，支持的值为：data_disk_available,binlog_disk_available,mem_available,cpu_usage_rate
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
     * Get 实例 ID，形如：tdsql-ow728lmc。 
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，形如：tdsql-ow728lmc。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始日期，格式yyyy-mm-dd 
     * @return StartTime 开始日期，格式yyyy-mm-dd
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始日期，格式yyyy-mm-dd
     * @param StartTime 开始日期，格式yyyy-mm-dd
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束日期，格式yyyy-mm-dd 
     * @return EndTime 结束日期，格式yyyy-mm-dd
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束日期，格式yyyy-mm-dd
     * @param EndTime 结束日期，格式yyyy-mm-dd
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 拉取的指标名称，支持的值为：data_disk_available,binlog_disk_available,mem_available,cpu_usage_rate 
     * @return MetricName 拉取的指标名称，支持的值为：data_disk_available,binlog_disk_available,mem_available,cpu_usage_rate
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 拉取的指标名称，支持的值为：data_disk_available,binlog_disk_available,mem_available,cpu_usage_rate
     * @param MetricName 拉取的指标名称，支持的值为：data_disk_available,binlog_disk_available,mem_available,cpu_usage_rate
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    public DescribeDBResourceUsageDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBResourceUsageDetailsRequest(DescribeDBResourceUsageDetailsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);

    }
}

