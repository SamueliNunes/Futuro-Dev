package m1s1.aula03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String nome,sobrenome,bairro,cidade,estado;
//        int idade;
//
//        System.out.println("Informe o seu nome: ");
//        nome = ler.nextLine();
//
//        System.out.println("Informe o seu sobrenome: ");
//        sobrenome = ler.nextLine();
//
//        System.out.println("Informe sua idade: ");
//        idade = ler.nextInt();
//
//        ler.nextLine(); //resetar buffer ??
//
//        System.out.println("Informe seu estado: ");
//        estado = ler.nextLine();
//
//        System.out.println("Informe sua cidade: ");
//        cidade = ler.nextLine();
//
//        System.out.println("Informe seu bairro: ");
//        bairro = ler.nextLine();
//
//        System.out.println("Meu nome é "+nome+" "+sobrenome+" Tenho "+ idade + " Anos" + " Moro no Estado de "+estado+" Na cidade de "+cidade+" em "+bairro);
//


//        Scanner ler = new Scanner(System.in);
//        String nome = null;
//        int idade;
//
//        System.out.println("Digite seu nome: ");
//        nome = ler.nextLine();
//        System.out.println("Digite sua Idade: ");
//        idade = ler.nextInt();
//
//
//        if (idade >= 18) { //nome.equals("samuel")
//            System.out.println("Maior de Idade");
//        }else{
//            System.out.println("Menor de Idade");
//        }
//
//        System.out.println("\nUsuário : "+nome+"\nIdade: " +idade);
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
    do{
        System.out.print("[0] Oi\n[2] Tudo bem\n[3] Sair\nOpção: ");
        opcao = ler.nextInt();

        if(opcao == 1){
            System.out.println("Olá");
        }else if(opcao == 2){
            System.out.println("Esta tudo bem!");
        }else if(opcao == 3){
            System.out.println("Como você esta!");
        }else if(opcao == 4){
            System.out.println("Saindo...!");
        }else{
            System.out.println("Opcao Invalida");
        }
    } while(opcao !=4);

    }
}
