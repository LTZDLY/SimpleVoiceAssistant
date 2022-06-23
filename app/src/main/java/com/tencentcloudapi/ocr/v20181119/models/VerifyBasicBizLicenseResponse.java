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

public class VerifyBasicBizLicenseResponse extends AbstractModel{

    /**
    * 状态码，成功时返回0
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 统一社会信用代码
    */
    @SerializedName("CreditCode")
    @Expose
    private String CreditCode;

    /**
    * 经营期限自（YYYY-MM-DD）
    */
    @SerializedName("Opfrom")
    @Expose
    private String Opfrom;

    /**
    * 经营期限至（YYYY-MM-DD）
    */
    @SerializedName("Opto")
    @Expose
    private String Opto;

    /**
    * 法人姓名
    */
    @SerializedName("Frname")
    @Expose
    private String Frname;

    /**
    * 经营状态，包括：成立、筹建、存续、在营、开业、在册、正常经营、开业登记中、登记成立、撤销、撤销登记、非正常户、告解、个体暂时吊销、个体转企业、吊销（未注销）、拟注销、已注销、（待）迁入、（待）迁出、停业、歇业、清算等。
    */
    @SerializedName("Entstatus")
    @Expose
    private String Entstatus;

    /**
    * 经营业务范围
    */
    @SerializedName("Zsopscope")
    @Expose
    private String Zsopscope;

    /**
    * 查询的状态信息
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 原注册号
    */
    @SerializedName("Oriregno")
    @Expose
    private String Oriregno;

    /**
    * 要核验的工商注册号
    */
    @SerializedName("VerifyRegno")
    @Expose
    private String VerifyRegno;

    /**
    * 工商注册号
    */
    @SerializedName("Regno")
    @Expose
    private String Regno;

    /**
    * 要核验的企业名称
    */
    @SerializedName("VerifyEntname")
    @Expose
    private String VerifyEntname;

    /**
    * 企业名称
    */
    @SerializedName("Entname")
    @Expose
    private String Entname;

    /**
    * 要核验的住址
    */
    @SerializedName("VerifyDom")
    @Expose
    private String VerifyDom;

    /**
    * 住址
    */
    @SerializedName("Dom")
    @Expose
    private String Dom;

    /**
    * 验证结果
    */
    @SerializedName("RegNumResult")
    @Expose
    private BizLicenseVerifyResult RegNumResult;

    /**
    * 注册资本（单位：万元）,只有输入参数regCapital为1的时候才输出
    */
    @SerializedName("RegCapital")
    @Expose
    private String RegCapital;

    /**
    * 成立/注册日期，只有输入参数EstablishTime为true时展示，默认为空
    */
    @SerializedName("EstablishTime")
    @Expose
    private String EstablishTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 状态码，成功时返回0 
     * @return ErrorCode 状态码，成功时返回0
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 状态码，成功时返回0
     * @param ErrorCode 状态码，成功时返回0
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 统一社会信用代码 
     * @return CreditCode 统一社会信用代码
     */
    public String getCreditCode() {
        return this.CreditCode;
    }

    /**
     * Set 统一社会信用代码
     * @param CreditCode 统一社会信用代码
     */
    public void setCreditCode(String CreditCode) {
        this.CreditCode = CreditCode;
    }

    /**
     * Get 经营期限自（YYYY-MM-DD） 
     * @return Opfrom 经营期限自（YYYY-MM-DD）
     */
    public String getOpfrom() {
        return this.Opfrom;
    }

    /**
     * Set 经营期限自（YYYY-MM-DD）
     * @param Opfrom 经营期限自（YYYY-MM-DD）
     */
    public void setOpfrom(String Opfrom) {
        this.Opfrom = Opfrom;
    }

    /**
     * Get 经营期限至（YYYY-MM-DD） 
     * @return Opto 经营期限至（YYYY-MM-DD）
     */
    public String getOpto() {
        return this.Opto;
    }

    /**
     * Set 经营期限至（YYYY-MM-DD）
     * @param Opto 经营期限至（YYYY-MM-DD）
     */
    public void setOpto(String Opto) {
        this.Opto = Opto;
    }

    /**
     * Get 法人姓名 
     * @return Frname 法人姓名
     */
    public String getFrname() {
        return this.Frname;
    }

    /**
     * Set 法人姓名
     * @param Frname 法人姓名
     */
    public void setFrname(String Frname) {
        this.Frname = Frname;
    }

    /**
     * Get 经营状态，包括：成立、筹建、存续、在营、开业、在册、正常经营、开业登记中、登记成立、撤销、撤销登记、非正常户、告解、个体暂时吊销、个体转企业、吊销（未注销）、拟注销、已注销、（待）迁入、（待）迁出、停业、歇业、清算等。 
     * @return Entstatus 经营状态，包括：成立、筹建、存续、在营、开业、在册、正常经营、开业登记中、登记成立、撤销、撤销登记、非正常户、告解、个体暂时吊销、个体转企业、吊销（未注销）、拟注销、已注销、（待）迁入、（待）迁出、停业、歇业、清算等。
     */
    public String getEntstatus() {
        return this.Entstatus;
    }

    /**
     * Set 经营状态，包括：成立、筹建、存续、在营、开业、在册、正常经营、开业登记中、登记成立、撤销、撤销登记、非正常户、告解、个体暂时吊销、个体转企业、吊销（未注销）、拟注销、已注销、（待）迁入、（待）迁出、停业、歇业、清算等。
     * @param Entstatus 经营状态，包括：成立、筹建、存续、在营、开业、在册、正常经营、开业登记中、登记成立、撤销、撤销登记、非正常户、告解、个体暂时吊销、个体转企业、吊销（未注销）、拟注销、已注销、（待）迁入、（待）迁出、停业、歇业、清算等。
     */
    public void setEntstatus(String Entstatus) {
        this.Entstatus = Entstatus;
    }

    /**
     * Get 经营业务范围 
     * @return Zsopscope 经营业务范围
     */
    public String getZsopscope() {
        return this.Zsopscope;
    }

    /**
     * Set 经营业务范围
     * @param Zsopscope 经营业务范围
     */
    public void setZsopscope(String Zsopscope) {
        this.Zsopscope = Zsopscope;
    }

    /**
     * Get 查询的状态信息 
     * @return Reason 查询的状态信息
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 查询的状态信息
     * @param Reason 查询的状态信息
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 原注册号 
     * @return Oriregno 原注册号
     */
    public String getOriregno() {
        return this.Oriregno;
    }

    /**
     * Set 原注册号
     * @param Oriregno 原注册号
     */
    public void setOriregno(String Oriregno) {
        this.Oriregno = Oriregno;
    }

    /**
     * Get 要核验的工商注册号 
     * @return VerifyRegno 要核验的工商注册号
     */
    public String getVerifyRegno() {
        return this.VerifyRegno;
    }

    /**
     * Set 要核验的工商注册号
     * @param VerifyRegno 要核验的工商注册号
     */
    public void setVerifyRegno(String VerifyRegno) {
        this.VerifyRegno = VerifyRegno;
    }

    /**
     * Get 工商注册号 
     * @return Regno 工商注册号
     */
    public String getRegno() {
        return this.Regno;
    }

    /**
     * Set 工商注册号
     * @param Regno 工商注册号
     */
    public void setRegno(String Regno) {
        this.Regno = Regno;
    }

    /**
     * Get 要核验的企业名称 
     * @return VerifyEntname 要核验的企业名称
     */
    public String getVerifyEntname() {
        return this.VerifyEntname;
    }

    /**
     * Set 要核验的企业名称
     * @param VerifyEntname 要核验的企业名称
     */
    public void setVerifyEntname(String VerifyEntname) {
        this.VerifyEntname = VerifyEntname;
    }

    /**
     * Get 企业名称 
     * @return Entname 企业名称
     */
    public String getEntname() {
        return this.Entname;
    }

    /**
     * Set 企业名称
     * @param Entname 企业名称
     */
    public void setEntname(String Entname) {
        this.Entname = Entname;
    }

    /**
     * Get 要核验的住址 
     * @return VerifyDom 要核验的住址
     */
    public String getVerifyDom() {
        return this.VerifyDom;
    }

    /**
     * Set 要核验的住址
     * @param VerifyDom 要核验的住址
     */
    public void setVerifyDom(String VerifyDom) {
        this.VerifyDom = VerifyDom;
    }

    /**
     * Get 住址 
     * @return Dom 住址
     */
    public String getDom() {
        return this.Dom;
    }

    /**
     * Set 住址
     * @param Dom 住址
     */
    public void setDom(String Dom) {
        this.Dom = Dom;
    }

    /**
     * Get 验证结果 
     * @return RegNumResult 验证结果
     */
    public BizLicenseVerifyResult getRegNumResult() {
        return this.RegNumResult;
    }

    /**
     * Set 验证结果
     * @param RegNumResult 验证结果
     */
    public void setRegNumResult(BizLicenseVerifyResult RegNumResult) {
        this.RegNumResult = RegNumResult;
    }

    /**
     * Get 注册资本（单位：万元）,只有输入参数regCapital为1的时候才输出 
     * @return RegCapital 注册资本（单位：万元）,只有输入参数regCapital为1的时候才输出
     */
    public String getRegCapital() {
        return this.RegCapital;
    }

    /**
     * Set 注册资本（单位：万元）,只有输入参数regCapital为1的时候才输出
     * @param RegCapital 注册资本（单位：万元）,只有输入参数regCapital为1的时候才输出
     */
    public void setRegCapital(String RegCapital) {
        this.RegCapital = RegCapital;
    }

    /**
     * Get 成立/注册日期，只有输入参数EstablishTime为true时展示，默认为空 
     * @return EstablishTime 成立/注册日期，只有输入参数EstablishTime为true时展示，默认为空
     */
    public String getEstablishTime() {
        return this.EstablishTime;
    }

    /**
     * Set 成立/注册日期，只有输入参数EstablishTime为true时展示，默认为空
     * @param EstablishTime 成立/注册日期，只有输入参数EstablishTime为true时展示，默认为空
     */
    public void setEstablishTime(String EstablishTime) {
        this.EstablishTime = EstablishTime;
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

    public VerifyBasicBizLicenseResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyBasicBizLicenseResponse(VerifyBasicBizLicenseResponse source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.CreditCode != null) {
            this.CreditCode = new String(source.CreditCode);
        }
        if (source.Opfrom != null) {
            this.Opfrom = new String(source.Opfrom);
        }
        if (source.Opto != null) {
            this.Opto = new String(source.Opto);
        }
        if (source.Frname != null) {
            this.Frname = new String(source.Frname);
        }
        if (source.Entstatus != null) {
            this.Entstatus = new String(source.Entstatus);
        }
        if (source.Zsopscope != null) {
            this.Zsopscope = new String(source.Zsopscope);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Oriregno != null) {
            this.Oriregno = new String(source.Oriregno);
        }
        if (source.VerifyRegno != null) {
            this.VerifyRegno = new String(source.VerifyRegno);
        }
        if (source.Regno != null) {
            this.Regno = new String(source.Regno);
        }
        if (source.VerifyEntname != null) {
            this.VerifyEntname = new String(source.VerifyEntname);
        }
        if (source.Entname != null) {
            this.Entname = new String(source.Entname);
        }
        if (source.VerifyDom != null) {
            this.VerifyDom = new String(source.VerifyDom);
        }
        if (source.Dom != null) {
            this.Dom = new String(source.Dom);
        }
        if (source.RegNumResult != null) {
            this.RegNumResult = new BizLicenseVerifyResult(source.RegNumResult);
        }
        if (source.RegCapital != null) {
            this.RegCapital = new String(source.RegCapital);
        }
        if (source.EstablishTime != null) {
            this.EstablishTime = new String(source.EstablishTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "CreditCode", this.CreditCode);
        this.setParamSimple(map, prefix + "Opfrom", this.Opfrom);
        this.setParamSimple(map, prefix + "Opto", this.Opto);
        this.setParamSimple(map, prefix + "Frname", this.Frname);
        this.setParamSimple(map, prefix + "Entstatus", this.Entstatus);
        this.setParamSimple(map, prefix + "Zsopscope", this.Zsopscope);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Oriregno", this.Oriregno);
        this.setParamSimple(map, prefix + "VerifyRegno", this.VerifyRegno);
        this.setParamSimple(map, prefix + "Regno", this.Regno);
        this.setParamSimple(map, prefix + "VerifyEntname", this.VerifyEntname);
        this.setParamSimple(map, prefix + "Entname", this.Entname);
        this.setParamSimple(map, prefix + "VerifyDom", this.VerifyDom);
        this.setParamSimple(map, prefix + "Dom", this.Dom);
        this.setParamObj(map, prefix + "RegNumResult.", this.RegNumResult);
        this.setParamSimple(map, prefix + "RegCapital", this.RegCapital);
        this.setParamSimple(map, prefix + "EstablishTime", this.EstablishTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

