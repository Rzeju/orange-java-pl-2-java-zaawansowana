package pl.sda.exceptions;

import java.io.FileNotFoundException;

public class ExceptionTest {

    public static int testException(int[] array, int index) throws FileNotFoundException {

        int result = array[index];

        return result;
    }
}
