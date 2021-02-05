package org.annotation.demo;
/*
 * @time 2021/2/4 14:07
 * @author chy
 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Calcul {
    @MyAnnotation(max = 25, min = 0)
    public int ma = 0;
    @MyAnnotation(max = 10, min = 0)
    public int mb = 0;

    public Calcul(int ma, int mb) {
        this.ma = ma;
        this.mb = mb;
    }

    public Calcul() {
    }

    @MyAnnotation(id = 5, value = "加法的注解")
    public int add () {
        return ma+mb;
    }

    @MyAnnotation(id = 8,value = "减法的注解")
    public int min (int a ,int b) {

        return a - b;
    }

    public void testManno() throws IllegalArgumentException, IllegalAccessException {
//        Class clazz = Calcul.class;
        Class clazz = this.getClass();

        for(Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation reange =  field.getAnnotation(MyAnnotation.class);
                field.setAccessible(true);
                System.out.println("Fields名： " + field.getName() + " 已经被 注释标记 ，标记名： " + field.getAnnotation(MyAnnotation.class) );
                System.out.println("--------------------");
                System.out.println("--------------------" + field.get(this));
                if ((Integer)field.get(this) > reange.max() || (Integer)field.get(this) < reange.min()) {
                    System.out.println("传入值大于注解最大值或者小于注解最小值， 准备抛出异常");
                    throw new IllegalArgumentException();
                } else {
                    System.out.println("未检出异常，输出log");
                }
            }
        }

//        for (Method method: clazz.getDeclaredMethods()) {
//            if (method.isAnnotationPresent(MyAnnotation.class)) {
//                System.out.println("方法名： " + method + " 已经被 注释标记 ，标记名： " + method.getAnnotation(MyAnnotation.class) );
//            }
//        }
    }
}
