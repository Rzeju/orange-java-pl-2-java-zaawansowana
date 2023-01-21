package pl.sda.in_out;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InOutExample {

    public static void main(String[] args) {

        FileInputStream in;
        FileOutputStream out;

        try {
            in = new FileInputStream("src/pl/sda/resources/user.txt");
            out = new FileOutputStream("src/pl/sda/resources/user_output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem z dostępem do pliku: " + e.getMessage());
        }
    }
}
