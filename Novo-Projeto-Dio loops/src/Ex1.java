import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
         Scanner scr = new Scanner(System.in);

         String nome;
         int idade;

         while (true){
             System.out.println("Para encerra digite 0");
             System.out.println("Digite seu nome: ");
             nome = scr.next();
             if (nome.equals("0"))break;

             System.out.println("Digite sua idade: ");
             idade = scr.nextInt();
         }
         scr.close();
    }
}
