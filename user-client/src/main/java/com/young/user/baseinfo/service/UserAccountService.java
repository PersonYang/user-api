package com.young.user.baseinfo.service;

import com.young.user.baseinfo.request.UserInfoRequest;
import com.young.user.baseinfo.response.UserInfoResponse;

/**
 * Created by young on 2018/8/23.
 */
public interface UserAccountService {

    UserInfoResponse getUserInfo(UserInfoRequest userInfoRequest);

}
