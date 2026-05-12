/* array no java(sintaxe igual em c) mas e tratado como um objeto entao assim como scanne para criar precisa usar new
int[] idades = new int[5]

string[] names = new String[3]
double[] notas = new double[10 ou um variavel] 

for ( int i = 0; i < = 9; i++) {
    println(frutas[i]);
for each ( para cada posicao do vetor frutas tem uma string F(frustas[i]))
for (String F: frutas) {
    printlf(F)



}
    
} */

import java.util.Scanner;

public class aula_07 {
    public static void main(String[] args) throws Exception{
        int[] vetor = new int[4];

        Scanner teclado = new Scanner(System.in);

        for (int i : vetor) {
                System.out.println("Digite o valor na posicao " + i);
                i = teclado.nextInt();
        }
        
        System.out.println("=====================================");
        System.out.println("Valores do nosso vetor");

        for (int numero : vetor) {
            System.out.println(numero);
        }

        System.out.println("=====================================");
        System.out.println("Soma Valores do nosso vetor");

        int soma = 0;

        for (int i: vetor){
            soma = soma + i;
        }


        System.out.println("o valor da soma e " + soma);
        teclado.close();
    }
}

