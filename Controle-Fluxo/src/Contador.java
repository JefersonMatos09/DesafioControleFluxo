import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner Terminal = new Scanner(System.in);
        int parametroUm = Terminal.nextInt();
        int parametroDois = Terminal.nextInt();
        try{
            // chamando o método contendo a logica de contagem 
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e) {
            // imprimir a mensagem : O segundo parâmetro deve ser maior que o primeiro 
            System.out.println(e.getMessage());
        }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é Maior que parametroDois e lançar a exceção 
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior do que o primeiro");
        }
        
        int contagem = parametroDois - parametroUm;
        
        // realizar o for para imprimir os números com base na variável contagem
        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o numero " + (parametroUm + i));
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String errorMessage) {
        super(errorMessage);
    }
}
