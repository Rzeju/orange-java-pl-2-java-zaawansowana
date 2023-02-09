package pl.sda.exceptions;

public class ExceptionTest {

    //metoda statyczna zwracająca element o wskazanym indexie z przekazanej do tej metody tablicy
    public static int testException(int[] array, int index) throws IndexOutOfBoundsException {

        //przypisanie do zmiennej result elementu z tablicy znajdującego się pod wskaznaym indexem
        int result = array[index];

        //metoda zwraca wynik
        return result;
    }
}
