import java.util.Scanner;

public class Massa {
    public static void main(String[] args) {
        double peso, pesoGramas;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o peso em kg: ");
        peso = Double.parseDouble(leitor.nextLine());

        pesoGramas = peso * 1000;

        System.err.println("O peso em gramas é: " + pesoGramas);
         
        leitor.close();

        

        
    }
}
