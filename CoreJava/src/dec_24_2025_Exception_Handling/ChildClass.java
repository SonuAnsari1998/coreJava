package dec_24_2025_Exception_Handling;

public class ChildClass extends ParentClass{
	@Override
	public void loadingClass(String str) throws ClassNotFoundException {
		if(str.isEmpty() || str.equals("") || str.isBlank() || str==null)
		{
			throw new IllegalArgumentException("Error Null/empty");
		}
		else {
			super.loadingClass(str);
		}
	}

}
