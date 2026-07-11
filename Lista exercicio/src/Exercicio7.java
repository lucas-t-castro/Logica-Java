import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = scr.nextInt();

        if (num %2==0) {
            System.out.print("Esse numero é par!");
        } else {
            System.out.print("Esse numero é impar!");
        }
    }
}
