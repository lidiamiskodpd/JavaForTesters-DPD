package a_introduction;

public class Task12 {
    public static void main(String[] args) {
        getQuadrant(2, 3);
        getQuadrant(-2, -3);
        getQuadrant(-2, 2);
        getQuadrant(2, -3);
        getQuadrant(0, 0);

    }

    public static void getQuadrant(int x, int y) {
        if ((x>0) && (y >0)) {
            System.out.println("Quarter 1");
        }
        else if ((x > 0) && (y < 0)) {

            System.out.println("Quarter 2");
        }
        else if ((x < 0) && (y < 0)) {
            System.out.println("Quarter 3");

        }
        else if ((x < 0) && (y > 0)) {
            System.out.println("Quarter 4");

        }
        else System.out.println("Not in Quarter");

}}


//Metod `getQuadrant()` ma przyjąć dwa parametry, współrzędne x
// oraz y punktu na osi współrzędnych. Ma zwrócić (użyj funkcji switch)
// numer ćwiartki na układzie współrzędnych.
//
//![Wyjaśnienie zadania 12](../../resources/images/quarters.png)