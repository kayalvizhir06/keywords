import java.util.Scanner;
public class chef
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a String:");
String str=sc.nextLine().toLowerCase();
int sum=0;
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
sum+=(int)ch;
}
}
System.out.println(sum);
sc.close();
}
}
