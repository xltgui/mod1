import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numAlunos = 5;
        double[] notaAlunos = new double[numAlunos];

        for(int i = 0; i < numAlunos; ++i){
            System.out.println("Insira a nota do " + (i+1) + "° aluno");
            notaAlunos[i] = leitor.nextDouble();


        }

        for(int i = 0; i < numAlunos; ++i){
            System.out.println("--> " + notaAlunos[i]);
        }
        leitor.close();
    }
    
}
