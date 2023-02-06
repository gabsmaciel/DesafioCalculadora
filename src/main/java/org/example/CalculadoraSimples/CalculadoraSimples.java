package org.example.CalculadoraSimples;
import java.util.Locale;
import java.util.Scanner;
public class CalculadoraSimples {



    public static void CalculoSimples () {

        Locale.setDefault(Locale.US);
        System.out.println("Bem-vindo a sua Calculadora\n");
        System.out.println("Escolha uma das seguintes operações: Somar, Subtrair, Dividir ou Multiplicar.");
        Scanner Operacoes = new Scanner(System.in);
        String OperacaoEscolhida = Operacoes.next();
        System.out.println("Somar");
        System.out.println("Subtrair");
        System.out.println("Dividir");
        System.out.println("Multiplicar");

        switch (OperacaoEscolhida) {
            case "Somar" -> Somar();
            case "Subtrair" -> Subtrair();
            case "Dividir" -> Dividir();
            case "Multiplicar" -> Multiplicar();
        }

    }
    public static void Somar() {
                Scanner scannerQueSalvaDoisNumeros = new Scanner(System.in);
                Integer numero1 = scannerQueSalvaDoisNumeros.nextInt();
                Integer numero2 = scannerQueSalvaDoisNumeros.nextInt();
                long resultado = numero1 + numero2;
                System.out.println("O seu resultado é " + resultado);
    }


    public static void Subtrair() {
                Scanner scannerQueSalvaDoisNumeros = new Scanner(System.in);
                Integer numero1 = scannerQueSalvaDoisNumeros.nextInt();
                Integer numero2 = scannerQueSalvaDoisNumeros.nextInt();
                long resultado = numero1 - numero2;
               System.out.println("O seu resultado é " + resultado);
    }

    public static void Dividir() {
                Scanner scannerQueSalvaDoisNumeros = new Scanner(System.in);
                Integer numero1 = scannerQueSalvaDoisNumeros.nextInt();
                Integer numero2 = scannerQueSalvaDoisNumeros.nextInt();
                long resultado = numero1 / numero2;
                System.out.println("O seu resultado é " + resultado);
    }

     public static void Multiplicar() {
                Scanner scannerQueSalvaDoisNumeros = new Scanner(System.in);
                Integer numero1 = scannerQueSalvaDoisNumeros.nextInt();
                Integer numero2 = scannerQueSalvaDoisNumeros.nextInt();
                long resultado = numero1 * numero2;
                System.out.println("O seu resultado é " + resultado);
    }


}


