package DesafioQuitandaDoSeuZe;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.*;

public class DIO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:

        double valorMorango = 2.5;
        double valorMaca = 1.8;

        if (morangos > 5) valorMorango = 2.2;
        if (macas > 5) valorMaca = 1.5;

        double valorAPagar = (macas*valorMaca) + (morangos*valorMorango);

        if (((morangos + macas) > 8) || (valorAPagar > 25)) {
            valorAPagar = valorAPagar * 0.9;
        }

        System.out.println(valorAPagar);

    }
}