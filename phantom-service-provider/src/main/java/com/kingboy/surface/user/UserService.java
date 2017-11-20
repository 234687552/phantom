package com.kingboy.surface.user;

import com.king.common.utils.page.PageParam;
import com.king.common.utils.page.PageResult;
import com.kingboy.surface.user.request.UserRequest;
import com.kingboy.surface.user.response.UserResponse;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/11/19 下午10:44
 * @desc 用户服务接口.
 */
public interface UserService {

    UserResponse getUserById(Long id);

    void save(UserRequest userRequest);

    PageResult<UserResponse> listUserByPage(PageParam pageParam);
}
