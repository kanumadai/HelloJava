package com.kunuma.responsibility;
/**
 * abstract process
 * @author Dynabook
 *
 */

public abstract class Handler {

	protected final static int DAYS_ONE = 1;
	protected final static int DAYS_THREE = 3;
	protected final static int DAYS_SEVEN = 7;
	
	private int numStart;
	private int numEnd;
	
	//
	private Handler nextHandler;
	
	public Handler(int numStart) {
		this.numStart  = numStart;
	}
	
	public Handler(int numStart,int numEnd) {
		this.numStart  = numStart;
		this.numEnd = numEnd;
	}
	
	//set next level object
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	protected abstract void handleLeave(LeaveRequest leaveRequest);
	
	public final void submit(LeaveRequest leaveRequest) {
		
		if(this.nextHandler != null && leaveRequest.getDays()>this.numEnd) {
			this.nextHandler.submit(leaveRequest);
		}
		else {
			this.handleLeave(leaveRequest);
			System.out.println("Process is done!");
		}
	}
	
}
