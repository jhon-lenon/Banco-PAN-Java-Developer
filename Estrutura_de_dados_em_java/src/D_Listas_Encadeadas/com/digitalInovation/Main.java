package D_Listas_Encadeadas.com.digitalInovation;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.add("Teste1");
        listaEncadeada.add("Teste2");
        listaEncadeada.add("Teste3");
        listaEncadeada.add("Teste4");

        System.out.println(listaEncadeada.get(0));
        System.out.println(listaEncadeada.get(1));
        System.out.println(listaEncadeada.get(2));
        System.out.println(listaEncadeada.get(3));
        System.out.println(listaEncadeada.refDeEntrada);
        System.out.println(listaEncadeada);
        System.out.println(listaEncadeada.size());
        System.out.println(listaEncadeada.remove(2));
        System.out.println(listaEncadeada);

    }
}
