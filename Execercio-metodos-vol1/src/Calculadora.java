public class Calculadora {
    public static void soma(int num1, int num2){
        int resultado = num1 + num2;
        System.out.println(num1 + " mais " + num2 + " é igual a = " + resultado);
    }

    public static void subtracao(int num1, int num2){
        int resultado = num1 - num2;
        System.out.println(num1 + " - " + num2 + " é igual a = " + resultado);
    }
    public static void multiplicacao (double num1, double num2){
        double resultado = num1 * num2;
        System.out.println(num1 + " multiplicado por " + num2 + " é igual a = " + resultado);
    }
    public static void divisao(double num1, double num2){
        double resultado = num1 / num2;
        System.out.print(num1 + " dividido por " + num2 + " é igual a =" + resultado);
    }
}


