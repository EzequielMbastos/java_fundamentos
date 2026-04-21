import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) throws Exception {
        double nota;
        int frequencia;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota");
        nota = teclado.nextDouble();

        System.out.println("Digita a frequencia");
        frequencia = teclado.nextInt();

        if (nota >= 7.0 && frequencia >= 75) {
            System.out.println("APROVADO!");
        } else if (nota >= 5.0 && nota <= 6.0 && frequencia >= 75) {
            System.out.println("RECUPERAÇÂO");
        } else {
            System.out.println("REPROVADO");
        }

        teclado.close();
    }
}