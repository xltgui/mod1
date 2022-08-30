import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salario, aumento1, aumento2, aumento3, aumento4, salarioAumentado1, salarioAumentado2, salarioAumentado3,
                salarioAumentado4;
        int codigo;

        System.out.println("Menu de cargos: ");
        
        System.out.println("1. Escrituário.");
        System.out.println("2. Secretário.");
        System.out.println("3. Caixa.");
        System.out.println("4. Gerente.");
        System.out.println("5. Diretor:");
        

        System.out.println("Digite o código correspondente ao cargo: ");
        codigo = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o salário atual do funcionário: ");
        salario = Double.parseDouble(leitor.nextLine());
        System.out.println();

        aumento1 = (50 * salario) / 100;
        aumento2 = (35 * salario) / 100;
        aumento3 = (20 * salario) / 100;
        aumento4 = (10 * salario) / 100;

        salarioAumentado1 = salario + aumento1;
        salarioAumentado2 = salario + aumento2;
        salarioAumentado3 = salario + aumento3;
        salarioAumentado4 = salario + aumento4;

        if (codigo == 1) {
            System.out.println("Cargo: Escrituário.");
            System.out.println("O valor do aumento é: " + " R$ " + aumento1);
            System.out.println("O valor do salário aumentado é: " + "R$ " + salarioAumentado1);

        } else if (codigo == 2) {
            System.out.println("Cargo: Secretário.");
            System.out.println("O valor do aumento é: " + " R$ " + aumento2);
            System.out.println("O valor do salário aumentado é: " + "R$ " + salarioAumentado2);

        } else if (codigo == 3) {
            System.out.println("Cargo: Caixa.");
            System.out.println("O valor do aumento é: " + " R$ " + aumento3);
            System.out.println("O valor do salário aumentado é: " + "R$ " + salarioAumentado3);

        } else if (codigo == 4) {
            System.out.println("Cargo: Gerente.");
            System.out.println("O valor do aumento é: " + " R$ " + aumento4);
            System.out.println("O valor do salário aumentado é: " + "R$ " + salarioAumentado4);
            }
            else if(codigo == 5){
                System.out.println("Cargo: Diretor.");
                System.out.println("O diretor não tem direito ao aumento.");
                
            }
            leitor.close();
                

        }
    }

