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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataPoint extends AbstractModel{

    /**
    * 数据点的时间
    */
    @SerializedName("LogTime")
    @Expose
    private String LogTime;

    /**
    * 数据值
    */
    @SerializedName("MetricValue")
    @Expose
    private Float MetricValue;

    /**
     * Get 数据点的时间 
     * @return LogTime 数据点的时间
     */
    public String getLogTime() {
        return this.LogTime;
    }

    /**
     * Set 数据点的时间
     * @param LogTime 数据点的时间
     */
    public void setLogTime(String LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get 数据值 
     * @return MetricValue 数据值
     */
    public Float getMetricValue() {
        return this.MetricValue;
    }

    /**
     * Set 数据值
     * @param MetricValue 数据值
     */
    public void setMetricValue(Float MetricValue) {
        this.MetricValue = MetricValue;
    }

    public DataPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataPoint(DataPoint source) {
        if (source.LogTime != null) {
            this.LogTime = new String(source.LogTime);
        }
        if (source.MetricValue != null) {
            this.MetricValue = new Float(source.MetricValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogTime", this.LogTime);
        this.setParamSimple(map, prefix + "MetricValue", this.MetricValue);

    }
}

