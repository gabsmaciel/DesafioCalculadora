package org.example.CalculadoraDeGasolina;

import java.util.Scanner;

public class CalculadoraDeGasolina {

    public static void CalculadoraDeGasolina() {

        Scanner CalculoGasolina = new Scanner(System.in);
        System.out.println("Metodo usado apenas com Números");

        System.out.println("Quantos litros de gasolina o seu carro gasta por KM's?");
        double KMporLitro = CalculoGasolina.nextDouble();

        System.out.println("Quantos KM's você quer percorrer?");
        double km = CalculoGasolina.nextDouble();

        System.out.println("Qual valor atual da gasolina da sua região?");
        double ValordaGasolina = CalculoGasolina.nextDouble();

        double UsoDaGasolina = km / KMporLitro;
        double ValorPago = ValordaGasolina * UsoDaGasolina;
        System.out.printf("Você precisará de %.1f litros de gasolina para percorrer %.1f de km e irá gastar um valor de %.2f\n.", UsoDaGasolina, km, ValorPago);

        CalculoGasolina.close();
    }

}
