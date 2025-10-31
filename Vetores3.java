// Luan Rodrigues Araújo
import java.util.Scanner;
public class Vetores3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = entrada.nextLine();
        }
        System.out.println("\nNomes do último para o primeiro:");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
        System.out.println("\nPrimeiro nome: " + nomes[0]);
        System.out.println("Último nome: " + nomes[nomes.length - 1]);
        entrada.close();
    }
}
