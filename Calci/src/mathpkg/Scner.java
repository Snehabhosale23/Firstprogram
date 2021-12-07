package mathpkg;
import java.util.*;

public class Scner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Roll Number:");
		int rollno = sc.nextInt();
		System.out.print("Enter The Student's Name:");
		String Name = sc.next();
		
		System.out.print("Enter Theory Marks");
		int marks = sc.nextInt();
		System.out.print("Enter Practicle Marks");
		int pract = sc.nextInt();
		int total = marks+pract;
		System.out.println("Total Marks Are:" +total);
		double percent = (total/200.0)*100;
		System.out.println("Total  Percentage Is:" +percent);
		
		
		if(percent>80)
		{
			System.out.println("Grade Is A");
		}
        else
		{
			System.out.println("Grade Is B");
		}
	
	
		System.out.println("Roll Number Is:" +rollno);
		System.out.println("Name Is:" +Name);
	}
}
	

	


