package D03;

import java.util.Calendar;
import java.util.concurrent.Callable;

public class TestMaxMin {


   

    public static void main(String[] args) {

        
        class Customer{

            String name;
            String phone;
            String address;
            String regidentNum;


            public Customer(String name, String phone, String address, String regidentNum){
                this.name = name;
                this. phone = phone;
                this.address = address;
                this.regidentNum = regidentNum;
            }
        }
        //T1
        int sum = 0;
        int avg = 0;
        int scores [] = {10,20,50,40,30};
        for(int i=0; i<scores.length; i++){
           sum+=scores[i];
        }
        avg = sum/scores.length;
        System.out.println("T1==============\n");
        System.out.println("avg= "+avg);

        //T2 
        double salaries[] = {3000.5, 4000.2, 4105.4, 4210.2, 4108.5};
        double max = salaries[0];
        double min = salaries[0];
        for(int i=1; i<salaries.length; i++){
           
            if(min>salaries[i]){
                min = salaries[i];
            }
            if(max<salaries[i]){
                max = salaries[i];
            }
         }
         System.out.println("T2==============\n");
         System.out.printf("Min %.2f\nMax %.2f", min,max);

         //T3
         int nums[] = {-1,-5,-4,3,-2,1,-8,-2};
         System.out.println("T3==============\n");
         for(int i=0; i<nums.length; i++){
           
            if(nums[i]<0){
                System.out.println(nums[i]*-1);
            }
            else{
                System.out.println(nums[i]);
            }
         }

         //T4
    // Customer c1 = new Customer("CB", "0411280814", "137 Newcastle Street", "910101-1111111");
    // Customer c1 = new Customer("Emliy", "032323234", "100 Newcastle Street", "000211-2111111");
       Customer c1 = new Customer("Emliy", "032323234", "100 Newcastle Street", "220211-2111111");

        int bornYear = 0;
        int regidentNum = Integer.parseInt(c1.regidentNum.substring(0,2));
        System.out.println("T4==============\n");
        int age = 0;
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR); 
        if(regidentNum>currentYear){
            bornYear = 1900+regidentNum;
        }else{
            bornYear = 2000+regidentNum;
        }
        age = currentYear-bornYear;
        System.out.printf("name %s\n phone : %s\n address %s\n age %d\n", c1.name, c1.phone, c1.address, age);
    }
}
