public class MethodOverloading {
    // method name and parameter list called method signature
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a){
        System.out.println(a);
    }
    void add(double a, double b, int c){
        System.out.println(a+b+c);
    }
    // here for three params if user inputs only int then it will automatically converts first two to doubles then last one will remain int, but print will be in double
    void add(int a, int b, int c, int d, int e){
        System.out.println(a+b+c+d+e);
    }
    void add (){
        System.out.println("nothing inputted");
    }
    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        m1.add(5,5,5);
        MethodOverloading m2 = new MethodOverloading();
        m2.add(5,5,5, 6,4);
    }
}
