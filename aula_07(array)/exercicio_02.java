import java.util.Arrays;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) throws Exception {
        
        double[] numeros = new double[5];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
        System.out.println("Digite um preço"); 
            numeros[i] = teclado.nextDouble();
        }

        System.out.println("Digite um preço para buscar");
        double procura = teclado.nextDouble();

        Arrays.sort(numeros);

        int posicao = Arrays.binarySearch(numeros, procura);

        if (posicao > 0) {
            System.out.println("O numero esta na posição : " + posicao);
        } else 
            System.out.println("O numero nao esta no vetor");
            
        teclado.close();
    
    }
}
