
/* java possue classe chamada array igual scanner 
precisar importar para poder usar as funcoes
import java.util.Arrays;
3 principais comandos mais usados sao Fill, Sort e BinarySearch

Arrays.fill(nome array, valor que quer preencher no array) */
import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        Arrays.fill(numeros, 10);

        System.out.println(numeros);

    }
}

/*Arrays.sort(nome do array) organizar em ordem crescente 
Array.binarySearch() 
int posicao = Arrays.binarySearch (nums, 30);
´array precisa esta ordenado pelo sort antes