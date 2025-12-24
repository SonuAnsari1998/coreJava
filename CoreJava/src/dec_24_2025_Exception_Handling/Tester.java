package dec_24_2025_Exception_Handling;

public class Tester {
	void main() {
		ParentClass p =new ChildClass();
		String str=IO.readln("Enter class name");
		try
		{
			p.loadingClass(str);			
		}
		catch(IllegalArgumentException | ClassNotFoundException e)
		{
				System.out.println(e);
		}
	}
}
