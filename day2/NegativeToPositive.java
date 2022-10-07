package week1.day2;

public class NegativeToPositive {
	public int positive(int num)
	{
		if (num<0)
		{
			num=num*-1;
			
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NegativeToPositive n=new NegativeToPositive();
		int num;
		int pos=30;
		num=n.positive(pos);
		if (pos==num)
		{
			System.out.println("the number is already positive"+pos);
		}
		else
			System.out.println("thepositive number is "+num);
		}

	}


