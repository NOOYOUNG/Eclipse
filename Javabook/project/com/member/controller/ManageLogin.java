package com.member.controller;

public interface ManageLogin {
	abstract void readMember(String id);
	
	abstract void updateMember(String id);
	
	abstract void deleteMember(String id);

}
