package com.kunuma.aggregate;

import java.util.ArrayList;
import java.util.List;

public class AggregateImpl implements Aggregate{

	private List<Student> list = new ArrayList<Student>();	
	
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		list.add(student);
	}

	@Override
	public void romove(Student student) {
		// TODO Auto-generated method stub
		list.remove(student);
	}

	@Override
	public StudentIteratorImpl getIterator() {
		// TODO Auto-generated method stub

		return new StudentIteratorImpl(list);
	}

	public List<Student> getList() {
		return list;
	}

	public void setStudentList(List<Student> studentList) {
		this.list = studentList;
	}

}
