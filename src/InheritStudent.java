public class InheritStudent extends InheritPerson {
    private int id = 5362;
    private double cgpa = 5.00;

    public static void main(String[] args) {
        InheritStudent st1 = new InheritStudent();
        System.out.println(st1.name+ " "+ st1.id+ " " + st1.cgpa + " " + st1.age);

    }
}