package test;

import service.Singleton;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Run {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock(true);
        System.out.println(Singleton.INSTANCE.whatever());
        Callable callable = () -> null;
        AtomicInteger integer =new AtomicInteger(1);
        integer.addAndGet(2);
        Lock lock1 = new Lock() {
            @Override
            public void lock() {

            }

            @Override
            public void lockInterruptibly() throws InterruptedException {

            }

            @Override
            public boolean tryLock() {
                return false;
            }

            @Override
            public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public void unlock() {

            }

            @Override
            public Condition newCondition() {
                return null;
            }
        };
    }
}
