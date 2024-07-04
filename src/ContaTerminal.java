import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela Scanner os valores digitados pelo usuário
        // Exibir a mensagem conta criada
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            // Dados fixos para simulação
            String nomeCliente = "Mario Andrade";
            double saldo = 237.48;

            // Solicitação e leitura dos dados do usuário
            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.next();

            // Exibição da mensagem de confirmação
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua agência é: " + agencia + ", conta: " + numero + " e seu saldo de R$" + String.format("%.2f", saldo) + " já está disponível para saque.");
        } catch (Exception e) {
            // Tratamento de exceções, se necessário
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
