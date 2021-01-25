public class MainCredit {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int summa = 1000000;
        double percent = 9.99/12/100;
        int term = 12;


        double payment1 = service.calculate(1000000, 9.99/12/100, 12);
        System.out.println(payment1);

        double payment2 = service.calculate(1000000, 9.99/12/100, 24);
        System.out.println(payment2);

        double payment3 = service.calculate(1000000, 9.99/12/100, 36);
        System.out.println(payment3);

        }
}
