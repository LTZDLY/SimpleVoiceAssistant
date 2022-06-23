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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCollaboratorsRequest extends AbstractModel{

    /**
    * 分页条数，缺省为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页起始值，缺省为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 分页条数，缺省为20 
     * @return Limit 分页条数，缺省为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页条数，缺省为20
     * @param Limit 分页条数，缺省为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页起始值，缺省为0 
     * @return Offset 分页起始值，缺省为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始值，缺省为0
     * @param Offset 分页起始值，缺省为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public ListCollaboratorsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCollaboratorsRequest(ListCollaboratorsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}
