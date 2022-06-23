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

public class DescribeTasksRequest extends AbstractModel{

    /**
    * 过滤条件：任务状态，可选值：WAITING（等待中）、PROCESSING（处理中）、FINISH（已完成）。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 过滤条件：文件 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 过滤条件：任务创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * 过滤条件：任务结束时间。
    */
    @SerializedName("FinishTime")
    @Expose
    private TimeRange FinishTime;

    /**
    * 排序方式。Sort.Field 可选：
<li> CreateTime 任务创建时间。</li>
<li>FinishTime 任务结束时间。</li>
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * 返回记录条数，默认值：10，最大值：100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 过滤条件：任务状态，可选值：WAITING（等待中）、PROCESSING（处理中）、FINISH（已完成）。 
     * @return Status 过滤条件：任务状态，可选值：WAITING（等待中）、PROCESSING（处理中）、FINISH（已完成）。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 过滤条件：任务状态，可选值：WAITING（等待中）、PROCESSING（处理中）、FINISH（已完成）。
     * @param Status 过滤条件：任务状态，可选值：WAITING（等待中）、PROCESSING（处理中）、FINISH（已完成）。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 过滤条件：文件 ID。 
     * @return FileId 过滤条件：文件 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 过滤条件：文件 ID。
     * @param FileId 过滤条件：文件 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 过滤条件：任务创建时间。 
     * @return CreateTime 过滤条件：任务创建时间。
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 过滤条件：任务创建时间。
     * @param CreateTime 过滤条件：任务创建时间。
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 过滤条件：任务结束时间。 
     * @return FinishTime 过滤条件：任务结束时间。
     */
    public TimeRange getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 过滤条件：任务结束时间。
     * @param FinishTime 过滤条件：任务结束时间。
     */
    public void setFinishTime(TimeRange FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 排序方式。Sort.Field 可选：
<li> CreateTime 任务创建时间。</li>
<li>FinishTime 任务结束时间。</li> 
     * @return Sort 排序方式。Sort.Field 可选：
<li> CreateTime 任务创建时间。</li>
<li>FinishTime 任务结束时间。</li>
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set 排序方式。Sort.Field 可选：
<li> CreateTime 任务创建时间。</li>
<li>FinishTime 任务结束时间。</li>
     * @param Sort 排序方式。Sort.Field 可选：
<li> CreateTime 任务创建时间。</li>
<li>FinishTime 任务结束时间。</li>
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 返回记录条数，默认值：10，最大值：100。 
     * @return Limit 返回记录条数，默认值：10，最大值：100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认值：10，最大值：100。
     * @param Limit 返回记录条数，默认值：10，最大值：100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。 
     * @return ScrollToken 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。
     * @param ScrollToken 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
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

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new TimeRange(source.CreateTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new TimeRange(source.FinishTime);
        }
        if (source.Sort != null) {
            this.Sort = new SortBy(source.Sort);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "CreateTime.", this.CreateTime);
        this.setParamObj(map, prefix + "FinishTime.", this.FinishTime);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

