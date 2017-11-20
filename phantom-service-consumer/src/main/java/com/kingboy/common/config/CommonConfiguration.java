package com.kingboy.common.config;

import com.king.common.utils.page.PageResultFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

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
