package core.realtime.controlstatements;
import java.util.Scanner;
public class ResultGenerator {
	public static void main(String[] args) {
		System.out.println("Enter the marks");
		Scanner scan = new Scanner(System.in);
		int marks = scan.nextInt();
		if (marks > 40) {
	System.out.println("congrats your have "
			+ "cleared the examination");
		} else {
			System.out.println("sorry your are suppose"
					+ " to re-appear");
		}
		System.out.println("welcome ");
		scan.close();
	}
}
