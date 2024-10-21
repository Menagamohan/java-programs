import java.util.HashMap;

class Sample20
{
	HashMap<Integer, String>m1=new HashMap<Integer, String>();
	void get1()
	{
		m1.put(1001,"Menaga");
		m1.put(1002,"Mohan");
		m1.put(1003,"Sathish");
		System.out.println("Your value is::"+m1);
		
	}
}

public class MapConcept1 {

	public static void main(String[] args) {
		Sample20 f1=new Sample20();
		f1.get1();

	}

}
