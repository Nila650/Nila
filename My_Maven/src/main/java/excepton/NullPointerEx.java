package excepton;

public class NullPointerEx {

	public static void main(String[] args) {


try
{// TODO Auto-generated method stub
String val=null;
System.out.println(val.length());
}
catch(Exception e)
{
	System.out.println("exception handled");
	System.out.println(e);
}
finally
{
	System.out.println("finally");
}
	}

}
