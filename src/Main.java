import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("nada a declarar");
        curso1.setCargaHoraia(20);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Js");
        curso2.setDescricao("Escadona");
        curso2.setCargaHoraia(25);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Gustavo Guanabara");
        mentoria1.setDescricao("JS");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);
    }

}