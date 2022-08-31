import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args) {
        float bmaior, bmenor, altura, area;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tamanho da base maior: ");
        bmaior = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o tamanho da base menor: ");
        bmenor = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o tamanho da altura");
        altura = Float.parseFloat(leitor.nextLine());

        area = (bmaior + bmenor) * altura / 2;

        System.out.println("A área do trapézio é: ");
        System.out.println(area + " cm²");

        leitor.close();
        



    }
    
}
