import java.util.Scanner;
public class Exercicio68 {
    public static void main(String[] args){
        int somaNotasTurmas = 0;
        int somaNotas = 0;
        int numTurmas = 0;
        int numAlunos = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero de turmas: "); 
        numTurmas = Integer.parseInt(leitor.nextLine());

        for(int i= 0; i < numTurmas; i++){
            System.out.println("Turma número: " +  (i+1));
            System.out.println("Digite o número de alunos:");
            numAlunos = Integer.parseInt(leitor.nextLine());
            for(int contaAluno = 0; contaAluno < numAlunos; contaAluno++){
                System.out.println("Aluno número: " + (contaAluno+1));
                System.out.println("Digite a sua média: ");
                float media = Float.parseFloat(leitor.nextLine());
                somaNotas += media;

                
            }
            float mediaturma = somaNotas / numAlunos;
            somaNotasTurmas += mediaturma;
            System.out.println("A média da turma é: " + mediaturma);
        }
        float mediaEscola = somaNotasTurmas / numTurmas;
        System.out.print("A media da escola é: " + mediaEscola);
        

    }
    
}
