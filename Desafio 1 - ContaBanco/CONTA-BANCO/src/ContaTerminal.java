import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TO.DO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o nosso usuário
        System.out.println("Seja bem vindo ao nosso banco, vamos dar continuidade no seu cadastro!");

        // Obter pela scanner os valores digitados no terminal
        System.out.println("Digite um número para sua conta : ");
        int Numero = scanner.nextInt();

        System.out.println("Digite o número da sua agência : ");
        String Agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String NomeCliente = scanner.next();

        System.out.println("Digite seu saldo : ");
        double Saldo = scanner.nextDouble();

        // Exibir a mensagem conta criada
        System.out.println("Olá,  " + NomeCliente + " obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é  " + Agencia + ", conta " + Numero + " ");
        System.out.println("e seu saldo " + Saldo + " já está disponível para saque");

    }
}
