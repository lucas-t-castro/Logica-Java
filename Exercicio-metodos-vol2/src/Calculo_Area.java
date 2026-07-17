public class Calculo_Area {
    public static void area(double lado){
        System.out.println("A area total do quadrado é " + lado * lado);
    }

    public static void area(int Base, int Altura){
        System.out.println("A area do retangulo é " + Base * Altura);
    }

    public static void area(double diagonalMaior, int diagonalMenor){
        System.out.println("A area do losangolo é " + ((diagonalMaior * diagonalMenor) / 2));
    }

    public static void area(float BaseMaiorf, float baseMenorf, double Altura){
        System.out.println("A area do trapézio é " + ((BaseMaiorf + baseMenorf) * Altura) / 2);
    }
}
