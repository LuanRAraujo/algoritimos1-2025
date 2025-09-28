import java.util.Scanner;
public class For6 {
    public static void main(String[] args) {
        Scanner lt=new Scanner(System.in);
        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votos4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalEleitores = 10;
        for (int cont = 1; cont <= totalEleitores; cont++) {
            System.out.println("Eleitor " + cont + " - Digite seu voto (1-4 candidatos, 5 nulo, 6 branco): ");
            int voto=lt.nextInt();
            switch (voto) {
                case 1:
                    votos1++;
                    break;
                case 2:
                    votos2++;
                    break;
                case 3:
                    votos3++;
                    break;
                case 4:
                    votos4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Voto inválido! Não será contabilizado.");
            }
        }
        double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
        double percentualNulos = (votosNulos * 100.0) / totalEleitores;
        System.out.println("\n=== Resultado da Eleição ===");
        System.out.println("Total de votos para o Candidato 1: " + votos1);
        System.out.println("Total de votos para o Candidato 2: " + votos2);
        System.out.println("Total de votos para o Candidato 3: " + votos3);
        System.out.println("Total de votos para o Candidato 4: " + votos4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);
        System.out.println("Percentual de votos nulos: "+ percentualNulos);
        System.out.println("Percentual de votos em branco: "+ percentualBrancos);
        lt.close();
    }
}
