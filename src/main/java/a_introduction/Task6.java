package a_introduction;

public class Task6 {
    public static void main(String[] args) {
        double alcoholContent = 5.5;
        final String beerType = alcoholContent >= 4 ? "mocne" :"słabe";
        System.out.println(beerType);
    }}






//Użyj ternary operatora żeby zapisać krócej:
//
//```java
//double alcoholContent = 5.5;
//String beerType;
//if (alcoholContent >= 4) {
//    beerType = "mocne";
//}
//else {
//    beerType = "słabe";
//}
//```