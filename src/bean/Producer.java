package bean;

import service.MyStack;

/**
 * 生产者
 */
public class Producer {
    private MyStack myStack;

    public Producer(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
