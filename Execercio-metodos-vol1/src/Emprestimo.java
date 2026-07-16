public class Emprestimo {
    public static int getDuasParcelas(){ return 2; }

    public static int getTresParcelas(){
        return 3;
    }

    public static double getTaxaDuasParcelas(){
        return 0.5;
    }

    public static double getTaxaTresParcelas(){
        return 0.9;
    }

    public static void calcular(double valor, int parcelas){

        if (parcelas == 2){
            double ValorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + ValorFinal);
        } else if (parcelas == 3) {
            double ValorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + ValorFinal);;
        }else
            System.out.println("Quantidade de parcelas não aceita.");
    }

}
