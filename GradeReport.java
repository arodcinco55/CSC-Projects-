import java.util.Scanner;
//reads grades from a user and prints out comments accordingly 

public class GradeReport {
	public static void main(String[]args){
		int grade, category;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a numeric grade (0 to 100): ");
		grade = scan.nextInt();
		
		category = grade / 10; 
		
		System.out.print("That grade is ");
		
		switch(category){
		case 10: 
			System.out.println("a perfect score. Well done.");
			break;
		case 9: 			System.out.println("well above average. Well done.");
			break;
		case 8: 
			System.out.println("Above average. Well done.");
			break;
		case 7: 
			System.out.println("Average");
			break;
		case 6: 
			System.out.println("Below Average. You should see the");
			System.out.println("instructor to clarify the material" + "presented in class");
			break;
		default:
			System.out.println("not passing.");
		}
	}
}



