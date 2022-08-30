import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double taxa, valorCompra, d5, d10, d13;

        System.out.println("Digite o valor da compra: ");
        valorCompra = Double.parseDouble(leitor.nextLine());
        
        taxa = 1.5;

        d5 = (5 * valorCompra) / 100;
        d10 = (10 * valorCompra) /100;
        d13 =  (13 * valorCompra) /100;

        if(valorCompra <= 100){
            System.out.println("Valor com desconto + taxa: ");
            System.out.println((valorCompra - d5) + taxa); 
        }else if(valorCompra >= 100 && valorCompra <= 400){
            System.out.println("Valor com desconto + taxa: ");
            System.out.println((valorCompra - d10) + taxa);
        }else{
            System.out.println("Valor com desconto + taxa: ");
            System.out.println((valorCompra - d13) + taxa);
        }
        leitor.close();

    
    }
    
}
