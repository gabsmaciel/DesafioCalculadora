package org.example.CalculadoraDeNumeros;
import java.util.Scanner;
import java.lang.System;
public class CalculadoraDeNumeros {


    public static void Somar() {
        Scanner scannerQueSalvaDoisNumeros = new Scanner(System.in);
         Integer numero1 = scannerQueSalvaDoisNumeros.nextInt();
         Integer numero2 = scannerQueSalvaDoisNumeros.nextInt();
        System.out.println(numero1 + numero2);}


    public static void Subtrair() {
        Scanner scannerQueSalvaDoisNumeros = new Scanner(System.in);
        Integer numero1 = scannerQueSalvaDoisNumeros.nextInt();
        Integer numero2 = scannerQueSalvaDoisNumeros.nextInt();
        System.out.println(numero1 - numero2); }


    public static void Dividir() {
        Scanner scannerQueSalvaDoisNumeros = new Scanner(System.in);
        Integer numero1 = scannerQueSalvaDoisNumeros.nextInt();
        Integer numero2 = scannerQueSalvaDoisNumeros.nextInt();
        System.out.println(numero1 / numero2); }

    public static void Multiplicar() {
        Scanner scannerQueSalvaDoisNumeros = new Scanner(System.in);
        Integer numero1 = scannerQueSalvaDoisNumeros.nextInt();
        Integer numero2 = scannerQueSalvaDoisNumeros.nextInt();
        System.out.println(numero1 * numero2); }

    public static void Calculadora() {






}
}