public class haha {
    public static void main(String[] args) {
        System.out.println("hah");
        C c = new D();
        c.dosome();
        D d = (D) c;//向下转型调用子类的特有方法
        d.doother();
    }
}
class C{
    public  void dosome(){
        System.out.println("c");
    }
}
class D extends C{  bb
    public  void dosome(){
        System.out.println("D");

    }
    public void doother(){
        System.out.println("子类中特有的方法");
    }

}
