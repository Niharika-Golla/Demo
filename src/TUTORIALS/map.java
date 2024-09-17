package TUTORIALS;

import java.util.HashMap;
import java.util.TreeMap;

import java.util.Map;

public class map {
	public static void main(String[]args) {
	Map m = new HashMap();
	m.put("Niha", 173);
	System.out.println(m.get("Niha"));
	
	Map map = new HashMap();
	map.put("Harsi",169);
	map.put("Minnnu", 151);
	map.put("Kavya", 156);
	map.put("Bhargav",141);
	map.containsValue("156");
	map.containsKey("Sponda");
	map.put("Sponda","Spandana");
	System.out.println(map);
	}

}
