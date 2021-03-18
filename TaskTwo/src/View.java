import java.util.Currency;

public class View {

    public void doView(double result,String Currency, String MSG) {
        System.out.printf("Du betaler %.2f%3s i %s%n", result, Currency, MSG);
    }
}
