import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        String[] consoantes = new String[6];
        int QuantConsoantes = 0;
        int count = 0;

        do{
            System.out.print("Digite aqui: ");
            String letras = scr.next();

            if ( !(letras.equalsIgnoreCase("a")|
                  letras.equalsIgnoreCase("e") |
                  letras.equalsIgnoreCase("i") |
                  letras.equalsIgnoreCase("o") |
                  letras.equalsIgnoreCase("u"))) {
                consoantes[count] = letras;
                QuantConsoantes++;
            }
            count++;
        }while(count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes){
            if (consoante != null)
                System.out.println(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + QuantConsoantes);
        System.out.println(consoantes.length);
    }
}
