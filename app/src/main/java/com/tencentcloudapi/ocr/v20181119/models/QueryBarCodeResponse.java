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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryBarCodeResponse extends AbstractModel{

    /**
    * 条码
    */
    @SerializedName("BarCode")
    @Expose
    private String BarCode;

    /**
    * 条码信息数组
    */
    @SerializedName("ProductDataRecords")
    @Expose
    private ProductDataRecord [] ProductDataRecords;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 条码 
     * @return BarCode 条码
     */
    public String getBarCode() {
        return this.BarCode;
    }

    /**
     * Set 条码
     * @param BarCode 条码
     */
    public void setBarCode(String BarCode) {
        this.BarCode = BarCode;
    }

    /**
     * Get 条码信息数组 
     * @return ProductDataRecords 条码信息数组
     */
    public ProductDataRecord [] getProductDataRecords() {
        return this.ProductDataRecords;
    }

    /**
     * Set 条码信息数组
     * @param ProductDataRecords 条码信息数组
     */
    public void setProductDataRecords(ProductDataRecord [] ProductDataRecords) {
        this.ProductDataRecords = ProductDataRecords;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public QueryBarCodeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryBarCodeResponse(QueryBarCodeResponse source) {
        if (source.BarCode != null) {
            this.BarCode = new String(source.BarCode);
        }
        if (source.ProductDataRecords != null) {
            this.ProductDataRecords = new ProductDataRecord[source.ProductDataRecords.length];
            for (int i = 0; i < source.ProductDataRecords.length; i++) {
                this.ProductDataRecords[i] = new ProductDataRecord(source.ProductDataRecords[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BarCode", this.BarCode);
        this.setParamArrayObj(map, prefix + "ProductDataRecords.", this.ProductDataRecords);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

