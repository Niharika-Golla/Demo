package TUTORIALS;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;
public class set {
public static void main (String []args) {
	Set<Integer> t = new TreeSet<Integer>();
	t.add(5);
	t.add(7);
	t.add(5);
	t.add(9);
	t.add(-7);
	
	
	boolean x= t.contains(6);
System.out.println(x);
t.remove(9);
t.add(-5);
t.size();
int s = t.size();
System.out.println("The size of the hash map is "+ s);
 System.out.println(t);
}
}
