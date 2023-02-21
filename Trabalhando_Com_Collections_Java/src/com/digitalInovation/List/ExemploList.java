package com.digitalInovation.List;

//TODO: Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//TODO: ("Crie uma lista e adicione as sete notas: ");
//TODO: ("Exiba a posição da nota 5.0: ");
//TODO: ("Adicione na lista a nota 8.0 na posição 4: ");
//TODO: ("Substitua a nota 5.0 pela nota 6.0: ");
//TODO: ("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
//TODO: ("Exiba a terceira nota adicionada: " + notas.get(2));
//TODO: ("Exiba a menor nota: " + Collections.min(notas));
//TODO: ("Exiba a maior nota: " + Collections.max(notas));
//TODO: ("Exiba a soma dos valores: " + soma);
//TODO: ("Exiba a média das notas: " + (soma/notas.size()));
//TODO: ("Remova a nota 0: ");
//TODO: ("Remova a nota da posição 0");
//TODO: ("Remova as notas menores que 7 e exiba a lista: ");
//TODO: ("Confira se a lista está vazia: " + notas.isEmpty());

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("\nExiba a posição da nota 5.0: ");
        System.out.println("A nota 5.0 está na posição: " + notas.indexOf(5.0));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(3, 6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: ");
        System.out.println(notas.contains(5.0));

        System.out.println("\nExiba todas as notas na ordem em que foram informadas: ");
        for (double nota: notas) {
            System.out.print(nota + ", ");
        }

        System.out.println("\nExiba a terceira nota adicionada: ");
        System.out.println(notas.get(2));

        System.out.println("\nExiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("\nExiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println("\nExiba a soma dos valores: ");
        double soma = 0;
        for (int i = 0; i < notas.size(); i++) {
            soma += notas.get(i);
        }
        System.out.println(soma);

        System.out.println("\nExiba a média das notas: ");
        System.out.println(soma/notas.size());

        System.out.println("\nRemova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("\nRemova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()) {
            Double next = iterator.next();
            if (next < 7) iterator.remove();
        }
        System.out.println(notas);

        System.out.println("\nApague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia: ");
        System.out.println(notas.isEmpty());

        System.out.println("\n-----------\n");

        /*
        TODO: Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        TODO: ("Crie uma lista chamada notas2 e coloque todos os elementos da list Arraylist nessa nova lista: ");
        TODO: ("Mostre a primeira nota da nova lista sem removê-lo: ");
        TODO: ("Mostre a primeira nota da nova lista removendo-o: ");
        */

        System.out.println("Crie uma lista chamada notas2 e coloque todos os elementos da list Arraylist nessa nova lista: ");
        List<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println(notas2.get(0));
        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista removendo-o: ");
        System.out.println(notas2.remove(0));
        System.out.println(notas2);

    }
}
