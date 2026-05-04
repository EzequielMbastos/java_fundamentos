import java.util.Scanner;

public class boletimVirtual {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome do Aluno : ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota 1 : ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a nota 2 : ");
        double nota2 = teclado.nextDouble();

        exibirBoletim(nome, nota1, nota2);

        teclado.close();

    }

    public static void exibirBoletim (String nomeAluno, double nota1, double nota2) {
        System.out.println("O aluno" + nomeAluno + " ficou com media " + (nota1 + nota2 / 2));
    }
} 
