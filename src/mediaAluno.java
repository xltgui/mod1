import java.util.Scanner;


public class mediaAluno {


    public static void main(String[] args) {
        // VARIÁVEL - TIPO NOME = VALOR;
        float nota1=0, nota2=0, nota3=0, nota4=0;
        float percPresenca = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
    // conversão entre tipo OBJETO para tipo PRIMITIVO
        nota1 = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite a segunda nota: ");
        nota2 = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite a terceira nota: ");
        nota3 = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite a quarta nota: ");
        nota4 = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o percentual de presença do aluno");
        // Converte o texto digitado (nextLine) de String para float
        percPresenca = Float.parseFloat(leitor.nextLine());

        // final = constante
        // a palavara VAR permite que o java crie a variável com o tipo do valor que foi atribuído ao código
        final var media = (nota1 + nota2 + nota3 + nota4) / 4.0f;

        // AND = &&
        // OR = ||
        // NOT !

        System.out.println("Sua media é: " + media);
        
        boolean situação = media >= 7 && percPresenca >= 75;
        if(situação)
        System.out.println("Parabéns vc foi aprovado ");
        else System.out.println("E você reprovou");



        
        leitor.close();        
        
    }
    
}
