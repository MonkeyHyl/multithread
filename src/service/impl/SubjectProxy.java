package service.impl;

import service.Subject;

public class SubjectProxy implements Subject {
    private Subject subject = new ReadSubject();

    @Override
    public void doSomething() {
        System.out.println("1111");
        subject.doSomething();
    }
}
