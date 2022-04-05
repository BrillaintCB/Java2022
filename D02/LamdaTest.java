package D02;

import java.util.ArrayList;

public class LamdaTest {
    public static void main(String[] args) {
        
        ArrayList<Integer> salaies = new ArrayList<Integer>();

        salaies.add(3000);
        salaies.add(3240);
        salaies.add(3480);
        salaies.add(3600);
        salaies.add(3650);


        salaies.forEach(  (n) -> { System.out.println(n); });



        salaies.forEach(  (n) ->  { System.out.println(n); });


    }
    
}
