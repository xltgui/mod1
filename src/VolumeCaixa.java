import java.util.Scanner;

public class VolumeCaixa {
    public static void main(String[] args) {
        double altura, compr, largura, volume;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor da altura da caixa: ");
        altura = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite o valor do comprimento da caixa ");
        compr = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite o valor da largura da caixa: ");
        largura = Double.parseDouble(leitor.nextLine());

        volume = altura * compr * largura;

        System.out.println("O volume da caixa retangular é: ");
        System.err.println(volume + " cm²");

        leitor.close();
        



        
    }
    
}
