package pl.sda.in_out;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteReadExample {

    //wyjątki mogące wystąpić w tym przykładzie zostały oddelegowane do wywołujących metodę main - throws IOException
    //w takim przypadku nie musimy obsługiwać tych wyjątków w metodzie
    public static void main(String[] args) throws IOException {

        //Utworzenie obiektu FileReader. Posłuży on do odczytywania danych z pliku
        FileReader reader = new FileReader("src/pl/sda/in_out/reader_file.txt");
        //Utworzenie obiektu FileWriter. Posłuży on do zapisywania danych do pliku
        FileWriter writer = new FileWriter("src/pl/sda/in_out/writer_file.txt");

        //zmienna przechowująca kolejny znak odczytany z pliku
        int nextChar;
        //pętla while odczytuje kolejne znaki z pliku aż do końca tego pliku
        //w przypadku dotarcia do końca tego pliku metoda read() zwraca -1
        while ((nextChar = reader.read()) != -1) {
            //dodanie kolejnego znaku do zapisu
            writer.append((char) nextChar);
        }

        //przesłanie danych do pliku docelowego
        writer.flush();
    }
}
