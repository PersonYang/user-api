package com.young.user.baseinfo.request;

import java.io.Serializable;

/**
 * Created by young on 2018/8/23.
 */
public class UserInfoRequest implements Serializable {

    private Long userId;



    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
