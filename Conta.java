import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String name = reader.nextLine();
        System.out.println("Digite seu saldo atual:");
        double saldo = reader.nextDouble();
        System.out.println("\nNome do cliente: "+name+"\nTipo conta: Corrente");
        int opcao = 0;
        while (opcao != 4){
            System.out.println("\n*** Digite sua opção ***\n1 - Consultar saldo \n2- Transferir valor \n3- Receber valor \n4- Fechar aplicativo");
            opcao = reader.nextInt();
            if(opcao == 1){
                System.out.println("\nSaldo atual: "+saldo);
            } else if (opcao == 2) {
                System.out.println("\nTransfira o valor desejado:");
                double transferirSaldo = reader.nextDouble();
                saldo = saldo - transferirSaldo;
                System.out.println("\n... Transação concluida!");
            } else if (opcao==3) {
                System.out.println("\nReceba o valor desejado:");
                double receberSaldo = reader.nextDouble();
                saldo = saldo + receberSaldo;
                System.out.println("\n... Valor recebido!");
            }
        }
        System.out.println("\nFechar aplicativo...!");
    }
}
