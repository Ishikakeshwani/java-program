import java.util.Scanner;
public class Reverse
{
public static void main(String args[])
{
int m,n,rev=0,rem,sum=0;
Scanner obj=new Scanner(System.in);
System.out.println("enter 1 for reversing a number\nenter 2 for sum of digit:");
m=obj.nextInt();
System.out.println("enter a number on which u want to do operation:");
n=obj.nextInt();
switch(m)
{
case 1:
while(n!=0)
{
rem=n%10;
n=n/10;
rev=rev*10+rem;
}
System.out.println("the reverse="+rev);
break;
case 2:
while(n!=0)
{
rem=n%10;
n=n/10;
sum=sum+rem;
}
System.out.println("the sum of digit="+sum);
break;
}
}
}

