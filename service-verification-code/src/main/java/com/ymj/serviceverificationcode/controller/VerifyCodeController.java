package com.ymj.serviceverificationcode.controller;

import com.ymj.internalcommon.dto.ResponseResult;
import com.ymj.serviceverificationcode.service.VerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname VerifyCodeController
 * @Description TODO
 * @Date 2021/8/10 19:44
 * @Created by yemingjie
 */
@RestController
@RequestMapping("/verify-code")
public class VerifyCodeController {

    @Autowired
    private VerifyCodeService verifyCodeService;


    @GetMapping("/generate/{identity}/{phoneNumber}")
    public ResponseResult generate(@PathVariable("identity") int identity,
                                   @PathVariable("phoneNumber") String phoneNumber) {
        return verifyCodeService.generate(identity, phoneNumber);
    }


}
