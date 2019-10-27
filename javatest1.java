public class javatest1 {
public static void main(String[] args)
{
	if(args.length==0)
	{
		System.out.print("至少输入一个数");
		return;
	}
int sum = 0;
for(int i = 0;i < args.length;i++)
{
	sum += Integer.parseInt(args[i]);
}	
double aver = (double)sum/args.length;
System.out.print(aver);
}
}