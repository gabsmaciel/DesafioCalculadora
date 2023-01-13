package org.example.CalculadoraDeImc;
import java.util.Scanner;
import java.lang.System;
public class CalculadoraDeImc {
    public static void IMC()  {

        Scanner scannerDeImc = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double peso = scannerDeImc.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = scannerDeImc.nextDouble();

        double IMC = (peso/(altura * altura));
        System.out.printf ("O seu IMC é de %.2f"+"\n", IMC);

        if (IMC < 18.5)
            System.out.println("Sua Classificação é de Magreza");
        else if ((IMC > 18.5) && (IMC < 24.9))
            System.out.println("Sua Classificação Está Dentro do Normal");
        else if ((IMC > 25.0) && (IMC < 29.9))
            System.out.println("Sua Classificação é de Sobrepeso I");
        else if ((IMC > 30.0) && (IMC < 34.9))
            System.out.println("Sua Classificação é Obesidade II");
        else if (IMC >= 40)
            System.out.println("Sua Classificação é Obesidade Grave III");

        scannerDeImc.close();

    }

}
