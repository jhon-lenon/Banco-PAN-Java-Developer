package F_Listas_Circulares.com.digitalInovation;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> listaCircular = new ListaCircular<>();

        listaCircular.add("C1");
        System.out.println(listaCircular);

        listaCircular.remove(0);
        System.out.println(listaCircular);

        listaCircular.add("C1");
        listaCircular.add("C2");
        listaCircular.add("C3");
        System.out.println(listaCircular);

        System.out.println("O tamanho da lista é: " + listaCircular.size());
    }
}
