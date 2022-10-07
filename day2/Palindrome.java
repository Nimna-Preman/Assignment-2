package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		int num=34343;
		int reverse=0;
		for (int i=num;i>=0;i=i/10) {
			int remainder=1%10;
			reverse=reverse*10+remainder;
		}
		System.out.println(reverse);
		if (num == reverse) {
			System.out.println("palindrome is"+reverse);
		}
			else
			{
				System.out.println(reverse+"it is not a palindrome");
				
		}
		

	}

}
