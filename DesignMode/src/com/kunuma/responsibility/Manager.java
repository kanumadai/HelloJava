package com.kunuma.responsibility;

public class Manager extends Handler{
	
	public Manager() {
		super(Handler.DAYS_ONE,Handler.DAYS_THREE);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void handleLeave(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		System.out.println(leaveRequest.getName()+" leave " +leaveRequest.getDays()+" days "+leaveRequest.getContent()+".");
		System.out.println("Manager's agree.");
	}

}
