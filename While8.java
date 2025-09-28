import java.util.Scanner;
public class While8 {
public static void main(String[] args) {
Scanner lt = new Scanner(System.in);
int aluno=1;
while(aluno<=5){
    double nota1,nota2;
    do {
        System.out.println("Aluno " + aluno + " digite a primeira nota: ");
        nota1 = lt.nextDouble();
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota invalida! Digite novamente. ");
        }
    } while (nota1<0 || nota1>10);
        do {
            System.out.println("Aluno " + aluno + " digite a segunda nota: ");
            nota2 = lt.nextDouble();
            if (nota2<0 || nota2>10) {
                System.out.println("Nota invalida! Digite novamente. ");
            }
        } while (nota2<0 || nota2>10);
        double media=(nota1+nota2)/2;
        System.out.printf("A média do aluno %d: %.2f%n%n ", aluno, media);
        aluno++;
    }
        }
    }