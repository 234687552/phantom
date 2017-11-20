package com.kingboy.common.config;

import com.king.common.utils.page.PageResultFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/11/20 上午1:49
 * @desc 普通配置.
 */
@Configuration
public class CommonConfiguration {

    @Bean
    public PageResultFactory pageResultFactory() {
        return new PageResultFactory();
    }

}
