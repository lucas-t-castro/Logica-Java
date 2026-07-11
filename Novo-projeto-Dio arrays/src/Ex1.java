public class Ex1 {
    public static void main(String[] args){
        int[] vetor = {-5,-3,35,2,41,52};
        int count = 0;

        System.out.print(vetor + " ");

        while (count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println("\nvetor: ");
        for (count = (vetor.length- 1) ; count >= 0; count--){
            System.out.print(vetor[count] + " ");
        }
    }
}