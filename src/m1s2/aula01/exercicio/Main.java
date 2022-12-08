package m1s2.aula01.exercicio;

public class Main {
    public static void main(String[] args){
        mouse logtec = new mouse();
        teclado teclado = new teclado();
        monitor monitor = new monitor();
        pc_game computador = new pc_game();

        System.out.println(logtec.getNome()+" Marca: "+ logtec.getMarca()+" Valor: "+ logtec.getPreco());
        System.out.println(teclado.getNome()+" Marca: "+ teclado.getMarca()+" Valor: "+ teclado.getPreco());
        System.out.println(monitor.getNome()+" Marca: "+ monitor.getMarca()+" Valor: "+ monitor.getPreco());
        System.out.println(computador.getNome()+" Disco: "+computador.getDisco()+" "+computador.getMemoria()+" "+computador.getProcessador()+" "+computador.getGabinete()+" "+computador.getPreco());

    }
}
