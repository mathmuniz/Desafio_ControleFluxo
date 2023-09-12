package com.mtmuniz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int numberOne = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int numberTwo = scanner.nextInt();

        try {
            contar(numberOne, numberTwo);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int numberOne, int numberTwo) throws ParametrosInvalidosException {

        if (numberOne > numberTwo) {
            throw new ParametrosInvalidosException();
        }

        int contagem = numberTwo - numberOne;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}