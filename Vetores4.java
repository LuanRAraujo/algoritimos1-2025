// Luan Rodrigues Araújo
import java.util.Scanner;
public class Vetores4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número do vetor A: ");
            A[i] = entrada.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = A[i] * 3;
        }
        System.out.println("\nVetor B (A multiplicado por 3):");
        for (int valor : B) {
            System.out.print(valor + " ");
        }
        entrada.close();
    }
}
