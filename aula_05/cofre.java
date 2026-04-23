import java.util.Scanner;

public class cofre {
    public static void main(String[] args) {
        double moeda, soma = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite o valor da moeda ou digite '0' quando nao tiver mais moedas!");
            moeda = teclado.nextDouble();
            soma = soma + moeda;
        }
        while (moeda != 0);

        System.out.printf("Você guardou um total de R$ %.2f ",soma);

    teclado.close();
    }   
}
