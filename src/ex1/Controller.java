package ex1;

public class Controller {

    static int calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Inválido. Número Negativo.");
        }
        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

	
}
