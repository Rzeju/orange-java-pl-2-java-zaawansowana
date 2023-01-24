package pl.sda.in_out.serializable;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializableExample {

    public static void main(String[] args) throws IOException {

        //obiekty typu Book
        Book book_1 = new Book(1L, "BOOK", "Author");
        Book book_2 = new Book(2L, "Note", "Some guy");

        Path path = Paths.get("D:\\Dev\\SDA\\orange-java-pl-2-java-zaawansowana\\src\\pl\\sda\\in_out\\serializable\\object_output.txt");
        File file = new File(path.toUri());

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

        objectOutputStream.writeObject(book_1);
        objectOutputStream.writeObject(book_2);

        objectOutputStream.flush();
    }
}
