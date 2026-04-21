import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        
        double nota1, nota2, media;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = teclado.nextDouble();

        media = (nota1 + nota2) / 2;
        System.out.printf("Media : %.1f !", media);
        if (media >= 7){
            System.out.println("Aluno Aprovado");
        } else if (media <= 6.9 && media > 5.0) {
            System.out.println("Aluno em Recuperação!");
        } else {
            System.out.println("Aluno Reprovado!");
        }
        teclado.close();
    }
}