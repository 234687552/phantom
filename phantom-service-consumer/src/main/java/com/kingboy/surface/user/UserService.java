package com.kingboy.surface.user;

import com.king.common.utils.page.PageResult;
import com.kingboy.surface.user.request.UserRequest;
import com.kingboy.surface.user.response.UserResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/11/19 下午10:43
 * @desc 用户接口调用.
 */
@FeignClient(name = "phantom-service-provider", fallbackFactory = UserServiceFallbackFactory.class)
public interface UserService {

    @GetMapping(value = "/user/get/{id}")
    UserResponse getUserById(@PathVariable("id") Long id);

    @PostMapping(value = "/user/save")
    String save(@RequestBody UserRequest userRequest);

    @GetMapping(value = "/user/get/page")
    PageResult<UserResponse> listUserByPage(@RequestParam("p") int p, @RequestParam("c") int c);
}
