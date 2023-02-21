package com.Desafio2_Imprimindo_Primitivos_E_Media;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.


import java.io.IOException;
import java.util.Scanner;

public class DIO {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0; //valores positivos
        double media = 0;
        double somaDosPositivos = 0;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:

        double[] valores = new double[6];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = leitor.nextDouble();
            if (valores[i] > 0) {
                somaDosPositivos += valores[i];
                cont++;
            }
            media = somaDosPositivos/cont;
        }


        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }

}
