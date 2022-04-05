package D01;

public class Variable {
    
    public static void main(String[] args) {
        
    boolean employeed = false;
    String name = "CB";
    char gender = 'M';
    int year = 2022;
    double salary = 3620.5;




    System.out.printf("%s : Employed : %b Gender %c, %d , Salary %f \n\n",name, employeed, gender, year, salary);
    

    System.out.printf("%8.2f\n", salary);
    System.out.printf("%7.2f\n", salary);

    System.out.printf("%s\n", name);
    System.out.printf("%5s\n", name);
    System.out.printf("%10s\n", name);

    System.out.printf(" \"%7.2f\" \n", salary);

    salary = 1;
    employeed = salary > 0 ? true:false;

    System.out.printf("%b", employeed);
    

    }
}
