package com.kingboy.repository.user;

import com.kingboy.repository.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/11/19 下午10:40
 * @desc 用户仓储接口.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findAllByName(String name);

    UserEntity findByName(String name);

    int countByName(String name);

    UserEntity readByName(String name);

    UserEntity getByName(String name);


}
