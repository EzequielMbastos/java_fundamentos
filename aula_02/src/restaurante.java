import java.util.Scanner;

public class restaurante {

    public static void main(String[] args) throws Exception {
    
    double valorTotal;
    int numPessoas;
    double taxaServico;
    double valorFinal; 
    double precoPessoa;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Qual o valor da conta");
    valorTotal = teclado.nextDouble();

    System.out.println("Qual a quantidade de pessoas");
    numPessoas = teclado.nextInt();

    System.out.println("Qual a taxa de serviço");
    taxaServico = teclado.nextInt();

    valorFinal = valorTotal + (valorTotal * (taxaServico / 100));

    precoPessoa = valorFinal / numPessoas;


    System.out.printf(" O valor final é : %.2f", valorFinal);
    System.out.printf(" cada pessoa deve pagar : %.2f", precoPessoa);

    //comentario apenas para treinar

    }
}