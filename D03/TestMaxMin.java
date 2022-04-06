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

        String getGender(String reg){
            String gender = reg.substring(7,8) == "1" ? "Male" : "Female"; 
            
            if(reg.substring(7,8)=="1"|| reg.substring(7,8)=="3"){
                gender = "Male";
            } 
            else{
                gender = "Female";
            }
            return gender;
        }

        void print(Customer c){
                Calendar calendar = Calendar.getInstance();
                int currentYear = calendar.get(Calendar.YEAR); 
                int bornYear = 0;
                int regidentNum = Integer.parseInt(c.regidentNum.substring(0,2));
                String currentYear2 = Integer.toString(currentYear).substring(2,4);
                if(regidentNum> Integer.parseInt(currentYear2)){
                    bornYear = 1900+regidentNum;
                }else{
                    bornYear = 2000+regidentNum;
                }
                int age = 0;
                age = currentYear-bornYear;            
                //String gender = "male";
                String gender = getGender(c.regidentNum);
                System.out.printf("name %s\n phone : %s\n address %s\n age %d\n gender %s\n", c.name, c.phone, c.address, age, gender);
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
         //T4 //T8
        Customer cb = new Customer("CB", "0411280814", "31 Newcastle Street", "910101-18888888");
        Customer emliy = new Customer("Emliy", "032323234", "22 Newcastle Street", "000211-2333333");
        Customer baby = new Customer("baby", "032323234", "0 Newcastle Street", "220211-44444444");
        System.out.println("T4==============\n");
        cb.print(cb);
        emliy.print(emliy);
        baby.print(baby);
    }
}
