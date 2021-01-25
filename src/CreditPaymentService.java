public class CreditPaymentService {
    public double calculate(double summa, double percent, int term){
        double a = 1+percent;

        double K = (percent * Math.pow(a,term))/(Math.pow(a,term)-1);
        double payment1 = summa * K;

        return payment1;

    }

}
