import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
         Scanner scr = new Scanner(System.in);
          int numero;
          int soma = 0;
          int maior = 0;

          int count = 0;

          do {
              System.out.println("Digite um numero: ");
              numero = scr.nextInt();
               soma = soma + numero;

               if (numero > maior)maior = numero;
               count = count + 1;
          }while (count < 5);

          System.out.println("Maior numero " + maior);
          System.out.print("Média " + soma/5);
    scr.close();
    }
}
