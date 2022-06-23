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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicPolicyRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * Topic名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Topic权限，1发布，2订阅，3订阅和发布
    */
    @SerializedName("Privilege")
    @Expose
    private Long Privilege;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Topic名称 
     * @return TopicName Topic名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic名称
     * @param TopicName Topic名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Topic权限，1发布，2订阅，3订阅和发布 
     * @return Privilege Topic权限，1发布，2订阅，3订阅和发布
     */
    public Long getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Topic权限，1发布，2订阅，3订阅和发布
     * @param Privilege Topic权限，1发布，2订阅，3订阅和发布
     */
    public void setPrivilege(Long Privilege) {
        this.Privilege = Privilege;
    }

    public CreateTopicPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicPolicyRequest(CreateTopicPolicyRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Privilege != null) {
            this.Privilege = new Long(source.Privilege);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);

    }
}

