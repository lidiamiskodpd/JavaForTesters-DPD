package a_introduction;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
    String imie = scanner.nextLine();


       // int wiek = 10;
        System.out.println("Podaj wiek");
        int wiek = scanner.nextInt();

        if (wiek >= 18) {
            System.out.println(imie + " ma " + wiek + " i jest pełnoletni");
        }
            else {
                System.out.println(imie + " ma " + wiek + " i nie jest pełnoletni");
            }

        }
    }



//Stwórz dwie zmienne:
//- String imie
//- int wiek
//
//Wydrkuj napis w postaci "Imię, ma x lat i jest/nie jest pełnoletni" w zależności od podanego parametru wieku.