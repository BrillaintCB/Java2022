package D02;

public class DosInput {
    
    public static void main(String[] args) {

        String strArray[] = {"1","2","3","4","5"};

        int sum = 0;
        for(int i=0; i<strArray.length; i++){
        
            int n = Integer.parseInt(strArray[i]);

            sum += n;
        }

        System.out.println(sum);
        
    }
}
