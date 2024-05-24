package com.member.domain;

public class Mem {
	private int[] num;
	private String[] name;
	private String[] phone;
	private String[] addr;
	private String[] pwd;
	public int index=0;
	
	public Mem(){
		num=new int[100];
		name=new String[100];
		phone=new String[100];
		addr=new String[100];
		pwd=new String[100];
	}
	
	public Mem(int num, String name, String phone, String addr, String pwd) {
		
	}
	
	public void setMember(int num, String name, String phone, String addr, String pwd) {
		this.num[index]=num;
		this.name[index]=name;
		this.phone[index]=phone;
		this.addr[index]=addr;
		this.pwd[index]=pwd;
		index++;
	}
	

	public int getNum(int index) {
		return num[index];
	}
	
	public void setNum(int index, int num) {
		this.num[index]=num;
	}
	
	public String getName(int index) {
		return name[index];
	}
	
	public void setName(int index, String name) {
		this.name[index]=name;
	}
	
	public String getPhone(int index) {
		return phone[index];
	}
	
	public void setPhone(int index, String phone) {
		this.phone[index]=phone;
	}
	
	public String getAddr(int index) {
		return addr[index];
	}
	
	public void setAddr(int index, String addr) {
		this.addr[index]=addr;
	}
	
	public String getPwd(int index) {
		return pwd[index];
	}
	
	public void setPwd(int index, String pwd) {
		this.pwd[index]=pwd;
	}

}
