package com.kunuma.aggregate;

import java.util.List;

public class StudentIteratorImpl implements StudentIterator{

	private List<Student> studentList;
	private int position = 0;
	
	

	public StudentIteratorImpl(List<Student> list) {
		super();
		studentList = list;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return position< studentList.size();
	}

	@Override
	public Student next() {
		// TODO Auto-generated method stub
		Student student = studentList.get(position);
		position ++;
		return student;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}


}
