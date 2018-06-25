import java.util.Scanner;
class Java1
{
void display()
{
   String a;
   Scanner scn=new Scanner(System.in);
   System.out.println("Enter Your Name");
   a=scn.nextLine();
   System.out.println("Your Name "+a);
}
}
class Name
{
public static void main(String[] args)
{
	Java1 ss=new Java1();
	ss.display();
}
}