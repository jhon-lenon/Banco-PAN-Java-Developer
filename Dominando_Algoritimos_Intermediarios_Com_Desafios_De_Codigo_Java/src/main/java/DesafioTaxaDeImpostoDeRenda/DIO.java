package DesafioTaxaDeImpostoDeRenda;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.io.IOException;
import java.util.Scanner;

public class DIO {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto;

        //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:

        if (renda <= 2000) {
            System.out.println("Isento");
        } else if (renda <= 3000) {
            imposto = (renda - 2000) * 0.08;
            System.out.println(String.format("R$ %.2f", imposto));
        } else if (renda <= 4500) {
            imposto = ((renda - 3000) * 0.18) + (0.08 * 1000);
            System.out.println(String.format("R$ %.2f", imposto));
        } else {
            imposto = ((renda - 4500) * 0.28) + (0.08 * 1000) + (0.18 * 1500);
            System.out.println(String.format("R$ %.2f", imposto));
        }

    }

}
