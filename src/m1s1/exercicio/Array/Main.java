package m1s1.exercicio.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String nome = "",cidade,estado, hobbies, profissao;
        int idade = 0;
        int opcao = ler.nextInt();

//    do {
//        System.out.print("[1] Adicionar nome\n[2] Adicionar Idade\n[3] Adicionar Cidade\n[4] Adicionar Estado \n[5] Adicionar Profissão \n[6] Adicionar Hobbies \n[7] Sair \nOpcao:");
//        opcao = ler.nextInt();
//        ler.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite seu nome: ");
                nome = ler.nextLine();
                break;
            case 2:
                System.out.println("Digite sua Idade: ");
                idade = ler.nextInt();
                break;
            case 3:
                System.out.println("Digite sua Cidade: ");
                cidade = ler.nextLine();
                System.out.println("Digite seu estado: ");
                estado = ler.nextLine();
                break;
            case 4:
                System.out.println("Digite sua Profissao: ");
                profissao = ler.nextLine();
                break;
            case 5:
                System.out.println("Digite um hobbie: ");
                hobbies = ler.nextLine();
                break;
            case 6:
                if (nome.isBlank() || idade == 0){
                    opcao = 0;
                    System.out.println("Nome e Idade são obrigatorios");
                }else{
                    System.out.println("Saindo ...");
                }
                break;

            default:
                System.out.println("Opção Invalida! Digite Novamente: ");
        }

//        if(opcao == 1){
//            System.out.println("Digite seu nome: ");
//            nome = ler.nextLine();
//        } else if (opcao == 2) {
//            System.out.println("Digite sua Idade: ");
//            idade = ler.nextInt();
//        } else if (opcao == 3) {
//            System.out.println("Digite sua Cidade: ");
//            cidade = ler.nextLine();
//        } else if (opcao == 4) {
//            System.out.println("Digite seu estado: ");
//            estado = ler.nextLine();
//
//        } else if (opcao == 5) {
//            System.out.println("Digite sua Profissao: ");
//            profissao = ler.nextLine();
//
//        } else if (opcao == 6) {
//            System.out.println("Digite um hobbie: ");
//            hobbies = ler.nextLine();
//
//        } else if(opcao == 7) {
//            if (nome.isBlank() || idade == 0){
//                opcao = 0;
//                System.out.println("Nome e Idade são obrigatorios");
//            }else{
//                System.out.println("Saindo ...");
//            }
//        }else{
//            System.out.println("Opção Invalida! Digite Novamente: ");
//        }
//    }while(opcao != 7);
//
    }
}
