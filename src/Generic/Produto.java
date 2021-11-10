package Generic;

public class Produto implements Comparable<Produto>{
    private String name;
    private Double preco;

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", preco);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String name, double preco) {
        this.name = name;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return preco.compareTo(outro.getPreco());
    }
}
