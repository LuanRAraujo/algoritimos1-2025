import java.util.Scanner;
public class While6 {
public static void main(String[] args) {
Scanner lt = new Scanner(System.in);
int menor;
int num;
System.out.println("Digite o primeiro número inteiro e positivo: ");
num = lt.nextInt();
menor=num;
int contador=2;
while(contador<=10){
    System.out.println("Digite o " + contador + "° número: ");
    num = lt.nextInt();
    if(num<menor){
        menor=num;
    }
    contador++;
        }
System.out.println("O menor número digitado é: " + menor);
lt.close();
    }
}