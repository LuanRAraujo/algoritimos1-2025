// Luan Rodrigues Araújo
import java.util.Random;
public class MenorNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[10];
        int menor;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10) + 1; // +1 para incluir o 10
        }
        menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.print("Vetor: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println("\nMenor número: " + menor);
    }
}
