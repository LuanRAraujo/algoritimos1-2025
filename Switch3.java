import java.util.Scanner;
public class Switch3 {
public static void main(String[] args) {
Scanner leitor=new Scanner(System.in);
System.out.println("Digite o período das aulas (M para Matutino, V para Vespertino e N para Noturno): ");
String periodo=leitor.nextLine().toUpperCase();
switch(periodo){
    case "M":
        System.out.println("Bom dia!");
        break;
        case "V":
            System.out.println("Boa tarde!");
            break;
            case "N":
                System.out.println("Boa noite!");
                break;
                default:
                    System.out.println("Período invalido! ");
        }
        leitor.close();
    }
}