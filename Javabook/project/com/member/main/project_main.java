package com.member.main;

import com.member.controller.MemController;
import com.member.controller.initialController;
import com.member.exception.login;

public class project_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogIn log=new LogIn();
		String id=log.scrLogin();
		if(id.equals("Admin")) {
			MemController MCr=new MemController();
			MCr.setProgram();
		}
		else if(id.equals("none")) {
			System.out.println("등록되지 않은 회원 및 관리자입니다.");
		}
		else {
			initialController iCr=new initialController();
			iCr.setProgram(id);
		}
		
	}

}