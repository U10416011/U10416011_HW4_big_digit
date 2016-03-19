import java.util.Scanner;
import java.util.ArrayList;
class TestAddBigInteger {
	public static void main(String[] args) {
		int l;
		//creat a scanner
		Scanner input = new Scanner(System.in);
		AddBigInteger A = new AddBigInteger();
		String a;
		String b;
		System.out.println("Enter first big integer");
		a = input.nextLine();
		System.out.println("Enter second big integer");
		b = input.nextLine();
		for(int i = A.add(a,b).size()-1;i >= 0; i--){
			System.out.print(A.add(a,b).get(i));
		}
		
	}
}
