package D05;

class OverrideA{
    void show(String str){
        System.out.println("Override A str"+ str);
    }
}

class SubOverrideA extends OverrideA {
    void show(){
        System.out.println("Subclass it is not Overwriting ");
    }
    void show(String str){
        System.out.println("Subclass it is Overwriting ");
    }
    void show(String str, int year){
        System.out.println("This is overloading" + str+year);
    }
}
public class OverrideEx1 {
   
    public static void main(String[] args) {        
        SubOverrideA a = new SubOverrideA();
        a.show("CB");
        a.show();
        a.show("tes");
        a.show("haha",2022);
        // Overloading -> within same class  arguments are different
        // Overwriting -> Inheriience -> redefine ( method argument should be same)
        // this case its neither overloading nor overwriting
    }
}
