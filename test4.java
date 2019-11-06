import java.util.Arrays;
public class test4{
	public static void bubbleSort(int [] a){
		int t = 0;
	for(int i = a.length-1;i>=0;i--)
	{
		for(int j=0;j<i;j++)
		{
			if(a[j]>a[j+1])
			{
			t = a[j];
			a[j] = a[j+1];
			a[j+1]=t;
			}
		}
	}
	}
	public static int binarySearch (int [] a,int b){
	int left = 0;
	int right = a.length-1;
	while(true){
	int mid = (left+right)/2;
	if(b==a[mid])
	return mid;
    if(b<a[mid])
		right = mid -1;
	if (b>a[mid])
		left = mid + 1;
	if(left>right)
		return -1;
	}
	
	}
public static void main(String [] args){
	int a [] = {9,5,2,7};
	bubbleSort(a);
	System.out.println(Arrays.toString(a));
	int b = binarySearch(a,9);
	System.out.println(b);
	}
}