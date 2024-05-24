package Chap13;

import java.util.HashMap;
import java.util.Iterator;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> cats=new HashMap<Integer, String>();
		
		cats.put(1, "페르시안");
		cats.put(2, "샴");
		System.out.println(cats);
		
		cats.put(3, "러시안블루");
		System.out.println(cats);
		
		cats.put(3, "래그돌");
		System.out.println(cats);
		
		cats.remove(1);
		System.out.println(cats);
		
		System.out.println(cats.size());
		System.out.println(cats.get(2));
		
		System.out.print("(Key, Value) =");
		Iterator<Integer> keys=cats.keySet().iterator(); //값이 있으면 그 다음값이 있는지 판별하기 위함. hasNext()와 함께 사용
		//keySet() 메서드를 사용하면 HashMap 내의 모든 키를 가져올 수 있습니다. 
		while(keys.hasNext()) { //다음값이 없으면 false가 되어 반복문을 빠져나오게 됨
			int key=keys.next();
			System.out.print(" ("+key+", "+cats.get(key)+")");
		}

	}

}
