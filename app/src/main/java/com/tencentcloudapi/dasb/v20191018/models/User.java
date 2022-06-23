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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class User extends AbstractModel{

    /**
    * 用户名, 3-20个字符 必须以英文字母开头，且不能包含字母、数字、.、_、-以外的字符
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户姓名， 最大20个字符，不能包含空白字符
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 手机号码， 大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx"
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 用户ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 电子邮件
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 用户生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效
    */
    @SerializedName("ValidateFrom")
    @Expose
    private String ValidateFrom;

    /**
    * 用户失效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效
    */
    @SerializedName("ValidateTo")
    @Expose
    private String ValidateTo;

    /**
    * 所属用户组列表
    */
    @SerializedName("GroupSet")
    @Expose
    private Group [] GroupSet;

    /**
    * 认证方式，0 - 本地，1 - LDAP，2 - OAuth
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问
    */
    @SerializedName("ValidateTime")
    @Expose
    private String ValidateTime;

    /**
     * Get 用户名, 3-20个字符 必须以英文字母开头，且不能包含字母、数字、.、_、-以外的字符 
     * @return UserName 用户名, 3-20个字符 必须以英文字母开头，且不能包含字母、数字、.、_、-以外的字符
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名, 3-20个字符 必须以英文字母开头，且不能包含字母、数字、.、_、-以外的字符
     * @param UserName 用户名, 3-20个字符 必须以英文字母开头，且不能包含字母、数字、.、_、-以外的字符
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户姓名， 最大20个字符，不能包含空白字符 
     * @return RealName 用户姓名， 最大20个字符，不能包含空白字符
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 用户姓名， 最大20个字符，不能包含空白字符
     * @param RealName 用户姓名， 最大20个字符，不能包含空白字符
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 手机号码， 大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx" 
     * @return Phone 手机号码， 大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx"
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号码， 大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx"
     * @param Phone 手机号码， 大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx"
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 用户ID 
     * @return Id 用户ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 用户ID
     * @param Id 用户ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 电子邮件 
     * @return Email 电子邮件
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 电子邮件
     * @param Email 电子邮件
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 用户生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效 
     * @return ValidateFrom 用户生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效
     */
    public String getValidateFrom() {
        return this.ValidateFrom;
    }

    /**
     * Set 用户生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效
     * @param ValidateFrom 用户生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效
     */
    public void setValidateFrom(String ValidateFrom) {
        this.ValidateFrom = ValidateFrom;
    }

    /**
     * Get 用户失效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效 
     * @return ValidateTo 用户失效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效
     */
    public String getValidateTo() {
        return this.ValidateTo;
    }

    /**
     * Set 用户失效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效
     * @param ValidateTo 用户失效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则用户长期有效
     */
    public void setValidateTo(String ValidateTo) {
        this.ValidateTo = ValidateTo;
    }

    /**
     * Get 所属用户组列表 
     * @return GroupSet 所属用户组列表
     */
    public Group [] getGroupSet() {
        return this.GroupSet;
    }

    /**
     * Set 所属用户组列表
     * @param GroupSet 所属用户组列表
     */
    public void setGroupSet(Group [] GroupSet) {
        this.GroupSet = GroupSet;
    }

    /**
     * Get 认证方式，0 - 本地，1 - LDAP，2 - OAuth 
     * @return AuthType 认证方式，0 - 本地，1 - LDAP，2 - OAuth
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 认证方式，0 - 本地，1 - LDAP，2 - OAuth
     * @param AuthType 认证方式，0 - 本地，1 - LDAP，2 - OAuth
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问 
     * @return ValidateTime 访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问
     */
    public String getValidateTime() {
        return this.ValidateTime;
    }

    /**
     * Set 访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问
     * @param ValidateTime 访问时间段限制， 由0、1组成的字符串，长度168(7 × 24)，代表该用户在一周中允许访问的时间段。字符串中第N个字符代表在一周中的第N个小时， 0 - 代表不允许访问，1 - 代表允许访问
     */
    public void setValidateTime(String ValidateTime) {
        this.ValidateTime = ValidateTime;
    }

    public User() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public User(User source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.ValidateFrom != null) {
            this.ValidateFrom = new String(source.ValidateFrom);
        }
        if (source.ValidateTo != null) {
            this.ValidateTo = new String(source.ValidateTo);
        }
        if (source.GroupSet != null) {
            this.GroupSet = new Group[source.GroupSet.length];
            for (int i = 0; i < source.GroupSet.length; i++) {
                this.GroupSet[i] = new Group(source.GroupSet[i]);
            }
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.ValidateTime != null) {
            this.ValidateTime = new String(source.ValidateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ValidateFrom", this.ValidateFrom);
        this.setParamSimple(map, prefix + "ValidateTo", this.ValidateTo);
        this.setParamArrayObj(map, prefix + "GroupSet.", this.GroupSet);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ValidateTime", this.ValidateTime);

    }
}

