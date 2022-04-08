package D05;

class Car{
    public void gear(){
        System.out.println("Manual Gear");
    }
}

class ChildCar extends Car{
    public void auto_gear(){
        System.out.println("Automatic Gear");
    }
}

class ChildCar2 extends ChildCar{
    public void hybrid(){
        System.out.println("Manual / Automatic hybrid");
    }
}


public class CarInheritance {
    public static void main(String[] args) {
        
        ChildCar2 car2 = new ChildCar2();
        car2.gear();
        car2.auto_gear();
        car2.hybrid();
    }
    
}
