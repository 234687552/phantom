package com.kingboy.surface.user;

import com.king.common.utils.page.PageResult;
import com.kingboy.surface.user.request.UserRequest;
import com.kingboy.surface.user.response.UserResponse;
import feign.hystrix.FallbackFactory;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/11/20 上午3:50
 * @desc 用户服务的fallback.
 */
@Log4j
@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserService>{

    @Override
    public UserService create(Throwable cause) {
        return new UserService() {
            @Override
            public UserResponse getUserById(@PathVariable("id") Long id) {
                log.error(this.getClass().getSimpleName() + cause);
                return new UserResponse(-1L, "default", "default", -1, BigDecimal.valueOf(0.00));
            }

            @Override
            public String save(@RequestBody UserRequest userRequest) {
                log.error(this.getClass().getSimpleName() + cause);
                return "fail";
            }

            @Override
            public PageResult<UserResponse> listUserByPage(@RequestParam("p") int p, @RequestParam("c") int c) {
                log.error(this.getClass().getSimpleName() + cause);
                return new PageResult<>(0, 0, null);
            }
        };
    }
}
