import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {

    private static Map<String, Double> PRICE_REPO = new HashMap<>();

    static {
        PRICE_REPO.put("USD_EUR", 0.9);
        PRICE_REPO.put("ETH_EUR", 2010.4);
        PRICE_REPO.put("ETH_BTC", 0.11);
        PRICE_REPO.put("ETH_USD", 2100.0);
        PRICE_REPO.put("BTC_USD", 42233.0);
    }


    public Double getEstimatedPrice(String tickerInQuestion, String referenceTicker) {
        // your code here
    }

    public Double computeWalletValue(Wallet wallet, String tokenOut) {
        // your code here as well
    }

    /**
     * DO NOT CHANGE CODE BELOW THIS LINE
     */
    public static void main(String[] args) {
        Main app = new Main();
        Wallet w1 = new Wallet();
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        String[] split = input.split(";");
        String[] parts = split[0].split(" ");
        w1.liquidityList = IntStream.range(0, parts.length/2).map(i -> i * 2)
                .mapToObj((i) -> new Liquidity(Double.parseDouble(parts[i]), parts[i + 1])).collect(
                        Collectors.toList());

        Double output = app.computeWalletValue(w1, split[1]);
        System.out.printf("%.2f%n", output);
    }
}