import java.util.Scanner;

public class Exercicio43 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int livros, quantNec;

        System.out.println("Digite a quantidade de livros: ");
        livros = Integer.parseInt(leitor.nextLine());

        quantNec = livros /32;

        System.out.println("A quantidade de prateleiras necessária para suportar" + " " + livros + " livros é: " + quantNec);

        leitor.close();




        
    }
}
