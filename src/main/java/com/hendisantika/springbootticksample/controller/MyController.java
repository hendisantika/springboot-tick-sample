package com.hendisantika.springbootticksample.controller;

import com.hendisantika.springbootticksample.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-tick-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-01
 * Time: 06:47
 */
@RestController
public class MyController {

    @GetMapping("/api/people")
    public List<Person> listPeople() {

        delay();
        return getPeople();

    }

    private List<Person> getPeople() {
        Person p1 = new Person("Uzumaki Naruto");
        Person p2 = new Person("Uchiha Sasuke");
        Person p3 = new Person("Haruno Sakura");
        Person p4 = new Person("Hatake Kakashi");

        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        return people;
    }

    private void delay() {
        try {
            Thread.sleep(new Random().nextInt(4) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
