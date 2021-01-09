package com.kunuma.state;
public class Client{
	
	public static void main(String[] args) {
		Context context = new Context();
		
		context.setLiftState(Context.OPENING_STATE);
		
		context.open();
		context.close();
		context.stop();
		context.run();
		
		
	}
}