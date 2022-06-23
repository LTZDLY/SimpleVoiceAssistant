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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteImageRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 镜像仓库名称
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * 镜像版本
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
     * Get 实例Id 
     * @return RegistryId 实例Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例Id
     * @param RegistryId 实例Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 镜像仓库名称 
     * @return RepositoryName 镜像仓库名称
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set 镜像仓库名称
     * @param RepositoryName 镜像仓库名称
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get 镜像版本 
     * @return ImageVersion 镜像版本
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set 镜像版本
     * @param ImageVersion 镜像版本
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    public DeleteImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteImageRequest(DeleteImageRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);

    }
}

