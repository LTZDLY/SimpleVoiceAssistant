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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunTimeFilters extends AbstractModel{

    /**
    * 过滤键的名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 一个或者多个过滤值。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 是否模糊查询
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

    /**
     * Get 过滤键的名称 
     * @return Name 过滤键的名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤键的名称
     * @param Name 过滤键的名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 一个或者多个过滤值。 
     * @return Values 一个或者多个过滤值。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 一个或者多个过滤值。
     * @param Values 一个或者多个过滤值。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 是否模糊查询 
     * @return ExactMatch 是否模糊查询
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set 是否模糊查询
     * @param ExactMatch 是否模糊查询
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    public RunTimeFilters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunTimeFilters(RunTimeFilters source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.ExactMatch != null) {
            this.ExactMatch = new Boolean(source.ExactMatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "ExactMatch", this.ExactMatch);

    }
}
