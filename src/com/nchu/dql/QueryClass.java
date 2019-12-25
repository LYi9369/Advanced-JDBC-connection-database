package com.nchu.dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryClass {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String user = "root";
		String pwd = "root";
		// 1、加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 2、连接数据库
		Connection conn = DriverManager.getConnection(url, user, pwd);
		// 3、编写sql
		// String sql = "SELECT * FROM emp WHERE ename = '小红'";
		String sql = "SELECT * FROM emp";
		Statement st = conn.createStatement();
		// 4、执行sql
		ResultSet res = st.executeQuery(sql);
		while (res.next()) {
			int empno = res.getInt("empno");
			String ename = res.getString("ename");
			String job = res.getString("job");
			System.out.println("empno=" + empno + "	empname=" + ename + "	job="
					+ job);
		}
		// 5、释放资源
		st.close();
		conn.close();
	}

	void aData() throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String user = "root";
		String pwd = "root";
		// 1、加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 2、连接数据库
		Connection conn = DriverManager.getConnection(url, user, pwd);
		// 3、编写sql
		String sql = "SELECT COUNT(*)  as total FROM emp";// 将查询结果的名称由原来的count（*）自定义为total
		Statement st = conn.createStatement();
		// 4、执行sql
		ResultSet res = st.executeQuery(sql);
		if (res.next()) {
			// int count = res.getInt(1);
			int count = res.getInt("total");// 获得列名为total的查询结果
			System.out.println(count);
		}
		// 5、释放资源
		st.close();
		conn.close();
	}

	void oneLineData() throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String user = "root";
		String pwd = "root";
		// 1、加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 2、连接数据库
		Connection conn = DriverManager.getConnection(url, user, pwd);
		// 3、编写sql
		String sql = "SELECT * FROM emp WHERE ename = '小红'";
		Statement st = conn.createStatement();
		// 4、执行sql
		ResultSet res = st.executeQuery(sql);
		while (res.next()) {
			int empno = res.getInt("empno");
			String ename = res.getString("ename");
			String job = res.getString("job");
			System.out.println("empno=" + empno + "	empname=" + ename + "	job="
					+ job);
		}
		// 5、释放资源
		st.close();
		conn.close();
	}
}
