import java.util.Map.Entry;
import java.util.TreeMap;

public class MapConcepts2 {
	TreeMap<Integer, String>list1=new TreeMap<Integer, String>();
	void get1()
	{
		list1.put(1001,"Menaga");
		list1.put(1002,"Sathish");
		list1.put(1003,"Mohan");
		list1.put(1004,"Malar");
	}
	void get2()
	{
		for(Entry<Integer, String> k:list1.entrySet())
		{
			System.out.println("GetKeyvalue is::"+k.getKey());
			System.out.println("Getvalue is::"+k.getValue());
		}
		System.out.println("Searching Your data is::"+list1.containsKey(1001));
		System.out.println("Removing of data is::"+list1.remove(1002));
		System.out.println("After remving data is::"+list1.containsKey(1002));
		System.out.println("Total size is::"+list1.size());
		System.out.println("Index of the data is::"+list1.get(1004));
	}

	public static void main(String[] args) {
		MapConcepts2 f1=new MapConcepts2();
		f1.get1();
		f1.get2();
	}

}
