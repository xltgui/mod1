import java.util.Scanner;

public class mediaturmas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int turmas, alunos, quantAlunos;
        System.out.println("Turmas: ");
        turmas = Integer.parseInt(leitor.nextLine());
        System.out.println("Alunos: ");
        alunos = Integer.parseInt(leitor.nextLine());

        int[] numTurmas = new int[turmas];

        int[] numAlunos = new int[alunos];

        for(int i = 1; i <= turmas; i++){
            System.out.println("Digite a nota do: " + i + "° " + "aluno: ");
            quantAlunos = Integer.parseInt(leitor.nextLine());

        }
        leitor.close();
        
        


        
    }
    /*Faça um algoritmo que calcule a média de todas as turmas de uma escola.
    Considere como entradas o número de turmas e o número de alunos de cada turma. 
    A média de cada turma deve ser apresentada, além da média geral, que será o resultado da média das turmas.
    */

} 
