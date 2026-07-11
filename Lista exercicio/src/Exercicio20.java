import java.util.Random;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        Random aleatorio = new Random();

        int randomInt = aleatorio.nextInt(10);
        int min = 1;
        int max = 10;

        int intervalo = aleatorio.nextInt((max + min) + 1) + min;

        System.out.print("Tente adivinhar o numero certo (de 1 a 10): ");
        int resposta = scr.nextInt() ;



        while (intervalo != resposta) {
            System.out.println("Resposta errada, tente novamente: ");
            (resposta) = scr.nextInt();
        }
        System.out.print("Correto, bom palpite!");

        scr.close();
    }
}
