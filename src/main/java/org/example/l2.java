package org.example;

interface payment {
    public void processpayment();
}
class ccpayment implements payment{
    @Override
    public void processpayment(){
        System.out.println("ccpayment processing");
    }
}
class paypal implements payment{
    @Override
    public void processpayment(){
        System.out.println("paypal processing");
    }

}
interface paymentfactory{
    public payment createpayment();
}
class ccpaymentfactory implements paymentfactory{
    @Override
   public payment createpayment(){
        return new ccpayment();
    }
}
class pppaymentfactory implements paymentfactory{
    @Override
    public payment createpayment(){
        return new paypal();
    }
}
class min{
    public class Main {
        public static void main(String[] args) {

            paymentfactory ccf=new ccpaymentfactory();
            paymentfactory ppf=new pppaymentfactory();
            payment cc=ccf.createpayment();
            payment pp=ppf.createpayment();

        }
    }
}