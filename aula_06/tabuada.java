import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroDigitado;

        System.out.println("Digite um numero : ");
        numeroDigitado = teclado.nextInt();

        gerarTabuada(numeroDigitado);
    }

    public static void gerarTabuada(int numero){
        int valorMultiplicacao;
        for (int i=1; i<=10; i++){
            valorMultiplicacao = numero * i;

            System.out.println(numero + " x " + i + " = " + valorMultiplicacao);
        }
    }
}
