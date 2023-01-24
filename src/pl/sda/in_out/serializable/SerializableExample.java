package pl.sda.in_out.serializable;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializableExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

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
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);

        Object object_1 = objectInputStream.readObject();
        Object object_2 = objectInputStream.readObject();

        System.out.println(object_1);
        System.out.println( ((Book) object_2).toString() );

        Book loadedBook = (Book) object_2;
        System.out.println(loadedBook.getAuthor());

    }
}
