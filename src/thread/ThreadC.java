package thread;

import service.Service;

public class ThreadC extends Thread {
    private Object lock;

    public ThreadC(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

    }
}
