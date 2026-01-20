import br.com.dio.desafio.Dominio.Bootcamp;
import br.com.dio.desafio.Dominio.Conteudo;
import br.com.dio.desafio.Dominio.Curso;
import br.com.dio.desafio.Dominio.Dev;
import br.com.dio.desafio.Dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("nada a declarar");
        curso1.setCargaHoraia(20);
//        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Js");
        curso2.setDescricao("Escadona");
        curso2.setCargaHoraia(25);
//        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Gustavo Guanabara");
        mentoria1.setDescricao("JS");
        mentoria1.setData(LocalDate.now());
//        System.out.println(mentoria1);

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp  Java Developer");
       bootcamp.setDescricao("Descrição Bootcamp");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila: " +devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("Conteudos Concluidos Camila: " +devCamila.getConteudosConcluidos());

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Gabriel: " +devGabriel.getConteudoInscritos());
        devGabriel.progredir();
        System.out.println("Conteudos Concluidos Gabriel: " +devGabriel.getConteudosConcluidos());
    }

}