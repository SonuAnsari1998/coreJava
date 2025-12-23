package dec_23_2025_Exception_Handling;

class ArrayStoreExample {
	public static void storeObject() {
		int size = Integer.parseInt(IO.readln("Enter Array size"));

		Object arr[] = new Object[size];
		for (int i = 0; i < arr.length; i++) {

			String str = IO.readln();
			if (str.matches("\\d+")) {
				arr[i] = Integer.parseInt(str);
			} else {
				arr[i] = str;
			}
		}
		try {
			for (Object obj : arr) {
				String str = (String) obj;
			}
			IO.println("Objects stored successfully.");
		} catch (Exception e) {
			IO.println(
					"ArrayStoreException caught: Incompatible type: class java.lang.Integer cannot be cast to class java.lang.String");
		}
	}
}
