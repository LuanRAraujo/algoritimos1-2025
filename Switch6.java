import java.util.Scanner;
public class Switch6 {
public static void main(String[] args) {
Scanner lt=new Scanner(System.in);
System.out.printf("====== Cardápio ======%n Selecione uma opção:%n 100 - Cachorro quente R$1,20%n 101 - Bauru Simples R$1,30%n 102 - Bauru com Ovo R$1,50%n 103 - Hambúrguer R$1,20%n 104 - Cheeseburguer R$1,30%n 105 - Refrigerante R$1,00%n ");
int codigo=lt.nextInt();
System.out.println("Digite a quantidade: ");
int quantidade=lt.nextInt();
double pagamento=0;
switch(codigo){
    case 100:
pagamento=quantidade*1.20;
System.out.printf("O total da compra é: %.2f%n",pagamento);
break;
    case 101:
        pagamento=quantidade*1.30;
        System.out.printf("O total da compra é: %.2f%n",pagamento);
        break;
        case 102:
            pagamento=quantidade*1.50;
            System.out.printf("O total da compra é: %.2f%n",pagamento);
            break;
            case 103:
                pagamento=quantidade*1.20;
                System.out.printf("O total da compra é: %.2f%n",pagamento);
                break;
                case 104:
                    pagamento=quantidade*1.30;
                    System.out.printf("O total da compra é: %.2f%n",pagamento);
                    break;
                    case 105:
                    pagamento=quantidade*1.0;
                    System.out.printf("O total da compra é: %.2f%n",pagamento);
                    break;
                    default:
                        System.out.println("O código selecionado é inválido!");
}
lt.close();
        }
    }