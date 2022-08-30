import java.util.*;

public class zenos
{

    public static void main(String[] args) {   

        int classes;
        int students[][] = new int[1][1];
        int grades[][] = new int[0][0];       
        int i=0,j=0,k=0,l=0;
        boolean checkStudents = true, checkGrades = true;
        double total=0, avg=0, soma=0;
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.println("Insira a quantidade de turmas:");
        
        classes = scanner.nextInt();
        
        for(i=0; i<classes; i++) { 
            System.out.println("Insira a quantidade de alunos da turma " + (i+1) + ":");
            
            j = scanner.nextInt();
            if (checkStudents == true){ students = new int[1][classes];}
            students[0][i] = j;
            
             for(k=0; k<j; k++) { 
            System.out.println("Insira as "+ j +" notas (faltam " +(j-k)+ " notas):");
            
            l = scanner.nextInt();
            if (checkGrades == true){ grades = new int[11][11];}
            grades[i][j] = l;
            soma = soma + l;
            avg = (Math.round(soma/j*100.0))/100.0;
            checkStudents = false;
            checkGrades = false;
             }
            System.out.println("A média da turma "+ (i+1) +" é de: " + avg + "");

            total = total+avg;
            soma = 0;
            avg = 0;
        } 
    
    total = (Math.round(total/classes*100.0))/100.0;
    System.out.println("A média total é de: " + (total) + "");
    scanner.close();
    
    }
	
}