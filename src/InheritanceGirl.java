public class InheritanceGirl extends InheritanceHuman {
    int number = 300;

    public void eat() {
        super.eat();
        System.out.println("eating girl with" + super.number);
    }

    public static void main(String[] args) {
        InheritanceGirl g1 = new InheritanceGirl();
        g1.eat();
        System.out.println(g1.number);
    }
}
