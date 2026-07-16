import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.println("Digite sua nota (entre 1 e 10): ");
        double nota = scr.nextDouble();

        while (nota < 1 | nota > 10){
            System.out.println("Valor invalido, tente novamente!");
            nota=scr.nextDouble();
        }
        System.out.print("nota valida!");
        scr.close();

    }
}
