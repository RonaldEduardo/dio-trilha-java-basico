import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Solicitando o número da conta
        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scan.nextInt();
        scan.nextLine();

        // Solicitando o número da agência
        System.out.println("Por favor, digite o número da Agência!");
        String numeroAgencia = scan.nextLine();

        // Solicitando o nome do cliente
        System.out.println("Por favor, digite seu Nome!");
        String nomeCliente = scan.nextLine();

        // Solicitando o saldo
        System.out.println("Por favor, digite seu saldo atual");
        double saldo = scan.nextDouble();
        scan.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldo);
    }
    }
