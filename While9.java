import java.util.Scanner;
public class While9 {
public static void main(String[] args) {
Scanner lt = new Scanner(System.in);
double total=0;
char continuar;
do {
    System.out.printf("====== Cardápio ======%n " + "Selecione uma opção:%n " + " 100 - Cachorro Quente R$1,20%n " + " 101 - Bauru Simples R$1,30%n " + " 102 - Bauru com Ovo R$1,50%n " + " 103 - Hambúrguer R$1,20%n " + " 104 - Cheeseburguer R$1,30%n " + " 105 - Refrigerante R$1,00%n ");
    System.out.println("Digite o código do produto: ");
    int codigo = lt.nextInt();
    System.out.println("Digite a quantidade: ");
    int quantidade = lt.nextInt();
    double pagamento=0.0;
    switch(codigo){
        case 100:
            pagamento=quantidade*1.20;
            break;
            case 101:
                pagamento=quantidade*1.30;
                break;
                case 102:
                    pagamento=quantidade*1.50;
                    break;
                    case 103:
                        pagamento=quantidade*1.20;
                        break;
                        case 104:
                            pagamento=quantidade*1.30;
                            break;
                            case 105:
                                pagamento=quantidade*1.00;
                                break;
                                default:
                                    System.out.println("Código inválido! ");
                                    pagamento=0.0;
    }
    if (pagamento > 0) {
        System.out.printf("O total deste produto: R$%.2f%n", pagamento);
        total+=pagamento;
    }
    System.out.println("Gostaria de comprar outro produto? (S/N)" );
    continuar = lt.next().toUpperCase().charAt(0);
        } while(continuar == 'S');
System.out.printf("%nValor Total da compra: R$ %.2f%n", total);
 lt.close();
    }
}