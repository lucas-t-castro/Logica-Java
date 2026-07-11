import java.util.HashMap;
import java.util.Map;
public class Exercicio18 {
    public static void main(String[] args){
        Map<String, String> dicionario = new HashMap<>();

        dicionario.put("Nome" , "Lucas");
        dicionario.put("Idade" , "26");
        dicionario.put("Cidade" , "São Gonçalo");

        System.out.println("Nome: " + dicionario.get("Nome"));
        System.out.println("Idade: " + dicionario.get("Idade"));
        System.out.println("Cidade: " + dicionario.get("Cidade"));


    }

}
