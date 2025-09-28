import java.util.Scanner;
public class While3 {
public static void main(String[] args) {
Scanner lt = new Scanner(System.in);
System.out.println("Digite um número inteiro: ");
int limite = lt.nextInt();
int  num = 1;
while(num<=limite){
    System.out.println(num+ " ");
    num=num*2;
        }
lt.close();
    }
}