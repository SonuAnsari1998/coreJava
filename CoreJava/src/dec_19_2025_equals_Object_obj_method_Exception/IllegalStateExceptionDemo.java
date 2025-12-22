package dec_19_2025_equals_Object_obj_method_Exception;

public class IllegalStateExceptionDemo {
	void main() {
		IO.println("Calling throwIllegalException from main method:");
		throwIllegalException();
	}
	static void throwIllegalException() {
	       try {
	           throw new IllegalStateException("MyException");
	       } catch (IllegalStateException objA) {
	           System.out.println("Caught: " + objA);
	       }
	   }
}
