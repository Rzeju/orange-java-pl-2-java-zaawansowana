package pl.sda.in_out.buffor;

import java.nio.CharBuffer;
import java.util.Arrays;

public class BufferExample {

    public static void main(String[] args) {

        CharBuffer buffer = CharBuffer.allocate(8);
        String text = "String";
        System.out.println("Input text: " + text);

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            buffer.put(c);
        }

        System.out.println("Buffer data: " + Arrays.toString(buffer.array()));

        System.out.println(buffer.position());
        buffer.append('!');
        buffer.append('?');
        System.out.println(buffer.position());

        buffer.clear();
        buffer.put("NewIn");
        System.out.println(buffer.position());
        System.out.println(Arrays.toString(buffer.array()));
    }
}
