import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Digite um valor em R$: R$");
        double reais = scr.nextDouble();

        final double dolar = 5.50;

        double conversao = reais / dolar;

        System.out.println("O valor total em Dólares é U$" + conversao);
        scr.close();

    }
}
