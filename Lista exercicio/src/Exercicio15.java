import java.util.Scanner;
public class Exercicio15 {
    public static String Ola (String Oi){
        return ("Olá " + Oi + " seja bem vindo!");
    }

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String pessoa = scr.nextLine();

        String saudacao = Ola(pessoa);
        System.out.print(saudacao);
    }
}
