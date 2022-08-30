import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        float lado, area;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o comprimento do lado: ");
        lado = Float.parseFloat(leitor.nextLine());

        area = lado * lado;

        System.out.println("A área do quadrado é: " + area + " cm²");

        leitor.close();
        


        
    }
    
}
