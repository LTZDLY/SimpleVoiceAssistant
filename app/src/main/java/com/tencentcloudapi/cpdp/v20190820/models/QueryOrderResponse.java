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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryOrderResponse extends AbstractModel{

    /**
    * 返回订单数
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 查询结果的订单列表
    */
    @SerializedName("OrderList")
    @Expose
    private QueryOrderOutOrderList [] OrderList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回订单数 
     * @return TotalNum 返回订单数
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 返回订单数
     * @param TotalNum 返回订单数
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 查询结果的订单列表 
     * @return OrderList 查询结果的订单列表
     */
    public QueryOrderOutOrderList [] getOrderList() {
        return this.OrderList;
    }

    /**
     * Set 查询结果的订单列表
     * @param OrderList 查询结果的订单列表
     */
    public void setOrderList(QueryOrderOutOrderList [] OrderList) {
        this.OrderList = OrderList;
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

    public QueryOrderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOrderResponse(QueryOrderResponse source) {
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.OrderList != null) {
            this.OrderList = new QueryOrderOutOrderList[source.OrderList.length];
            for (int i = 0; i < source.OrderList.length; i++) {
                this.OrderList[i] = new QueryOrderOutOrderList(source.OrderList[i]);
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
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamArrayObj(map, prefix + "OrderList.", this.OrderList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

