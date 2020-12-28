import java.util.Scanner;

public class Print_values_in_separate_line {

	public static void main(String[] args) {
		
		//Write a code to get an integer N and print values from 1 till N in a separate line.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}	
	}
}
