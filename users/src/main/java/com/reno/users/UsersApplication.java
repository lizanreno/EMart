package com.reno.users;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@MapperScan("com.reno.users.mapper")
@SpringBootApplication
public class UsersApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(
                UsersApplication.class
        ).web(true).run(args);
    }

}
