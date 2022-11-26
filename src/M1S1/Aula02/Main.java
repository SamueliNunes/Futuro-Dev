package M1S1;

public class Main {
    public static void main(String[] args) {
//        Códigos primeira aula
//        System.out.print("Hello World ");
//        System.out.println("Oi, Tudo bem?");
//
//        System.out.println("Meu primeiro código java\nMeu nome é : Samuel");
//        System.out.println("Nome: Samuel nunes da silva\nIdade: 25 Anos\nRecife, Pernambuco ");

//        String nameComplete = "Samuel Nunes";
//        int age = 18;
//        String city = "Recife";
//        String UF = "PE";
//
//        System.out.println("Meu Nome: " + nomeComplete + "\nAge: " + idade + "\nCidade: " + cidade + "\nEstado: " + UF);

//        System.out.println(7+22);
//        if(age == 18 || age == 15){
//            System.out.println("\n" + "age is equal to : "+age);
//        }else{
//            System.out.println("you are underage!");
//        }

        int numero = 7;
        String texto = "S";

        System.out.println("Valor do numero é :" + numero);

        if (numero < 12){
            System.out.println("Valor da tabela: "+numero);
            for (int i = 1; i < 13 ; i++) {
                System.out.println(i+"x"+numero+"="+(numero*i));
            }
        } else if (numero > 12 && texto =="S") {
            System.out.println("O doblo do valor é: " + numero * 2);
        }else {
            System.out.println("Soma de valor +15 =: " + (numero+15));
        }
    }

}