package com.kunuma.state;

public class OpenState extends LiftState{


	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Lift is opening.");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.context.setLiftState(Context.CLOSING_STATE);
		
		super.context.close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
