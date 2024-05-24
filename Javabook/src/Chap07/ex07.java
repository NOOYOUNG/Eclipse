package Chap07;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***학생 주소록***");
		Student stObj1=new Student();
		
		stObj1.insertRecord(20221004, "홍길순");
		stObj1.printInfo();
		
		Student stObj2=new Student(20221005, "홍길동");
		stObj2.printInfo();

	}

}
