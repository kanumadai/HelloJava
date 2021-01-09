package com.kunuma.responsibility;

public class GeneralManager extends Handler{
	
	public GeneralManager() {
		super(Handler.DAYS_THREE,Handler.DAYS_SEVEN);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void handleLeave(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		System.out.println(leaveRequest.getName()+" leave " +leaveRequest.getDays()+" days "+leaveRequest.getContent()+".");
		System.out.println("General Manager's agree.");
	}

}
