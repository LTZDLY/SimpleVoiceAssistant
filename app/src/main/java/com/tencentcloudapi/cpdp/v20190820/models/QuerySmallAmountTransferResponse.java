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

public class QuerySmallAmountTransferResponse extends AbstractModel{

    /**
    * String(20)，返回码
    */
    @SerializedName("TxnReturnCode")
    @Expose
    private String TxnReturnCode;

    /**
    * String(100)，返回信息
    */
    @SerializedName("TxnReturnMsg")
    @Expose
    private String TxnReturnMsg;

    /**
    * String(22)，交易流水号
    */
    @SerializedName("CnsmrSeqNo")
    @Expose
    private String CnsmrSeqNo;

    /**
    * STRING(10)，返回状态（0: 成功; 1: 失败; 2: 待确认）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnStatus")
    @Expose
    private String ReturnStatus;

    /**
    * STRING(512)，返回信息（失败返回具体信息）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * STRING(1027)，保留域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReservedMsg")
    @Expose
    private String ReservedMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get String(20)，返回码 
     * @return TxnReturnCode String(20)，返回码
     */
    public String getTxnReturnCode() {
        return this.TxnReturnCode;
    }

    /**
     * Set String(20)，返回码
     * @param TxnReturnCode String(20)，返回码
     */
    public void setTxnReturnCode(String TxnReturnCode) {
        this.TxnReturnCode = TxnReturnCode;
    }

    /**
     * Get String(100)，返回信息 
     * @return TxnReturnMsg String(100)，返回信息
     */
    public String getTxnReturnMsg() {
        return this.TxnReturnMsg;
    }

    /**
     * Set String(100)，返回信息
     * @param TxnReturnMsg String(100)，返回信息
     */
    public void setTxnReturnMsg(String TxnReturnMsg) {
        this.TxnReturnMsg = TxnReturnMsg;
    }

    /**
     * Get String(22)，交易流水号 
     * @return CnsmrSeqNo String(22)，交易流水号
     */
    public String getCnsmrSeqNo() {
        return this.CnsmrSeqNo;
    }

    /**
     * Set String(22)，交易流水号
     * @param CnsmrSeqNo String(22)，交易流水号
     */
    public void setCnsmrSeqNo(String CnsmrSeqNo) {
        this.CnsmrSeqNo = CnsmrSeqNo;
    }

    /**
     * Get STRING(10)，返回状态（0: 成功; 1: 失败; 2: 待确认）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnStatus STRING(10)，返回状态（0: 成功; 1: 失败; 2: 待确认）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReturnStatus() {
        return this.ReturnStatus;
    }

    /**
     * Set STRING(10)，返回状态（0: 成功; 1: 失败; 2: 待确认）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnStatus STRING(10)，返回状态（0: 成功; 1: 失败; 2: 待确认）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnStatus(String ReturnStatus) {
        this.ReturnStatus = ReturnStatus;
    }

    /**
     * Get STRING(512)，返回信息（失败返回具体信息）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnMsg STRING(512)，返回信息（失败返回具体信息）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set STRING(512)，返回信息（失败返回具体信息）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnMsg STRING(512)，返回信息（失败返回具体信息）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get STRING(1027)，保留域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReservedMsg STRING(1027)，保留域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReservedMsg() {
        return this.ReservedMsg;
    }

    /**
     * Set STRING(1027)，保留域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReservedMsg STRING(1027)，保留域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReservedMsg(String ReservedMsg) {
        this.ReservedMsg = ReservedMsg;
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

    public QuerySmallAmountTransferResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuerySmallAmountTransferResponse(QuerySmallAmountTransferResponse source) {
        if (source.TxnReturnCode != null) {
            this.TxnReturnCode = new String(source.TxnReturnCode);
        }
        if (source.TxnReturnMsg != null) {
            this.TxnReturnMsg = new String(source.TxnReturnMsg);
        }
        if (source.CnsmrSeqNo != null) {
            this.CnsmrSeqNo = new String(source.CnsmrSeqNo);
        }
        if (source.ReturnStatus != null) {
            this.ReturnStatus = new String(source.ReturnStatus);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.ReservedMsg != null) {
            this.ReservedMsg = new String(source.ReservedMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TxnReturnCode", this.TxnReturnCode);
        this.setParamSimple(map, prefix + "TxnReturnMsg", this.TxnReturnMsg);
        this.setParamSimple(map, prefix + "CnsmrSeqNo", this.CnsmrSeqNo);
        this.setParamSimple(map, prefix + "ReturnStatus", this.ReturnStatus);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

