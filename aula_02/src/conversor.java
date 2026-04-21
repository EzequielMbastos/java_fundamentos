import java.util.Scanner;

public class conversor {

    public static void main(String[] args) throws Exception {

        int segundos, horas, minutos, segundosRestantes;

        Scanner teclado = new Scanner(System.in);

        System.out.println("digite um tempo em segundos: ");
        segundos = teclado.nextInt();
        
        horas = segundos / 3600;
        segundosRestantes = segundos % 3600;
        minutos = segundosRestantes / 60;
        segundosRestantes = segundosRestantes % 60;

        System.out.println("Tempo total : " + horas + " horas " + minutos + " minutos e " + segundosRestantes + " segundos restantes" );
    }   
}
