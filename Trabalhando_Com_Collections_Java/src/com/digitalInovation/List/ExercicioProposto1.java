package com.digitalInovation.List;

/*
TODO: Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
TODO: Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
TODO: e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            System.out.println("digite a temperatura do mês " + i);
            double temp = scan.nextDouble();
            temperaturas.add(temp);
        }

        System.out.println("\n------------\n");

        System.out.println("Listando as temperaturas:");
        System.out.println(temperaturas);

        System.out.println("\nMédia da temperatura semestral:");
        double soma = 0;
        double media = 0;
        for (int i = 0; i < temperaturas.size(); i++) {
            soma += temperaturas.get(i);
        }
        System.out.printf("%.1f\n", media = soma/temperaturas.size());

//        media = temperaturas.stream()
//                .mapToDouble(Double::doubleValue)
//                .average()
//                .orElse(0d);
//        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        System.out.println("\nTemperaturas acima dá média:");
        for (int i = 0; i < temperaturas.size(); i++) {
            temperaturas.get(i);
            if (temperaturas.get(i) > media) {
                switch (i) {
                    case 0:
                        System.out.printf("1 - janeiro: %.1f\n ", temperaturas.get(i));
                        break;
                    case 1:
                        System.out.printf("2 - fevereiro: %.1f\n ", temperaturas.get(i));
                        break;
                    case 2:
                        System.out.printf("3 - março: %.1f\n ", temperaturas.get(i));
                        break;
                    case 3:
                        System.out.printf("4 - abril: %.1f\n ", temperaturas.get(i));
                        break;
                    case 4:
                        System.out.printf("5 - mail: %.1f\n ", temperaturas.get(i));
                        break;
                    case 5:
                        System.out.printf("6 - junho: %.1f\n ", temperaturas.get(i));
                        break;
                    default:
                        System.out.printf("Não ouve temperaturas acima da média!");
                }
            }
        }



    }
}
