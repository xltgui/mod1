
import java.util.Scanner;

public class Arrendondar {
    public static void main(String[] args) {
    
        double numero;
        

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número: ");
        numero = Double.parseDouble(leitor.nextLine());

        int numInteiro = (int)numero;

        System.out.println("A parte inteira desse número é: " + numInteiro);

        System.out.println("O número de forma arredondado fica: " + Math.round(numero)); ////////// Math.round(numero)     arredonda o numero.
        

        System.out.println("A parte fracionada desse número é: " + (numero - numInteiro));

        

        


        leitor.close();
        




        

        
        
        

    


        
        
    }
    
}
