package dec_17_2025_Function_Supplier;

import module java.base;

import dec_17_2025_Function_Supplier.Laptop.Book;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

	@Override
	public String toString() {
		return id + "  " + name + "  " + salary;
	}
    
}

class Laptop
{
	public static final Book Book = null;
	int id;
	
	public Laptop(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + "]";
	}

	class Book{
		String bookName;
		

		public Book(String bookName) {
			super();
			this.bookName = bookName;
		}


		@Override
		public String toString() {
			return "Book [" + (bookName != null ? "bookName=" + bookName : "") + "]";
		}
		
	}
}


public class Practice {
	  public static void main(String[] args) {

		  Employee[] emp = new Employee[30];

	        emp[0]  = new Employee(1, "Amit Sharma", 25000);
	        emp[1]  = new Employee(2, "Rahul Verma", 26000);
	        emp[2]  = new Employee(3, "Neha Singh", 27000);
	        emp[3]  = new Employee(4, "Pooja Patel", 28000);
//	        emp[4]  = new Employee(5, "Rohit Mehta", 29000);
//	        emp[5]  = new Employee(6, "Anjali Gupta", 30000);
//	        emp[6]  = new Employee(7, "Vikas Malhotra", 31000);
//	        emp[7]  = new Employee(8, "Sneha Iyer", 32000);
//	        emp[8]  = new Employee(9, "Karan Khanna", 33000);
//	        emp[9]  = new Employee(10, "Priya Nair", 34000);
//
//	        emp[10] = new Employee(11, "Suresh Rao", 35000);
//	        emp[11] = new Employee(12, "Nikita Joshi", 36000);
//	        emp[12] = new Employee(13, "Arjun Kapoor", 37000);
//	        emp[13] = new Employee(14, "Meena Chawla", 38000);
//	        emp[14] = new Employee(15, "Deepak Yadav", 39000);
//	        emp[15] = new Employee(16, "Riya Saxena", 40000);
//	        emp[16] = new Employee(17, "Manoj Kumar", 41000);
//	        emp[17] = new Employee(18, "Kavita Mishra", 42000);
//	        emp[18] = new Employee(19, "Ankit Tiwari", 43000);
//	        emp[19] = new Employee(20, "Swati Bansal", 44000);
//
//	        emp[20] = new Employee(21, "Naveen Arora", 45000);
//	        emp[21] = new Employee(22, "Shalini Jain", 46000);
//	        emp[22] = new Employee(23, "Harish Pandey", 47000);
//	        emp[23] = new Employee(24, "Sonali Kulkarni", 48000);
//	        emp[24] = new Employee(25, "Ramesh Iyer", 49000);
//	        emp[25] = new Employee(26, "Payal Aggarwal", 50000);
//	        emp[26] = new Employee(27, "Akash Srivastava", 51000);
//	        emp[27] = new Employee(28, "Divya Malviya", 52000);
//	        emp[28] = new Employee(29, "Sanjay Thakur", 53000);
//	        emp[29] = new Employee(30, "Bhavna Deshmukh", 54000);

	        System.out.println("ID  Name               Salary");
	        System.out.println("--------------------------------");

//	        List<Employee> et=new ArrayList<Employee>();
//	        for(int i=0; i<3; i++)
//	        {
//	        	et.add(emp[i]);
//	        }
//	        
//	        et.addFirst(new Employee(103, "Ravi", 33345));
//	      et.forEach(System.out::println);
	        
	        Book book = Laptop.Book;
	        System.out.println(book.bookName);

	  }

}
