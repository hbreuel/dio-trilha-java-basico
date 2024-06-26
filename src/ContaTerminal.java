import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Simulador de conta digital</h1>
 * <p>Projeto para teste de conhecimentos do Bootcamp Java</p>
 * 
 * 
 * @author Henrique Breuel
 * @version 1.0
 * @since 26/06/2024
 * * 
 */



public class ContaTerminal {    

    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem-vindo ao Banco Digital");
        System.out.println();

        System.out.println("Por favor, digite o número da sua conta:");
        numero = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        agencia = scanner.next();

        System.out.println("Insira seu nome completo:");
        nomeCliente = scanner.next();

        System.out.println("Digite o saldo desejado:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        

    }
}
