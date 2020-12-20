package thread;

import bean.Client;

/**
 * 消费者线程
 */
public class ThreadA extends Thread {
    private Client client;

    public ThreadA(Client client) {
        this.client = client;
    }

    @Override
    public void run() {
        // while (true) {
        client.getService();
        //}
    }
}
