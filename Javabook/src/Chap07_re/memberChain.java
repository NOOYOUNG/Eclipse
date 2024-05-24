package Chap07_re;

public class memberChain {
	String name;
	String country;
	int age;
	
	public memberChain() {
		this("홍길순");
	}
	
	public memberChain(String mName) {
		this(mName, 20);
	}
	
	public memberChain(String mName, int mAge) {
		this(mName, mAge, "대한민국");
	}
	
	public memberChain(String mName, int mAge, String Country) {
		name=mName;
		country=Country;
		age=mAge;
	}
	
	void printInfo() {
		System.out.println("이름: "+name);
		System.out.println("국적: "+country);
		System.out.println("나이: "+age);
	}

}
