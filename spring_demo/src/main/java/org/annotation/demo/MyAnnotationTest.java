package org.annotation.demo;
/*
 * @time 2021/2/3 16:56
 * @author chy
 */


import java.lang.annotation.Documented;

public class MyAnnotationTest {

    public static void main(String[] args) {
//        Calcul calcul = new Calcul();
        Calcul calcul = new Calcul(15 , 15);

        calcul.add();

        try {
            calcul.testManno();
        } catch (IllegalAccessException e) {
//            e.printStackTrace();
            System.out.println("抛出异常" +  e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("抛出异常" +  e.getMessage());
//            e.printStackTrace();
        }

        return;
    }
}
