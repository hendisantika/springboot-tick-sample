package com.hendisantika.springbootticksample.entity;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-tick-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-01
 * Time: 06:45
 */
public class Person {
    private String name;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
