import java.util.Scanner;
class Happy_Number
{
public static void main(String[] args)
{
 Scanner s = new Scanner(System.in);
 System.out.println("enter a number");
 int n = s.nextInt();
 int temp = n;
 Happy_Number obj = new Happy_Number();
 while(temp!=1 && temp !=4)
{
    temp = obj.display(temp);
}
if(temp == 1)
System.out.println(n + " is a Happy Number");
else 
System.out.println(n  +" is not a Happy number");
}


int display(int n)
{
 int sum =0;
 while(n > 0)
{ 
 int rem = n%10;
 sum = sum +(rem*rem);
 n =n/10;
}
return sum;
}
}
