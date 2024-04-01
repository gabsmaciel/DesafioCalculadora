package org.example.CalculadoraSimples;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class CalculadoraSimples {

    public static void CalculoSimples () {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à sua Calculadora\n");
        System.out.println("Escolha uma das seguintes operações: Somar, Subtrair, Dividir ou Multiplicar.");

        String operacaoEscolhida = scanner.next().toLowerCase();

        switch (operacaoEscolhida) {
            case "somar":
                somar(scanner);
                break;
            case "subtrair":
                subtrair(scanner);
                break;
            case "dividir":
                dividir(scanner);
                break;
            case "multiplicar":
                multiplicar(scanner);
                break;
            default:
                System.out.println("Operação inválida.");
        }

        scanner.close();
    }

    public static void somar(Scanner scanner) {
        try {
            System.out.println("Digite o primeiro número:");
            int numero1 = scanner.nextInt();
            System.out.println("Digite o segundo número:");
            int numero2 = scanner.nextInt();
            long resultado = numero1 + numero2;
            System.out.println("O seu resultado é " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar números válidos.");
        }
    }

    public static void subtrair(Scanner scanner) {
        try {
            System.out.println("Digite o primeiro número:");
            int numero1 = scanner.nextInt();
            System.out.println("Digite o segundo número:");
            int numero2 = scanner.nextInt();
            long resultado = numero1 - numero2;
            System.out.println("O seu resultado é " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar números válidos.");
        }
    }

    public static void dividir(Scanner scanner) {
        try {
            System.out.println("Digite o primeiro número:");
            int numero1 = scanner.nextInt();
            System.out.println("Digite o segundo número:");
            int numero2 = scanner.nextInt();
            if (numero2 == 0) {
                System.out.println("Erro: Divisão por zero não permitida.");
                return;
            }
            long resultado = numero1 / numero2;
            System.out.println("O seu resultado é " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar números válidos.");
        }
    }

    public static void multiplicar(Scanner scanner) {
        try {
            System.out.println("Digite o primeiro número:");
            int numero1 = scanner.nextInt();
            System.out.println("Digite o segundo número:");
            int numero2 = scanner.nextInt();
            long resultado = numero1 * numero2;
            System.out.println("O seu resultado é " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar números válidos.");
        }
    }
}