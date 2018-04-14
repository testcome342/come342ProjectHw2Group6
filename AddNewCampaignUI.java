package yigitersan;
import java.util.Scanner;
import java.util.Set;

public class AddNewCampaignUI {

	public void startInterface() {
		  System.out.println("Start interface");
	}
	public void selectClient() {
		
	}
	public void createNewCampaign() {
		Scanner input =new Scanner(System.in);
     
        System.out.println("Maili: ");
        String email;
        email=input.next();
        
        System.out.println(email);
        
        System.out.println("Company Name: ");
        String companyName;
        companyName=input.next();
   
        System.out.println(companyName);
        System.out.println("Company Address: ");
        String address;
        address=input.next();
      
        System.out.println(companyAddress);
        
        System.out.println("ContactName: ");
        String contactName;
        contactName=input.next();
      
        System.out.println(contactName);
	}
}
