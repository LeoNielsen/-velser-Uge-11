public class VAT {

    final int PRCVAT = 20; //moms på 25% = 100/(((moms*100)/((moms*100)-100))

    public double doVAT(double number) {
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
