package a_introduction;

import java.time.Year;

public class Task8 {

    public static void main(String[] args) {
        calculatePrice(10, 0.2);

    }

    public static double calculatePrice(int price, double discount) {
        double result = price - (price * discount);
        System.out.println(result);
        return result;

    }

}


//Napisz metodę, która zwróci wartość ceny `price` po rabacie `discount`. Rabat ma być podany jako liczba zmiennoprzecinkowa (20% rabatu będzie przekazane jako wartość 0.2)
//```java
//public static double calculatePrice(int price, double discount) {}
//```