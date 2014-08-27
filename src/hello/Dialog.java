package hello;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Nikita on 27.08.2014.
 */
public class Dialog {
    public void write() {
        System.out.println("Input String");
        try {
            byte[] inputData = new byte[50];
            int strLength = System.in.read(inputData);
            String str = new String(Arrays.copyOf(inputData, strLength));
            System.out.println("You input: " + str + "String length: " + strLength);
        } catch  (IOException e) {
            System.out.println("Input ERROR");
        }
    }
}
