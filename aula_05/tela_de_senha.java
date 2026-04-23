import java.util.Scanner;

public class tela_de_senha {
    public static void main(String[] args) {

        String senha_correta = "java123", senha_usuario;
        
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite a senha :");
            senha_usuario = teclado.nextLine();

            if (!senha_usuario.equals(senha_correta)) {
                System.out.println("Senha Incorreta!");
            }
        } while (!senha_usuario.equals(senha_correta));
        System.out.println("Acesso Liberado!");

        teclado.close();
    }
}
