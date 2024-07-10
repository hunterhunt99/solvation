package basicProblems;
import java.util.Scanner;

public class Problem1 {
    public static void displayName(){
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        System.out.println("Hello\n"+firstName+" "+lastName);
    }

    public static void main(String[] args) {
        displayName();
        System.out.println("Hello\nSai Kumar");
    }
}



