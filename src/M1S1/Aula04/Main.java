package M1S1.Aula04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] produtos = {"Mouse","teclado","fone"};
        int[] precos = {15,25,50};
        String nome;
        int opcao;

        do {
            System.out.print("Bem vindo! Informe o seu Nome: ");
            nome = ler.nextLine();
        }while (nome.isBlank());


        do{
            System.out.print("Produtos Disponiveis!\n[1] Mouse\n[2] Teclado\n[3] Fone");
            opcao = ler.nextInt();

        }while (opcao >= 4 || opcao <= 0);

        System.out.print(nome+" Comprou o produto, "+produtos[opcao-1]+" no valor de R$ "+precos[opcao-1]);

    }
}
