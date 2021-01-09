package com.kunuma.responsibility;

public class GroupLeader extends Handler{
	
	public GroupLeader() {
		super(0,Handler.DAYS_ONE);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void handleLeave(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		System.out.println(leaveRequest.getName()+" leave " +leaveRequest.getDays()+" days "+leaveRequest.getContent()+".");
		System.out.println("Group leader's agree.");
	}

}
