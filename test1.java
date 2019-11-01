import java.util.Scanner;
public class test1{
	public double sub (double a, double b)
	{
		double x = a - b;
		return x;
	}
	public  static int cheng(int n )
	{  	int sum = 1;
		for(int i=1; i<=n;i++)
		{
			sum*=i;
		}
		return(sum);
	}
	public  static  int add(int n)
	{ 	int result = 0;
		for(int i = 1; i<=n;i++)
		{
			result += cheng(i);
		}
		return result;
	}
	public static void main(String[]args)
	{
		System.out.println("输入n");
		Scanner aa = new Scanner(System.in);
		int x = add(aa.nextInt());
		System.out.println(x);
		// test1 bb = new test1 ();
		// System.out.println("请输入a和b：");
		// double a =aa.nextInt();
		// double b =aa.nextInt();
		// double x = bb.sub( a , b );
		// System.out.println(x);
		
	}
}