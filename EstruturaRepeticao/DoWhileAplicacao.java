import java.util.Random;

public class DoWhileAplicacao {

    public static void main(String[] args) {
        
        System.out.println("Discando ...");

        do {
            //executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        } while (tocando());

        System.out.println("Alô !!!");
    }

    
    //metodo tocando
    private static boolean tocando(){
        //valor aleartorio entre 1  e 3, se o valor for igual a 1 ele nega o ato de tocar
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
