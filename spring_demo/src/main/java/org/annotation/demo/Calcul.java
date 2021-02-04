package org.annotation.demo;
/*
 * @time 2021/2/4 14:07
 * @author chy
 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Calcul {
    @MyAnnotation(max = 50, min = 0)
    int ma = 0;
    @MyAnnotation(max = 50, min = 0)
    int mb = 0;

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
        Class clazz = Calcul.class;

        for(Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation reange =  field.getAnnotation(MyAnnotation.class);

                System.out.println("Fields名： " + field.getName() + " 已经被 注释标记 ，标记名： " + field.getAnnotation(MyAnnotation.class) );
                if ((Integer)field.getInt("") > reange.max() || (Integer)field.getInt("") < reange.min()) {
                    throw new IllegalArgumentException();
                } else {
                    System.out.println("field.getInt(Integer.class) " +  field.getInt(Integer.class));
                }
            }
        }

        for (Method method: clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                System.out.println("方法名： " + method + " 已经被 注释标记 ，标记名： " + method.getAnnotation(MyAnnotation.class) );
            }
        }
    }
}
