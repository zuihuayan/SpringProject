package com.yan.bean;

import org.springframework.stereotype.Component;

@Component("user")
public class User {
    private String name;
    private Integer age;

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

    public void init(){
        System.out.println("��ʼ������");
    }
    public void destroy(){
        System.out.println("���ٷ���");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}