package com.w.springboot_sys.SrcConfig;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//处理驼峰式和下划线的转化问题
@Configuration
public class MyBatisConfig {

    @Bean
    public ConfigurationCustomizer getCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }

}
