package com.kunuma.bridge;

public class MacSystem extends OperatingSystem{

	public MacSystem(VideoFile videoFile) {
		super(videoFile);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(String fileName) {
		// TODO Auto-generated method stub
		
		videoFile.decode(fileName);
	}

}
