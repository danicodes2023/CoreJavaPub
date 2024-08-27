interface A{
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends  X{

}
class B implements A,Y{
    public void show() {
        System.out.println("in show");
    }
    public void config() {
        System.out.println("in config");
    }
    public void run() {
        System.out.println("running...");
    }
    public void test(){

    }
}
interface Demo{
    void add();
    default void subtract(){
        System.out.println("default subtract");
    }
}
class DemoImpl implements Demo{
    public void add() {
        System.out.println("add Impl");
    }
    public void divide(){
        System.out.println("divide Impl only");
    }
}

public class DemoInterface {
    public static void main(String[] args) {
        /*Demo obj = new DemoImpl();
        //obj.
        DemoImpl obj1 = new DemoImpl();*/
        X obj = new X() {//Anonymous inner class with interface
            @Override
            public void run() {
                System.out.println("Yess");
            }
        };
        obj.run();
        X obj1 =() -> System.out.println("Lambda");
        obj1.run();


        /*A obj;
        obj = new B();
        X obj1 = new B();
        obj1.run();
        Y obj2 = new B();
        obj2.run();*/

    }
}
