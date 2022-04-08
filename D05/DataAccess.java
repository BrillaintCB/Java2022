package D05;


 class Data {
//Instance variables
private String name;
private String season;
private int year;

    public void setName(String name){
        this.name = name;
    }
    public void setSEason(String season){
        this.season = season;
    }

    public String getName(){
        return name;
    }

    public String getSeason(){
        return season;
    }

    public int getYear(){
        return year;
    }



    public void setYear(int Year){
        if(year >= 20 && year <=30){
            this.year = year;
        }
        else {
            System.out.println("Please input \"year\" between 20~30");
        }
    }
 }

public class DataAccess {
    public static void main(String[] args) {
        Data d = new Data();
        
        d.setName("CB");
        d.setSEason("Summer");

       System.out.println( d.getName());
       System.out.println( d.getSeason());
        d.setYear(44);
        System.out.println( d.getYear());

    }
}
