package com.ymj.serviceverificationcode.service;

import com.ymj.internalcommon.dto.ResponseResult;
import com.ymj.internalcommon.dto.serviceverificationcode.VerifyCodeResponse;

/**
 * @Classname VerifyCodeService
 * @Description TODO
 * @Date 2021/8/11 19:28
 * @Created by yemingjie
 */
public interface VerifyCodeService {
    /**
     * 根据身份和手机号生成验证码
     * @param identity
     * @param phoneNumber
     * @return
     */
    ResponseResult<VerifyCodeResponse> generate(int identity , String phoneNumber);

    /**
     * 校验身份，手机号，验证码的合法性
     * @param identity
     * @param phoneNumber
     * @param code
     * @return
     */
    ResponseResult verify(int identity,String phoneNumber,String code);
}
