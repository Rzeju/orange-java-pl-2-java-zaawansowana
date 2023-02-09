package pl.sda.in_out.serializable;

import java.io.Serializable;

//Klasa Book implementuje Interface Serializable
//Umożliwia to serializacje/deserializację obiektów tej klasy
//Interafce Serializable jest interface'em znacznikowym - nie posiada metod
public class Book implements Serializable {

    //pola z danymi opisującymi obiekty typu Book
    private long id;
    private String title;
    private String author;

    //konstruktor klasy Book przyjmujący dane dla pól tworzonego obiektu
    public Book(long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    //getter dla pola id
    //zwraca wartość tego pola dla obiektu wywołującego tę metodę
    public long getId() {
        return id;
    }

    //setter dla pola id
    //ustawia nową wartość tego pola w obiekcie wywołującym tę metodę
    public void setId(long id) {
        this.id = id;
    }

    //getter dla pola title
    //zwraca wartość tego pola dla obiektu wywołującego tę metodę
    public String getTitle() {
        return title;
    }

    //setter dla pola title
    //ustawia nową wartość tego pola w obiekcie wywołującym tę metodę
    public void setTitle(String title) {
        this.title = title;
    }

    //getter dla pola author
    //zwraca wartość tego pola dla obiektu wywołującego tę metodę
    public String getAuthor() {
        return author;
    }

    //setter dla pola id
    //ustawia nową wartość tego pola w obiekcie wywołującym tę metodę
    public void setAuthor(String author) {
        this.author = author;
    }

    //metoda toString() jest nadpisana (@Override) z klasy Object
    //każdy obiekt w Javie niejawnie dziedziczy po klasie Object (każdy obiek jest obiektem)
    //metoda pozwala wypisać wartości pól dla danego obiektu
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
