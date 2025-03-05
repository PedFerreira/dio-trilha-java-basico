/**
 *
 * @author Pedro Ferreira
 */

import java.utils.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 123.44;
        Scanner ler = new Scanner(System.in);

        System.out.println("Seja bem vindo ao Banco! Comece digitando seu nome:");
        nomeCliente = ler.next();

        System.out.println("Por favor, digite o nome da sua agencia:");
        agencia = ler.next();

        System.out.println("Agora, digite o numero da sua conta:");
        numeroConta = ler.nextInt();

        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numeroConta+ " e seu saldo " +saldo+ " já está disponível para saque");
    }
}
