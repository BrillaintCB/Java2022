package D02;

import java.text.DecimalFormat;

public class DosInput3 {
    public static void main(String[] args) {
        DecimalFormat comma = new DecimalFormat("###,###");

        String cs1 = "150.2345";
        String cs2 = "266.1222";

        int i1 = Integer.parseInt(cs1);
        
        int i2 = Integer.parseInt(cs2);

       // cs1 = comma.format(i1);
       // cs2 = comma.format(i2);

            System.out.println(cs1);
            System.out.println(cs2);
    }

}
