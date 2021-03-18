public class Controller {
    final private String MSG = "MOMS";
    final private String CURRENCY = "Kr";

    public void runController() {

        Dialog diag = new Dialog();
        VAT vat = new VAT();
        View view = new View();

        double userIn = diag.doDiag();
        double moms = vat.doVAT(userIn);
        view.doView(moms, CURRENCY, MSG);
    }
}
