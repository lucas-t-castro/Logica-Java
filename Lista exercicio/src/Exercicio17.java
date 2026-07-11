import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scr.nextLine();

        String invertida = new StringBuffer(frase).reverse().toString();
        System.out.print(invertida);
        scr.close();

        //Outra forma de resolver//

        String palavra = "Fala rapaziada";
        String[] pls = palavra.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int count = pls.length - 1; count >= 0; count--) {
            sb.append(pls[count]);
            if (count > 0){ sb.append(" ");}
        }
        System.out.println(sb.toString());
    }
}