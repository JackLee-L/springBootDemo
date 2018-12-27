package cn.gree.lwh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 260175 on 2018/8/24.
 * Author:JackLee -李文华
 * Email：18173910487@163.com
 * 描述：
 */
@Configuration
public class config {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
