import java.util.Scanner;

public class compraOnline {

    public static void main(String[] args) throws Exception {

        double valorProduto;
        double desconto;
        double valorDesconto;
        double valorFinal;
        double valorFinalcomDesconto;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o valor do produto");
        valorProduto = teclado.nextDouble();

        System.out.println("Qual o desconto");
        desconto = teclado.nextDouble();

        valorDesconto = valorProduto * (desconto /100);
        System.out.printf(" O valor do desconto : %.2f", valorDesconto);
        valorFinal = valorProduto - valorDesconto;

        

        System.out.printf(" O valor do produto é : %.2f", valorFinal);

    }
}
