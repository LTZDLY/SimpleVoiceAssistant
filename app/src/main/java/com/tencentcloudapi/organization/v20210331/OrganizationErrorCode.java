package com.tencentcloudapi.organization.v20210331;
public enum OrganizationErrorCode {
    // 用户未实名。
     FAILEDOPERATION_AUTHINFOEMPTY("FailedOperation.AuthInfoEmpty"),
     
    // 用户非企业实名。
     FAILEDOPERATION_AUTHNOTENTERPRISE("FailedOperation.AuthNotEnterprise"),
     
    // 创建成员异常。
     FAILEDOPERATION_CREATEACCOUNT("FailedOperation.CreateAccount"),
     
    // 账号实名认证超过上限。
     FAILEDOPERATION_CREATEMEMBERAUTHOVERLIMIT("FailedOperation.CreateMemberAuthOverLimit"),
     
    // 创建测试失败。
     FAILEDOPERATION_CREATEPOLICY("FailedOperation.CreatePolicy"),
     
    // 创建已成功。
     FAILEDOPERATION_CREATERECORDALREADYSUCCESS("FailedOperation.CreateRecordAlreadySuccess"),
     
    // 创建记录不存在。
     FAILEDOPERATION_CREATERECORDNOTEXIST("FailedOperation.CreateRecordNotExist"),
     
    // 创建角色异常。
     FAILEDOPERATION_CREATEROLE("FailedOperation.CreateRole"),
     
    // 名字已经被使用。
     FAILEDOPERATION_MEMBERNAMEUSED("FailedOperation.MemberNameUsed"),
     
    // 成员授权策略名已存在。
     FAILEDOPERATION_MEMBERPOLICYNAMEEXIST("FailedOperation.MemberPolicyNameExist"),
     
    // 操作计费侧成员权限错误。
     FAILEDOPERATION_OPERATEBILLINGPERMISSIONERR("FailedOperation.OperateBillingPermissionErr"),
     
    // 操作策略失败。
     FAILEDOPERATION_OPERATEPOLICY("FailedOperation.OperatePolicy"),
     
    // 成员名已存在。
     FAILEDOPERATION_ORGANIZATIONMEMBERNAMEUSED("FailedOperation.OrganizationMemberNameUsed"),
     
    // 组织节点不存在。
     FAILEDOPERATION_ORGANIZATIONNODENOTEXIST("FailedOperation.OrganizationNodeNotExist"),
     
    // 组织权限不合法。
     FAILEDOPERATION_ORGANIZATIONPERMISSIONILLEGAL("FailedOperation.OrganizationPermissionIllegal"),
     
    // 组织策略不合法。
     FAILEDOPERATION_ORGANIZATIONPOLICYILLEGAL("FailedOperation.OrganizationPolicyIllegal"),
     
    // 代付者不合法。
     FAILEDOPERATION_PAYUINILLEGAL("FailedOperation.PayUinIllegal"),
     
    // 子账号存在身份。
     FAILEDOPERATION_SUBACCOUNTIDENTITYEXIST("FailedOperation.SubAccountIdentityExist"),
     
    // 子账号不存在。
     FAILEDOPERATION_SUBACCOUNTNOTEXIST("FailedOperation.SubAccountNotExist"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 创建成员超过上限。
     LIMITEXCEEDED_CREATEMEMBEROVERLIMIT("LimitExceeded.CreateMemberOverLimit"),
     
    // 成员超过上限。
     LIMITEXCEEDED_ORGANIZATIONMEMBEROVERLIMIT("LimitExceeded.OrganizationMemberOverLimit"),
     
    // 成员可授权身份不存在。
     RESOURCENOTFOUND_MEMBERIDENTITYNOTEXIST("ResourceNotFound.MemberIdentityNotExist"),
     
    // 成员不存在。
     RESOURCENOTFOUND_MEMBERNOTEXIST("ResourceNotFound.MemberNotExist"),
     
    // 组织成员策略不存在。
     RESOURCENOTFOUND_MEMBERPOLICYNOTEXIST("ResourceNotFound.MemberPolicyNotExist"),
     
    // 企业组织不存在。
     RESOURCENOTFOUND_ORGANIZATIONNOTEXIST("ResourceNotFound.OrganizationNotExist"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // 不允许添加代付关系。
     UNSUPPORTEDOPERATION_ADDDELEGATEPAYERNOTALLOW("UnsupportedOperation.AddDelegatePayerNotAllow"),
     
    // 不允许添加优惠继承关系。
     UNSUPPORTEDOPERATION_ADDDISCOUNTINHERITNOTALLOW("UnsupportedOperation.AddDiscountInheritNotAllow"),
     
    // 用户类型不一致。
     UNSUPPORTEDOPERATION_INCONSISTENTUSERTYPES("UnsupportedOperation.InconsistentUserTypes"),
     
    // 调用经管系统报错。
     UNSUPPORTEDOPERATION_MANAGEMENTSYSTEMERROR("UnsupportedOperation.ManagementSystemError"),
     
    // 成员账户欠费。
     UNSUPPORTEDOPERATION_MEMBERACCOUNTARREARS("UnsupportedOperation.MemberAccountArrears"),
     
    // 成员存在优惠继承。
     UNSUPPORTEDOPERATION_MEMBERDISCOUNTINHERITEXISTED("UnsupportedOperation.MemberDiscountInheritExisted"),
     
    // 成员存在账户级优惠。
     UNSUPPORTEDOPERATION_MEMBEREXISTACCOUNTLEVELDISCOUNTINHERIT("UnsupportedOperation.MemberExistAccountLevelDiscountInherit"),
     
    // 成员是代理商或代客。
     UNSUPPORTEDOPERATION_MEMBERISAGENT("UnsupportedOperation.MemberIsAgent"),
     
    // 存在在途订单。
     UNSUPPORTEDOPERATION_ORDERINPROGRESSEXISTED("UnsupportedOperation.OrderInProgressExisted"),
     
    // 管理员存在优惠继承。
     UNSUPPORTEDOPERATION_OWNERDISCOUNTINHERITEXISTED("UnsupportedOperation.OwnerDiscountInheritExisted"),
     
    // 代付者欠费且未开通信用账户。
     UNSUPPORTEDOPERATION_PAYERARREARSANDNOCREDITACCOUNT("UnsupportedOperation.PayerArrearsAndNoCreditAccount"),
     
    // 代付者存在账户级优惠。
     UNSUPPORTEDOPERATION_PAYEREXISTACCOUNTLEVELDISCOUNTINHERIT("UnsupportedOperation.PayerExistAccountLevelDiscountInherit");
     
    private String value;
    private OrganizationErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

