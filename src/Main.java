import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        Double saldo = 1599.99;
        int opcao = 0;

        System.out.println("********");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da conta" + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("********");

        String menu = """
                **************** 
                Digite sua opção
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                ****************
                """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();


            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao ==2 ) {
                System.out.println("Digite o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado: " + saldo);
                }

            }

            else if (opcao == 3) {
                    System.out.println("Valor recebido: ");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Novo saldo: " + saldo);
                }



            else if (opcao != 4) {
                System.out.println("Opção inválida");

            }
        }
    }
}