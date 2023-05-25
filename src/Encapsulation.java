public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("John");
        obj.setAge(32);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
