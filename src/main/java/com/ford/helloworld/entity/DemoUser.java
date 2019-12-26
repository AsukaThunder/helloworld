package com.ford.helloworld.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @ClassName: DemoUser
 * @author: Ford.Zhang
 * @version: 1.0
 * 2019/12/26 上午 9:52
 **/
@Entity
public class DemoUser {
    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增长策略
    private Long id;
    private String name;
    private Integer age;

    protected DemoUser(){//无参构造函数；设为protected防止被直接使用
    }

    public DemoUser(Long id ,String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DemoUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
