package Homework;


import java.util.random.RandomGenerator;

public class StringHomework {
    public static void main(String[] args) {
        uniqueEmail("michal@gmail.com");
        uniqueEmail("alalala");
        uniqueEmail("L@com.pk");
        uniqueEmail("michal@gmail.com");

    }
    public static String uniqueEmail(String userEmail) {
        if (userEmail == "michal@gmail.com") {
            int min = 100000;
            int max = 999999;
            int randomInt = RandomGenerator.getDefault().nextInt(min, max);
            System.out.println("michał +" + randomInt + "@gmail.com");


        }

        return "Email not proper";


        }
    }



//W klasie StringHomework napisz funkcję, która jako parametr przyjmie maila i
//zwróci maila unikalnego:
//public String uniqueEmail(String userEmail) {
// return ""; // to do zmiany
//}
//Funkcja dla maila michal@gmail.com ma zwrócić michal+123456@gmail.com gdzie
//123456 ma być losową liczbą z przedziału od 100_000 do 999_999. Przetestuj
//funkcję w public static void main dla paru emaili.
//Podpowiedź: użyj funkcji split() oraz randInt()



//public class Randomizer {
//    public static int generate(int min, int max) {
//        return min + (int)(Math.random() * ((max - min) + 1));
//    }
//}