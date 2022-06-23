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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIp6AddressesBandwidthRequest extends AbstractModel{

    /**
    * 修改的目标带宽，单位Mbps
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * IPV6地址。Ip6Addresses和Ip6AddressId必须且只能传一个
    */
    @SerializedName("Ip6Addresses")
    @Expose
    private String [] Ip6Addresses;

    /**
    * IPV6地址对应的唯一ID，形如eip-xxxxxxxx。Ip6Addresses和Ip6AddressId必须且只能传一个
    */
    @SerializedName("Ip6AddressIds")
    @Expose
    private String [] Ip6AddressIds;

    /**
     * Get 修改的目标带宽，单位Mbps 
     * @return InternetMaxBandwidthOut 修改的目标带宽，单位Mbps
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 修改的目标带宽，单位Mbps
     * @param InternetMaxBandwidthOut 修改的目标带宽，单位Mbps
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get IPV6地址。Ip6Addresses和Ip6AddressId必须且只能传一个 
     * @return Ip6Addresses IPV6地址。Ip6Addresses和Ip6AddressId必须且只能传一个
     */
    public String [] getIp6Addresses() {
        return this.Ip6Addresses;
    }

    /**
     * Set IPV6地址。Ip6Addresses和Ip6AddressId必须且只能传一个
     * @param Ip6Addresses IPV6地址。Ip6Addresses和Ip6AddressId必须且只能传一个
     */
    public void setIp6Addresses(String [] Ip6Addresses) {
        this.Ip6Addresses = Ip6Addresses;
    }

    /**
     * Get IPV6地址对应的唯一ID，形如eip-xxxxxxxx。Ip6Addresses和Ip6AddressId必须且只能传一个 
     * @return Ip6AddressIds IPV6地址对应的唯一ID，形如eip-xxxxxxxx。Ip6Addresses和Ip6AddressId必须且只能传一个
     */
    public String [] getIp6AddressIds() {
        return this.Ip6AddressIds;
    }

    /**
     * Set IPV6地址对应的唯一ID，形如eip-xxxxxxxx。Ip6Addresses和Ip6AddressId必须且只能传一个
     * @param Ip6AddressIds IPV6地址对应的唯一ID，形如eip-xxxxxxxx。Ip6Addresses和Ip6AddressId必须且只能传一个
     */
    public void setIp6AddressIds(String [] Ip6AddressIds) {
        this.Ip6AddressIds = Ip6AddressIds;
    }

    public ModifyIp6AddressesBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIp6AddressesBandwidthRequest(ModifyIp6AddressesBandwidthRequest source) {
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.Ip6Addresses != null) {
            this.Ip6Addresses = new String[source.Ip6Addresses.length];
            for (int i = 0; i < source.Ip6Addresses.length; i++) {
                this.Ip6Addresses[i] = new String(source.Ip6Addresses[i]);
            }
        }
        if (source.Ip6AddressIds != null) {
            this.Ip6AddressIds = new String[source.Ip6AddressIds.length];
            for (int i = 0; i < source.Ip6AddressIds.length; i++) {
                this.Ip6AddressIds[i] = new String(source.Ip6AddressIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamArraySimple(map, prefix + "Ip6Addresses.", this.Ip6Addresses);
        this.setParamArraySimple(map, prefix + "Ip6AddressIds.", this.Ip6AddressIds);

    }
}

