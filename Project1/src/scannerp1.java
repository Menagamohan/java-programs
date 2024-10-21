import java.util.Scanner;
public class scannerp1 
{
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the empid::");
		empid=sc.nextInt();
		System.out.println("Enter the empname");
		empname=sc.next();
	}
	void display()
	{
		System.out.println("your empid is::"+empid+"your empname is::"+empname);
	}

	public static void main(String[] args) {
		scannerp1 f1=new scannerp1();
				f1.get1();
		f1.display();

	}

}
