package com.demo.lc;
/*
 * @time 2021/1/25 11:02
 * @author chy
 */

public class UserBean {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserBean(String name, int age) {
        System.out.println("UserBean 全参数构造");
        this.name = name;
        this.age = age;
    }

    public UserBean() {
        System.out.println("UserBean 午餐构造");
    }
}
