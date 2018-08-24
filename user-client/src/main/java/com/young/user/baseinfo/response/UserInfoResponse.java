package com.young.user.baseinfo.response;

import java.io.Serializable;

/**
 * Created by young on 2018/8/23.
 */
public class UserInfoResponse implements Serializable {

    private String  userName;
    private String  mobile;



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
