class Demo14
{
	static int a=10;
	int e1;
	String e2;
	Demo14()
	{
		a++;
		System.out.println(a);
	}
	void get1(int empid,String empname)
	{
		this.e1=empid;
		this.e2=empname;
		System.out.println("Your get1 value is::"+empid+""+empname);
	}
	void display()
	{
		System.out.println("Your value is::"+e1+""+e2);
	}
}
public class StaticP1 {

	public static void main(String[] args) {
		new Demo14();
		Demo14 f1=new Demo14();
		f1.get1(1001,"Menaga");
		f1.display();

	}

}
