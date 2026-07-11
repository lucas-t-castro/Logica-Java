import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int[] numeros = new int[5] ;

        System.out.println("Digite 5 numeros: ");

        for (int count = 0; count < 5; count++){
            numeros[count] = scr.nextInt();
        }

        int MaiorNum = numeros[0];

        for (int count = 1; count < 5; count++){
            if (numeros [count] > MaiorNum){
                MaiorNum = numeros[count];
            }
        }
        System.out.print(MaiorNum + " é o maior numero");

        scr.close();
    }
}