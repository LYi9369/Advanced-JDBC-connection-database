package com.nchu.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertClass {
	public static void main(String[] args) {

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
			String sql = "insert into stu values(1,'zs',20)";
			st = conn.createStatement();
			// 4、执行sql
			int row = st.executeUpdate(sql);
			System.out.println(row);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {/* 无论上面try的内容能否执行成功，都会执行finally */
			// 5、释放资源
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
}
