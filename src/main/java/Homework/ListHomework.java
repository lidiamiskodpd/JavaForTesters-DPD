package Homework;

import java.util.Collections;
import java.util.List;

public class ListHomework {
    public static void main(String[] args) {

        List<String> ListA = List.of("Asia", "Basia", "Kasia");
        List<String> ListB = List.of("Asia", "Basia", "Kasia");

       areListEqual(ListA, ListB);
       areListEquivalent(ListA,ListB);


    }


    public static boolean areListEqual(List<String> listA, List<String> listB) {
        for (int i = 0; i < listA.size(); i++) {
            if (listA.equals(listB)) {

                System.out.println("Listy są takie same: " + listA);
                return true;
            }}
        System.out.println("Listy nie są takie same. Lista A: " + listA + " Lista B: " + listB);
            return false;
        }

           // else return false;


    public static boolean areListEquivalent(List<String> listA, List<String> listB) {
        for (int i = 0; i < listA.size(); i++) {
            if (listA.containsAll(listB)) {
                System.out.println("Listy zawierają te same elementy: " + listA);
                return true;
            }}
        System.out.println("Listy zawierają inne elementy");
        return false;
    }

}






//W klasie ListHomework napisz funkcję, która jako parametr przyjmie dwie Listy
//stringów i sprawdzi czy ich elementy w środku są takie same.
//public boolean areListEqual(List<String> listA, List<String> listB) {
// return true; // to do zmiany
//}
//Dla dwóch list (“Asia”, “Basia”, “Kasia”) zwraca true.
//Listy (“Asia”, “Basia”, “Kasia”) i (“Asia”, “Kasia”, “Basia”) zwracają false.

//Dodaj funkcję w klasie ListHomework (tej samej co w zadaniu 4)
//public boolean areListEquivalent(List<String> listA, List<String> listB) {
//return true; // to do zmiany
//}
//Lista (“Asia”, “Basia”, “Kasia”) i lista (“Basia”, “Kasia”, “Asia”) zwracają true (kolejność
//elementów w tej kolekcji nie ma znaczenia).