import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scr.nextLine();

        System.out.print("Existem " + frase.length() + " caracteres na sua frase");

        scr.close();
    }

}
