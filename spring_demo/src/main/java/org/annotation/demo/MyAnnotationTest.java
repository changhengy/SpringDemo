package org.annotation.demo;
/*
 * @time 2021/2/3 16:56
 * @author chy
 */


import java.lang.annotation.Documented;

public class MyAnnotationTest {

    public static void main(String[] args) throws IllegalAccessException {
//        Calcul calcul = new Calcul();
        Calcul calcul = new Calcul(1 , 25);

        calcul.add();

        calcul.testManno();

        return;
    }
}
