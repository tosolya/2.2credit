public class MainCredit {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        long summa = 1000000;
        int percent = 9;
        int term = 24;

        long payment1 = service.calculate(1000000, 9, 24);
        System.out.println(payment1);

        }
}
