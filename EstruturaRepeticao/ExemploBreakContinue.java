public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1;numero<=5; numero ++){
            if(numero == 3)
           /* break; //interrompe a execução no 3*/
           continue;//mudou o fluxo da aplicação, ele pula o 3 e continua no 4

            System.out.println(numero);
        }
    }
    
}
