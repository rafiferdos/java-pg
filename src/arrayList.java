import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrL1 = new ArrayList<Integer>();

        for (int i = 0; i<n; i++){
            arrL1.add(sc.nextInt()); // .add() to add something to arrayList
        }
        for (int i = 0; i<n; i++) {
        System.out.print(arrL1.get(i) + " "); // .get() to access something from arrayList
        }
        arrL1.set(3, 100); // .set(indexOf, whatToSet) to set or update in arrayList
        System.out.println(arrL1);

        System.out.println(arrL1.size());// .size() to find how many elements are here in arrayList

        arrL1.clear(); // .clear() to clear everything in arrayList
        System.out.println(arrL1);

        // new one

        ArrayList<String> strArr = new ArrayList<String>();
        strArr.add("Rafi");
        strArr.add("Sarah");
        strArr.add("Mom");
        strArr.add("Dad");

        System.out.println(strArr.size());

        for(int i = 0; i<strArr.size(); i++){
            System.out.println(strArr.get(i));
        }
        Collections.sort(strArr);
        for (String s:strArr) {
            System.out.println(s);
        }
    }
}
