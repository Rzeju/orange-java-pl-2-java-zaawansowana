package pl.sda.in_out.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathExample {

    public static void main(String[] args) throws IOException {

        Path rootPath = Paths.get("D:\\Dev\\SDA\\orange-java-pl-2-java-zaawansowana\\src\\pl\\sda\\in_out\\path");

        System.out.println(rootPath.getFileName());
        System.out.println(rootPath.getParent());
        System.out.println(rootPath.toAbsolutePath());
        System.out.println(rootPath.getFileSystem());

        String newFileName = "my_new_file.txt";
        Path newFile = Paths.get(rootPath.toAbsolutePath() + "\\" + newFileName);

        Files.createFile(newFile);
        Files.write(newFile, "A long time ago in a galaxy far, far away....".getBytes(), StandardOpenOption.WRITE);
        Files.write(newFile, "in a galaxy far, ".getBytes(), StandardOpenOption.APPEND);
        Files.write(newFile, "far away....\n".getBytes(), StandardOpenOption.APPEND);

        for (String line : Files.readAllLines(newFile)) {
            System.out.println(line);
        }

        Files.delete(newFile);

        Path path_dirs = Path.of(rootPath.toAbsolutePath().toString(), "dir_a", "dir_b");
        Files.createDirectories(path_dirs);

    }
}
