import java.util.Scanner;

public class acumulador {
    public static void main(String[] args) {
        
        double somaTotal = 0, valor;

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o valor do produto");
            valor = teclado.nextDouble();

            somaTotal = somaTotal + valor;
        }  
        System.out.printf("A soma total foi %.2f" , somaTotal);  
        teclado.close();

    }
}