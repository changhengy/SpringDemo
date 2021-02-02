package org.aop.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorProxy {
    public static Object getCalculator(final Calculator calculator) {
        return Proxy.newProxyInstance(CalculatorProxy.class.getClassLoader(), calculator.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + "开始执行了");
                Object mCalculator = method.invoke(calculator, args);
                System.out.println(method.getName() + "执行结束了");
                return mCalculator;
            }
        });
        }

    }

