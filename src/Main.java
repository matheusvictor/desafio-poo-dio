import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java na prática");
        bootcamp.getConteudos().add(primeiroCurso);
        bootcamp.getConteudos().add(segundoCurso);
        bootcamp.getConteudos().add(mentoria);

        Dev participante_um = new Dev();
        participante_um.setNome("Matheus");
        participante_um.inscreverBootcamp(bootcamp);

        System.out.println("------------------------------------------------");

        System.out.println
                ("Conteúdos em que "
                        + participante_um.getNome() + " está inscrito(a): "
                        + participante_um.getConteudosInscritos()
                );
        System.out.println("Quantidade de cursos a fazer: " + participante_um.getConteudosInscritos().size());

        System.out.println("------------------------------------------------");

        System.out.println
                ("Conteúdos concluídos por "
                        + participante_um.getNome() + ": "
                        + participante_um.getConteudosConcluidos()
                );
        System.out.println("Quantidade de cursos concluídos: " + participante_um.getConteudosConcluidos().size());
        System.out.println
                ("Total de XP de "
                        + participante_um.getNome() + ": "
                        + participante_um.calcularTotalXp()
                );

        System.out.println("------------------------------------------------");

        participante_um.progredir();
        participante_um.progredir();
        System.out.println("Depois de concluir alguns cursos...");

        System.out.println("Quantidade de cursos a fazer: " + participante_um.getConteudosInscritos().size());
        System.out.println("Quantidade de cursos concluídos: " + participante_um.getConteudosConcluidos().size());
        System.out.println
                ("Total de XP de "
                        + participante_um.getNome() + ": "
                        + participante_um.calcularTotalXp()
                );

        System.out.println("------------------------------------------------");

        Dev participante_dois = new Dev();
        participante_dois.setNome("Victor");
        participante_dois.inscreverBootcamp(bootcamp);

        System.out.println
                ("Conteúdos em que "
                        + participante_dois.getNome() + " está inscrito(a): "
                        + participante_dois.getConteudosInscritos()
                );
        System.out.println("Quantidade de cursos a fazer: " + participante_dois.getConteudosInscritos().size());

        System.out.println("------------------------------------------------");

        System.out.println
                ("Conteúdos concluídos por "
                        + participante_dois.getNome() + ": "
                        + participante_dois.getConteudosConcluidos()
                );
        System.out.println("Quantidade de cursos concluídos: " + participante_dois.getConteudosConcluidos().size());
        System.out.println
                ("Total de XP de "
                        + participante_dois.getNome() + ": "
                        + participante_dois.calcularTotalXp()
                );

        System.out.println("------------------------------------------------");

        System.out.println("Como cursos não foram concluídos...");

        System.out.println("Quantidade de cursos a fazer: " + participante_dois.getConteudosInscritos().size());
        System.out.println("Quantidade de cursos concluídos: " + participante_dois.getConteudosConcluidos().size());
        System.out.println
                ("Total de XP de "
                        + participante_dois.getNome() + ": "
                        + participante_dois.calcularTotalXp()
                );

        System.out.println("------------------------------------------------");

    }
}
