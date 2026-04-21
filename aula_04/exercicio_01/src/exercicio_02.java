import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) throws Exception {

        int idade;
        String estudante;
        double valor_ingresso = 40;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Idade");
        idade = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Estudante ? sim/nao");
        estudante = teclado.nextLine();

        if (idade > 60 || estudante.equals("sim")) {
            valor_ingresso = 20;
        }

        System.out.println("Valor ingresso " + valor_ingresso);
        teclado.close();

    }
}
