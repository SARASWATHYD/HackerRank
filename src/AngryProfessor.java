import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int classes = sc.nextInt();
		for(int i = 0 ; i < classes ; i ++) {
			int totalstudent = sc.nextInt();
			int[] students = new int [totalstudent];
			int expectedStudent = sc.nextInt();
			for(int j = 0 ; j <totalstudent ; j ++ ) {
				students[j] = sc.nextInt();
			}
			
			System.out.println(angryprofessor(students,expectedStudent));

				
		}
				
			
		}

	static public String angryprofessor(int[] students, int threshold) {
		int counter = 0;
		for(int i = 0 ; i < students.length ; i ++) {
	
			if(students[i] <= 0 ) 
				counter++;
		}
		if(counter < threshold)
			return "YES";
		else
			return "NO";
	}	

}
