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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Quota extends AbstractModel{

    /**
    * 单次批量提交配额上限。
    */
    @SerializedName("Batch")
    @Expose
    private Long Batch;

    /**
    * 每日提交配额上限。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 每日剩余的可提交配额。
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
     * Get 单次批量提交配额上限。 
     * @return Batch 单次批量提交配额上限。
     */
    public Long getBatch() {
        return this.Batch;
    }

    /**
     * Set 单次批量提交配额上限。
     * @param Batch 单次批量提交配额上限。
     */
    public void setBatch(Long Batch) {
        this.Batch = Batch;
    }

    /**
     * Get 每日提交配额上限。 
     * @return Total 每日提交配额上限。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 每日提交配额上限。
     * @param Total 每日提交配额上限。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 每日剩余的可提交配额。 
     * @return Available 每日剩余的可提交配额。
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set 每日剩余的可提交配额。
     * @param Available 每日剩余的可提交配额。
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    public Quota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Quota(Quota source) {
        if (source.Batch != null) {
            this.Batch = new Long(source.Batch);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Batch", this.Batch);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Available", this.Available);

    }
}

