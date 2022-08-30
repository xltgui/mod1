import java.util.Arrays;

public class Exercicio81 {
    public static void main(String[] args) {
        int[] x = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int[] y = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int[] uniaox = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
        int[] diferenca = new int[10];
        int proxlivre = 0;
        int soma = 0;
        int mult = 0;
        System.out.println("Intersecção: " + "Não há nenhum número repetido");
        System.out.println("       ");
        System.out.println("União de X: " + Arrays.toString(uniaox));
        System.out.println("        ");
        System.out.println("        ");
        System.out.println("Soma:");

        for (int i = 0; i < 10; i++) {
            soma = x[i] + y[i];
            System.out.println(x[i] + " + " + y[i] + " = " + soma);
        }
        System.out.println("          ");
        System.out.println("           ");
        System.out.println("Multiplicação:");
        for (int j = 0; j < 10; j++) {
            mult = x[j] * y[j];
            System.out.println(x[j] + " * " + y[j] + " = " + mult);
        }
        System.out.print("\t");
        System.out.println("Diferença:");
        for (int i = 0; i < 10; i++) {
            System.out.println("diff X: " + x[i]);
            boolean achei = false;
            for (int j = 0; j < 10; j++) {
                System.out.println("\tdiff Y: " + y[j]);
                if (x[i] == y[j]) {
                    System.out.println("ACHEI IGUAL");
                    achei = true;
                    break;
                }
            }
            if (!achei) {
                diferenca[proxlivre] = x[i];
                proxlivre++;
            }

        }
        System.out.println("         ");
        System.out.println("Intersecção: ");
        int[] interseccao = new int[10];
        proxlivre = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("\tinter Y: " + y[i]);
            if(x[i] == y[i]) {
                interseccao[proxlivre] = x[i];
                proxlivre++;
                break;
            }
        }
        System.out.println(Arrays.toString(interseccao));
    }
    
}
