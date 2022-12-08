package m1s2.aula01.exercicio;

public class monitor {
    public String nome;
    public double preco;

    public String marca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public monitor() {
        this.nome = "Monitor Lg Ultra";
        this.preco = 890.00;
        this.marca = "Lg";
    }
}
