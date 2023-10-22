import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        try (Scanner Terminal = new Scanner(System.in).useLocale(Locale.US)) {
            // COLOCANDO OS VALORES DOS PARAMETRÔS 1 E 2 ;
            System.out.println("Imprimindo valor 1:");
                  int parametroUm = Terminal.nextInt();
            System.out.println("Imprimindo valor 2:");
                  int parametroDois = Terminal.nextInt();
   
   // Imprimir o segundo parametro deve ser maior doque o primeiro 
             if (parametroUm > parametroDois) 
             // Validar se o parametro 1 é maior doque o 2 e lançar a exceção 
                 throw new ParametrosInvalidosException("O segundo parametro deve ser maior doque o primeiro");
             
// realizar o for para imprimir o numero com base na variavel contagem
             int contagem = parametroUm + parametroDois;
                            for(int p = 0;p < contagem; p++);
                            System.out.println("Imprimindo o numero: " + (contagem));
        }
                    }
}

       class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String errorMessage){ 
       }
    }
