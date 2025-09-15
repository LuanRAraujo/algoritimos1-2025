import java.util.Scanner;
public class Switch5 {
public static void main(String[] args) {
Scanner lt=new Scanner(System.in);
System.out.printf("====== Menu de opções ======%nEscolha uma das opções abaixo:%n M - média%n S - diferença%n P - produto%n D - divisão.%n ");
String operacao=lt.next().toUpperCase();
System.out.println("Digite o primeiro número: ");
double num1=lt.nextDouble();
System.out.println("Digite o segundo número: ");
double num2=lt.nextDouble();
double resultado=0;
switch(operacao){
    case "M":
        resultado=(num1+num2)/2;
        System.out.printf("O resultado da média é: %.2f " , resultado);
        break;
        case "S":
        resultado=Math.abs(num1-num2);
        System.out.printf("O resultado da diferença é: %.2f " , resultado);
        break;
        case "P":
            resultado=num1*num2;
            System.out.printf("O resultado da multiplicação é: %.2f " , resultado);
            break;
            case "D":
                resultado=num1/num2;
                System.out.printf("O resultado da divisão é: %.2f " , resultado);
                break;
                default:
                    System.out.println("O operação é inválida! ");
}
lt.close();
        }
    }