package D05;

class Garbage{
    int objNo;
    public Garbage(int n) {
        objNo = n;
        System.out.println("Garbage clas" + objNo + "has been created.");
    }

    protected void finalize() throws Throwable {
        try{
        System.out.println("Garbage class" + objNo + "memroy that is being used has been collected.");
        }
        finally{
          //  super.finalize();
        }
    }
}

public class GarbageCollect {
    
    public static long mbUsed(){
        return (Runtime.getRuntime().totalMemory());
    }

    public static void main(String[] args) {
        Garbage[] ga = new Garbage[10];
        //Create objects
        for(int i=0; i<ga.length; i++){
            ga[i] = new Garbage(i);
        }
        System.out.println(mbUsed());
        // Garbage disposal
        for(int i=0; i<ga.length; i++){
            ga[i] = null;
        }
        System.out.println(mbUsed());
        // prioty gc
        System.gc();
        System.out.println(mbUsed());
    }
}
