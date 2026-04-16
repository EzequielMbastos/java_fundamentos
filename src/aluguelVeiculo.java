import java.util.Scanner;

public class aluguelVeiculo {
    public static void main(String[] args) {
        
        int idade;
        String cnhValida;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        idade = teclado.nextInt();
        
        teclado.nextLine();
        
        System.out.println("Sua CNH esta valida!");
        cnhValida = teclado.nextLine();

        if (idade > 18 && cnhValida.equals("sim")) {
            System.out.println("Você pode alugar um carro!");
        } else {
            System.out.println("Você não pode alugar um carro!");
        }
    }
}
