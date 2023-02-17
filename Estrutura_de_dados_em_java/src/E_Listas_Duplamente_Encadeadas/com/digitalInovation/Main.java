package E_Listas_Duplamente_Encadeadas.com.digitalInovation;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("C1");
        lista.add("C2");
        lista.add("C3");
        lista.add("C4");
        lista.add("C5");
        lista.add("C6");
        lista.add("C7");
        System.out.println(lista);

        lista.remove(3);
        System.out.println(lista);

        lista.add(3, "99");
        System.out.println(lista);

        System.out.println(lista.get(3));

    }
}
