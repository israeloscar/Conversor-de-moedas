import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static final Map<String, Double> cotacoes = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cotacoes.put("Dólar", 5.20);
        cotacoes.put("Euro", 6.07);
        cotacoes.put("Real", 1.00);
        cotacoes.put("Libra", 6.93);

        menu(sc);

    }

    public static double conversor(double valor, double cotacaoOrigem, double cotacaoDestino) {
        double valorMultiplicado = valor * cotacaoOrigem;
        return valorMultiplicado / cotacaoDestino;
    }

    public static int lerInteiros(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }

    }

    public static double lerDoubles(Scanner sc) {
        try {
            return Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void menu(Scanner sc) {

        boolean continuar = true;

        do {
            System.out.println("1 - Dólar($)");
            System.out.println("2 - Euro(€)");
            System.out.println("3 - Real(R$)");
            System.out.println("4 - Libra(£)");
            System.out.println("0 - Sair");
            System.out.print("Escolha a moeda: ");
            int escolha = lerInteiros(sc);

            switch (escolha) {
                case 1:
                    System.out.println("1- Euro");
                    System.out.println("2- Real");
                    System.out.println("3- Libra");
                    System.out.print("Deseja converter Dólar para qual moeda?: ");
                    int escolhaConversaoDolar = lerInteiros(sc);

                    switch (escolhaConversaoDolar) {
                        case 1:
                            System.out.print("Quantos dólares? (ex: 32.45): ");
                            double numDolares = lerDoubles(sc);
                            if (numDolares == -1) {
                                System.out.println("Você não digitou um número");
                                break;
                            } else {
                                double conversaoDolarEuro = conversor(numDolares, cotacoes.get("Dólar"), cotacoes.get("Euro"));
                                System.out.println(numDolares + " Dólares em Euros: " + String.format("%.2f", conversaoDolarEuro) + " Euros");
                                break;
                            }
                        case 2:
                            System.out.print("Quantos dólares? (ex: 32.45): ");
                            double numeroDolares = lerDoubles(sc);
                            if (numeroDolares == -1) {
                                System.out.println("Você não digitou um número");
                                break;
                            } else {
                                double conversaoDolarReal = conversor(numeroDolares, cotacoes.get("Dólar"), cotacoes.get("Real"));
                                System.out.println(numeroDolares + " Dólares em Reais: " + String.format("%.2f", conversaoDolarReal) + " Reais");
                                break;
                            }

                        case 3:
                            System.out.print("Quantos dólares? (ex: 32.45): ");
                            double numeroDeDolares = lerDoubles(sc);
                            if (numeroDeDolares == -1) {
                                System.out.println("Você não digitou um número");
                                break;
                            } else {
                                double conversaoDolarLibra = conversor(numeroDeDolares, cotacoes.get("Dólar"), cotacoes.get("Libra"));
                                System.out.println(numeroDeDolares + " Dólares em Libras: " + String.format("%.2f", conversaoDolarLibra) + " Libras");
                                break;
                            }
                        case -1:
                            System.out.println("Você só pode digitar números!");
                            break;

                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    System.out.println("1- Dólar");
                    System.out.println("2- Real");
                    System.out.println("3- Libra");
                    System.out.print("Deseja converter Euro para qual moeda?: ");
                    int escolhaConversaoEuro = lerInteiros(sc);

                    switch (escolhaConversaoEuro) {
                        case 1:
                            System.out.print("Quantos euros? (ex: 45.50): ");
                            double numEuros = lerDoubles(sc);
                            if (numEuros == -1) {
                                System.out.println("Você não digitou um número");
                                break;
                            } else {
                                double conversaoEuroDolar = conversor(numEuros, cotacoes.get("Euro"), cotacoes.get("Dólar"));
                                System.out.println(numEuros + " Euros em Dólares: " + String.format("%.2f", conversaoEuroDolar) + " Dólares");
                                break;
                            }
                        case 2:
                            System.out.print("Quantos euros? (ex: 45.50): ");
                            double numeroEuros = lerDoubles(sc);
                            if (numeroEuros == -1) {
                                System.out.println("Você não digitou um número");
                                break;
                            } else {
                                double conversaoEuroReal = conversor(numeroEuros, cotacoes.get("Euro"), cotacoes.get("Real"));
                                System.out.println(numeroEuros + " Euros em Reais: " + String.format("%.2f", conversaoEuroReal) + " Reais");
                                break;
                            }

                        case 3:
                            System.out.print("Quantos euros? (ex: 45.50): ");
                            double numeroDeEuros = lerDoubles(sc);
                            if (numeroDeEuros == -1) {
                                System.out.println("Você não digitou um número");
                                break;
                            } else {
                                double conversaoEuroLibra = conversor(numeroDeEuros, cotacoes.get("Euro"), cotacoes.get("Libra"));
                                System.out.println(numeroDeEuros + " Euros em Libras: " + String.format("%.2f", conversaoEuroLibra) + " Libras");
                                break;
                            }

                        case -1:
                            System.out.println("Você só pode digitar números!");
                            break;

                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;

                case 3:
                    System.out.println("1- Dólar");
                    System.out.println("2- Euro");
                    System.out.println("3- Libra");
                    System.out.print("Deseja converter Real para qual moeda?: ");
                    int escolhaConversaoReal = lerInteiros(sc);

                    switch (escolhaConversaoReal) {
                        case 1:
                            System.out.print("Quantos reais? (ex: 12.50): ");
                            double numReais = lerDoubles(sc);
                            if (numReais == -1) {
                                System.out.println("Você não digitou um número");
                                break;
                            } else {
                                double conversaoRealDolar = conversor(numReais, cotacoes.get("Real"), cotacoes.get("Dólar"));
                                System.out.println(numReais + " Reais em Dólares: " + String.format("%.2f", conversaoRealDolar) + " Dólares");
                                break;
                            }
                        case 2:
                            System.out.print("Quantos reais? (ex: 12.50): ");
                            double numeroReais = lerDoubles(sc);
                            if (numeroReais == -1) {
                                System.out.println("Você não digitou um número");
                                break;
                            } else {
                                double conversaoRealEuro = conversor(numeroReais, cotacoes.get("Real"), cotacoes.get("Euro"));
                                System.out.println(numeroReais + " Reais em Euros: " + String.format("%.2f", conversaoRealEuro) + " Euros");
                                break;
                            }

                        case 3:
                            System.out.print("Quantos reais? (ex: 12.50): ");
                            double numeroDeReais = lerDoubles(sc);
                            if (numeroDeReais == -1) {
                                System.out.println("Você não digitou um número");
                                break;
                            } else {
                                double conversaoRealLibra = conversor(numeroDeReais, cotacoes.get("Real"), cotacoes.get("Libra"));
                                System.out.println(numeroDeReais + " Reais em Libras: " + String.format("%.2f", conversaoRealLibra) + " Libras");
                                break;
                            }

                        case -1:
                            System.out.println("Você só pode digitar números!");
                            break;

                        default:
                            System.out.println("Opção inválida!");

                    }
                    break;

                case 4:
                    System.out.println("1- Dólar");
                    System.out.println("2- Euro");
                    System.out.println("3- Real");
                    System.out.print("Deseja converter Libra para qual moeda?: ");
                    int escolhaConversaoLibra = lerInteiros(sc);

                    switch (escolhaConversaoLibra) {
                        case 1:
                            System.out.print("Quantas libras? (ex: 24.75): ");
                            double numLibras = lerDoubles(sc);
                            if (numLibras == -1) {
                                System.out.println("Você não digitou um número");
                                break;
                            } else {
                                double conversaoLibraDolar = conversor(numLibras, cotacoes.get("Libra"), cotacoes.get("Dólar"));
                                System.out.println(numLibras + " Libras em Dólares: " + String.format("%.2f", conversaoLibraDolar) + " Dólares");
                                break;
                            }

                        case 2:
                            System.out.print("Quantas libras? (ex: 24.75): ");
                            double numeroLibras = lerDoubles(sc);
                            if (numeroLibras == -1) {
                                System.out.println("Você não digitou um número");
                                break;
                            } else {
                                double conversaoLibraEuro = conversor(numeroLibras, cotacoes.get("Libra"), cotacoes.get("Euro"));
                                System.out.println(numeroLibras + " Libras em Euros: " + String.format("%.2f", conversaoLibraEuro) + " Euros");
                                break;
                            }

                        case 3:
                            System.out.print("Quantas libras? (ex: 24.75): ");
                            double numeroDeLibras = lerDoubles(sc);
                            if (numeroDeLibras == -1) {
                                System.out.println("Você não digitou um número");
                                break;
                            } else {
                                double conversaoLibraReal = conversor(numeroDeLibras, cotacoes.get("Libra"), cotacoes.get("Real"));
                                System.out.println(numeroDeLibras + " Libras em Reais: " + String.format("%.2f", conversaoLibraReal) + " Reais");
                                break;
                            }

                        case -1:
                            System.out.println("Você só pode digitar números!");
                            break;

                        default:
                            System.out.println("Opção inválida!");



                    }
                    break;


                case 0:
                    continuar = false;
                    System.out.println("Obrigado por testar o programa!");
                    break;

                case -1:
                    System.out.println("Você só pode digitar números!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (continuar);
    }
}