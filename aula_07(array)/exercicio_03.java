import java.util.Scanner;
import java.util.Arrays;

public class exercicio_03 {
    public static void main(String[] args) {

        int numero_alunos;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Quantos alunos existem");
        numero_alunos = teclado.nextInt();

        double[] notas = new double[numero_alunos];

        for (int i = 0 ; i < notas.length; i++){
            System.out.println("Digite a nota do aluno " + i);
            notas[i] = teclado.nextDouble();
        }

        double media = 0;

        for (double nota : notas) {
            media = media + nota;
        }

        System.out.println("a media é : " + (media / numero_alunos));

        teclado.close();
    }
}
