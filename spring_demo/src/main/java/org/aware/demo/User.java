package org.aware.demo;
/*
 * @time 2021/2/2 15:15
 * @author chy
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

public class User implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private String address;

    public User() {
        System.out.println("User  类的无参构造");
    }

    public void setBeanName(String beanName) {
        System.out.println("setBeanName被执行");
        System.out.println("beanName "+ beanName);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext 被执行");
        DemoBean demoBean = (DemoBean)applicationContext.getBean("demoBean");
        demoBean.pringHello();
    }

    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        System.out.println("setEmbeddedValueResolver 被执行");
    }
}
