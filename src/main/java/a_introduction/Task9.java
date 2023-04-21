package a_introduction;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(minFrom(10, 20, 3));
    }


    public static double minFrom(double a, double b, double c) {
        if ((a > b) & (a > c)) {

            return a;
        }
        else if (b > c) {

            return b;

        }

        else{

            return c;
        }
    }

}


//Napisz metodę, która przyjmuje trzy liczby (a, b oraz c) i zwraca największą z nich.
//```java
//public static double minFrom(double a, double b, double c) {}
//```
//
//### Task 10