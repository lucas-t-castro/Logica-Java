
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade= scr.nextInt();

        if (idade >= 18) {
            System.out.print("Você é maior de idade");
        } else {
            System.out.print("Você é menor de idade");
        }
        scr.close();
    }
}
