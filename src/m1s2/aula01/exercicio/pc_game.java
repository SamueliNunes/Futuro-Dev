package m1s2.aula01.exercicio;

public class pc_game {
    public String nome;
    public double preco;

    public String memoria;
    public String disco;
    public String processador;

    public String gabinete;

    public String fonte;

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

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public pc_game() {
        this.nome = "Pc Gamer";
        this.preco = 3000;
        this.memoria = "16 GB - DDR4";
        this.disco = "SSD 1T";
        this.processador = "Processador i7 10º Geração";
        this.gabinete = "Fortgater 4 baias + 3 cooles";
        this.fonte = "Fonte 600w Real+";
    }
}
