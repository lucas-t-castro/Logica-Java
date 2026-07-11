import java.util.Random;
public class Ex4 {
    public static void main(String[] args){
        Random aleatorio = new Random();

         int[][] Matriz = new int[4][4];

         for (int count = 0; count < Matriz.length; count++){
             for (int cont = 0; cont < Matriz[count].length; cont++){
                 Matriz[count][cont] = aleatorio.nextInt(9);
             }
         }
         System.out.println("Matriz: ");
         for (int[] linha : Matriz){
             for (int coluna : linha){
                 System.out.print(coluna + " ");
             }
             System.out.println();
         }
    }
}
