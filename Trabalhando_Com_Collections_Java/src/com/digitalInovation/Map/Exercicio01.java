package com.digitalInovation.Map;

import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Long> dicionario = new HashMap<>(){{
            put("PE", 9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
        }};
        System.out.println(dicionario);

        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        dicionario.replace("RN", 3534165L);
        System.out.println(dicionario);

        System.out.println("\nConfira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione PB - 4.039.277: ");
        System.out.println(dicionario.containsKey("PB"));
        dicionario.put("PB", 4039277L);
        System.out.println(dicionario);
        System.out.println(dicionario.containsKey("PB"));

        System.out.println("\nExiba a população do estado PE: ");
        System.out.println(dicionario.get("PE"));

        System.out.println("\nExiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Long> dicionario2 = new LinkedHashMap<>() {{
            put("PE", 9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
            put("PB", 4039277L);
        }};
        System.out.println(dicionario2);

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Long> dicionario3 = new TreeMap<>(dicionario);
        System.out.println(dicionario3);

        System.out.printf("\nExiba o estado com a menor população e seu respectivo valor;\n");
        Collection<Long> populacao = dicionario.values();
        String estadoComMaiorPopulacao = "";
        String estadoComMenorPopulacao = "";
        for (Map.Entry<String, Long> entry : dicionario.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoComMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoComMenorPopulacao = entry.getKey();
        }
        System.out.printf("(%s) = (%d)\n", estadoComMenorPopulacao, Collections.min(populacao));

        System.out.printf("\nExiba o estado com a maior população; \n");
        System.out.printf("(%s) = (%d)", estadoComMaiorPopulacao, Collections.max(populacao));

        System.out.println("\n\nExiba a soma da população desses estados: ");
        Long soma = 0L;
        Iterator<Long> iterator = dicionario.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: ");
        System.out.println(soma/dicionario.size());

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Long> iterator2 = dicionario.values().iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next() < 4000000L) iterator2.remove();
        }
        System.out.println(dicionario);

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas: ");
        dicionario.clear();
        System.out.println(dicionario);

        System.out.println("\nConfira se a lista está vazia: ");
        System.out.println(dicionario.isEmpty());
    }
}
