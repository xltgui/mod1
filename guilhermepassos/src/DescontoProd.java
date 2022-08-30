
import java.util.Scanner;

public class DescontoProd {
    public static void main(String[] args) {
        float preço, preçoDesconto;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o preço bruto do produto: ");
        preço = Float.parseFloat(leitor.nextLine());

        preçoDesconto = preço - (preço * 10) / 100;

        System.out.println("O preço do produto com 10% de desconto é: " + preçoDesconto);

        leitor.close();

    

        
    }
    
}
