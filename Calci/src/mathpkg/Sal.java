package mathpkg;
import java.util.*;

public class Sal {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Please Enter Your Monthly Salary");
		float salary = s.nextFloat();
		double Totalsal = salary*12;
		System.out.println("Total yearly salary Is :" +Totalsal);
		double per=(salary/Totalsal)*100;
		System.out.println("Monthly Salry Percentage is:" +per);

	}

}
