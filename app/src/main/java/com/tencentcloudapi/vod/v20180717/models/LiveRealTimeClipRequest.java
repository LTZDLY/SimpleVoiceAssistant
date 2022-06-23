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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveRealTimeClipRequest extends AbstractModel{

    /**
    * 推流直播码。
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * 流剪辑的开始时间，格式参照 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 流剪辑的结束时间，格式参照 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 是否固化。0 不固化，1 固化。默认不固化。
    */
    @SerializedName("IsPersistence")
    @Expose
    private Long IsPersistence;

    /**
    * 剪辑固化后的视频存储过期时间。格式参照 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 剪辑固化后的视频点播任务流处理，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。仅 IsPersistence 为 1 时有效。
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * 是否需要返回剪辑后的视频元信息。0 不需要，1 需要。默认不需要。
    */
    @SerializedName("MetaDataRequired")
    @Expose
    private Long MetaDataRequired;

    /**
    * 云点播中添加的用于时移播放的域名，必须在云直播已经[关联录制模板和开通时移服务](https://cloud.tencent.com/document/product/266/52220#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E)。**如果本接口的首次调用时间在 2021-01-01T00:00:00Z 之后，则此字段为必选字段。**
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 系统保留字段，请勿填写。
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 推流直播码。 
     * @return StreamId 推流直播码。
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 推流直播码。
     * @param StreamId 推流直播码。
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get 流剪辑的开始时间，格式参照 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return StartTime 流剪辑的开始时间，格式参照 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 流剪辑的开始时间，格式参照 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param StartTime 流剪辑的开始时间，格式参照 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 流剪辑的结束时间，格式参照 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return EndTime 流剪辑的结束时间，格式参照 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 流剪辑的结束时间，格式参照 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param EndTime 流剪辑的结束时间，格式参照 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 是否固化。0 不固化，1 固化。默认不固化。 
     * @return IsPersistence 是否固化。0 不固化，1 固化。默认不固化。
     */
    public Long getIsPersistence() {
        return this.IsPersistence;
    }

    /**
     * Set 是否固化。0 不固化，1 固化。默认不固化。
     * @param IsPersistence 是否固化。0 不固化，1 固化。默认不固化。
     */
    public void setIsPersistence(Long IsPersistence) {
        this.IsPersistence = IsPersistence;
    }

    /**
     * Get 剪辑固化后的视频存储过期时间。格式参照 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。 
     * @return ExpireTime 剪辑固化后的视频存储过期时间。格式参照 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 剪辑固化后的视频存储过期时间。格式参照 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。
     * @param ExpireTime 剪辑固化后的视频存储过期时间。格式参照 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。填“9999-12-31T23:59:59Z”表示永不过期。过期后该媒体文件及其相关资源（转码结果、雪碧图等）将被永久删除。仅 IsPersistence 为 1 时有效，默认剪辑固化的视频永不过期。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 剪辑固化后的视频点播任务流处理，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。仅 IsPersistence 为 1 时有效。 
     * @return Procedure 剪辑固化后的视频点播任务流处理，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。仅 IsPersistence 为 1 时有效。
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set 剪辑固化后的视频点播任务流处理，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。仅 IsPersistence 为 1 时有效。
     * @param Procedure 剪辑固化后的视频点播任务流处理，详见[上传指定任务流](https://cloud.tencent.com/document/product/266/9759)。仅 IsPersistence 为 1 时有效。
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get 是否需要返回剪辑后的视频元信息。0 不需要，1 需要。默认不需要。 
     * @return MetaDataRequired 是否需要返回剪辑后的视频元信息。0 不需要，1 需要。默认不需要。
     */
    public Long getMetaDataRequired() {
        return this.MetaDataRequired;
    }

    /**
     * Set 是否需要返回剪辑后的视频元信息。0 不需要，1 需要。默认不需要。
     * @param MetaDataRequired 是否需要返回剪辑后的视频元信息。0 不需要，1 需要。默认不需要。
     */
    public void setMetaDataRequired(Long MetaDataRequired) {
        this.MetaDataRequired = MetaDataRequired;
    }

    /**
     * Get 云点播中添加的用于时移播放的域名，必须在云直播已经[关联录制模板和开通时移服务](https://cloud.tencent.com/document/product/266/52220#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E)。**如果本接口的首次调用时间在 2021-01-01T00:00:00Z 之后，则此字段为必选字段。** 
     * @return Host 云点播中添加的用于时移播放的域名，必须在云直播已经[关联录制模板和开通时移服务](https://cloud.tencent.com/document/product/266/52220#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E)。**如果本接口的首次调用时间在 2021-01-01T00:00:00Z 之后，则此字段为必选字段。**
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 云点播中添加的用于时移播放的域名，必须在云直播已经[关联录制模板和开通时移服务](https://cloud.tencent.com/document/product/266/52220#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E)。**如果本接口的首次调用时间在 2021-01-01T00:00:00Z 之后，则此字段为必选字段。**
     * @param Host 云点播中添加的用于时移播放的域名，必须在云直播已经[关联录制模板和开通时移服务](https://cloud.tencent.com/document/product/266/52220#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E)。**如果本接口的首次调用时间在 2021-01-01T00:00:00Z 之后，则此字段为必选字段。**
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 系统保留字段，请勿填写。 
     * @return ExtInfo 系统保留字段，请勿填写。
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 系统保留字段，请勿填写。
     * @param ExtInfo 系统保留字段，请勿填写。
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public LiveRealTimeClipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRealTimeClipRequest(LiveRealTimeClipRequest source) {
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.IsPersistence != null) {
            this.IsPersistence = new Long(source.IsPersistence);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Procedure != null) {
            this.Procedure = new String(source.Procedure);
        }
        if (source.MetaDataRequired != null) {
            this.MetaDataRequired = new Long(source.MetaDataRequired);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsPersistence", this.IsPersistence);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "MetaDataRequired", this.MetaDataRequired);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

