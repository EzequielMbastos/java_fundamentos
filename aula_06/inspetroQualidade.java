import java.util.Scanner;

public class inspetroQualidade {
    public static void main(String[] args) {

        int passou = 0, nao_passou = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0 ; i < 10; i++) {
            System.out.println("A peça passou no teste? (sim/nao)");
            resposta = teclado.nextLine();

            if (resposta.equals("sim")) {
                passou++;
            } else if (resposta.equals("nao")) {
                nao_passou++;
            } 
        }
        System.out.printf("%d Peças Aprovadas e %d Peças Reprovadas!", passou, nao_passou);
    teclado.close();
    }
}
