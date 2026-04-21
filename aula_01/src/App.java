import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nome;
        double peso, altura, imc;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome : ");
        nome = teclado.nextLine();

        System.out.println("Digite seu peso : ");
        peso = teclado.nextDouble();

        System.out.println("Digite sua altura : ");
        altura = teclado.nextDouble();

        imc = peso / Math.pow(altura, 2);

        System.out.println(nome + " seu IMC : " + imc);

        if (IMC < 18.5) {
            System.out.println(" Você esta abaixo do peso ");
        }
        else if (imc > 18.5{

        }

        Baixo Peso: IMC < 18,5
        Peso Normal (Saudável): IMC entre 18,5 e 24,9
        Sobrepeso: IMC entre 25,0 e 29,9


      
    }
}
