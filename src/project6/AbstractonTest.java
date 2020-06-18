package project6;

public class AbstractonTest {

	 public static void main(String [] args) {
	      Salary s = new Salary("Mohd ", "Ambehta, UP", 3, 3600.00);
	      Employee e = new Salary("John ", "Boston, MA", 2, 2400.00);
	      System.out.println("Call mailCheck using Salary reference --");
	      s.mailCheck();
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();
	   }
	}