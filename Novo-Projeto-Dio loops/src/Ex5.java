import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scr.nextInt();

        for (int count = 0; count <= 10; count++){
            System.out.println(num + " X " + count + " = " + (num * count));
        }
        scr.close();
    }
}
