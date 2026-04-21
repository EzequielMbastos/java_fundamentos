import java.util.Scanner;

public class validador {

    public static void main(String[] args) {
        
        String senhaDigitada;
        String senhaCorreta = "admin123";

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a senha correta");
        senhaDigitada = teclado.nextLine();

        if (senhaDigitada.equals(senhaCorreta)){
            System.out.println("login aprovado");

        } else {
            System.out.println("senha incorreta! Acesso negado!");
        }
    }
}