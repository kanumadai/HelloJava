package com.kunuma.state;

public class CloseState extends LiftState{


	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.OPENING_STATE);
		
		super.context.open();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Lift is closing.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.RUNNING_STATE);
		
		super.context.run();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
