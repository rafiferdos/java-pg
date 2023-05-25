public class InheritanceBoy extends InheritanceHuman{
    int number = 50;
    public void eat(){
        System.out.println("eating boy");
    }

    public static void main(String[] args) {
        InheritanceBoy b1 = new InheritanceBoy();
        b1.eat();
        System.out.println(b1.number);
    }
}
