package com.kingboy.controller.user;

import com.king.common.utils.page.PageResult;
import com.kingboy.surface.user.UserService;
import com.kingboy.surface.user.request.UserRequest;
import com.kingboy.surface.user.response.UserResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/11/20 上午1:37
 * @desc 用户远程调用示例.
 */
@Api(value = "用户操作接口")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    UserService userService;

    @ApiOperation(value = "根据用户ID查找用户")
    @GetMapping(value = "/get/{id}")
    public UserResponse getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @ApiOperation(value = "添加一个用户")
    @PostMapping(value = "/save")
    public String saveUser(@RequestBody UserRequest userRequest) {
        userService.save(userRequest);
        return "success";
    }

    @ApiOperation(value = "分页查询用户")
    @GetMapping(value = "/get/page")
    public PageResult<UserResponse> listUserByPage(@RequestParam Integer p, @RequestParam Integer c) {
        //注意此处不能pageParam进行封装，因为pageParam中的p进行了特殊处理
        return userService.listUserByPage(p, c);
    }


}
