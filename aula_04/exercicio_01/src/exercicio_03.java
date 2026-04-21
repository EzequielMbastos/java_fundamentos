import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        
        String produto;
        double valor;
        double qtd;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        produto = teclado.nextLine();

        System.out.println("Digite o valor unitario de produto");
        valor = teclado.nextDouble();

        System.out.println("Quantidade do produto");
        qtd = teclado.nextInt();

        System.out.printf("O produto : " + produto + " custou um total de R$ %.2f " , (qtd * valor));

        teclado.close();
    }
}