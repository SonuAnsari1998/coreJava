package jan_06_2026_Collection_List_Interface;

/*4. Create an ArrayList<Integer> containing numbers from 1 to 20.
   Remove all even numbers safely without causing ConcurrentModificationException.*/
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		 for(int i=1; i<=20; i++) {
			 list.add(i);
		 }
		 Iterator<Integer> itr= list.iterator();
		 while(itr.hasNext()) {
			 if(itr.next()%2==0) {
				 itr.remove();
			 }
		 }
		 System.out.println(list);
	}
}
