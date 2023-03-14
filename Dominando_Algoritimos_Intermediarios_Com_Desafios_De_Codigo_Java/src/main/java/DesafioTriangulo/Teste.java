package DesafioTriangulo;

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.


import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double perimetro;
        boolean triangulo;
        double area;

//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.

        if (((A+B) > C) && ((A+C) > B) && ((B+C) > A)) {
            perimetro = A+B+C;
            System.out.println(String.format("Perimetro = %.1f", perimetro));
        } else {
            area = ((A + B) * C) / 2;
            System.out.println(String.format("Area = %.1f", area));
        }


    }

}
