import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
       
   
ArrayList<Integer> num = new ArrayList<Integer>(); // Create an ArrayList object

        num.add(2);
        num.add(3);
        num.add(4);

        int sum = 0;
        for(int i = 0; i < num.size(); i++)
            sum += num.get(i);

        int sweet = sum;

    System.out.println(sweet);
     }
}