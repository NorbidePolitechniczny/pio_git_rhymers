package edu.kis.vh.nursery;

/** DefaultCountingOutRhymer
 * Klasa zajmująca się tablicą intów
 * Posiada metody takie jak:
 * Metoda dodająca element na koniec tablicy
 * Metoda usuwająca element z końca tablicy
 * Metoda sprawdzająca czy tablica jest pełna
 * Metoda sprawdzająca czy tablica jest pusta
 */

public class DefaultCountingOutRhymer {

    public static final int INT = -1;
    public static final int INT1 = 12;
    public static final int INT2 = 11;
    private final int[] numbers = new int[INT1];

    private int total = INT;
    /**
     * getter zmiennej prywatnej total
     * @return total
     */
    public int getTotal() {
        return total;
    }
    /**
     * Metoda dodająca element na koniec tablicy
     * @param in - element do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            this.numbers[++total] = in;
    }
    /**
     * Metoda sprawdzająca czy zmienna total jest równa -1 (const INT)
     * @return true lub false
     */
    public boolean callCheck() {
        return getTotal() == INT;
    }
    /**
     * Metoda sprawdzająca czy zmienna total jest równa 12 (const INT2)
     * @return true lub false
     */
    public boolean isFull() {
        return getTotal() == INT2;
    }
    /**
     * Metoda zwracająca ostatni element tablicy
     * @return int[ostatni_element] lub -1 jeżeli jest pusta
     */
    protected int getNumbers() {
        if (callCheck())
            return INT;
        return this.numbers[getTotal()];
    }
    /**
     * @return int[total -1] lub -1 jeżeli jest pusta
     */
    public int countOut() {
        if (callCheck())
            return INT;
        return this.numbers[total--];
    }

}
