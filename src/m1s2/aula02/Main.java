package m1s2.aula02;

public class Main {
    public static void main(String[] args){
        Usuario usuarioA = new Usuario();

        usuarioA.primeiroNome = "Samuel";
        usuarioA.ultimoNome= "Nunes";

        String nomeCompleto= usuarioA.getNomeCompleto();
        System.out.println(nomeCompleto);

//      usuarioA.setEstaLogado(true);
//      System.out.println(usuarioA.setEstaLogado(true));

    }
}
