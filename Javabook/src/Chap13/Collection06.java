package Chap13;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Collection06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> str=new HashMap<Integer, String>();
		
		str.put(1,"A");
		str.put(2,"B");
		str.put(3,"C");
		System.out.println(str);
		
		System.out.print("Keys: ");
		for(Integer key : str.keySet()) {
			System.out.print(key);
			System.out.print(", ");
		}
		
		System.out.println();
		System.out.print("Values: ");
		for(String value : str.values()) {
			System.out.print(value);
			System.out.print(", ");
		}
		
		System.out.println();
		System.out.print("Keys=Values : ");
		for(Entry<Integer, String> entry : str.entrySet()) {
			System.out.print(entry);
			System.out.print(", ");
		}
		
		System.out.println("\n");
		
		Map map=new HashMap();
		map.put("a", "aa");
		map.put("b", "bb");
		map.put(1, "aa");
		map.put(2,  "bb");
		System.out.println(map);
		System.out.println(map.get("b"));

	}

}
