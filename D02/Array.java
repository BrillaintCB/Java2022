package D02;

public class Array {
    public static void main(String[] args) {
        
        int[] pay = {3000, 3240, 3480, 3500, 5000};

        for(int i=0; i<pay.length; i++){
            System.out.println(pay[i]);
        }

        System.out.println("================");
        int sum = 0;
        for(int i=1; i<=100; i++){
            if(i%2 ==0){
               sum += i; 
            }
        }  
        System.out.println(sum); 
     }
}
