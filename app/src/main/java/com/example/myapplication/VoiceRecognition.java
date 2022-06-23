package com.example.myapplication;

import com.tencentcloudapi.asr.v20190614.AsrClient;
import com.tencentcloudapi.asr.v20190614.models.SentenceRecognitionRequest;
import com.tencentcloudapi.asr.v20190614.models.SentenceRecognitionResponse;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;

import org.apache.commons.codec.binary.Base64;

import java.io.File;
import java.io.FileInputStream;


public class VoiceRecognition {

    // 获取文件转换之后的base64内容
    public static String encodeBase64File(String filepath) throws Exception {
        File file = new File(filepath);
        FileInputStream inputFile = new FileInputStream(file);
        byte[] buffer = new byte[(int) file.length()];
        long len = buffer.length;
        inputFile.read(buffer);
        inputFile.close();

        String data = Base64.encodeBase64String(buffer);

//        return "你好";
        return recognition(data, len);

    }

    public static String recognition(String data, long len) {

        try {
            // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey,此处还需注意密钥对的保密
            // 密钥可前往https://console.cloud.tencent.com/cam/capi网站进行获取
            Credential cred = new Credential("secretid",
                    "secretkey");
//            Credential cred = new Credential("1",
//                    "1");
            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("asr.tencentcloudapi.com");
            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);
            // 实例化要请求产品的client对象,clientProfile是可选的
            AsrClient client = new AsrClient(cred, "", clientProfile);
            // 实例化一个请求对象,每个接口都会对应一个request对象
            SentenceRecognitionRequest req = new SentenceRecognitionRequest();
            req.setProjectId(0L);
            req.setSubServiceType(2L);
            req.setEngSerViceType("8k_zh");
            req.setSourceType(1L);
            req.setVoiceFormat("m4a");
            req.setUsrAudioKey("test");
            req.setData(data);
            req.setDataLen(len);

            // 返回的resp是一个SentenceRecognitionResponse的实例，与请求对象对应
            SentenceRecognitionResponse resp = client.SentenceRecognition(req);
            // 输出json格式的字符串回包
//            System.out.println(SentenceRecognitionResponse.toJsonString(resp));
            return resp.getResult();
        } catch (TencentCloudSDKException e) {
//            System.out.println(e.toString());
            return null;
        }
    }

}
