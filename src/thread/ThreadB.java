package thread;

import bean.Producer;

/**
 * 生产者线程
 */
public class ThreadB extends Thread {
    private Producer producer;

    public ThreadB(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        //while (true) {
        producer.pushService();
        //}

    }
}
