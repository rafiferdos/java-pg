import java.lang.Math;
public class Mathematics {
    public static void main(String[] args) {
        System.out.println(Math.abs(-43.4)); // returns positive (depends to give int or double from user)
        System.out.println(Math.sqrt(25)); // returns double
        System.out.println(Math.pow(3,4)); // returns double
        System.out.println(Math.PI); // returns double
        System.out.println(Math.log(1)); // returns double
        System.out.println(Math.log10(10)); // returns double
        System.out.println(Math.exp(1)); // returns double
        System.out.println(Math.max(3,5.5)); // returns as given by user int or double but the max number of two
        System.out.println(Math.min(3,5.5)); // returns as given by user int or double but the min number of two, here if another one is double but the printed one is int, that will be replaced by double
        System.out.println(Math.ceil(5.3)); // returns double
        System.out.println(Math.floor(4.5)); //returns double
        System.out.println(Math.random()); //returns random
    }
}
