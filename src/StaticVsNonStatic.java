public class StaticVsNonStatic {
    static void displayInfo (){
        System.out.println("from static");
        //displayInfoNonStatic(); // can't called, static can't call non static
    }
    void displayInfoNonStatic(){
        System.out.println("from non static");
        displayInfo();
    }
}
