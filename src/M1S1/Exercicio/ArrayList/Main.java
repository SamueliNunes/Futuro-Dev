package M1S1.Exercicio.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Double> notas = new ArrayList<Double>();
        Scanner ler = new Scanner(System.in);

        int select = 0;
        double nota,media;
        boolean active = true;

        do {
            System.out.print("\n[0]Adicionar nota\n[1]Alterar uma nota\n[2]Excluir uma nota\n[3]Excluir todas as notas\n[4]Apresentar as notas\n[5]Calcular média\nDigite a Opção: ");
            select = ler.nextInt();
            ler.nextLine();

            switch (select){
                case 0:
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Informe o valor da "+(i+1)+"º Nota:");
                        nota = ler.nextInt();
                        notas.add(nota);
                    }
                    break;
                case 1:
                    if (notas.size() > 2) {
                        System.out.println("1º Nota foi " + notas.get(0));
                        System.out.println("2º Nota foi " + notas.get(1));
                        System.out.println("3º Nota foi " + notas.get(2));
                        System.out.print("Por favor informe qual das notas sera alterada: ");
                        select = ler.nextInt();
                        ler.nextLine();

                        if (select == 1) {
                            System.out.print("Por favor informe a nova nota: ");
                            nota = ler.nextInt();
                            notas.set(0, nota);
                        } else if (select == 2) {
                            System.out.print("Por favor informe a nova nota: ");
                            nota = ler.nextInt();
                            notas.set(1, nota);
                        } else if (select == 3) {
                            System.out.print("Por favor informe a nova nota: ");
                            nota = ler.nextInt();
                            notas.set(2, nota);
                        } else {
                            System.out.print("Escolha invalida!");
                        }
                    }
                    break;
                case 2:
                    if (notas.size() > 2) {
                        System.out.println("1º Nota foi " + notas.get(0));
                        System.out.println("2º Nota foi " + notas.get(1));
                        System.out.println("3º Nota foi " + notas.get(2));
                        System.out.print("Por favor informe qual das notas sera excluida: ");
                        select = ler.nextInt();
                        ler.nextLine();

                        if (select == 1) {
                            System.out.print("Operação Realizada a 1º nota foi removida!");
                            notas.remove(0);
                        } else if (select == 2) {
                            System.out.print("Operação Realizada a 2º nota foi removida!");
                            notas.remove(1);
                        } else if (select == 3) {
                            System.out.print("Operação Realizada a 3º nota foi removida!");
                            notas.remove(2);
                        } else {
                            System.out.print("Escolha invalida!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Confirmar escolha [1=S/2=N]");
                    select = ler.nextInt();

                    if (select == 1){
                        notas.clear();
                        System.out.print("Operação Realizada!");
                    }else if(select == 2){
                        System.out.print("Operação Cancelada");
                        break;
                    }else{
                        System.out.print("Escolha invalida !");
                    }

                    break;
                case 4:
                    if(notas.size() == 0){
                        System.out.println("Não foram Adionadas as notas!");
                    }
                    else if (notas.get(0) > 0 && notas.get(1) >= 0 && notas.get(2) >= 0){
                        System.out.println("1º Nota foi " + notas.get(0));
                        System.out.println("2º Nota foi " + notas.get(1));
                        System.out.println("3º Nota foi " + notas.get(2));
                    }else if(notas.get(0) > 0 && notas.get(1) >= 0) {
                        System.out.println("1º Nota foi " + notas.get(0));
                        System.out.println("2º Nota foi " + notas.get(1));
                    }else{
                        System.out.println("1º Nota foi " + notas.get(0));
                    }

                    break;
                case 5:
                    if (notas.size() == 0){
                        System.out.println("é obrigatório ter uma nota para calcular a média.");
                    }else{
                        System.out.println("Calcular media");
                        System.out.println("Nota Final:"+(notas.get(0)+notas.get(1)+notas.get(2))/3);

                        active = false;
                    }
            }
        }while (active);

    }
}
