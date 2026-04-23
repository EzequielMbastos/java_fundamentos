import java.util.Scanner;
import java.util.Random;

public class jogo_adivinhacao {
    public static void main(String[] args) {
        int chute;
        Random random = new Random();
        int numero_secreto = random.nextInt(100) + 1;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Adivinhe o numero");
            chute = teclado.nextInt();

            if (chute > numero_secreto){
                System.out.println("Muito Alto!");
            } else if (chute < numero_secreto) {
                System.out.println("Muito Baixo!");
            } else {
                System.out.println("Parabens! Voce acertou!");
            }

        }while(chute != numero_secreto);
        
    }
}
