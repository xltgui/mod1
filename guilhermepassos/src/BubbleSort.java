public class BubbleSort {
    public static void main(String[] args) {
        int vetor[] = {3, 6, 2, 1, 8, 4, 7, 5, 9, 10};
        int aux;
        boolean controle;

        for (int i = 0; i < vetor.length; ++i) {
            controle = true;

            for (int j = 0; j < (vetor.length - 1); ++j) { 
              

                if (vetor[j] > vetor[j + 1]) {
                    //    INVERSÃO
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    //    INVERSÃO
                    controle = false;

                }

            }
            if (controle) {
                break;
            }

        }
        for (int i = 0; i < vetor.length; ++i) {
            System.out.print(vetor[i] + "");
        }

    }

}
