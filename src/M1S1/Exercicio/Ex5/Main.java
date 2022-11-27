package M1S1.Exercicio.Ex5;

public class Main {
    public static void main(String[] args){
        int num1 = 2, num2 = 3;

        System.out.println(num2);
        System.out.println(num1);

        for(int i = 0; i < 8; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
    }
}
