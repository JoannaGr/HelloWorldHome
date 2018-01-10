package com.hello.world.home;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int[] grade1 = {1, 2, 3, 2, 5, 6};
        Student uczen1 = new Student("Asia", "Gr", grade1);
        System.out.println("Uczeń: " + uczen1.name + " " + uczen1.surname + ", srednia ocen: " + uczen1.getAvg() + ", najwyższa ocena: " + uczen1.getMax() + ", najniższa ocena: " + uczen1.getMin());

        int[] grade2 = {1, 2, 3, 4, 2};
        Student uczen2 = new Student("Jarek", "Gr", grade2);
        System.out.println("Uczeń: " + uczen2.name + " " + uczen2.surname + ", srednia ocen: " + uczen2.getAvg() + ", najwyższa ocena: " + uczen2.getMax() + ", najniższa ocena: " + uczen2.getMin() );



    }
}
