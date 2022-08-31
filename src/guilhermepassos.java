public class guilhermepassos { 
//ISSO É UM COMENTÁRIO
    public static void main(String[] args) throws Exception {
        //System.out.println("oi eu sou o goku"); esse é o console.log usado no java, 
        //println (O PRINTIN É UMA LETRA L de LAPIS)

        //int significa INTEIRO

        int primeironumero = 10;
        int segundonumero = 5;

        System.out.print("a soma dos números é " );
    //.print (invés de println) foi para não separar as linhas.


        System.out.println((float)primeironumero + segundonumero);
        // ou... int soma = primeironumero + segundonumero
        // System.out.println(soma);

        //ou...  System.out.println("o resultado é: " + resultado) ----- CONCATENAÇÃO

        //ou...   System.out.println(String.format("o resultado é: %d" , resultado))
        //     %d  SIGNIFICA máscara,         a variavel depois da virgula vai ocupar o lugar de %d.
    

        System.out.print("o resultado da divisão desses dois números é: " + ((float)primeironumero / segundonumero));
        
        System.out.println(       );
        System.out.print("o resultado da multiplicação desses dois números é: " + ((float)primeironumero * segundonumero));

        System.out.println(       );
        System.out.print("o resultado da subtração desses dois números é: " + ((float)primeironumero - segundonumero));
        System.out.println(       );
        
        //        tipo lógico   (booleano) = true or false
        boolean comparação = primeironumero == segundonumero;
        System.out.println("O primeironumero é igual ao segundonumero...");
        System.out.println(comparação);

        String nome = "gui";
        System.out.println(nome.replace("i", "*"));

        char umaLetra = 'a';
        System.out.println(umaLetra);
        System.out.println((int)umaLetra);


    
        // o L após o numero classifica ele como LONG, ou seja suporta até 64 bits.
        long numeroGrande = 10L;
        //int vaiDarRuim = 10L   ---------------- a vaiável INT não suporta o valor long por que só aguenta 32 bits. 
        System.out.println(numeroGrande);

        int salario = (int)1210.5f;
        System.out.println(salario);


        // DOUBLE = 64bits          FLOAT = 32bits
        // como 1000.0 é um double, não é possivel colocar 64 em bits em algo que cabe 32.
        //  float ExemploImposto = 1000.0;










    }
}
