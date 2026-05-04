import java.util.Scanner;

public class etiquetaDeBagagem {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do passageiro");
        String dados = teclado.nextLine();
        System.out.println("Digite o destino");
        String destino = teclado.nextLine();

        gerarEtiquerta(dados, destino);

        teclado.close();
    }

    public static void gerarEtiquerta(String nomePasageiro, String destino) {
        System.out.println("BAGAGEM DE: "+ nomePasageiro + " - DESTINO: " + destino);
    }
    
}
