package com.ford.helloworld.controller.user.dto;

/**
 * @ClassName: UserDTO
 * @author: Ford.Zhang
 * @version: 1.0
 * 2019/12/25 下午 4:55
 **/

public class UserDTO {
    /**
     * 用户标识
     */
    private Long id;
    /**
     * 用户姓名
     */
    private  String name;
    /**
     * 用户年龄
     */
    private  Integer age;

    public UserDTO(){}

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

    public UserDTO(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
