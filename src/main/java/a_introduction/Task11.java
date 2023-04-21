package a_introduction;

public class Task11 {
    public static void main(String[] args) {
        boolean test3 = validateSumWithDiscount(10, 10, 6, 200);
        System.out.println(test3);
    }

    public static boolean validateSumWithDiscount(int pcs, double price, double discount, double expectedSum) {

        expectedSum = (pcs * price) - (((pcs * price) * discount )/100);
        System.out.println(expectedSum);
        return false;
    }
}



//Metoda ma przyjąć cztery parametry (liczbę, cenę jednostkową, rabat oraz spodziewaną kwotę
// do drugiego miejsca po przecinku) Liczba produktów (pcs)
// pomnożona przez cenę jednostkową (price) minus rabat procentowy
// od całości ma być równa oczekiwanej sumie. Metoda ma zwrócić true
// (kwota się zgadza) lub false (kwota się nie zgadza)
//
//Podpowiedź: Użyj Math.round() do zaokrąglenia porównywanych kwot do jednego grosza.
//
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html#round(double)
//```java
//public static boolean validateSumWithDiscount(int pcs, double price, double discount, double expectedSum)
//```