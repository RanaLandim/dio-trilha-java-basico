public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        // estrutura condicional composta com depuração
        if (nota >= 7)
            System.out.println("Aprovado");

        // condição encandeada
        else if (nota > 5 && nota < 7)
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");
    }
}
