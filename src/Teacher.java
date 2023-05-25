public class Teacher {
    //instance variables
    String name;
    int id, phone;
    //static variables also called class variable because it is not related to object but related to class
    static String fromUniversity;
    
    //overloading constructor
    Teacher (String name, int id, int phone){
        this.name = name;
        this.id = id;
        this.phone = phone;
    }
    Teacher (String name, int id){
        this.name = name;
        this.id = id;
    }
    void showInfo () {
        System.out.println(name + " " + id + " " + phone);
    }
}