import java.util.Scanner;

public class SalarioVendas {
    public static void main(String[] args) {
        double fixo, vendas, comissao;

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor do salário fixo: ");
        fixo = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite o valor das vendas: ");
        vendas = Double.parseDouble(leitor.nextLine());
        
        comissao = (4 * vendas) / 100;     //// COMISSÃO = 4% DE VENDAS.

        System.out.println("O valor do salário fixo é: " + fixo);

        System.out.println("O valor da comissão é: " + comissao);

        leitor.close();


        

        
    }
    
}
