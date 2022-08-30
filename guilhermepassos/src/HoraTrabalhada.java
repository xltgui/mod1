import java.util.Scanner;

public class HoraTrabalhada {
    public static void main(String[] args) {
        float minimo, horasTrab, receber, horaTrab, bruto, imposto;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo: ");
        minimo = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o total de horas trabalhadas: ");
        horasTrab = Float.parseFloat(leitor.nextLine());

        horaTrab = minimo / 2;

        bruto = horasTrab * horaTrab;

        imposto = (3 * bruto) / 100;

        receber = bruto - imposto;

        System.out.println("O salário a receber é de: " + receber);

        leitor.close();

    }

}
