package org.example.CalculadoraDeImpostos;
import java.util.Scanner;

public class CalculadoraDeImpostos {

    public static void CalculoDeImpostos() {


        System.out.println("Bem-vindo a sua Calculadora\n");
        System.out.println("Por favor, digite sua renda mensal bruta: ");
        Scanner Renda = new Scanner(System.in);
        double Salario = Renda.nextDouble();


        if (Salario < 1903.98) {
            System.out.println("Você é isento do Imposto de Renda.");

        } else if (Salario >= 1903.98 && Salario < 2826.65) {

            double Taxa = Salario * 0.075;
            double Liquido = Salario - Taxa;
            System.out.printf("Você pagará de imposto %.2f e receberá o salário líquido de %.2f.", Taxa, Liquido);
        } else if (Salario >= 2826.66 && Salario < 3751.05) {
            double Taxa = Salario * 0.15;
            double Liquido = Salario - Taxa;
            System.out.printf("Você pagará de imposto %.2f e receberá o salário líquido de %.2f.", Taxa, Liquido);

        } else if (Salario >= 3751.06 && Salario < 4664.68) {
            double Taxa = Salario * 0.225;
            double Liquido = Salario - Taxa;
            System.out.printf("Você pagará de imposto %.2f e receberá o salário líquido de %.2f.", Taxa, Liquido);

        } else if (Salario >= 4664.68) {
            double Taxa = Salario * 0.227;
            double Liquido = Salario - Taxa;
            System.out.printf("Você pagará de imposto %.2f e receberá o salário líquido de %.2f.", Taxa, Liquido);
        }

    }

}







