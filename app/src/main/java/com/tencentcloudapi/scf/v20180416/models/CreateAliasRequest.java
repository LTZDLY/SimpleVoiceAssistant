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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAliasRequest extends AbstractModel{

    /**
    * 别名的名称，在函数级别中唯一，只能包含字母、数字、'_'和‘-’，且必须以字母开头，长度限制为1-64
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 别名指向的主版本
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
    * 函数所在的命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 别名的请求路由配置
    */
    @SerializedName("RoutingConfig")
    @Expose
    private RoutingConfig RoutingConfig;

    /**
    * 别名的描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 别名的名称，在函数级别中唯一，只能包含字母、数字、'_'和‘-’，且必须以字母开头，长度限制为1-64 
     * @return Name 别名的名称，在函数级别中唯一，只能包含字母、数字、'_'和‘-’，且必须以字母开头，长度限制为1-64
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 别名的名称，在函数级别中唯一，只能包含字母、数字、'_'和‘-’，且必须以字母开头，长度限制为1-64
     * @param Name 别名的名称，在函数级别中唯一，只能包含字母、数字、'_'和‘-’，且必须以字母开头，长度限制为1-64
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 函数名称 
     * @return FunctionName 函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名称
     * @param FunctionName 函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 别名指向的主版本 
     * @return FunctionVersion 别名指向的主版本
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * Set 别名指向的主版本
     * @param FunctionVersion 别名指向的主版本
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * Get 函数所在的命名空间 
     * @return Namespace 函数所在的命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数所在的命名空间
     * @param Namespace 函数所在的命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 别名的请求路由配置 
     * @return RoutingConfig 别名的请求路由配置
     */
    public RoutingConfig getRoutingConfig() {
        return this.RoutingConfig;
    }

    /**
     * Set 别名的请求路由配置
     * @param RoutingConfig 别名的请求路由配置
     */
    public void setRoutingConfig(RoutingConfig RoutingConfig) {
        this.RoutingConfig = RoutingConfig;
    }

    /**
     * Get 别名的描述信息 
     * @return Description 别名的描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 别名的描述信息
     * @param Description 别名的描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateAliasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAliasRequest(CreateAliasRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.FunctionVersion != null) {
            this.FunctionVersion = new String(source.FunctionVersion);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.RoutingConfig != null) {
            this.RoutingConfig = new RoutingConfig(source.RoutingConfig);
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
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamObj(map, prefix + "RoutingConfig.", this.RoutingConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

