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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindLiveDomainCertRequest extends AbstractModel{

    /**
    * 证书Id。使用添加证书接口获取证书Id。
    */
    @SerializedName("CertId")
    @Expose
    private Long CertId;

    /**
    * 播放域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * HTTPS开启状态，0： 关闭  1：打开。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 证书Id。使用添加证书接口获取证书Id。 
     * @return CertId 证书Id。使用添加证书接口获取证书Id。
     */
    public Long getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书Id。使用添加证书接口获取证书Id。
     * @param CertId 证书Id。使用添加证书接口获取证书Id。
     */
    public void setCertId(Long CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 播放域名。 
     * @return DomainName 播放域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 播放域名。
     * @param DomainName 播放域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get HTTPS开启状态，0： 关闭  1：打开。 
     * @return Status HTTPS开启状态，0： 关闭  1：打开。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set HTTPS开启状态，0： 关闭  1：打开。
     * @param Status HTTPS开启状态，0： 关闭  1：打开。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public BindLiveDomainCertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindLiveDomainCertRequest(BindLiveDomainCertRequest source) {
        if (source.CertId != null) {
            this.CertId = new Long(source.CertId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

