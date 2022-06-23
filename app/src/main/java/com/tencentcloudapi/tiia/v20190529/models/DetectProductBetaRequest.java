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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectProductBetaRequest extends AbstractModel{

    /**
    * 图片限制：内测版仅支持jpg、jpeg，图片大小不超过1M，分辨率在25万到100万之间。 
建议先对图片进行压缩，以便提升处理速度。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 图片经过base64编码的内容。最大不超过1M，分辨率在25万到100万之间。 
与ImageUrl同时存在时优先使用ImageUrl字段。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 是否需要百科信息 1：是，0: 否，默认是0
    */
    @SerializedName("NeedLemma")
    @Expose
    private Long NeedLemma;

    /**
     * Get 图片限制：内测版仅支持jpg、jpeg，图片大小不超过1M，分辨率在25万到100万之间。 
建议先对图片进行压缩，以便提升处理速度。 
     * @return ImageUrl 图片限制：内测版仅支持jpg、jpeg，图片大小不超过1M，分辨率在25万到100万之间。 
建议先对图片进行压缩，以便提升处理速度。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片限制：内测版仅支持jpg、jpeg，图片大小不超过1M，分辨率在25万到100万之间。 
建议先对图片进行压缩，以便提升处理速度。
     * @param ImageUrl 图片限制：内测版仅支持jpg、jpeg，图片大小不超过1M，分辨率在25万到100万之间。 
建议先对图片进行压缩，以便提升处理速度。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 图片经过base64编码的内容。最大不超过1M，分辨率在25万到100万之间。 
与ImageUrl同时存在时优先使用ImageUrl字段。 
     * @return ImageBase64 图片经过base64编码的内容。最大不超过1M，分辨率在25万到100万之间。 
与ImageUrl同时存在时优先使用ImageUrl字段。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片经过base64编码的内容。最大不超过1M，分辨率在25万到100万之间。 
与ImageUrl同时存在时优先使用ImageUrl字段。
     * @param ImageBase64 图片经过base64编码的内容。最大不超过1M，分辨率在25万到100万之间。 
与ImageUrl同时存在时优先使用ImageUrl字段。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 是否需要百科信息 1：是，0: 否，默认是0 
     * @return NeedLemma 是否需要百科信息 1：是，0: 否，默认是0
     */
    public Long getNeedLemma() {
        return this.NeedLemma;
    }

    /**
     * Set 是否需要百科信息 1：是，0: 否，默认是0
     * @param NeedLemma 是否需要百科信息 1：是，0: 否，默认是0
     */
    public void setNeedLemma(Long NeedLemma) {
        this.NeedLemma = NeedLemma;
    }

    public DetectProductBetaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectProductBetaRequest(DetectProductBetaRequest source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.NeedLemma != null) {
            this.NeedLemma = new Long(source.NeedLemma);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "NeedLemma", this.NeedLemma);

    }
}

