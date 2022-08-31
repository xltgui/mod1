import java.util.Scanner;


public class Losango {
    public static void main(String[] args) {
        double diagonalMaior, diagonalMenor, area;

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor da diagonal maior do losango: ");
        diagonalMaior = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite o valor da diagonal menor do losango: ");
        diagonalMenor = Double.parseDouble(leitor.nextLine());

        area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("A área do losango é: " + area + " m²");
        
        leitor.close();
        




    }
    
}
