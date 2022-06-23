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

public class DescribeTaskDetailRequest extends AbstractModel{

    /**
    * 拨测任务id 数组
    */
    @SerializedName("TaskIds")
    @Expose
    private Long [] TaskIds;

    /**
     * Get 拨测任务id 数组 
     * @return TaskIds 拨测任务id 数组
     */
    public Long [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 拨测任务id 数组
     * @param TaskIds 拨测任务id 数组
     */
    public void setTaskIds(Long [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    public DescribeTaskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskDetailRequest(DescribeTaskDetailRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new Long[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new Long(source.TaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);

    }
}

