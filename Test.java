package yigitersan;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
        System.out.println("1) Add a new client");
        System.out.println("2) Add a new campaign");
        System.out.println("3) Add a new member of staff");
        System.out.println("4) Add a new staff grade; change the rate for a staff grade");
        System.out.println("5) Change the grade for a member of staff");
        System.out.print("Enter your choice :");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice) {
            case 1:
            	System.out.println(" the client are selected");
            case 2:
            	System.out.println(" the campaign are selected");
            case 3:
            	System.out.println(" staff are assigned");
            case 4:
            	System.out.println(" staff grades are changed");
            case 5:
            	System.out.println(" Grade for a member of staff are changed");
            break;
            
            default:
                System.out.println("Your choice not correct");
            break;
        }
    }   

}
