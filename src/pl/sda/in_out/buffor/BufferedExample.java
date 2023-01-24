package pl.sda.in_out.buffor;

import java.io.*;

public class BufferedExample {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("src/pl/sda/in_out/buffor/bufforReader.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("src/pl/sda/in_out/buffor/bufforWrite.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
            out.write(line);
            out.newLine();
        }

        out.flush();
    }
}
