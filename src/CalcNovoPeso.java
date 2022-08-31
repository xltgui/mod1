import java.util.Scanner;

public class CalcNovoPeso {
    public static void main(String[] args) {
        double peso, pEngordar, pEmagrecer;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o peso: ");
        peso = Double.parseDouble(leitor.nextLine());

        pEngordar = peso + (15 * peso) / 100;

        pEmagrecer = peso - (20 * peso) / 100;

        System.out.println("Se a pessoa engordar em 15%, seu novo peso será: " + pEngordar + " kg");
        
        System.out.println("Se a pessoa emagrecer em 20%, seu novo peso será: " + pEmagrecer + " kg");

        leitor.close();
    }
    
}
