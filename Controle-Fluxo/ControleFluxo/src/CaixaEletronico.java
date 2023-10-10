public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        // condicional simples com depuração
        if (valorSolicitado < saldo) {
            // para mais de uma linha é necessário criar um bloco {}
            saldo = saldo - valorSolicitado;
            System.out.println("Seu saldo atual é : " + saldo);
        } else
            System.out.println(" Saldo insuficiente");

    }
}
