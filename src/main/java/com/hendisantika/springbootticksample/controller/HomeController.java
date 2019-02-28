package com.hendisantika.springbootticksample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-tick-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-01
 * Time: 06:46
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        delay();
        return "Greetings from Spring Boot! " + new Date();
    }

    private void delay() {
        try {
            Thread.sleep(new Random().nextInt(4) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}