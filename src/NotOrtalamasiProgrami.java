import java.util.Scanner;

public class NotOrtalamasiProgrami {

	public static void main(String[] args) {
		int quiz, midterm, finalExam;
		double average;
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter your Quiz Grade: ");
		quiz = inputScanner.nextInt();
		System.out.println("Enter your Midterm Grade: ");
		midterm = inputScanner.nextInt();
		System.out.println("Enter your Final Exam Grade: ");
		finalExam = inputScanner.nextInt();
		
		average = (quiz * 0.2) + (midterm * 0.35) + (finalExam * 0.45);
		System.out.println("Your Grade Average: " + average);
		String resultString = (average >= 50) ? "Passed" : "Failed";
		System.out.println(resultString);
	}
}
