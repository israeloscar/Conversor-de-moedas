import java.util.Scanner;

public class Main {

    static final double COTACAO_DOLAR = 5.20;
    static final double COTACAO_EURO = 6.07;
    static final double COTACAO_REAL = 1.00;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu(sc);

    }

    public static double conversor(double valor, double cotacaoOrigem, double cotacaoDestino) {
        double valorMultiplicado = valor * cotacaoOrigem;
        return valorMultiplicado / cotacaoDestino;
    }

    public static void menu(Scanner sc) {

        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Real");
        System.out.print("Escolha a moeda: ");
        int escolha = Integer.parseInt(sc.nextLine());

        switch (escolha) {
            case 1:
                System.out.println("1- Euro");
                System.out.println("2 - Real");
                System.out.print("Deseja converter Dólar para qual moeda?: ");
                int escolhaConversaoDolar = Integer.parseInt(sc.nextLine());

                switch (escolhaConversaoDolar) {
                    case 1:
                        System.out.print("Quantos dólares? (ex: 32.45): ");
                        double numDolares = Double.parseDouble(sc.nextLine());

                        double conversaoDolarEuro = conversor(numDolares, COTACAO_DOLAR, COTACAO_EURO);
                        System.out.println(numDolares + " Dólares em Euros: " + String.format("%.2f", conversaoDolarEuro)  + " Euros");
                        break;
                    case 2:
                        System.out.print("Quantos dólares? (ex: 32.45): ");
                        double numeroDolares = Double.parseDouble(sc.nextLine());

                        double conversaoDolarReal = conversor(numeroDolares, COTACAO_DOLAR, COTACAO_REAL);
                        System.out.println(numeroDolares + " Dólares em Reais: " + String.format("%.2f", conversaoDolarReal)  + " Reais");
                        break;


                }
            break;

            case 2:
                System.out.println("1- Dólar");
                System.out.println("2- Real");
                System.out.println("Deseja converter Euro para qual moeda?: ");
                int escolhaConversaoEuro = Integer.parseInt(sc.nextLine());

                switch (escolhaConversaoEuro) {
                    case 1:
                        System.out.println("Quantos euros? (ex: 45.50): ");
                        double numEuros = Double.parseDouble(sc.nextLine());

                        double conversaoEuroDolar = conversor(numEuros, COTACAO_EURO, COTACAO_DOLAR);
                        System.out.println(numEuros + " Euros em Dólares: " + String.format("%.2f", conversaoEuroDolar) + " Dólares");
                        break;

                    case 2:
                        System.out.print("Quantos euros? (ex: 45.50): ");
                        double numeroEuros = Double.parseDouble(sc.nextLine());

                        double conversaoEuroReal = conversor(numeroEuros, COTACAO_EURO, COTACAO_REAL);
                        System.out.println(numeroEuros + " Euros em Reais: " + String.format("%.2f", conversaoEuroReal) + " Reais");
                        break;
                }
            break;

        }
    }

}