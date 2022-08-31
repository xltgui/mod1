import java.util.Scanner;

public class ConversãoTemp {
    public static void main(String[] args) {
        float celsius, farenheit;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius: ");
        celsius = Float.parseFloat(leitor.nextLine());

        farenheit = (9 * celsius + 160) / 5;

        System.out.println("O temperatura em farenheit é: ");
        System.out.println(farenheit + " °F");

        leitor.close();





    }
    
}
