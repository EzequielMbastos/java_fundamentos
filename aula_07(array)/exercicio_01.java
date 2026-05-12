import java.util.Arrays;

public class exercicio_01 {
    public static void main(String[] args) {
        
        String[] cidades = {
            "Itajai", "Balneario", "Navegantes","Blumenau","Itapema"
        };

        Arrays.sort(cidades);

        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}