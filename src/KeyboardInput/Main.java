package KeyboardInput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter Name");
        Scanner N1 = new Scanner(System.in);
        String name = N1.next();
        System.out.println("Enter Password");
        Scanner P1 = new Scanner(System.in);
        String pass = P1.next();
        System.out.println("Hello " + name +" Welcome to CSC200 class! and Your password is " +pass);
    }
}
