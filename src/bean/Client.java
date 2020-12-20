package bean;

import service.MyStack;

/**
 * 消费者
 */
public class Client {
    private MyStack myStack;

    public Client(MyStack myStack) {
        this.myStack = myStack;
    }

    public void getService() {
        System.out.println("get=" + myStack.get());
    }
}
