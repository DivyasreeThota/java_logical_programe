import java.util.Scanner;
class Array2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,sum=0;
System.out.print("enter the array size:");
n=sc.nextInt();
int a[] = new int[n];
System.out.print("enter the array elements");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("the elements in array is:");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
for(i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.println("sum of array numbers:"+sum);
}
}
‎