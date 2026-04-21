import java.util.Scanner;

public class BoasVindas{
	
	public static void main(String[] args)	{
		
		String nome;
		System.out.print("Digite seu nome : ");
		Scanner leitor = new Scanner(System.in);
		nome = leitor.nextLine();
	
		System.out.println("Digite seu Genero 'M' ou 'F'?");
		String gen = leitor.nextLine(); 
		
		System.out.println("Digite sua idade!");
		int idade = leitor.nextInt();

	
		if (gen.equals("M") || gen.equals("m")) {
			System.out.print("Bem vindo, " + nome + " voce ja viveu " + idade + " anos!");
		}
		else if (gen.equals("F") || gen.equals("f")) {
			System.out.print("Bem vinda, " + nome + "voce ja viveu " + idade + " anos!");
		}
	
		else {
            System.out.print("Gênero inválido!");
		}
	
	leitor.close();
	}
}
