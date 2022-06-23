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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamTaskNotifyConfig extends AbstractModel{

    /**
    * CMQ 的模型，有 Queue 和 Topic 两种，目前仅支持 Queue。
    */
    @SerializedName("CmqModel")
    @Expose
    private String CmqModel;

    /**
    * CMQ 的园区，如 sh，bj 等。
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * 当模型为 Queue 时有效，表示接收事件通知的 CMQ 的队列名。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 当模型为 Topic 时有效，表示接收事件通知的 CMQ 的主题名。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 通知类型，默认CMQ，指定URL时HTTP回调推送到 NotifyUrl 指定的地址。
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * HTTP回调地址，NotifyType为URL时必填。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
     * Get CMQ 的模型，有 Queue 和 Topic 两种，目前仅支持 Queue。 
     * @return CmqModel CMQ 的模型，有 Queue 和 Topic 两种，目前仅支持 Queue。
     */
    public String getCmqModel() {
        return this.CmqModel;
    }

    /**
     * Set CMQ 的模型，有 Queue 和 Topic 两种，目前仅支持 Queue。
     * @param CmqModel CMQ 的模型，有 Queue 和 Topic 两种，目前仅支持 Queue。
     */
    public void setCmqModel(String CmqModel) {
        this.CmqModel = CmqModel;
    }

    /**
     * Get CMQ 的园区，如 sh，bj 等。 
     * @return CmqRegion CMQ 的园区，如 sh，bj 等。
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set CMQ 的园区，如 sh，bj 等。
     * @param CmqRegion CMQ 的园区，如 sh，bj 等。
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * Get 当模型为 Queue 时有效，表示接收事件通知的 CMQ 的队列名。 
     * @return QueueName 当模型为 Queue 时有效，表示接收事件通知的 CMQ 的队列名。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 当模型为 Queue 时有效，表示接收事件通知的 CMQ 的队列名。
     * @param QueueName 当模型为 Queue 时有效，表示接收事件通知的 CMQ 的队列名。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 当模型为 Topic 时有效，表示接收事件通知的 CMQ 的主题名。 
     * @return TopicName 当模型为 Topic 时有效，表示接收事件通知的 CMQ 的主题名。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 当模型为 Topic 时有效，表示接收事件通知的 CMQ 的主题名。
     * @param TopicName 当模型为 Topic 时有效，表示接收事件通知的 CMQ 的主题名。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 通知类型，默认CMQ，指定URL时HTTP回调推送到 NotifyUrl 指定的地址。 
     * @return NotifyType 通知类型，默认CMQ，指定URL时HTTP回调推送到 NotifyUrl 指定的地址。
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 通知类型，默认CMQ，指定URL时HTTP回调推送到 NotifyUrl 指定的地址。
     * @param NotifyType 通知类型，默认CMQ，指定URL时HTTP回调推送到 NotifyUrl 指定的地址。
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get HTTP回调地址，NotifyType为URL时必填。 
     * @return NotifyUrl HTTP回调地址，NotifyType为URL时必填。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set HTTP回调地址，NotifyType为URL时必填。
     * @param NotifyUrl HTTP回调地址，NotifyType为URL时必填。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    public LiveStreamTaskNotifyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamTaskNotifyConfig(LiveStreamTaskNotifyConfig source) {
        if (source.CmqModel != null) {
            this.CmqModel = new String(source.CmqModel);
        }
        if (source.CmqRegion != null) {
            this.CmqRegion = new String(source.CmqRegion);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CmqModel", this.CmqModel);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);

    }
}

