package Generic;

import java.util.Objects;

public class Votos {
    private String nome;

    public Votos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Votos votos = (Votos) o;
        return Objects.equals(nome, votos.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
