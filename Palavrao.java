package com.br.alura;

import java.util.Scanner;

public class Palavrao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = "";

        do {
            System.out.println("Digite uma palavra: ");
            palavra = sc.next().toLowerCase();

            if (palavra.length() > 20) {
                System.out.println("Informe uma palavra com até 20 caracteres");
            } else if (palavra.length() < 10) {
                System.out.println("palavrinha");
            } else {
                System.out.println("palavrao");
            }

        } while (palavra.length() > 20);
    }

}
