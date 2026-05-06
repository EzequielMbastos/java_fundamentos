import java.util.Scanner;

public class menu_infinito {
    public static void main(String[] args) {
        int opcao;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("1-SALDO 2-SAQUE 3-SAIR");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Exibindo Saldo...");
                    break;
            
                case 2:
                    System.out.println("Iniciando Saque...");
                    break;
                
                case 3:
                    System.out.println("Encerrando Sistema...");
                    break;
        } 
        } while (opcao != 3);

    teclado.close();
    }
}

