class Samples
{
	Samples()
	{
		System.out.println("This is default const...");
	}
	Samples(int a)
	{
		System.out.println("Value is::"+a);
	}
	void get1()
	{
		System.out.println("Normal function");
	}
}
public class ConstP1 {

	public static void main(String[] args) {
		Samples f1=new Samples();
		new Samples(100);
		f1.get1();

	}

}
