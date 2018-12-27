package cn.gree.lwh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by 260175 on 2018/8/24.
 * Author:JackLee -李文华
 * Email：18173910487@163.com
 * 描述：
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableScheduling // 此注解必加
public class bluetoothApplication {
    public static void main(String[] args) {
        SpringApplication.run(bluetoothApplication.class, args);
    }
}
