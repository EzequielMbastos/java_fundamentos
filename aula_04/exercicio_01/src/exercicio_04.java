import java.util.Scanner;

public class exercicio_04 {
    public static void main (String[] args) {

        int velocidade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Velocidade do veiculo");
        velocidade = teclado.nextInt();

        if (velocidade > 80) {
            System.out.println("Multado! Você excedeu o limite");    
        } else {
            System.out.println("Velocidade dentro do limite. Boa viagem!");
        }
        teclado.close();
    }
}