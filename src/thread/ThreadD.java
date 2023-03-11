package thread;

public class ThreadD extends Thread {
    private Object lock;

    public ThreadD(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            lock.notifyAll();
        }
    }
}
