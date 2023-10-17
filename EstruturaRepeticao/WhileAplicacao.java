import java.util.concurrent.ThreadLocalRandom;
public class WhileAplicacao {

    public static void main(String[] args) {
        double mesada =50.0;

        while (mesada > 0) {
            Double valorDoce =  valorAleartorio();

            if(valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
    
    //método para trazer o valor aleartorio de 2 e 8 dos doces
    private static double valorAleartorio(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
