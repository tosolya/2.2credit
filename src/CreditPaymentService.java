public class CreditPaymentService {
    public long calculate(int summa,int percent,int term){

       long payment1 = summa*(percent/(1+percent)-term-1);

       return payment1;

    }
}
