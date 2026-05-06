import java.util.Scanner;

public class revisao {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        
        int opcao;

        do {
            System.out.println("Digite a operacao");
            System.out.println("1 - calcular bonus");
            System.out.println("2 - sair do sistema");
            opcao = teclado.nextInt();

            teclado.nextLine();

            switch (opcao) {
                case 1:
                    operacao1();
                    break;

                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Operacao invalida");
            }
        } while (opcao != 2);

        teclado.close();

    }

    public static void operacao1() {

        Scanner sc = new Scanner(System.in);

        String nomeFuncionario;
        int anosDeEmpresa;
        double bonus;

        System.out.println("Digite o nome do funcionario: ");
        nomeFuncionario = sc.nextLine();

        System.out.println("Quantos anos de empresa tem esse funcionario?");
        anosDeEmpresa = sc.nextInt();

        sc.nextLine();

        bonus = calcularPremio(anosDeEmpresa);

        if (nomeFuncionario.equals("Gerente")) {
            bonus = bonus + 1000;
        }
        System.out.println("Bonus de R$" + bonus);

    }

    public static double calcularPremio(int anosTrabalhados) {
        return anosTrabalhados * 200;
    }
}