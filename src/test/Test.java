package test;

import service.Service;

public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        Thread threadA = new Thread(() ->
        {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                service.get();
            }
        }
        );
        threadA.start();
        Thread threadB = new Thread(() ->
        {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                service.set();
            }
        });
        threadB.start();


    }
}
