package com.xzc.gamestore.service;
import com.xzc.gamestore.common.api.CommonResult;

/**
 * @author xzc
 * @date 2025/7/6 14 28:28
 * @description
 */




public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
