import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

public class LocalizingTime {

	public static void main(String[] args) {
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,new Locale("en","us"));
		String d1=df.format(new Date());
		System.out.println(d1);

	}


}
