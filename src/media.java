import java.util.Scanner;

public class media {
    //main tab
    public static void main(String[] args) {
        
        double nota1, nota2, media;

        Scanner teclado = new Scanner(System.in);
        //sout 
        System.out.println("Digite a nota 1: ");
        nota1 = teclado.nextDouble();

        System.out.println("Digite a nota 2: ");
        nota2 = teclado.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 9){
            System.out.println("parabens execelente desempenho");
        } 
        System.out.println("sua media é : " + media);    
    }
}
