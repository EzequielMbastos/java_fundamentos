import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class autoAtendimento {
    public static void main(String[] args) {
        
        int opcao;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual Operação deseja fazer?");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Verificando Saldo...");
                break;
            
            case 2:
                System.out.println("Iniciando PIX...");
                break;
            case 3:
                System.out.println("Buscando Atendente...");
                break;
            default:
                System.out.println("Opção Invalida!");
                break;
        }
        teclado.close();
    }
    
}
