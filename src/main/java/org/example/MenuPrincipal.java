package org.example;

import org.example.CalculadoraDeGasolina.CalculadoraDeGasolina;
import org.example.CalculadoraDeImc.CalculadoraDeImc;
import org.example.CalculadoraDeImpostos.CalculadoraDeImpostos;
import org.example.CalculadoraSimples.CalculadoraSimples;

import java.util.Scanner;


public class MenuPrincipal {
    public static void chamaMenuPrincipal() {
        System.out.println("Bem-vindo a sua Calculadora\n");
        Scanner MenuInicial = new Scanner(System.in);
        int opcao;
        System.out.println("Escolha sua calculadora");
        System.out.println("(1) Calculadora de IMC");
        System.out.println("(2) Calculadora de Números");
        System.out.println("(3) Calculadora de Gasolina");
        System.out.println("(4) Calculadora de Impostos");
        opcao = MenuInicial.nextInt();

        switch (opcao) {


            case 1:
                CalculadoraDeImc.IMC();
                break;

            case 2:
                CalculadoraSimples.CalculoSimples();
                break;

            case 3:
                CalculadoraDeGasolina.CalculadoraDeGasolina();
                break;

            case 4:
                CalculadoraDeImpostos.CalculoDeImpostos();
                break;

            default:
                System.out.print("Você digitou uma operação inválida.");
        }

    }
}


