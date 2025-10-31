// Luan Rodrigues Araújo
import java.util.Scanner;
public class Vetores5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = entrada.nextInt();
        }
        System.out.println("\nDigite os elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = entrada.nextInt();
        }
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] - B[i];
        }
        System.out.println("\nVetor C (A - B):");
        for (int valor : C) {
            System.out.print(valor + " ");
        }
        entrada.close();
    }
}
