class Computer{
    public void code(){

    }
    public void codeComputer(){

    }
}
class Laptop extends Computer{
    public void code(){
        System.out.println("Laptop: code");
    }
    public void codeLaptop(){

    }
}
class Desktop extends Computer{
    public void code(){
        System.out.println("Desktop: code");
    }
    public void codeDesktop(){

    }
}
class Developer{
    public void developApp(Computer computer){
        computer.code();
    }
}
public class DemoClasses {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev = new Developer();
        dev.developApp(desk);
    }
}
