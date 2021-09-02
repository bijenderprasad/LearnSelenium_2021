package CollectionsProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class mapLearning {

	public static void main(String[] args) {
	Map m = new HashMap();
	m.put("name", "Bijender Prasad");
	m.put("age", 29);
	m.put("address", "1037 LBN");
	m.put("mobile", "8802268862");
	System.out.println(m);
	
	
	
	Set s = m.entrySet();
	Iterator itr  =  s.iterator();
	
	while (itr.hasNext()) {
			Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey());
	}
	
	}

}
