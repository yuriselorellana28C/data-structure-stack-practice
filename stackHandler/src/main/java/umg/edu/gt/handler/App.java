package umg.edu.gt.handler;

public class App {
    public static void main(String[] args) {

        String valido = "(a+b) * [c-d]";
        String invalido = "([)]";

        System.out.println("Caso válido:   " + valido);
        System.out.println("Resultado:     " + SymbolValidator.isValid(valido)); // debe dar true

        System.out.println();

        System.out.println("Caso inválido: " + invalido);
        System.out.println("Resultado:     " + SymbolValidator.isValid(invalido)); // debe dar false
    }
}