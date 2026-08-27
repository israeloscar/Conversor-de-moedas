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
                int escolhaConversao = Integer.parseInt(sc.nextLine());

                switch (escolhaConversao) {
                    case 1:
                        System.out.print("Quantos dólares? (ex: 32.45): ");
                        double numDolares = Double.parseDouble(sc.nextLine());

                        double resultado = conversor(numDolares, COTACAO_DOLAR, COTACAO_EURO);
                        System.out.println(numDolares + " dólares em euros: " + String.format("%.2f", resultado)  + " euros");
                        break;
                    case 2:
                        System.out.print("Quantos dólares? (ex: 32.45): ");
                        double numeroDolares = Double.parseDouble(sc.nextLine());

                        double conversao = conversor(numeroDolares, COTACAO_DOLAR, COTACAO_REAL);
                        System.out.println(numeroDolares + " dólares em reais: " + conversao + " reais");
                        break;


                }
            break;


        }
    }

}