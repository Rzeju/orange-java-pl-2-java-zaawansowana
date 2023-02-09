package pl.sda.in_out.serializable;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

//Przykład serializacji i deserializacji obiektów
public class SerializableExample {

    //wyjątki mogące wystąpić w tym przykładzie zostały oddelegowane do wywołujących metodę main - throws IOException, ClassNotFoundException
    //w takim przypadku nie musimy obsługiwać tych wyjątków w metodzie
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //utworzenie obiektów typu Book
        Book book_1 = new Book(1L, "BOOK", "Author");
        Book book_2 = new Book(2L, "Note", "Some guy");

        //utworzenie obiektu typu Path zawierający ścieżkę do pliku tekstowego
        //w tym pliku zapiszemy utworozne obiekty
        Path path = Paths.get("src\\pl\\sda\\in_out\\serializable\\object_output.txt");
        //Utworzenie obiektu File na podstawie ścieżki do pliku
        File file = new File(path.toUri());

        //Przygotowanie bufforowanego strumienia, zapisującego obiekty do pliku - serializacja
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

        //przekazanie obiektów do strumienia wyjściowego - przykład serializacji (obiekty są zamieniane na strumień bajtów)
        objectOutputStream.writeObject(book_1);
        objectOutputStream.writeObject(book_2);

        //strumień wysyła dane do pliku
        objectOutputStream.flush();
        //zamknięcie strumienia
        objectOutputStream.close();

        //Przygotowanie bufforowanego strumienia, odczytującego obiekty z pliku - deserializacja
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);

        //odczytanie obiektów z pliku
        Object object_1 = objectInputStream.readObject();
        Object object_2 = objectInputStream.readObject();

        //wyświetlenie obiektów odczytanych z pliku
        //zapis i odczyt przebiegły poprawnie. Odczytane dane są zgodne z danymi użytymi do utworzeniach tych obiektów
        System.out.println(object_1);
        System.out.println(object_2.toString() );

        //rzutowanie odczytanego obiektu na klasę Book i wywołanie gettera
        Book loadedBook = (Book) object_2;
        System.out.println(loadedBook.getAuthor());

    }
}
