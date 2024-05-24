package Chap07_re;

public class ex7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***학생 주소록***");
		
		Student st1=new Student();
		st1.insertRecord(20221004, "홍길순");
		st1.printInfo();
		
		Student st2=new Student(20221005, "홍길동");
		st2.printInfo();

	}

}
