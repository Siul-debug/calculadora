/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author luism
 */

public class Calculadora {

    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double numero1 = calculadora.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double numero2 = calculadora.nextDouble();

        System.out.println("Seleccione una operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

        System.out.println("Ingrese el número de la operacion: ");
        int opcion = calculadora.nextInt();

        double resultado;

        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("El resultado de la division es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opcion no válida. Por favor, seleccione una opcion del 1 al 4.");
        }

        calculadora.close();
    }
}