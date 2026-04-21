import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args) {

        int numero;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println(" O numero é impar");
        }
    }  
}
