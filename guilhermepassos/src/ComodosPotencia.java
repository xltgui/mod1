import java.util.Scanner;

public class ComodosPotencia {
    public static void main(String[] args) {
        double comp, largura, area, potNec;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o comprimento do cômodo: ");
        comp = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite a largura do cômodo: ");
        largura = Double.parseDouble(leitor.nextLine());

        area = largura * comp;

        potNec = area * 18;

        System.out.println("A área desse cômodo é de: " + area + " m²");
        System.out.println(
                "E a potência em Watts necessária para iluminar de maneira correta os cômodos é de: " + potNec + " w");

        leitor.close();

    }

}
