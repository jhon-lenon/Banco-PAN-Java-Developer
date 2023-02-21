import desafio_poo_dio.br.com.dio.desafio.dominio.Bootcamp;
import desafio_poo_dio.br.com.dio.desafio.dominio.Cursos;
import desafio_poo_dio.br.com.dio.desafio.dominio.Dev;
import desafio_poo_dio.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cursos curso1 = new Cursos();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso Js");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println("---------\n");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        System.out.println("\n---------\n");

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Develop", "Descrição do Bootcamp Java Develop");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria1);

        Dev devJhon = new Dev("Jhon Lenon");
        devJhon.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + devJhon.getNome() + devJhon.getConteudosInscritos());
        devJhon.progredir();
        System.out.println(".");
        System.out.println("Conteúdos inscritos de " + devJhon.getNome() + devJhon.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + devJhon.getNome() + devJhon.getConteudosConcluidos());
        System.out.println("XP Jhon Lenon: " + devJhon.calcularTotalXp());
        devJhon.progredir();
        devJhon.progredir();
        System.out.println("Conteúdos inscritos de " + devJhon.getNome() + devJhon.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + devJhon.getNome() + devJhon.getConteudosConcluidos());
        System.out.println("XP Jhon Lenon: " + devJhon.calcularTotalXp());

        System.out.println("\n-------\n");

        Dev devJoão = new Dev("João");
        devJoão.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + devJoão.getNome() + devJoão.getConteudosInscritos());
        devJoão.progredir();
        System.out.println(".");
        System.out.println("Conteúdos inscritos de " + devJoão.getNome() + devJoão.getConteudosInscritos());
        System.out.println("XP João: " + devJoão.calcularTotalXp());
        System.out.println("Conteúdos Concluídos de " + devJoão.getNome() + devJoão.getConteudosConcluidos());
        System.out.println("XP João: " + devJoão.calcularTotalXp());

    }
}
