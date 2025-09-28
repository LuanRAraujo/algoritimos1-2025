import java.util.Scanner;
public class For5 {
public static void main(String[] args) {
Scanner lt = new Scanner(System.in);
int totalAlunos = 6;
int aprovados = 0;
int reprovados = 0;
int exame=0;
double somaMediaClasse=0;
for (int cont = 1; cont <= totalAlunos; cont++) {
    System.out.println("Aluno " + cont + ":");
    System.out.println("Digite a primeira nota: ");
    double nota1= lt.nextDouble();
    System.out.println("Digite a segunda nota: ");
    double nota2= lt.nextDouble();
    double media = (nota1+nota2)/2.0;
    somaMediaClasse+=media;
    String situacao;
    if (media<=3) {
        situacao = "Reprovado";
        reprovados++;
    }else if (media<7) {
        situacao = "Exame!";
        exame++;
    }else {
        situacao = "Aprovado";
        aprovados++;
        }
    System.out.println("Média: " + media + " - " + situacao);
    System.out.println();
    }
System.out.println("Total de alunos aprovados: " + aprovados);
System.out.println("Total de alunos exame: " + exame);
System.out.println("Total de alunos reprovados: " + reprovados);
double mediaClasse = somaMediaClasse/totalAlunos;
System.out.println("Media da classe: " + mediaClasse);
lt.close();
}
}
