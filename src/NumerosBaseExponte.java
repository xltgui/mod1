import java.util.Scanner;

public class NumerosBaseExponte {
    public static void main(String[] args) {
        float base, expoente, resultado = 1;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a base: ");
        base = Float.parseFloat(leitor.nextLine());
        
        System.out.println("Digite o expoente: ");
        expoente = Float.parseFloat(leitor.nextLine());

        for (float i = expoente; i >= 1; i--) {
            resultado = resultado * base;

            }
            System.out.println("Resultado: " +resultado);

            leitor.close();
            
    }
    
}
