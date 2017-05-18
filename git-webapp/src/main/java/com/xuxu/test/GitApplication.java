package com.xuxu.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by xuxu on 2017/4/20.
 */
@SpringBootApplication
@RestController
public class GitApplication {
    public static void  main(String[] args) {

        SpringApplication.run(GitApplication.class, args);
    }

    @RequestMapping(value="/test")
    public String test(){
        System.out.println("ddd");
        double e=2.2222;
        
        int g=88263;
        boolean flag=true;
        return "dcfdd";

    }

    public String abc(){
        return "test";
    }
}
