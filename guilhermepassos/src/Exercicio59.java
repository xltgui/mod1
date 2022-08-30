public class Exercicio59 {
    public static void main(String[] args) {
        double celsius = 10;
        double farenheit = 0;
        
        for (celsius = 10; celsius <= 100; celsius += 10){
            farenheit = (celsius * 1.8) + 32;
            System.out.println("Celsius: " + celsius);
            System.out.println("Farenheit: " + farenheit);
            System.out.println("        ");
        }
        


        
    }
    
}
/* Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus,
iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa deverá apresentar os valores das duas temperaturas.
*/