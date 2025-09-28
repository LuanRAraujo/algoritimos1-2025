import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner lt = new Scanner(System.in);
int pessoas=10;
int contador=0;
double somaAltura=0.0;
for(int cont=1;cont<=pessoas;cont++){
    System.out.println("Pessoa "+ cont + ":");
    System.out.println("Digite a sua idade: ");
    int idade=lt.nextInt();
    System.out.println("Digite a sua altura: ");
    double altura=lt.nextDouble();
    if(idade > 50){
        somaAltura+=altura;
        contador++;
    }
    if(idade > 0){
        double media=somaAltura/contador;
        System.out.printf("A média das alturas das pessoas com mais de 50 anos é: " , media , " m ");
    } else {
        System.out.println(" Não há pessoas com mais de 50 anos ");
    }
        }
    }
}
