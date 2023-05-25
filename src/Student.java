public class Student {
    //instance variables
    String name;
    int id, phone;
    int nonStaticCount = 0;
        
    //static variables also called class variable because it is not related to object but related to class
    // static blocks will executes before main method
    static{
        String fromUniversity;
        String sentence = "hey its me";
        int staticCount = 0;
    }
        static String fromUniversity;
        static String sentence = "hey its me";
        static int staticCount = 0;
    Student(){
        nonStaticCount++;
        staticCount++;
    }
    void setInfo(String n, int id, int ph, String uni){
        name = n;
        this.id = id;
        phone = ph;
        fromUniversity = uni;
    }
    void getInfo(){
        System.out.println(name + " " + id + " " + phone + " " + fromUniversity);
        System.out.println("Non static count: " + nonStaticCount + " " + "Static count: " + staticCount);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setInfo("Rafi", 2212, 244524352, "diu");
        s2.setInfo("Rafi", 2212, 244524352, "ru");
        s1.getInfo();
        s2.getInfo();
    }
}
