package Chap07_re;

public class ex7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person act=new Person();
		
		act.name="형진";
		act.reg_num=3;
		
		System.out.println(act.name+"은(는) 일주일에 "+act.reg_num+"번 ");
		
		act.walk();
		act.run();
	}

}
