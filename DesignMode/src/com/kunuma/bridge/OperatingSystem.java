package com.kunuma.bridge;

public abstract class OperatingSystem {

	protected  VideoFile videoFile ;

	public OperatingSystem(VideoFile videoFile) {
		super();
		this.videoFile = videoFile;
	}
	
	public abstract void play(String fileName);
	
}
