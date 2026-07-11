import java.util.Random;
public class Ex3 {
    public static void main(String[] args){
          Random aleatorio = new Random();

          int[] NumAlet = new int[20];

          for (int count = 0; count < NumAlet.length; count++){
            int numero = aleatorio.nextInt(100);
            NumAlet[count] = numero;
          }
          System.out.print(NumAlet + " ");
          System.out.print("Numeros aleatorios: ");
          for (int numero : NumAlet) {
              System.out.print(numero + " ");
          }
          System.out.print("\nNumeros descendentes: ");
           for (int numero : NumAlet){
               System.out.print((numero +1) + " ");
           }

           System.out.print("\nNumeros antecessores: ");
           for (int numero : NumAlet){
               System.out.print((numero - 1) + " ");
           }

    }
}
