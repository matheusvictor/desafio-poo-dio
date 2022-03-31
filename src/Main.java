import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso primeiroCurso = new Curso();
        primeiroCurso.setTitulo("Curso de POO em Java");
        primeiroCurso.setDescricao("Aprender os fundamentos de POO");
        primeiroCurso.setCargaHoraria(6);

        Curso segundoCurso = new Curso();
        segundoCurso.setTitulo("Curso de Kotlin");
        segundoCurso.setDescricao("Primeiros passos com Kotlin");
        segundoCurso.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria DIO");
        mentoria.setDescricao("Conteúdos gratuitos!");
        mentoria.setData(LocalDate.now());


    }
}
