import java.util.Scanner;

public class MenuOpções {
    public static void main(String[] args) {
        int numero1, numero2, raiz, escolha;

        Scanner leitor = new Scanner(System.in);

        System.out.println("O menu de opções é: ");
        System.out.println("1. Somar dois número");
        System.out.println("2. Raiz quadrada de um número");
        System.out.println("Escolha uma das opçãoes acima, digitando o número dela.");
        escolha = Integer.parseInt(leitor.nextLine());

        if (escolha == 1) {
            System.out.println("Digite o primeiro número: ");
            numero1 = Integer.parseInt(leitor.nextLine());
            System.out.println("Digite o segundo número: ");
            numero2 = Integer.parseInt(leitor.nextLine());
            System.out.println("A soma dos números é: " + numero1 + numero2);
        } else {
            System.out.println("Digite o número, qual se queira obter a raiz quadrada: ");
            raiz = Integer.parseInt(leitor.nextLine());
            System.out.println((String.format("O valor da raiz quadrada de %d é %2.0f",raiz,Math.sqrt((int)raiz)))); 
        }
        leitor.close();
    }

}
