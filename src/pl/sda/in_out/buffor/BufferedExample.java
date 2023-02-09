package pl.sda.in_out.buffor;

import java.io.*;

public class BufferedExample {

    //wyjątki mogące wystąpić w tym przykładzie zostały oddelegowane do wywołujących metodę main - throws IOException
    //w takim przypadku nie musimy obsługiwać tych wyjątków w metodzie
    public static void main(String[] args) throws IOException {

        //Utworzenie obiektu BufferedReader. Posłuży on do odczytywania danych. Posiada buffor na te dane
        //Zwróć uwagę na obiekt typu FileReader przekazany w konstruktorze
        //Obiekt ten umożliwia odczytywane danych z pliku znajdującego się we wskazanej lokalizacji
        BufferedReader in = new BufferedReader(new FileReader("src/pl/sda/in_out/buffor/bufforReader.txt"));
        //Utworzenie obiektu BufferedWriter. Posłuży on do zapisu danych. Posiada buffor na te dane
        //Zwróć uwagę na obiekt typu FileWriter przekazany w konstruktorze
        //Obiekt ten umożliwia zapis danych do pliku znajdującego się we wskazanej lokalizacji
        BufferedWriter out = new BufferedWriter(new FileWriter("src/pl/sda/in_out/buffor/bufforWrite.txt"));

        //Zmienna przechowująca kolejną linię danych odczytanych z pliku
        String line;
        //Pętla odczytująca dane linia po linii
        //Metoda readLine() zwraca null w momencie dojścia do końca pliku
        while ((line = in.readLine()) != null) {
            //Wyświetlenie aktualnie odczytanej linii
            System.out.println(line);
            //Zapis odczytanej linii do pliku docelowego
            out.write(line);
            //Przejście do kolejnej linii w pliku docelowego
            //Metoda readLine() odczytująca dane nie zwraca znaku nowej linii
            out.newLine();

        }

        //Wysłanie danych z buffora do pliku docelowego
        out.flush();

    }
}
