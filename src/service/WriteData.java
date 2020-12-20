package service;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {
    public void writeMethod(PipedOutputStream outputStream) {
        try {
            System.out.println("write :");
            String str = "你好！世界";
            outputStream.write(str.getBytes());
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
