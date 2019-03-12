class A{
    public void car(){
        System.out.println("Audi car");
    }
}
class B extends A{
    public void bike(){
        System.out.println("Duke Bike");
    }
}
class C extends B{
    public void cycle(){
        System.out.println("Hero Cycle");
    }
}
public class Minheritance{
    public static void main(String[] args) {
        C od=new C();
        od.car();
        od.bike();
        od.cycle();
    }
}

