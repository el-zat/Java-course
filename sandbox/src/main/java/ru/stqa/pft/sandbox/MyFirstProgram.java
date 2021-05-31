package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("User");
        hello("Elena");

        double len = 5;
        System.out.println("Площадь квадрата " +
                "" + len + " = " + area(len));
    }
    public static void hello(String somebody){
        System.out.println("Hello, "+somebody+"!");
    }

    public static double area(double l) {
        return l * l;
    }

    public static double area (double a, double b) {
        return a * b;
    }

}
