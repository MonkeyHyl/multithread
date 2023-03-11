package test;

import service.Subject;
import service.impl.ReadSubject;

import java.lang.reflect.*;

public class Test {
    public static void main(String[] args) {
        ReadSubject subject = new ReadSubject();
        try {
            Class<?> proxyClass = Proxy.getProxyClass(subject.getClass().getClassLoader(), subject.getClass());
            Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
            Subject subjecta = (Subject) constructor.newInstance(
                    (InvocationHandler) (proxy, method, args1) -> {
                        System.out.println("aaaa");
                        return null;
                    }
            );
            subjecta.doSomething();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }


}
