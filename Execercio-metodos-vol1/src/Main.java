public class Main{
    public static void main(String[] args){

        System.out.println("Exercicio Calculadora: ");
        Calculadora.soma(9, 12);
        Calculadora.subtracao(37, 64);
        Calculadora.multiplicacao(54, 12);
        Calculadora.divisao(4, 56);

        System.out.println("\n Exercicio Mensagem: ");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(23);

        System.out.println("Exercicio Emprestimo: ");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}