public class ForArrays {
    public static void main(String[] args) {
        //em arrays o indice de elemntos inicia em ZERO
        String alunos [] = {"FELIPE", "JONAS", "JULIA","MARCOS"};
    
       /*/ //Enquanto o x for menor que esse tamanho dos alunos ele vai executar
        for (int x=0; x<alunos.length; x++){

            
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }*/

        //forma abreviada , os dois pontos quer dizer q o valor da variavel vai ter um novo valor a cada execução
        for(String aluno:alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
