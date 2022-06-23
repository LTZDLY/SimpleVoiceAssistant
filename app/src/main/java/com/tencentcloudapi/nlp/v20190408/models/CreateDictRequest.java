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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDictRequest extends AbstractModel{

    /**
    * 自定义词库名称，不超过20字。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义词库描述，不超过100字。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 自定义词库名称，不超过20字。 
     * @return Name 自定义词库名称，不超过20字。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义词库名称，不超过20字。
     * @param Name 自定义词库名称，不超过20字。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义词库描述，不超过100字。 
     * @return Description 自定义词库描述，不超过100字。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 自定义词库描述，不超过100字。
     * @param Description 自定义词库描述，不超过100字。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateDictRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDictRequest(CreateDictRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

