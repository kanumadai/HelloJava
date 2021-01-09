package com.kunuma.bridge;

public class WindowsSystem extends OperatingSystem{

	public WindowsSystem(VideoFile videoFile) {
		super(videoFile);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(String fileName) {
		// TODO Auto-generated method stub
		videoFile.decode(fileName);
	}

}
