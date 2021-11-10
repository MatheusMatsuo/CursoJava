package Generic;

import java.util.Objects;

public class Alunos {
    private int idAluno;

    public Alunos(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return idAluno == alunos.idAluno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAluno);
    }
}
