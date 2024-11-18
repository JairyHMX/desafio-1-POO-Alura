import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int saldoInicial = 3000;

        System.out.println("Dados iniciais do cliente:\n" +
                "Nome do cliente: Jairy Silva\n" +
                "Tipo de conta: Corrente\n" +
                "Saldo inicial: R$ " + saldoInicial + "\n" +
                "Operações\n" +
                "1 - Consultar Saldo\n" +
                "2 - Depositar\n" +
                "3 - Saque\n" +
                "4 - Sair\n" +
                "Digite a opção desejada:");

        int escolha = leitura.nextInt();

        while (escolha != 4) {
                if (escolha == 1) {
                System.out.printf("Seu saldo atual é: R$ " + saldoInicial + "\n");
            } else if (escolha == 2) {
                System.out.print("Qual valor deseja depositar? ");
                int deposito = leitura.nextInt();
                saldoInicial += deposito;
                System.out.printf("Agora o saldo é de R$ " + saldoInicial + "\n");
            } else if (escolha == 3) {
                System.out.print("Qual valor deseja sacar? ");
                int saque = leitura.nextInt();
                if (saque <= saldoInicial) {
                    saldoInicial -= saque;
                    System.out.printf("Agora o saldo é de R$ " + saldoInicial + "\n" );
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else {
                System.out.println("Opção inválida.");
            }
            System.out.println("Operações\n" +
                    "1 - Consultar Saldo\n" +
                    "2 - Depositar\n" +
                    "3 - Saque\n" +
                    "4 - Sair\n" +
                    "Digite a opção desejada:");
            escolha = leitura.nextInt();
        }

    }}
