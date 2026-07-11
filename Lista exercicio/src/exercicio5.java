import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double nota1= 0;
        double nota2= 0;
        double nota3= 0;

        System.out.println("Digite sua primeira nota: ");
        nota1 = scr.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        nota2 = scr.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        nota3 = scr.nextDouble();

        double media = (nota1 + nota2 + nota3)/ 3;

        System.out.println("Sua média é " + media);
        scr.close();

    }
}
