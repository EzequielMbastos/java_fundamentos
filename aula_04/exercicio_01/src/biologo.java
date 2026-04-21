import java.util.Scanner;

public class biologo {
    public static void main(String[] args) {
        
        int pernas;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas pernas tem o animal");
        pernas = teclado.nextInt();

        switch (pernas) {
            case 2:
                System.out.println("Bipede");
                break;
        
            case 4 :
                System.out.println("Quadrúpede");
                break;

            case 6 :
                System.out.println("Inseto");
                break;

            case 8 :
                System.out.println("Aracnídeo");

            case 100 :
                System.out.println("Centopéia");

            default :
                System.out.println("Espécie desconhecida");
        }

        teclado.close();
    }
}
