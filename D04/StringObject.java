package D04;

public class StringObject {
    
    public static void main(String[] args) {

      
        System.out.println(max);
        

        String a1 = "a";
        String a2 = "a";
        String abc = "abc";
        String a3 = abc.substring(0,1);

        System.out.printf("a2  %s\n" ,a2);
        System.out.printf("a3   %s\n" ,a3);


        System.out.printf("a1 hashcode %d\t\n" ,a1.hashCode());
        System.out.printf("a2 hashcode %d\t\n" ,a2.hashCode());
        System.out.printf("a3 hashcode  %d\n" ,a3.hashCode());

        System.out.printf("a1 hashcode %d\t\n" ,System.identityHashCode(a1));
        System.out.printf("a2 hashcode %d\t\n" ,System.identityHashCode(a2));
        System.out.printf("a3 hashcode %d\t\n" ,System.identityHashCode(a3));

        System.out.printf("a2 == a  %b\n" , a2 == "a");
        System.out.printf("a2 ==a3  %b\n" ,a2 == a3);
        System.out.printf("a2 ==a3  %b\n" ,a2 == a1);

        System.out.printf("a2 == a  %b\n" , a2.equals("a"));
        System.out.printf("a2 ==a3  %b\n" ,a2.equals(a3));
        System.out.printf("a2 ==a3  %b\n" ,a2.equals(a1));

    }
}
