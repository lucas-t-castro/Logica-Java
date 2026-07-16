import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Digite um numero para contagem: ");
        int numN = scr.nextInt();

        int count = 0;
        int num;
        int NPar = 0;
        int NImpar = 0;

        while (count < numN){
            System.out.println("Digite um numero: ");
            num = scr.nextInt();

            if (num % 2 == 0){
                NPar++;
            }else {
                NImpar++;
            }

            count = count + 1;
        }
        System.out.println(NPar + " numeros pares");
        System.out.print(NImpar + " numeros impares");
        scr.close();
    }
}
