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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillSummaryByProductResponse extends AbstractModel{

    /**
    * 数据是否准备好，0未准备好，1准备好
    */
    @SerializedName("Ready")
    @Expose
    private Long Ready;

    /**
    * 总花费详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SummaryTotal")
    @Expose
    private BusinessSummaryTotal SummaryTotal;

    /**
    * 各产品花费分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SummaryOverview")
    @Expose
    private BusinessSummaryOverviewItem [] SummaryOverview;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据是否准备好，0未准备好，1准备好 
     * @return Ready 数据是否准备好，0未准备好，1准备好
     */
    public Long getReady() {
        return this.Ready;
    }

    /**
     * Set 数据是否准备好，0未准备好，1准备好
     * @param Ready 数据是否准备好，0未准备好，1准备好
     */
    public void setReady(Long Ready) {
        this.Ready = Ready;
    }

    /**
     * Get 总花费详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SummaryTotal 总花费详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BusinessSummaryTotal getSummaryTotal() {
        return this.SummaryTotal;
    }

    /**
     * Set 总花费详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param SummaryTotal 总花费详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummaryTotal(BusinessSummaryTotal SummaryTotal) {
        this.SummaryTotal = SummaryTotal;
    }

    /**
     * Get 各产品花费分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SummaryOverview 各产品花费分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BusinessSummaryOverviewItem [] getSummaryOverview() {
        return this.SummaryOverview;
    }

    /**
     * Set 各产品花费分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param SummaryOverview 各产品花费分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummaryOverview(BusinessSummaryOverviewItem [] SummaryOverview) {
        this.SummaryOverview = SummaryOverview;
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

    public DescribeBillSummaryByProductResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillSummaryByProductResponse(DescribeBillSummaryByProductResponse source) {
        if (source.Ready != null) {
            this.Ready = new Long(source.Ready);
        }
        if (source.SummaryTotal != null) {
            this.SummaryTotal = new BusinessSummaryTotal(source.SummaryTotal);
        }
        if (source.SummaryOverview != null) {
            this.SummaryOverview = new BusinessSummaryOverviewItem[source.SummaryOverview.length];
            for (int i = 0; i < source.SummaryOverview.length; i++) {
                this.SummaryOverview[i] = new BusinessSummaryOverviewItem(source.SummaryOverview[i]);
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
        this.setParamSimple(map, prefix + "Ready", this.Ready);
        this.setParamObj(map, prefix + "SummaryTotal.", this.SummaryTotal);
        this.setParamArrayObj(map, prefix + "SummaryOverview.", this.SummaryOverview);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

