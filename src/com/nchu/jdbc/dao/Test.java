package com.nchu.jdbc.dao;

public class Test {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setId(1);
		stu.setName("李白");
		stu.setAge(23);
		StudentDao dao = new StudentDao();
		dao.save(stu);
	}
}
