import java.util.Scanner;
public class While7 {
public static void main(String[] args) {
    Scanner lt = new Scanner(System.in);
    double altura, peso;
    double imc = 0;
    int contador = 1;
    int naoObeso = 0;
    while (contador <=10)
    {
        System.out.println("Pessoa " + contador+ " digite sua altura: " );
        altura = lt.nextDouble();
        System.out.println("Pessoa " + contador+ " digite seu peso: " );
        peso = lt.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf("IMC da pessoa %d: %.2f%n " , contador , imc);
        if (imc >= 18.5 && imc <= 24.9 ) {
            naoObeso++;
        }
        contador++;
    }
    System.out.println("\nTotal de pessoas sem obesidade é: " + naoObeso);
}
    }