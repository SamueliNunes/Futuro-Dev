package m1s2.aula02;

public class Usuario {
    public String primeiroNome;
    public String ultimoNome;

    public String nomeCompleto;
    public String getNomeCompleto(){
        return primeiroNome+" "+ultimoNome;
    }

//    private boolean estaLogado;
//
//    public boolean setEstaLogado(boolean a){
//        estaLogado=a;
//        return a;
//    }
}
