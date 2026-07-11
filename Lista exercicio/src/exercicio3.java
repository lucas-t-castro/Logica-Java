import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double n1 = scanner.nextDouble();

        double dobro = n1 * 2;
        double triplo = n1 * 3;
        double raiz = Math.sqrt(n1);

        System.out.println("O resultado de " + n1);
        System.out.println(dobro + " , " + triplo + " e " + raiz);
        scanner.close();
    };
}
