package m1s2.aula01;

public class Main {
    public static void main(String[] args){
        Usuario usuarioA = new Usuario();

        usuarioA.nome="Samuel";
        usuarioA.senha= 0123123.0F;
        usuarioA.ultimoNome= "Silva";
        usuarioA.salario= 1000.00F;

        System.out.println(usuarioA.salario);
    }
}
