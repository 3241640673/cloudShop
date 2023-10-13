package com.whh.client;

import com.whh.pojo.User;
import feign.hystrix.FallbackFactory;

public class ClientFeignFallbackFactory implements FallbackFactory<UserFeign> {
    public UserFeign create(Throwable throwable) {
        return new UserFeign() {
            public User getUser(Integer id) {
                return new User();
            }

            public String test1() {
                return "";
            }
        };
    }
}
