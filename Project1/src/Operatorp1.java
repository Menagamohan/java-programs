
public class Operatorp1 
{
	void arithmeticOperators()
	{
		int a=100,b=200;
		System.out.println("Add::"+(a+b));
		System.out.println("Sub::"+(a-b));
		System.out.println("Mul::"+(a*b));
		System.out.println("Mod::"+(a%b));
		System.out.println("Div::"+(a/b));
	}
	void relationOperator()
	{
		int a=100,b=200;
		System.out.println("Lessthan::"+(a<b));
		System.out.println("Greaterthan::"+(a>b));
		System.out.println("Equal to::"+(a==b));
		System.out.println("NotEqual::"+(a!=b));
	}
	void LogicalOperator()
	{
		int a=10,b=20;
		System.out.println("LogicalAND::"+((a>b)&&(b<a)));
		System.out.println("LogicalOR::"+((a<b)||(b>a)));
		System.out.println("LogicalNOT::"+(!(a>b)));
	}
	void bitwiseOperator()
	{
		int a=2,b=20;
		System.out.println("BitwiseAND::"+(a&b));
		System.out.println("BitwiseOR::"+(a|b));
		System.out.println("BitwiseXOR::"+(a^b));
		System.out.println("Onecomplement::"+(-a));
		System.out.println("Leftshift::"+(a<<1));
		System.out.println("Rightshift::"+(a>>1));
	}

	public static void main(String[] args) {
		Operatorp1 f1=new Operatorp1();
//		f1.arithmeticOperators();
//		f1.relationOperator();
//		f1.LogicalOperator();
		f1.bitwiseOperator();
		
	}

}
