import java.util.Scanner;

public class caixaSupermercado {
    public static void main(String[] args) {

        double somaTotal = 0, valorProduto;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("Digite o valor do Produto : ");
            valorProduto = teclado.nextDouble();
            if (valorProduto > 0) {
                somaTotal = somaTotal + valorProduto;
            }
        } while (valorProduto > 0);
        if (somaTotal > 200) {
            somaTotal = somaTotal - (somaTotal * 0.1);
        }
        
        System.out.printf("O valor total a ser pago: %.2f", somaTotal);
    
    teclado.close();
    }
}
