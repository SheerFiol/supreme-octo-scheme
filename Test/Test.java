import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = in.nextInt();
		num *= 2;
		System.out.printf("The number is %d after being doubled\n",num);
		System.out.println("This is an update from git hub");
	}
}
