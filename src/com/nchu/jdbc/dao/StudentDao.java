package com.nchu.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	// 保存
	public void save(Student stu) {
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String user = "root";
		String pwd = "root";
		Connection conn = null;
		Statement st = null;
		try {
			// 1、加载注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 2、连接数据库
			conn = DriverManager.getConnection(url, user, pwd);
			// 3、创建sql语句
			Integer id = stu.getId();
			String name = stu.getName();
			Integer age = stu.getAge();
			String sql = "insert into stu values(" + id + ",'" + name + "',"
					+ age + ")";
			st = conn.createStatement();
			// 4、执行sql
			int row = st.executeUpdate(sql);
			System.out.println(row);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	Student getStu(int id) throws Exception {
		// 1、加载驱动
		Class.forName("com.nysql.jdbc.Driver");
		// 2、连接数据库
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String user = "root";
		String pwd = "root";

		Connection conn = DriverManager.getConnection(url, user, pwd);

		// 3、创建sql语句
		String sql = "SELECT * FROM stu WHERE id = 1";
		Statement st = conn.createStatement();
		// 执行sql
		ResultSet res = st.executeQuery(sql);
		if (res.next()) {
			Student s = new Student();
			s.setId(res.getInt("id"));
			s.setName(res.getString("name"));
			s.setAge(res.getInt("age"));
			return s;
		} else {
			return null;
		}
	}
}
