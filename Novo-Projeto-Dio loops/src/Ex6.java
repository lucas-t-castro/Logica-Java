import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.print("Digite um numero fatorial: !");
        int fatorial = scr.nextInt();
        int multiplicacao = 1;

        for (int count = fatorial; count >= 1; count--){
            multiplicacao = multiplicacao * count;
        }
        System.out.print(fatorial + "! = " + multiplicacao);
        scr.close();
    }
}
