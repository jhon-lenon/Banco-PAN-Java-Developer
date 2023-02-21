package com.digitalInovation.Set;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class ExercicioProposto1 {
    public static void main(String[] args) {

        System.out.println("\nCrie uma conjunto contendo as cores do arco-íris:");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);

        System.out.println("\na) Exiba todas as cores o arco-íris uma abaixo da outra;");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        System.out.println("\nb) A quantidade de cores que o arco-íris tem;");
        System.out.println(coresArcoIris.size());

        System.out.println("\nc) Exiba as cores em ordem alfabética;");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("\nd) Exiba as cores na ordem inversa da que foi informada;");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("\ne) Exiba todas as cores que começam com a letra ”v”;");
        for (String cor : coresArcoIris) {
            if (cor.startsWith("v")) System.out.print(cor + ", ");
        }

        System.out.println("\nf) Remova todas as cores que não começam com a letra “v”;");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("\ng) Limpe o conjunto;");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        System.out.println("\nh) Confira se o conjunto está vazio;");
        System.out.println(coresArcoIris.isEmpty());

    }
}
