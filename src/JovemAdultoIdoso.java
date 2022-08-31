import java.util.Scanner;

public class JovemAdultoIdoso {
    public static void main(String[] args) {
        int idade;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        idade = Integer.parseInt(leitor.nextLine());

        if (idade <= 20) {
            System.out.println("Jovem.");
        }

        else if (idade >= 21 && idade <= 60) {
            System.out.println("Adulto.");
        }

        if (idade >= 61) {
            System.out.println("Idoso.");
        }
        leitor.close();

    }
}
