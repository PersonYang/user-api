package com.young.user.application;

import com.alibaba.dubbo.config.annotation.Service;
import com.young.user.baseinfo.request.UserInfoRequest;
import com.young.user.baseinfo.response.UserInfoResponse;
import com.young.user.baseinfo.service.UserAccountService;

/**
 * Created by young on 2018/8/23.
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class UserAccountServiceImpl implements UserAccountService {

    @Override
    public UserInfoResponse getUserInfo(UserInfoRequest userInfoRequest) {
        UserInfoResponse userInfoResponse = new UserInfoResponse();
        userInfoResponse.setUserName("wade");
        userInfoResponse.setMobile("15658193989");
        return userInfoResponse;
    }


}
