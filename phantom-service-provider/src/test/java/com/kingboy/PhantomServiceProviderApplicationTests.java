package com.kingboy;

import com.kingboy.repository.user.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PhantomServiceProviderApplicationTests {

    @Resource
    UserRepository userRepository;
    @Test
    public void contextLoads() {
    }

    @Test
    public void  testRepository(){
        log.info("countByName");
        userRepository.countByName("a");
        log.info("readByName");
        userRepository.readByName("a");
        log.info("findByName");
        userRepository.findByName("a");
        log.info("getByName");
        userRepository.getByName("a");
        log.info("findAllByName");
        userRepository.findAllByName("a");
    }


}
