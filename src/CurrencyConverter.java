import java.util.Scanner;

public class CurrencyConverter {
    private Scanner scanner;
    private ExchangeRateAPI api;

    public CurrencyConverter() {
        this.scanner = new Scanner(System.in);
        this.api = new ExchangeRateAPI();
    }

    public void run() {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Obrigado por usar o Conversor de Moedas!");
                break;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Opção inválida. Por favor, tente novamente.");
                continue;
            }

            System.out.print("Digite o valor a ser convertido: ");
            double amount = scanner.nextDouble();

            CurrencyPair pair = CurrencyPair.fromChoice(choice);
            if (pair == null) {
                System.out.println("Erro ao selecionar o par de moedas.");
                continue;
            }

            try {
                double result = convertCurrency(amount, pair);
                System.out.printf("%.2f %s = %.2f %s%n", amount, pair.getFromCurrency(), result, pair.getToCurrency());
            } catch (Exception e) {
                System.out.println("Erro ao converter moeda: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\nBem-vindo ao Conversor de Moedas!");
        System.out.println("Escolha uma opção:");
        System.out.println("1. USD para EUR");
        System.out.println("2. EUR para USD");
        System.out.println("3. USD para BRL");
        System.out.println("4. BRL para USD");
        System.out.println("5. EUR para BRL");
        System.out.println("6. BRL para EUR");
        System.out.println("0. Sair");
        System.out.print("Digite o número da opção desejada: ");
    }

    private double convertCurrency(double amount, CurrencyPair pair) throws Exception {
        double rate = api.getExchangeRate(pair.getFromCurrency(), pair.getToCurrency());
        return amount * rate;
    }
}