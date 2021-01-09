package com.kunuma.bridge;

public class AviFile implements VideoFile {

	@Override
	public void decode(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Avi file:"+ fileName);
	}

}
