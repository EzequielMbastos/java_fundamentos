public class Cartao {
    public static void main(String[] args) {
        
        double saldo = 500.0;
        String statusCartao = "ativo";

        if (saldo >= 100 && statusCartao.equals("ativo")) {
            System.out.println("Compra Concluida!");
        } else if (saldo < 100 || statusCartao.equals("Inativo!")) {
            System.out.println("Ligue para o banco!");
        } else {
            System.out.println("Compra negada!");
        }
    }
}
