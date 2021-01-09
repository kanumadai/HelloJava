package com.kunuma.state;

public class Context {

	public final static OpenState OPENING_STATE = new OpenState();
	public final static CloseState CLOSING_STATE = new CloseState();
	public final static RunState RUNNING_STATE = new RunState();
	public final static StopState STOPING_STATE = new StopState();
	
	private LiftState liftState;

	public LiftState getLiftState() {
		return liftState;
	}

	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		
		this.liftState.setContext(this);
	}

	public void open() {
		this.liftState.open();
	}
	public void close() {
		this.liftState.close();
	}	
	public void stop() {
		this.liftState.stop();
	}	
	public void run() {
		this.liftState.run();
	}

	
}
