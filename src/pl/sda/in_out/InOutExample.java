package pl.sda.in_out;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InOutExample {

    public static void main(String[] args) {

        //deklaracje zmiennej typu FileInputStream
        FileInputStream in;
        //deklaracje zmiennej typu FileOutputStream
        FileOutputStream out;

        try {
            //inicjalizacja zmienny 'in' oraz 'out'
            //użyte tutaj konstruktory mogą rzucić wyjątek - wyjątki z grupy checked
            //Wyjątki z tej grupy musimy jakoś obsłużyć
            //W tym przypadku przechwytujemy je w blokach catch i wypisujemy na ekranie informacje
            //Można również przekazać je wyżej. W tym celu należy dodać do sygnatury metody informacje, iż może ona rzucać te wyjątki
            //W tym przypadku taką deklaracje umieścilibyśmy przy metodzie main()
            //W pozostałych przykładach ze strumieniami wejścia/wyjścia będzie przekazywać wyjątki wyżej
            in = new FileInputStream("src/pl/sda/resources/user.txt");
            out = new FileOutputStream("src/pl/sda/resources/user_output.txt");

            int c;
            //pętla odczytująca kolejne bajty z pliku user.txt i zapisująca je do pliku wynikowego user_output.txt
            //metoda read() czyta kolejne bajty (znaki tekstowe) aż do napotkania końca pliku (wtedy zwraca -1)
            while ((c = in.read()) != -1) {
                //zapisanie kolejnego bajtu do pliku wynikowego
                out.write(c);
            }
        //przechwycenie wyjątków, które mogą wystąpić podczas próby dostępu do plików
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem z dostępem do pliku: " + e.getMessage());
        }
    }
}
