import java.util.Scanner;

public class triagem {
    public static void main(String[] args) {
        
        int idade;
        String gestante, pcd;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual sua idade");
        idade = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Você é gestante (sim/não)");
        gestante = teclado.nextLine();

        System.out.println("Você é PCD");
        pcd = teclado.nextLine();

        if (idade > 65 || gestante.equals("sim") || pcd.equals("sim")){
            System.out.println("Fila Prioritaria!");
        } else {
            System.out.println("Fila comum!");
        }
    }
}
