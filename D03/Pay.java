package D03;

public class Pay {
    String name;
    double original_payment;
    double tax;
    double final_payment;

    public double calTax(double original_payment){
        double cal_tax = 0;
        double tax_rate = 0;
        if(original_payment>5000){
            tax_rate = 0.3;
        }
        else if (original_payment<5000 && original_payment > 3500 )
        {
            tax_rate = 0.15;
        } else {
            tax_rate = 0.07;
        }
        cal_tax = original_payment * tax_rate;
        return cal_tax;
    }
    public Pay(String name, double original_payment, double tax, double final_payment){
        this.name = name;
        this.original_payment =  original_payment;
        this.tax = calTax(original_payment);
        this.final_payment = final_payment;
    }

    public void printPayment(Pay p){
        System.out.println("=====================================\n");
        System.out.println("Thanks for your work\n");
        System.out.println("=====================================\n");
        System.out.printf("Employee name : %s\n\rBefore Tax: %.2f\n\rTax:%.2f\n\rAfter tax %.2f\n", p.name, p.original_payment, p.tax, p.original_payment-p.tax);
    }
    public static void main(String[] args) {
        Pay cb    = new Pay("CB", 4000, 0, 0);
        Pay emliy = new Pay("Emliy", 3300, 0, 0);
        Pay baby = new Pay("Baby", 0, 0, 0);
        cb.printPayment(cb);
        emliy.printPayment(emliy);
        baby.printPayment(baby);
    }
}
