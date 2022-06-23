package com.tencentcloudapi.iotvideo.v20191126;
public enum IotvideoErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 签名校验失败。
     AUTHFAILURE_SIGNATUREFAILURE("AuthFailure.SignatureFailure"),
     
    // 获取token为空。
     AUTHFAILURE_TOKENFAILURE("AuthFailure.TokenFailure"),
     
    // DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。
     DRYRUNOPERATION("DryRunOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 设备固件升级任务已经完成。
     FAILEDOPERATION_DEVICEFIRMWARETASKALREADDONE("FailedOperation.DeviceFirmwareTaskAlreadDone"),
     
    // 设备正在升级中。
     FAILEDOPERATION_DEVICEISUPDATING("FailedOperation.DeviceIsUpdating"),
     
    // 设备已经运行其他ota升级任务。
     FAILEDOPERATION_DEVICERUNNINGOTHEROTATASK("FailedOperation.DeviceRunningOtherOtaTask"),
     
    // 无相关操作权限。
     FAILEDOPERATION_PERMISSIONDENIED("FailedOperation.PermissionDenied"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 固件已存在。
     INVALIDPARAMETERVALUE_FIRMWAREALREADYEXIST("InvalidParameterValue.FirmwareAlreadyExist"),
     
    // tid非法。
     INVALIDPARAMETERVALUE_TID("InvalidParameterValue.Tid"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 请求的次数超过了频率限制。
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 资源不足。
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 设备固件升级任务不存在。
     RESOURCENOTFOUND_DEVICEFIRMWARETASKNOTEXIST("ResourceNotFound.DeviceFirmwareTaskNotExist"),
     
    // 设备无固件版本。
     RESOURCENOTFOUND_DEVICEHASNOFIRMWARE("ResourceNotFound.DeviceHasNoFirmware"),
     
    // 固件不存在。
     RESOURCENOTFOUND_FIRMWARENOTEXIST("ResourceNotFound.FirmwareNotExist"),
     
    // 固件升级任务不存在。
     RESOURCENOTFOUND_FIRMWARETASKNOTEXIST("ResourceNotFound.FirmwareTaskNotExist"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 资源售罄。
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private IotvideoErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

