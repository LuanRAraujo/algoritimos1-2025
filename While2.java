import java.util.Scanner;
public class While2 {
public static void main(String[] args) {
Scanner lt = new Scanner(System.in);
int contador=1;
int par=0;
int impar=0;
while(contador<=10){
    System.out.println("Digite o " + contador + "o número: ");
    int num = lt.nextInt();
    if(num%2==0){
        par++;
    } else {
        impar++;
    }
    contador++;
        }
System.out.println("O total de pares é: " + par);
System.out.println("O total de ímpares é: "+ impar);
lt.close();
}
}