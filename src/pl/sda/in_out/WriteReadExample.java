package pl.sda.in_out;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteReadExample {

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("src/pl/sda/in_out/reader_file.txt");
        FileWriter writer = new FileWriter("src/pl/sda/in_out/writer_file.txt");

        int nextChar;
        while ((nextChar = reader.read()) != -1) {
            writer.append((char) nextChar);
        }

        writer.flush();
    }
}
