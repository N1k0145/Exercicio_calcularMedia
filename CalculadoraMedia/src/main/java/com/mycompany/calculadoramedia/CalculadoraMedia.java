package com.mycompany.calculadoramedia;

public class CalculadoraMedia {

    double num1;
    double num2;
    double num3;

    public void calcularMedia() {
        double media = (num1 + num2 + num3) / 3;

        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Numero 3: " + num3);
        System.out.println("Media: " + media);
    }

    public static void main(String[] args) {
        CalculadoraMedia calc = new CalculadoraMedia();

        calc.num1 = 7;
        calc.num2 = 8;
        calc.num3 = 9;
        calc.calcularMedia();
    }
}