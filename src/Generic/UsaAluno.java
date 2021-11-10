package Generic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UsaAluno {
    public static void main(String[] args) {
        System.out.println("Professor Alex");
        Set<Alunos> curso = new HashSet<>();

        int aux;
        int idAluno;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos tem no curso A? ");
        aux = sc.nextInt();
        for(int i=0; i< aux; i++){
            System.out.println("Informe o id do Aluno ");
            idAluno = sc.nextInt();
            curso.add(new Alunos(idAluno));
        }

        System.out.println("Quantos alunos tem no curso B? ");
        aux = sc.nextInt();
        for(int i=0; i< aux; i++){
            System.out.println("Informe o id do Aluno ");
            idAluno = sc.nextInt();
            curso.add(new Alunos(idAluno));
        }

        System.out.println("Quantos alunos tem no curso C? ");
        aux = sc.nextInt();
        for(int i=0; i< aux; i++){
            System.out.println("Informe o id do Aluno ");
            idAluno = sc.nextInt();
            curso.add(new Alunos(idAluno));
        }
        System.out.println("Número de alunos: " + curso.size());
        for (Alunos x: curso
             ) {
            System.out.println(x.getIdAluno());
        }

    }
}
