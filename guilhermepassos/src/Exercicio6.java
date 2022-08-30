import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        double quantRaçaoMes, quantConsRef, numRefDia;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de ração consumida por refeição: ");
        quantConsRef = Double.parseDouble(leitor.nextLine());
        System.out.println("Digite o número de refeições por dia que o cachorro faz: ");
        numRefDia = Double.parseDouble(leitor.nextLine());

        quantRaçaoMes = (quantConsRef * numRefDia) * 31;
        
        System.out.println("A quantidade de ração total consumida pelo cachorro no mês é de: ");
        System.out.println(quantRaçaoMes + " g.");

        leitor.close();


    }
    
}