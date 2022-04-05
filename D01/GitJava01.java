public class GitJava01 {

  public static void main(String[] args) {
    int year =3;
    int child = 0;
    int pay = 3500;
    
    switch (year) {
    case 0:
      System.out.println("Junior 0");
      pay += 200;
      break;
    case 1:
      System.out.println("Junior 1");
      pay += 500;
      break;
    case 2:
      System.out.println("Junior 2");
      pay += 600;
      break;
    case 3:
      System.out.println("Junior 3");
      pay += 700;
      break;
    case 4:
      System.out.println("Senior 1");
      pay += 1000;
      break;

    default:
      break;
    }
    System.out.println(pay);
  }
}
