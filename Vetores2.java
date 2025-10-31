// Luan Rodrigues Araújo
import java.util.Scanner;
public class    Vetores2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("\nNúmeros pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n\nNúmeros ímpares:");
        for (int num : numeros) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        entrada.close();
    }
}
