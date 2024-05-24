package com.member.exception;
import java.util.Scanner;

import com.member.controller.MemberController;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login log=new login();
		log.scrLogin();
		
		MemberController MCr=new MemberController();
		MCr.setProgram();
		
	}

}
