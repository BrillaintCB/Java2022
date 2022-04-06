package D03;

public class Score {
    String Name;
    int Korean;
    int English;
    int Math;
    public Score(String Name, int Korean, int English, int Math){
        this.Name = Name;
        this.Korean = Korean;
        this.English = English;
        this.Math = Math;
    }
    public void printScore(Score s){
       // double avg = (s.Korean + s.Math + s.English) /3;
        double avg = (double) (s.Korean + s.Math + s.English) /3;
        System.out.printf("%s average is %.2f ", Name, avg);
    }
    public static void main(String[] args) {
        Score cb = new Score("cb",100,99,100);
        Score emliy = new Score("emliy", 87,86,81);
        Score baby = new Score("baby", 47,51,51);
        cb.printScore(cb);
        cb.printScore(emliy);
        cb.printScore(baby);
    }    
}
