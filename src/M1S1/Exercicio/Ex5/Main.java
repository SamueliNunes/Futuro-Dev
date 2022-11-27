package M1S1.Exercicio.Ex5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int
                repetir,
                b = 0,
                c = 1;
        Scanner ler = new Scanner(System.in);

        System.out.print("Fibonacci - Informe a quantidade de vezes que deseja verificar na sequecia: ");
        repetir = ler.nextInt();

        for(int i = 0; i < repetir; i++){
            b = b + c;
            c = b - c;
            System.out.print("["+b+"],");
        }
    }
}
