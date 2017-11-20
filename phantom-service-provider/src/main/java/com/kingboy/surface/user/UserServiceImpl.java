package com.kingboy.surface.user;

import com.king.common.utils.mapper.MapperUtils;
import com.king.common.utils.page.PageParam;
import com.king.common.utils.page.PageResult;
import com.king.common.utils.page.PageResultFactory;
import com.kingboy.repository.user.UserRepository;
import com.kingboy.repository.user.entity.UserEntity;
import com.kingboy.surface.user.request.UserRequest;
import com.kingboy.surface.user.response.UserResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/11/19 下午10:44
 * @desc 用户服务实现.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    PageResultFactory pageResultFactory;

    @Resource
    UserRepository userRepository;

    @Override
    @Transactional(rollbackFor = Exception.class, readOnly = true)
    public UserResponse getUserById(Long id) {
        UserEntity user = userRepository.findOne(id);
        return MapperUtils.mapperBean(user, UserResponse.class);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(UserRequest userRequest) {
        UserEntity userEntity = MapperUtils.mapperBean(userRequest, UserEntity.class);
        userRepository.save(userEntity);
    }

    @Override
    public PageResult<UserResponse> listUserByPage(PageParam pageParam) {
        Page<UserEntity> page = userRepository.findAll(new PageRequest(pageParam.getP(), pageParam.getC()));
        PageResult pageResult = new PageResult(page.getNumber(), page.getTotalElements(), page.getContent());
        PageResult<UserResponse> convert = pageResultFactory.convert(pageResult, UserResponse.class);
        return convert;
    }
}
