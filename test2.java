import java.util.Scanner;
public class test2{
	public static int fabona(int n){
	if(n==1||n==2)
		return 1;
	else 
		return fabona(n-1)+fabona(n-2);
	}
public static void main(String [] args)
{
	System.out.println("请输入要求第几个斐波那契数：");
	Scanner aa = new Scanner(System.in);
	int n = aa.nextInt();
	aa.nextLine();
	int a = fabona(n);
	System.out.println(a);
}
}
