import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double rendimento, i8, i11;

        System.out.println("Digite o valor do rendimento anual: ");
        rendimento = Double.parseDouble(leitor.nextLine());

        i8 = (8 * rendimento) /100;
        i11 = (11 * rendimento) /100;
        if(rendimento < 19200){
            System.out.println("Isento.");
        }else if(rendimento > 19200 && rendimento <= 30000){
            System.out.println("Imposto de: " + i8);
            System.out.println("Valor total com imposto: ");
            System.out.println(rendimento + i8);
        }else{
            System.out.println("Imposto de: " + i11);
            System.out.println("Valor total com imposto: ");
            System.out.println(rendimento + i11);
        }
        leitor.close();
    }
    
}
