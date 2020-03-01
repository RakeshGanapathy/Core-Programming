package core.realtime.controlstatements;
import java.util.Scanner;
public class GradeGenerator {
	public static void main(String[] args) {
		System.out.println("Enter the marks");
		Scanner scan = new Scanner(System.in);
		int mark = scan.nextInt();
		String grade ;
		if (mark > 90)
			grade = "S Grade";
		else if (mark >= 80)
			grade ="A Grade";
		else if (mark >= 70)
			grade ="B Grade";
		else if (mark >= 60)
			grade ="C Grade";
		else if (mark >= 50)
			grade ="D Grade";
		else if (mark >= 45)
			grade ="E Grade";
		else
			grade ="Re-appear";
		scan.close();
		System.out.println("your grade status is "+grade);
		System.out.println("welcome");
	}
}
