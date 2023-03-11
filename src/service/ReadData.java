package service;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {

    public void readMethod(PipedInputStream inputStream) {
        try {
            System.out.println("read :")
            ;
            byte[] bytes = new byte[20];
            int read = inputStream.read(bytes);
            if (read != -1) {
                String newString = new String(bytes, 0,read);
                System.out.println(newString);
            }
            System.out.println();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
