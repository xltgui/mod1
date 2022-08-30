import java.util.Scanner;


public class adiçao5 {
    public static void main(String[] args) {
        int  num1, num2, adiçao;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Informe o segundo número: ");
        

        num2 = input.nextInt();

        adiçao = num1 + num2;

        System.out.println("O valor da soma desses dois números é: ");
        System.out.println(adiçao);

        input.close();
    

    }
    
}
