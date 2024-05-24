package Chap13;

import java.util.HashSet;

public class Collection04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> str=new HashSet<String>();
		
		str.add("A");
		str.add("B");
		str.add("C");
		System.out.println(str);
		
		System.out.print("HashSet 요소: ");
		for(String elements:str)
			System.out.print(elements+" ");
		
		String[] array=new String[str.size()];
		str.toArray(array); //toArray를 통해 str의 내용을 array 배열로 모두 넘김
		
		System.out.println();
		System.out.print("Array 요소: ");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
		
	}

}
