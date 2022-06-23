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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstanceRequest extends AbstractModel{

    /**
    * 每个副本集内节点个数，具体参照查询云数据库的售卖规格返回参数
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 实例内存大小，单位：GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例硬盘大小，单位：GB
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * 实例数量, 最小值1，最大值为10
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 实例所属区域名称，格式如：ap-guangzhou-2。注：此参数填写的是主可用区，如果选择多可用区部署，Zone必须是AvailabilityZoneList中的一个
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 机器类型，HIO：高IO型；HIO10G：高IO万兆型；STDS5：标准型
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数；若为单节点实例，该参数设置为0
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * 项目ID，不设置为默认项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 私有网络 ID，如果不传则默认选择基础网络，请使用 查询私有网络列表
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 查询子网列表
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例密码，不设置该参数则默认密码规则为 实例ID+"@"+主账户uin。举例实例id为cmgo-higv73ed，uin为100000001，则默认密码为"cmgo-higv73ed@100000001"。密码必须是8-16位字符，且至少包含字母、数字和字符 !@#%^*() 中的两种
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 实例标签信息
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 自动续费标记，可选值为：0 - 不自动续费；1 - 自动续费。默认为不自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 是否自动选择代金券，可选值为：1 - 是；0 - 否； 默认为0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 1:正式实例,2:临时实例,3:只读实例,4:灾备实例,5:克隆实例
    */
    @SerializedName("Clone")
    @Expose
    private Long Clone;

    /**
    * 若是只读，灾备实例或克隆实例，Father必须填写，即主实例ID
    */
    @SerializedName("Father")
    @Expose
    private String Father;

    /**
    * 安全组
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * 克隆实例回档时间。若是克隆实例，则必须填写，格式：2021-08-13 16:30:00。注：只能回档7天内的时间点
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
    * 实例名称。注：名称只支持长度为60个字符的中文、英文、数字、下划线_、分隔符-
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 多可用区部署的节点列表，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。注：1、多可用区部署节点只能部署在3个不同可用区；2、为了保障跨可用区切换，不支持将集群的大多数节点部署在同一个可用区（如3节点集群不支持2个节点部署在同一个区）；3、不支持4.2及以上版本；4、不支持只读灾备实例；5、不能选择基础网络
    */
    @SerializedName("AvailabilityZoneList")
    @Expose
    private String [] AvailabilityZoneList;

    /**
    * mongos cpu数量，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果
    */
    @SerializedName("MongosCpu")
    @Expose
    private Long MongosCpu;

    /**
    * mongos 内存大小，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果
    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * mongos 数量，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。注：为了保障高可用，最低需要购买3个mongos，上限为32个
    */
    @SerializedName("MongosNodeNum")
    @Expose
    private Long MongosNodeNum;

    /**
     * Get 每个副本集内节点个数，具体参照查询云数据库的售卖规格返回参数 
     * @return NodeNum 每个副本集内节点个数，具体参照查询云数据库的售卖规格返回参数
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 每个副本集内节点个数，具体参照查询云数据库的售卖规格返回参数
     * @param NodeNum 每个副本集内节点个数，具体参照查询云数据库的售卖规格返回参数
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 实例内存大小，单位：GB 
     * @return Memory 实例内存大小，单位：GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位：GB
     * @param Memory 实例内存大小，单位：GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例硬盘大小，单位：GB 
     * @return Volume 实例硬盘大小，单位：GB
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例硬盘大小，单位：GB
     * @param Volume 实例硬盘大小，单位：GB
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本 
     * @return MongoVersion 版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set 版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本
     * @param MongoVersion 版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get 实例数量, 最小值1，最大值为10 
     * @return GoodsNum 实例数量, 最小值1，最大值为10
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 实例数量, 最小值1，最大值为10
     * @param GoodsNum 实例数量, 最小值1，最大值为10
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 实例所属区域名称，格式如：ap-guangzhou-2。注：此参数填写的是主可用区，如果选择多可用区部署，Zone必须是AvailabilityZoneList中的一个 
     * @return Zone 实例所属区域名称，格式如：ap-guangzhou-2。注：此参数填写的是主可用区，如果选择多可用区部署，Zone必须是AvailabilityZoneList中的一个
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所属区域名称，格式如：ap-guangzhou-2。注：此参数填写的是主可用区，如果选择多可用区部署，Zone必须是AvailabilityZoneList中的一个
     * @param Zone 实例所属区域名称，格式如：ap-guangzhou-2。注：此参数填写的是主可用区，如果选择多可用区部署，Zone必须是AvailabilityZoneList中的一个
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36] 
     * @return Period 实例时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 实例时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     * @param Period 实例时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 机器类型，HIO：高IO型；HIO10G：高IO万兆型；STDS5：标准型 
     * @return MachineCode 机器类型，HIO：高IO型；HIO10G：高IO万兆型；STDS5：标准型
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set 机器类型，HIO：高IO型；HIO10G：高IO万兆型；STDS5：标准型
     * @param MachineCode 机器类型，HIO：高IO型；HIO10G：高IO万兆型；STDS5：标准型
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点 
     * @return ClusterType 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点
     * @param ClusterType 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数；若为单节点实例，该参数设置为0 
     * @return ReplicateSetNum 副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数；若为单节点实例，该参数设置为0
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set 副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数；若为单节点实例，该参数设置为0
     * @param ReplicateSetNum 副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数；若为单节点实例，该参数设置为0
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get 项目ID，不设置为默认项目 
     * @return ProjectId 项目ID，不设置为默认项目
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，不设置为默认项目
     * @param ProjectId 项目ID，不设置为默认项目
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 私有网络 ID，如果不传则默认选择基础网络，请使用 查询私有网络列表 
     * @return VpcId 私有网络 ID，如果不传则默认选择基础网络，请使用 查询私有网络列表
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络 ID，如果不传则默认选择基础网络，请使用 查询私有网络列表
     * @param VpcId 私有网络 ID，如果不传则默认选择基础网络，请使用 查询私有网络列表
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 查询子网列表 
     * @return SubnetId 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 查询子网列表
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 查询子网列表
     * @param SubnetId 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 查询子网列表
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例密码，不设置该参数则默认密码规则为 实例ID+"@"+主账户uin。举例实例id为cmgo-higv73ed，uin为100000001，则默认密码为"cmgo-higv73ed@100000001"。密码必须是8-16位字符，且至少包含字母、数字和字符 !@#%^*() 中的两种 
     * @return Password 实例密码，不设置该参数则默认密码规则为 实例ID+"@"+主账户uin。举例实例id为cmgo-higv73ed，uin为100000001，则默认密码为"cmgo-higv73ed@100000001"。密码必须是8-16位字符，且至少包含字母、数字和字符 !@#%^*() 中的两种
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 实例密码，不设置该参数则默认密码规则为 实例ID+"@"+主账户uin。举例实例id为cmgo-higv73ed，uin为100000001，则默认密码为"cmgo-higv73ed@100000001"。密码必须是8-16位字符，且至少包含字母、数字和字符 !@#%^*() 中的两种
     * @param Password 实例密码，不设置该参数则默认密码规则为 实例ID+"@"+主账户uin。举例实例id为cmgo-higv73ed，uin为100000001，则默认密码为"cmgo-higv73ed@100000001"。密码必须是8-16位字符，且至少包含字母、数字和字符 !@#%^*() 中的两种
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 实例标签信息 
     * @return Tags 实例标签信息
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例标签信息
     * @param Tags 实例标签信息
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 自动续费标记，可选值为：0 - 不自动续费；1 - 自动续费。默认为不自动续费 
     * @return AutoRenewFlag 自动续费标记，可选值为：0 - 不自动续费；1 - 自动续费。默认为不自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记，可选值为：0 - 不自动续费；1 - 自动续费。默认为不自动续费
     * @param AutoRenewFlag 自动续费标记，可选值为：0 - 不自动续费；1 - 自动续费。默认为不自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 是否自动选择代金券，可选值为：1 - 是；0 - 否； 默认为0 
     * @return AutoVoucher 是否自动选择代金券，可选值为：1 - 是；0 - 否； 默认为0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动选择代金券，可选值为：1 - 是；0 - 否； 默认为0
     * @param AutoVoucher 是否自动选择代金券，可选值为：1 - 是；0 - 否； 默认为0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 1:正式实例,2:临时实例,3:只读实例,4:灾备实例,5:克隆实例 
     * @return Clone 1:正式实例,2:临时实例,3:只读实例,4:灾备实例,5:克隆实例
     */
    public Long getClone() {
        return this.Clone;
    }

    /**
     * Set 1:正式实例,2:临时实例,3:只读实例,4:灾备实例,5:克隆实例
     * @param Clone 1:正式实例,2:临时实例,3:只读实例,4:灾备实例,5:克隆实例
     */
    public void setClone(Long Clone) {
        this.Clone = Clone;
    }

    /**
     * Get 若是只读，灾备实例或克隆实例，Father必须填写，即主实例ID 
     * @return Father 若是只读，灾备实例或克隆实例，Father必须填写，即主实例ID
     */
    public String getFather() {
        return this.Father;
    }

    /**
     * Set 若是只读，灾备实例或克隆实例，Father必须填写，即主实例ID
     * @param Father 若是只读，灾备实例或克隆实例，Father必须填写，即主实例ID
     */
    public void setFather(String Father) {
        this.Father = Father;
    }

    /**
     * Get 安全组 
     * @return SecurityGroup 安全组
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 安全组
     * @param SecurityGroup 安全组
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get 克隆实例回档时间。若是克隆实例，则必须填写，格式：2021-08-13 16:30:00。注：只能回档7天内的时间点 
     * @return RestoreTime 克隆实例回档时间。若是克隆实例，则必须填写，格式：2021-08-13 16:30:00。注：只能回档7天内的时间点
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set 克隆实例回档时间。若是克隆实例，则必须填写，格式：2021-08-13 16:30:00。注：只能回档7天内的时间点
     * @param RestoreTime 克隆实例回档时间。若是克隆实例，则必须填写，格式：2021-08-13 16:30:00。注：只能回档7天内的时间点
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    /**
     * Get 实例名称。注：名称只支持长度为60个字符的中文、英文、数字、下划线_、分隔符- 
     * @return InstanceName 实例名称。注：名称只支持长度为60个字符的中文、英文、数字、下划线_、分隔符-
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。注：名称只支持长度为60个字符的中文、英文、数字、下划线_、分隔符-
     * @param InstanceName 实例名称。注：名称只支持长度为60个字符的中文、英文、数字、下划线_、分隔符-
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 多可用区部署的节点列表，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。注：1、多可用区部署节点只能部署在3个不同可用区；2、为了保障跨可用区切换，不支持将集群的大多数节点部署在同一个可用区（如3节点集群不支持2个节点部署在同一个区）；3、不支持4.2及以上版本；4、不支持只读灾备实例；5、不能选择基础网络 
     * @return AvailabilityZoneList 多可用区部署的节点列表，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。注：1、多可用区部署节点只能部署在3个不同可用区；2、为了保障跨可用区切换，不支持将集群的大多数节点部署在同一个可用区（如3节点集群不支持2个节点部署在同一个区）；3、不支持4.2及以上版本；4、不支持只读灾备实例；5、不能选择基础网络
     */
    public String [] getAvailabilityZoneList() {
        return this.AvailabilityZoneList;
    }

    /**
     * Set 多可用区部署的节点列表，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。注：1、多可用区部署节点只能部署在3个不同可用区；2、为了保障跨可用区切换，不支持将集群的大多数节点部署在同一个可用区（如3节点集群不支持2个节点部署在同一个区）；3、不支持4.2及以上版本；4、不支持只读灾备实例；5、不能选择基础网络
     * @param AvailabilityZoneList 多可用区部署的节点列表，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。注：1、多可用区部署节点只能部署在3个不同可用区；2、为了保障跨可用区切换，不支持将集群的大多数节点部署在同一个可用区（如3节点集群不支持2个节点部署在同一个区）；3、不支持4.2及以上版本；4、不支持只读灾备实例；5、不能选择基础网络
     */
    public void setAvailabilityZoneList(String [] AvailabilityZoneList) {
        this.AvailabilityZoneList = AvailabilityZoneList;
    }

    /**
     * Get mongos cpu数量，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果 
     * @return MongosCpu mongos cpu数量，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果
     */
    public Long getMongosCpu() {
        return this.MongosCpu;
    }

    /**
     * Set mongos cpu数量，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果
     * @param MongosCpu mongos cpu数量，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果
     */
    public void setMongosCpu(Long MongosCpu) {
        this.MongosCpu = MongosCpu;
    }

    /**
     * Get mongos 内存大小，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果 
     * @return MongosMemory mongos 内存大小，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果
     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set mongos 内存大小，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果
     * @param MongosMemory mongos 内存大小，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果
     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get mongos 数量，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。注：为了保障高可用，最低需要购买3个mongos，上限为32个 
     * @return MongosNodeNum mongos 数量，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。注：为了保障高可用，最低需要购买3个mongos，上限为32个
     */
    public Long getMongosNodeNum() {
        return this.MongosNodeNum;
    }

    /**
     * Set mongos 数量，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。注：为了保障高可用，最低需要购买3个mongos，上限为32个
     * @param MongosNodeNum mongos 数量，购买MongoDB 4.2 WiredTiger存储引擎版本的分片集群时必须填写，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。注：为了保障高可用，最低需要购买3个mongos，上限为32个
     */
    public void setMongosNodeNum(Long MongosNodeNum) {
        this.MongosNodeNum = MongosNodeNum;
    }

    public CreateDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBInstanceRequest(CreateDBInstanceRequest source) {
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ReplicateSetNum != null) {
            this.ReplicateSetNum = new Long(source.ReplicateSetNum);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.Clone != null) {
            this.Clone = new Long(source.Clone);
        }
        if (source.Father != null) {
            this.Father = new String(source.Father);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.RestoreTime != null) {
            this.RestoreTime = new String(source.RestoreTime);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AvailabilityZoneList != null) {
            this.AvailabilityZoneList = new String[source.AvailabilityZoneList.length];
            for (int i = 0; i < source.AvailabilityZoneList.length; i++) {
                this.AvailabilityZoneList[i] = new String(source.AvailabilityZoneList[i]);
            }
        }
        if (source.MongosCpu != null) {
            this.MongosCpu = new Long(source.MongosCpu);
        }
        if (source.MongosMemory != null) {
            this.MongosMemory = new Long(source.MongosMemory);
        }
        if (source.MongosNodeNum != null) {
            this.MongosNodeNum = new Long(source.MongosNodeNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "Clone", this.Clone);
        this.setParamSimple(map, prefix + "Father", this.Father);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "RestoreTime", this.RestoreTime);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "AvailabilityZoneList.", this.AvailabilityZoneList);
        this.setParamSimple(map, prefix + "MongosCpu", this.MongosCpu);
        this.setParamSimple(map, prefix + "MongosMemory", this.MongosMemory);
        this.setParamSimple(map, prefix + "MongosNodeNum", this.MongosNodeNum);

    }
}

