package service;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private final List<String> list = new ArrayList<>();

    /**
     * 生产商品方法
     */
    synchronized public void push() {
        try {
            while (list.size() == 1) {//堆栈的最大值为1，如果list的大小为1,则无法push
                System.out.println("push操作中的" + Thread.currentThread().getName() + "线程呈wait状态");
                this.wait();
            }
            list.add("anyString=" + Math.random());//装载商品
            this.notifyAll();//唤醒其它线程取走商品
            System.out.println("push=" + list.size());//打印list的大小
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String get() {
        String returnValue = "";
        try {
            while (list.size() == 0) {//如果没有商品继续等待
                System.out.println("get操作中的" + Thread.currentThread().getName() + "线程呈wait状态");
                this.wait();
            }
            returnValue = " " + list.get(0);
            list.remove(0);
            this.notifyAll();
            System.out.println("get=" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
