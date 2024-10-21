
public class StringBuilderp1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Welcome");
		System.out.println(sb.append("hai"));
		System.out.println(sb.insert(5,"Menaga"));
		System.out.println(sb.replace(0,5,"******"));
		System.out.println(sb.delete(0,5));
		System.out.println(sb.reverse());

	}

}
