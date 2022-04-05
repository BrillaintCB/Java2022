package D02;

public class Multiplication {
    public static void main(String[] args) {
        
        for(int i=1; i<10; i++){

            for(int j=1; j<10; j++){
                System.out.printf("%2d x %2d = %2d\t", i,j, i*j);
            }
            if(i%3==0){
                System.out.printf("\n");
            }
        }
        System.out.printf("======================\n");

        for(int i=9; i>0; i--){

            for(int j=9; j>0; j--){
                System.out.printf("%2d x %2d = %2d\t", i,j, i*j);
                
            }
            if(i%3==0){
                System.out.printf("\n");
            }
        }
    }
}
