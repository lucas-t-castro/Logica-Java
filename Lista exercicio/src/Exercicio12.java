import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numero = scr.nextDouble();

        for (int count =0; count < 10; count++){
            System.out.println(count * numero);
        }
        scr.close();
    }

}
