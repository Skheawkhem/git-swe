import java.util.Scanner; 
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input number");
		int number,num;
		number = keyboard.nextInt();
		num= number%2;

		if (num ==0)
		System.out.println("เลขคู่");
		else
		System.out.println("เลชคี่");
		
	}
	
	public double OddEven(int num) {
		double a = num*num*22/7;
		return a;
	}

}