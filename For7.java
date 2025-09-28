import java.util.Scanner;
public class For7 {
    public static void main(String[] args) {
        Scanner lt=new Scanner(System.in);
        int totalPessoas = 10;
        int maisDe50 = 0;
        int entre10e20 = 0;
        double somaAlturas10a20 = 0.0;
        int pesoMenor40 = 0;
        for (int cont = 1; cont <= totalPessoas; cont++) {
            System.out.printf("Pessoa %d.%n", cont);
            System.out.println("Digite sua idade: ");
            int idade=lt.nextInt();
            System.out.println("Digite sua altura: ");
            double altura=lt.nextDouble();
            System.out.println("Digite seu peso: ");
            double peso=lt.nextDouble();
            if (idade > 50) {
                maisDe50++;
            }
            if (idade >= 10 && idade <= 20) {
                somaAlturas10a20 += altura;
                entre10e20++;
            }
            if (peso < 40) {
                pesoMenor40++;
            }
            System.out.println();
        }
        double mediaAlturas10a20 = 0.0;
        if (entre10e20 > 0) {
            mediaAlturas10a20 = somaAlturas10a20 / entre10e20;
        }
        double porcentagemPesoMenor40 = (pesoMenor40 * 100.0) / totalPessoas;
        System.out.println("=== Resultados ===");
        System.out.printf("Pessoas com mais de 50 anos: %d%n", maisDe50);
        if (entre10e20 > 0) {
            System.out.printf(" Média das alturas entre 10 a 20 anos: %.2f m%n", mediaAlturas10a20);
        } else {
            System.out.println(" Nenhuma pessoa entre 10 e 20 anos para calcular a média de altura. ");
        }
        System.out.printf(" Porcentagem com peso menor que 40 kg: %.2f%%%n", porcentagemPesoMenor40);
        lt.close();
    }
}
