package pl.sda.in_out.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathExample {

    //wyjątki mogące wystąpić w tym przykładzie zostały oddelegowane do wywołujących metodę main - throws IOException
    //w takim przypadku nie musimy obsługiwać tych wyjątków w metodzie
    public static void main(String[] args) throws IOException {

        //Utworzenie obiektu typu Path na podstawie przekazanej ścieżki
        //Zwróć uwagę na przekazaną ścieżkę. Zawiera on lokalizację, w której znajduje się ta klasa i odnosi się do struktury katalogowej tego projektu
        //Ścieżka ta, może mieć różne formy. Poniżej znajduje się ścieżka absolutna wskazująca na konkretne miejsce na moim dysku
        //  "D:\\Dev\\SDA\\orange-java-pl-2-java-zaawansowana\\src\\pl\\sda\\in_out\\path"
        Path rootPath = Paths.get("src\\pl\\sda\\in_out\\path");

        //Wyświetlenie nazwy pliku w utworzonej ścieżce (ostatni katalog)
        System.out.println(rootPath.getFileName());
        //Wyświetlenie katalogów nadrzędnych dla pliku
        System.out.println(rootPath.getParent());
        //Wyświetlenie ścieżki absolutnej
        System.out.println(rootPath.toAbsolutePath());
        //Wyświetlenie systemu plików dla utworzonej ścieżki
        System.out.println(rootPath.getFileSystem());

        //zmienna z nazwą pliku tekstowego
        String newFileName = "my_new_file.txt";
        //utworzenie nowej ścieżki poprzez dodanie nazwy pliku do ścieżki utworzonej powyżej
        Path newFile = Paths.get(rootPath.toAbsolutePath() + "\\" + newFileName);

        //Utworzenie pliku w lokalizacji wskazanej przez obiekt Path
        Files.createFile(newFile);
        //Dodanie tekstu do utworzonego pliku
        Files.write(newFile, "A long time ago in a galaxy far, far away....".getBytes(), StandardOpenOption.WRITE);
        //Dodanie kolejnego tekstu do pliku
        Files.write(newFile, "in a galaxy far, ".getBytes(), StandardOpenOption.APPEND);
        //Dodanie kolejnego tekstu do pliku
        Files.write(newFile, "far away....\n".getBytes(), StandardOpenOption.APPEND);

        //Wyświetlenie zawartości pliku pętlą foreach
        for (String line : Files.readAllLines(newFile)) {
            //Wyświetlenie kolejnej linii
            System.out.println(line);
        }

        //Usunięcie utworzonego pliku
        Files.delete(newFile);

        //Utworzenie ścieżki dla nowych katalogów znajdujących się w pakiecie path
        Path path_dirs = Path.of(rootPath.toAbsolutePath().toString(), "dir_a", "dir_b");
        //Utworzenie nowych katalogów pod wskazaną ścieżką
        Files.createDirectories(path_dirs);
    }
}
