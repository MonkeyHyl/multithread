package service.impl;

import service.Subject;

public class ReadSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("你好世界！");
    }
}
