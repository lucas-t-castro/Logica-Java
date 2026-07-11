import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        String senha = "java123";
        String resposta = "";

        while(!resposta.equals(senha)){
            System.out.print("Digite sua senha: ");
            resposta = scr.nextLine();
        }
        System.out.print("Senha correta!");
    }

}
