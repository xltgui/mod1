import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double numFotosRev = 0, valorTotal = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de fotos reveladas: ");
        numFotosRev = Float.parseFloat(leitor.nextLine());

        valorTotal = numFotosRev * 0.90;

        System.out.println("O valor total da revelação é: ");
        System.out.println(valorTotal + " $");

        leitor.close();



    }
    
}
