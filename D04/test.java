package D04;

public class test {
    public static void main(String[] args) {
        int max = 0;

        for(int i =0; i<50; i++ ){

            if(i*i-3*i<2550){
                max = i;
            }
        }
        System.out.println(max);
    }
    
}
